// Goo (a subset of Go) language grammar
//
// The goal symbol for the grammar is:             sourceFile
// An extra goal symbol for testing the lexer is:  anything
//
// This ANTLR4 grammar is based on the Go grammar provided here:
//     https://golang.org/ref
//
// Author: Nigel Horspool, January 2016

grammar Goo;

// The Java code below is embedded in the generated Lexer/Parser
// to implement a Go language feature whereby semicolons can be
// often be omitted at the ends of lines. The missing semicolons
// are inserted as and when needed.
//
// Omitted semicolons before ')' and '}' are NOT inserted by this
// code. (I don't know how to handle this feature easily.)
@lexer::header {
import java.util.*;
}

@lexer::members {
    protected int prevTokenType = Token.INVALID_TYPE;

    // These are the token types such that if one appears as the last
    // token on a line, a semicolon is inserted right afterwards.
    protected HashSet<Integer> lastTokens = new HashSet<Integer>() {{
        add(GooParser.Identifier);      add(GooParser.IntLit);
        add(GooParser.FloatLit);        add(GooParser.RuneLit);
        add(GooParser.StringLit);       add(GooParser.BREAK);
        add(GooParser.CONTINUE);        add(GooParser.FALLTHROUGH);
        add(GooParser.RETURN);          add(GooParser.PLUSPLUS);
        add(GooParser.MINUSMINUS);      add(GooParser.RPAREN);
        add(GooParser.RSQ);             add(GooParser.RBRACE);
    }};

	@Override
	public Token emit() {
		if (_type == GooParser.NL) {
            // we have a newline (NL) token
			if (lastTokens.contains(prevTokenType)) {
                // convert that NL token into a semicolon token
				_type = GooParser.SEMI;
				_text = ";";
			    prevTokenType = Token.INVALID_TYPE;
                //System.out.println(_tokenStartLine + ":" +
                //    _tokenStartCharPositionInLine + ": inserted semicolon");
			} else {
                // skip NL tokens
                //int cnt = 0;
                while(true) {
                    _type = nextToken().getType();
                //    cnt++;
                    if (_type != GooParser.NL) break;
                    super.emit();
                }
                prevTokenType = _type;
                if (_type < 0)
                    return emitEOF();
                //System.out.println(_tokenStartLine + ":" + _tokenStartCharPositionInLine +
                //    ": skipped " + cnt + "*NL" + ", next token = " + _SYMBOLIC_NAMES[_type]);
            }
		} else {
            // not a NL token, remember what kind it was
			prevTokenType = _type;
		}
		return super.emit();
	}

	@Override
	public Token nextToken() {
		if (_hitEOF && prevTokenType == GooParser.RBRACE) {
		    // insert a semicolon if last line ends with a right brace (i.e. NL is missing)
			_type = GooParser.SEMI;
			_text = ";";
			prevTokenType = Token.INVALID_TYPE;
			return super.emit();
		}
		return super.nextToken();
	}
}

// These grammar rules have been copied from https://golang.org/ref and
// converted to follow ANTLR4 conventions.
// The grammar rules appear in the same order, but lexical rules have
// all been moved to the end.
// A few grammar transformations have been made to simplify AST construction;
// namely embedded choices and Kleene stars have been expanded out creating
// more rules and a few more nonterminals.

type
        :   typeName
        |   typeLit
        |   '(' type ')'
        ;

typeName
        :   Identifier
        |   qualifiedIdent
        ;

typeLit
        :   arrayType
        |   structType
        |   pointerType
        |   sliceType
        ;

arrayType
        :   '[' arrayLength ']' elementType
        ;

arrayLength
        :   expression
        ;

elementType
        :   type
        ;

sliceType
        :   '[' ']' elementType
        ;

structType
        :   STRUCT '{' fieldDeclList '}'
        ;

fieldDeclList
        :       // empty
        |   fieldDeclList fieldDecl ';'
        ;

fieldDecl
        :   identifierList type
        ;

pointerType
        :   '*' baseType
        ;

baseType
        :   type
        ;

signature
        :   parameters result?
        ;

result
        :   parameters
        |   type
        ;

parameters
        :   '(' ( parameterList ','? )? ')'
        ;

parameterList
        :   parameterDecl
        |   parameterList ',' parameterDecl
        ;

parameterDecl
        :   identifierList? type
        ;

methodName
        :   Identifier
        ;

block
        :   '{' statementList '}'
        ;

statementList
        :       // empty
        |   statementList statement ';'
        ;

declaration
        :   constDecl
        |   typeDecl
        |   varDecl
        ;

topLevelDeclList
        :       // empty
        |    topLevelDeclList topLevelDecl ';'
        ;

topLevelDecl
        :   declaration
        |   functionDecl
        ;

constDecl
        :   CONST constSpec
        |   CONST '(' constSpecList ')'
        ;

constSpecList
        :       // empty
        |   constSpecList constSpec ';'
        ;

constSpec
        :   identifierList (type? '=' expressionList)?
        ;

identifierList
        :   Identifier
        |   identifierList ',' Identifier
        ;

expressionList
        :   expression
        |   expressionList ',' expression
        ;

typeDecl
        :   TYPE typeSpec
        |   TYPE '(' typeSpecList ')'
        ;

typeSpecList
        :       // empty
        |   typeSpecList typeSpec ';'
        ;

typeSpec
        :   Identifier type
        ;

varDecl
        :   VAR varSpec
        |   VAR '(' varSpecList ')'
        ;

varSpecList
        :       // empty
        |   varSpecList varSpec ';'
        ;

varSpec
        :   identifierList varSpecRem
        ;

varSpecRem
        :   type
        |   type '=' expressionList
        |   '=' expressionList
        ;

shortVarDecl
        :   identifierList ':=' expressionList
        ;

functionDecl
        :   FUNC functionName function
        |   FUNC functionName signature
        ;

functionName
        :   Identifier
        ;

function
        :   signature functionBody
        ;

functionBody
        :   block
        ;

operand
        :   literal
        |   operandName
        |   '(' expression ')'
        ;

literal
        :   basicLit
        |   compositeLit
        ;

basicLit
        :   IntLit
        |   FloatLit
        |   RuneLit
        |   StringLit
        ;

operandName
        :   Identifier
        |   qualifiedIdent
        ;

qualifiedIdent
        :   packageName '.' Identifier
        ;

compositeLit
        :   literalType literalValue
        ;

literalType
        :   structType
        |   arrayType
        |   '[' '...' ']' elementType
        |   sliceType
        |   typeName
        ;

literalValue
        :   '{' '}'
        |   '{' elementList ','? '}'
        ;

elementList
        :   element
        |   elementList ',' element
        ;

element
        :   value
        |   key ':' value
        ;
key
        :   fieldName
        |   expression
        |   literalValue
        ;

fieldName
        :   Identifier
        ;

value
        :   expression
        |   literalValue
        ;

primaryExpr
        :   'EXPAND ME TO ONE OR MORE RULES 1'
        ;

selector
        :   '.' Identifier
        ;

index
        :   '[' expression ']'
        ;

slice
        :   '[' expression? ':' expression? ']'
        |   '[' expression? ':' expression ':' expression ']'
        ;

typeAssertion
        :   '.' '(' type ')'
        ;

arguments
        :   '(' ')'
        |   '(' expressionList ','? ')'
        |   '(' type ','? ')'
        |   '(' type ',' expressionList ','? ')'
        ;

expression
        :   'EXPAND ME TO ONE OR MORE RULES 2'
        ;

unaryExpr
        :   'EXPAND ME TO ONE OR MORE RULES 3'
        ;

conversion
        :   type '(' expression ','? ')'
        ;

statement
        :   'EXPAND ME TO ONE OR MORE RULES 4'
        ;

simpleStmt
        :   'EXPAND ME TO ONE OR MORE RULES 5'
        ;

// there's a lot of missing stuff here

forStmt
        :   FOR condition block
        |   FOR forClause block
        |   FOR rangeClause block
        ;

condition
        :   expression
        ;

forClause
        :   initStmt ';' condition? ';' postStmt
        ;

initStmt        // simpleStmt includes the empty statement possibility
        :   simpleStmt
        ;

postStmt        // simpleStmt includes the empty statement possibility
        :   simpleStmt
        ;

rangeClause
        :   expressionList '=' RANGE expression
        |   identifierList ':=' RANGE expression
        ;

// A lot more stuff is missing here

// the goal symbol of this grammar
sourceFile
        :   packageClause ';' importDeclList topLevelDeclList
        ;

packageClause
        :   PACKAGE packageName
        ;

packageName
        :   Identifier
        ;

importDeclList
        :       // empty
        |   importDeclList importDecl ';'
        ;

importDecl
        :   IMPORT importSpec
        |   IMPORT '(' importSpecList ')'
        ;

importSpecList
        :       // empty
        |   importSpecList importSpec ';'
        ;

importSpec
        :   '.' importPath
        |   packageName importPath
        |   importPath
        ;

importPath
        :   StringLit
        ;

// These grammar rules are provided for testing the lexer
anything:   anyToken* ;
anyToken:   BREAK | CASE | CHAN | CONST | CONTINUE | DEFAULT | DEFER | ELSE |
            FALLTHROUGH | FOR | FUNC | GO | GOTO | IF | IMPORT | INTERFACE |
            MAP | PACKAGE | RANGE | RETURN | SELECT | STRUCT | SWITCH | TYPE |
            VAR | PLUSPLUS | MINUSMINUS | RPAREN | RSQ | RBRACE | SEMI |
            Identifier | ImaginaryLit | IntLit | FloatLit | StringLit |
            RuneLit | Whitespace | LineComment | NL | BlockComment |
            BlockNLComment |
            '(' | '[' | '{' | '*' | ',' | '=' | ':=' | '.' | '...' | ':' |
            '&&' | '||' |  '==' | '!=' | '<' | '<=' | '>' | '>=' | '+' | '-' |
            '|' | '^' | '/' | '%' | '<<' | '>>' | '&' | '&^' | '!'
        ;

//--------------- Lexer definitions follow -----------------

// All the keywords listed in the Go Language Specification
BREAK:      'break';
CASE:       'case';
CHAN:       'chan';
CONST:      'const';
CONTINUE:   'continue';
DEFAULT:    'default';
DEFER:      'defer';
ELSE:       'else';
FALLTHROUGH: 'fallthrough';
FOR:        'for';
FUNC:       'func';
GO:         'go';
GOTO:       'goto';
IF:         'if';
IMPORT:     'import';
INTERFACE:  'interface';
MAP:        'map';
PACKAGE:    'package';
RANGE:      'range';
RETURN:     'return';
SELECT:     'select';
STRUCT:     'struct';
SWITCH:     'switch';
TYPE:       'type';
VAR:        'var';

// Names are given to only those operators and special
// symbols referenced by the rule for semicolon insertion
PLUSPLUS:   '++' ;
MINUSMINUS: '--' ;
RPAREN:     ')' ;
RSQ:        ']' ;
RBRACE:     '}' ;
SEMI:       ';' ;

Identifier
        :   [a-zA-Z]+  // 'REPLACE ME 1'
        ;

ImaginaryLit
        :   'REPLACE ME 2'
        ;

IntLit
        :   'REPLACE ME 3'
        ;

FloatLit
        :   'REPLACE ME 4'
        ;

StringLit
        :   '\"' // REPLACE ME 5
        ;

RuneLit
        :   '\''  // REPLACE ME 6
        ;

// This rule is copied from the Antlr4 grammar for Java8
Whitespace
        :   [ \t\u000C]+
            -> skip
        ;

LineComment
        :   '//' ~[\r\n]*
            -> skip
        ;

// The following rules support 3 kinds of line endings:
//    \n   \r\n   and   \r
// By writing the first two rules in this particular manner, the \r\n
// combination gets processed as a single line ending and not as two.
NL
        :   (   '\r' '\n'?
            |   '\n'
            |   BlockNLComment
            )
        ;

// Must be defined before BlockNLComment
BlockComment
        :   '/*' ~[\r\n]* '*/'
            -> skip
        ;

// A comment which contains one or more newlines -- needs to be distinguished
// from other /*...*/ comments to support semicolon insertion logic
BlockNLComment
        :   '/*' .*? '*/'
        ;
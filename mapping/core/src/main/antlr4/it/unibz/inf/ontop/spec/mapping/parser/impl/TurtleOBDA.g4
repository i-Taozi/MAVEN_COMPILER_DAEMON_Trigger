/*
 * #%L
 * ontop-obdalib-core
 * %%
 * Copyright (C) 2009 - 2014 Free University of Bozen-Bolzano
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

/*
 This grammar is adapted from https://github.com/antlr/grammars-v4/tree/master/turtle,
 derived in turn from http://www.w3.org/TR/turtle/#sec-grammar-grammar,
 with the following copywright:

 [The "BSD licence"]
 Copyright (c) 2014, Alejandro Medrano (@ Universidad Politecnica de Madrid, http://www.upm.es/)
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
*/



grammar TurtleOBDA;

 /*
 Source files (Parser, Visitor, ...) are generated by the ANTLR4 Maven Plugin,
 during the Maven generate-sources phase.
 If src/main/<subPath>/TurtleOBDA.g4 is the path to this file,
 then the source files are generated in target/generated-sources/antlr4/<subPath>
 */


/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

parse
  : (triplesStatement|quadsStatement)+ EOF
  ;

triplesStatement
  : triples '.'
  ;

quadsStatement
    : 'GRAPH' graph '{' (triples '.')+ '}'
    ;

triples // [6]
  : subject predicateObjectList
  // blankNodePropertyList predicateObjectList?
  ;

predicateObjectList // [7]
  : verb objectList (';' (verb objectList)?)*
  ;

objectList // [8]
  : object (',' object)*
  ;

graph
  : iri
  | blank
  ;

verb  // [9] verb ::= predicate | 'a' [11] predicate ::= iri
  : iri        # predicateResource
  | 'a'        # predicateRdfType
  ;

subject // [10]	subject ::= iri | BlankNode | collection
  : iri
  | blank
  ;

object  // [12]	object ::= iri | BlankNode | collection | blankNodePropertyList | literal
  : iri
  | blank
  | literal
  ;

iri // [135s] iri ::= IRIREF | PrefixedName  [136s] PrefixedName ::= PNAME_LN | PNAME_NS
  : IRIREF        # resourceIri         // includes templates
  | PNAME_LN      # resourcePrefixedIri // includes templates
  ;

blank  // [137s] BlankNode ::= BLANK_NODE_LABEL | ANON
  : BLANK_NODE_LABEL     # blankNode    // includes templates
  | ANON                 # blankNodeAnonymous
  ;

literal // [13] literal ::= RDFLiteral | NumericLiteral | BooleanLiteral
  : rdfLiteral
  | numericLiteral
  | booleanLiteral
  ;

rdfLiteral // [128s] RDFLiteral ::=	String (LANGTAG | '^^' iri)?
          // [17] String ::= STRING_LITERAL_QUOTE | STRING_LITERAL_SINGLE_QUOTE | STRING_LITERAL_LONG_SINGLE_QUOTE | STRING_LITERAL_LONG_QUOTE
  : STRING_LITERAL_QUOTE (LANGTAG | '^^' iri)?  # constantRdfLiteral  // includes templates
  | ENCLOSED_COLUMN_NAME (LANGTAG | '^^' iri)?  # variableRdfLiteral
  ;

numericLiteral  // [16]
  : INTEGER   # integerLiteral
  | DOUBLE    # doubleLiteral
  | DECIMAL   # decimalLiteral
  ;

booleanLiteral // [133s] BooleanLiteral ::= 'true' | 'false'
  : 'true' | 'false'| 'TRUE' | 'True' | 'FALSE'| 'False'
  ;

WS
  : ([\t\r\n\u000C] | ' ') + -> skip
  ;

/*------------------------------------------------------------------
 * LEXER RULES
 Applied for tokenization (before parsing), regardless of parser rules, as follows:
 - The rule matching the longest substring is applied
 - If there are several of them, the first one is applied
 *------------------------------------------------------------------*/

ENCLOSED_COLUMN_NAME
  : '{' ~[{}]+ '}'
  ;

// extends with ENCLOSED_COLUMN_NAME
IRIREF // [18]
   : '<'  (~[\u0000-\u0020<>"{}|^`\\] | UCHAR | ENCLOSED_COLUMN_NAME)* '>'
   ;

PNAME_NS // [139s]
  : PN_PREFIX? ':'
  ;

PN_PREFIX // [167s]
   : PN_CHARS_BASE ((PN_CHARS | '.')* PN_CHARS)?
   ;

PNAME_LN // [140s]
   : PNAME_NS PN_LOCAL
  ;

// The characters _ and digits may appear anywhere in a blank node label.
// The character . may appear anywhere except the first or last character.
// The characters -, U+00B7, U+0300 to U+036F and U+203F to U+2040 are permitted anywhere except the first character.
// Important: the rule below is an extension of
//      [141s] BLANK_NODE_LABEL ::= '_:' (PN_CHARS_U | [0-9]) ((PN_CHARS | '.')* PN_CHARS)?
BLANK_NODE_LABEL
  : '_:' PN_LOCAL
  ;

LANGTAG // [144s]
  : '@' [a-zA-Z]+ ('-' [a-zA-Z0-9]+)*
  ;

INTEGER // [19]
  : [+-]? [0-9]+
  ;

DECIMAL // [20]
  : [+-]? [0-9]* '.' [0-9]+
  ;

DOUBLE // [21]
  : [+-]? ([0-9]+ '.' [0-9]* EXPONENT | '.' [0-9]+ EXPONENT | [0-9]+ EXPONENT)
  ;

EXPONENT // [154s]
  : [eE] [+-]? [0-9]+
  ;

// TURTLE.g4 says  '"' (~ ["\\\r\n] | '\'' | '\\"')* '"'
// but the one below is what is written in https://www.w3.org/TR/turtle/#grammar-production-STRING_LITERAL_QUOTE
STRING_LITERAL_QUOTE // [22]
  : '"' (~["\\\r\n] | ECHAR |  UCHAR)* '"'
  ;

UCHAR // [26]: numeric escapes for IRIs and Strings
  : '\\u' HEX HEX HEX HEX | '\\U' HEX HEX HEX HEX HEX HEX HEX HEX
  ;

ECHAR // [159s]: string escapes for Strings only
  : '\\' [tbnrf"'\\]
  ;

ANON_WS // [161s] WS ::= #x20 | #x9 | #xD | #xA
  : ' ' | '\t' | '\r' | '\n'
  ;

ANON // [162s] ANON ::= '[' WS* ']'
  : '[' ANON_WS* ']'
  ;

PN_CHARS_BASE // [163s]
  : [A-Z] | [a-z] | [\u00C0-\u00D6] | [\u00D8-\u00F6] | [\u00F8-\u02FF] | [\u0370-\u037D]
  | [\u037F-\u1FFF] | [\u200C-\u200D] | [\u2070-\u218F] | [\u2C00-\u2FEF] | [\u3001-\uD7FF]
  | [\uF900-\uFDCF] | [\uFDF0-\uFFFD] | [\u{10000}-\u{1FFFD}] | [\u{20000}-\u{2FFFD}]
  | [\u{30000}-\u{3FFFD}] | [\u{40000}-\u{4FFFD}] | [\u{50000}-\u{5FFFD}] | [\u{60000}-\u{6FFFD}]
  | [\u{70000}-\u{7FFFD}] | [\u{80000}-\u{8FFFD}] | [\u{90000}-\u{9FFFD}] | [\u{A0000}-\u{AFFFD}]
  | [\u{B0000}-\u{BFFFD}] | [\u{C0000}-\u{CFFFD}] | [\u{D0000}-\u{DFFFD}] | [\u{E1000}-\u{EFFFD}]
  ;

PN_CHARS_U // [164s]
  : PN_CHARS_BASE | '_'
  ;

// adds ? and =
PN_CHARS // [166s] PN_CHARS ::= PN_CHARS_U | '-' | [0-9] | #x00B7 | [#x0300-#x036F] | [#x203F-#x2040]
  : PN_CHARS_U | '-' | [0-9] | '\u00B7' | [\u0300-\u036F] | [\u203F-\u2040] | '?' | '='
  ;

// extends PN_LOCAL in the original grammar to allow  #, ; and / as well as ENCLOSED_COLUMN_NAME
PN_LOCAL // [168s] PN_LOCAL	::=	(PN_CHARS_U | ':' | [0-9] | PLX) ((PN_CHARS | '.' | ':' | PLX)* (PN_CHARS | ':' | PLX))?
  : (PN_CHARS_U | ':' | [0-9] | PLX | '#' | '/' | ENCLOSED_COLUMN_NAME)            // first: adds #, /
    ((PN_CHARS | '.' | ':' | PLX | '#' | '/' | ';' | '&' | ENCLOSED_COLUMN_NAME)*  // middle: adds ;, #, / and &  (? and = through PN_CHARS)
     (PN_CHARS | ':' | PLX | '/' | ENCLOSED_COLUMN_NAME))?                   // last: adds /  (? and = through PN_CHARS)
  ;

PLX // [169s]
  : PERCENT | PN_LOCAL_ESC
  ;

PERCENT // [170s]: %-encoded sequences are not decoded during processing
  : '%' HEX HEX
  ;

HEX // [171s]
  : [0-9] | [A-F] | [a-f]
  ;

PN_LOCAL_ESC  // [172s]: reserved character escape sequences for local names only
  : '\\' ('_' | '~' | '.' | '-' | '!' | '$' | '&' | '\'' | '(' | ')' | '*' | '+' | ',' | ';' | '=' | '/' | '?' | '#' | '@' | '%')
  ;
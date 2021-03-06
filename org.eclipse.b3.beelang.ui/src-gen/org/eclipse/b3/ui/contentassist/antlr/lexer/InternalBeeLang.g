
/*
* generated by Xtext
*/
lexer grammar InternalBeeLang;


@header {
package org.eclipse.b3.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}




KEYWORD_147 : '@postinputcondition';

KEYWORD_145 : 'default-properties';

KEYWORD_146 : 'postinputcondition';

KEYWORD_143 : 'having-parameters';

KEYWORD_144 : 'on-merge-conflict';

KEYWORD_142 : 'checkout-content';

KEYWORD_136 : 'builder-context';

KEYWORD_137 : 'modify-selected';

KEYWORD_138 : 'platform-filter';

KEYWORD_139 : 'replace-content';

KEYWORD_140 : 'select-builders';

KEYWORD_141 : 'select-required';

KEYWORD_133 : '@postcondition';

KEYWORD_134 : 'called-builder';

KEYWORD_135 : 'update-content';

KEYWORD_129 : '@precondition';

KEYWORD_130 : 'fragment-host';

KEYWORD_131 : 'postcondition';

KEYWORD_132 : 'select-switch';

KEYWORD_122 : 'accept-dirty';

KEYWORD_123 : 'precondition';

KEYWORD_124 : 'requires-max';

KEYWORD_125 : 'requires-min';

KEYWORD_126 : 'select-first';

KEYWORD_127 : 'select-units';

KEYWORD_128 : 'unit-context';

KEYWORD_120 : 'annotations';

KEYWORD_121 : 'select-best';

KEYWORD_111 : 'capability';

KEYWORD_112 : 'conditions';

KEYWORD_113 : 'connection';

KEYWORD_114 : 'instanceof';

KEYWORD_115 : 'name-space';

KEYWORD_116 : 'properties';

KEYWORD_117 : 'repository';

KEYWORD_118 : 'resolution';

KEYWORD_119 : 'sequential';

KEYWORD_107 : 'container';

KEYWORD_108 : 'endswitch';

KEYWORD_109 : 'load-from';

KEYWORD_110 : 'timestamp';

KEYWORD_100 : 'branches';

KEYWORD_101 : 'function';

KEYWORD_102 : 'parallel';

KEYWORD_103 : 'provides';

KEYWORD_104 : 'reexport';

KEYWORD_105 : 'requires';

KEYWORD_106 : 'revision';

KEYWORD_88 : 'builder';

KEYWORD_89 : 'concern';

KEYWORD_90 : 'context';

KEYWORD_91 : 'default';

KEYWORD_92 : 'exclude';

KEYWORD_93 : 'extends';

KEYWORD_94 : 'finally';

KEYWORD_95 : 'include';

KEYWORD_96 : 'mutable';

KEYWORD_97 : 'private';

KEYWORD_98 : 'proceed';

KEYWORD_99 : 'version';

KEYWORD_75 : 'branch';

KEYWORD_76 : 'cached';

KEYWORD_77 : 'elseif';

KEYWORD_78 : 'endtry';

KEYWORD_79 : 'greedy';

KEYWORD_80 : 'latest';

KEYWORD_81 : 'modify';

KEYWORD_82 : 'output';

KEYWORD_83 : 'policy';

KEYWORD_84 : 'public';

KEYWORD_85 : 'result';

KEYWORD_86 : 'source';

KEYWORD_87 : 'switch';

KEYWORD_68 : 'catch';

KEYWORD_69 : 'endif';

KEYWORD_70 : 'false';

KEYWORD_71 : 'final';

KEYWORD_72 : 'input';

KEYWORD_73 : 'super';

KEYWORD_74 : 'throw';

KEYWORD_58 : 'case';

KEYWORD_59 : 'else';

KEYWORD_60 : 'name';

KEYWORD_61 : 'null';

KEYWORD_62 : 'then';

KEYWORD_63 : 'this';

KEYWORD_64 : 'true';

KEYWORD_65 : 'unit';

KEYWORD_66 : 'when';

KEYWORD_67 : 'with';

KEYWORD_47 : '!==';

KEYWORD_48 : '##[';

KEYWORD_49 : '...';

KEYWORD_50 : '===';

KEYWORD_51 : 'env';

KEYWORD_52 : 'new';

KEYWORD_53 : 'tag';

KEYWORD_54 : 'try';

KEYWORD_55 : 'use';

KEYWORD_56 : 'val';

KEYWORD_57 : 'var';

KEYWORD_26 : '!=';

KEYWORD_27 : '!~';

KEYWORD_28 : '#[';

KEYWORD_29 : '%=';

KEYWORD_30 : '&&';

KEYWORD_31 : '*=';

KEYWORD_32 : '++';

KEYWORD_33 : '+=';

KEYWORD_34 : '--';

KEYWORD_35 : '-=';

KEYWORD_36 : '..';

KEYWORD_37 : '/=';

KEYWORD_38 : '<=';

KEYWORD_39 : '==';

KEYWORD_40 : '=>';

KEYWORD_41 : '>=';

KEYWORD_42 : 'as';

KEYWORD_43 : 'if';

KEYWORD_44 : 'is';

KEYWORD_45 : '||';

KEYWORD_46 : '~=';

KEYWORD_1 : '!';

KEYWORD_2 : '$';

KEYWORD_3 : '%';

KEYWORD_4 : '&';

KEYWORD_5 : '(';

KEYWORD_6 : ')';

KEYWORD_7 : '*';

KEYWORD_8 : '+';

KEYWORD_9 : ',';

KEYWORD_10 : '-';

KEYWORD_11 : '.';

KEYWORD_12 : '/';

KEYWORD_13 : ':';

KEYWORD_14 : ';';

KEYWORD_15 : '<';

KEYWORD_16 : '=';

KEYWORD_17 : '>';

KEYWORD_18 : '?';

KEYWORD_19 : '@';

KEYWORD_20 : '[';

KEYWORD_21 : ']';

KEYWORD_22 : '_';

KEYWORD_23 : '{';

KEYWORD_24 : '|';

KEYWORD_25 : '}';



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

RULE_PID : '$' '{' RULE_ID ('.' RULE_ID)* '}';

RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

RULE_SIMPLE_PATTERN : '~' RULE_STRING;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

RULE_TEXT : '\u00AB' (('}' ~('\u00BB')|'\u00AB' ~('{'))|~(('}'|'\u00AB'|'\u00BB')))* '\u00BB';

RULE_TEXTSTART : '\u00AB' (('}' ~('\u00BB')|'\u00AB' ~('{'))|~(('}'|'\u00AB'|'\u00BB')))* '\u00AB' '{';

RULE_TEXTEND : '}' '\u00BB' (('}' ~('\u00BB')|'\u00AB' ~('{'))|~(('}'|'\u00AB'|'\u00BB')))* '\u00BB';

RULE_TEXTMID : '}' '\u00BB' (('}' ~('\u00BB')|'\u00AB' ~('{'))|~(('}'|'\u00AB'|'\u00BB')))* '\u00AB' '{';

RULE_JAVADOC : '/**' ( options {greedy=false;} : . )*'*/';

RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

RULE_INT : ('0'..'9')+;

RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

RULE_ANY_OTHER : .;




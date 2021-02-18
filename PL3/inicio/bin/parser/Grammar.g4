grammar Grammar;

import Lexicon;

start : 'DATA' print EOF;

print : 'print' LITENT ';';

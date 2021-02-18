grammar Grammar;

import Lexicon;

start : print EOF;

print : 'print' LITENT ';';

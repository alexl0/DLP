package parser;

public class LexerHelper {

    public static int lexemeToInt(String lexeme) {
        try {
            return Integer.parseInt(lexeme);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static double lexemeToReal(String lexeme) {
        try {
            return Double.parseDouble(lexeme);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static char lexemeToChar(String lexeme) {
        try {
            if(lexeme.contains(Character.toString('\\'))){
                String[] token = lexeme.split("\\\\");
                String[] numberS = token[1].split("'");
                try{
                    int number = Integer.parseInt(numberS[0]);
                    return ((char) number);
                } catch(NumberFormatException n){
                    if(numberS[0].charAt(0)=='n')
                        return ((char) '\n');
                    else if (numberS[0].charAt(0)=='t')
                        return ((char) '\t');
                }
            }
            return lexeme.toCharArray()[1];
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return ' ';
    }

}

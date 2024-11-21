// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String word = args[0];
                int cheersNum = Integer.parseInt(args[1]);

                String upperCaseString = ToUpperCase(word);
                CheerGenerator(upperCaseString, cheersNum);

        }
        public static String ToUpperCase(String word) {
                String upperCaseString = "";

                for (int i = 0; i < word.length(); i++){
                        int C = word.charAt(i);

                    if ( C >= 97 && C <= 122) {
                        upperCaseString += (char)(C - 32);
                    } else {
                        upperCaseString += (char)C; 
                    }
                }
                return upperCaseString;

        }
               
        public static void CheerGenerator(String upperCaseString, int cheersNum) {

                for (int i = 0; i < upperCaseString.length(); i++) {
                        char L = upperCaseString.charAt(i);
                        if (L == 'A' || L == 'E' || L == 'F' || L == 'H' || L == 'I' || L == 'L' || L == 'M' || L == 'N' || L == 'O' || L == 'R' || L == 'S' || L == 'X') {
                                System.out.println("Give me an " + L + ": " + L + "!");
                        } else {
                        System.out.println("Give me a  " + L + ": " + L + "!");
                        }
                }

                System.out.println("What does that spell?");

                for (int i = 0; i < cheersNum; i++) {
                        System.out.println(upperCaseString + "!!!");
                }

        }
}

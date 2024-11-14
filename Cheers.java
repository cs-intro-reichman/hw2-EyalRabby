// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String word = args[0];
                int cheersNum = Integer.parseInt(args[1]);

                word.toUpperCase();

                for (int i = 0; i < word.length(); i++) {
                        char L = word.charAt(i);
                        if (L == 'A' || L == 'E' || L == 'F' || L == 'H' || L == 'I' || L == 'L' || L == 'M' || L == 'N' || L == 'O' || L == 'R' || L == 'S' || L == 'X') {
                                System.out.println("Give me an " + L + ": " + L + "!");
                        } else {
                        System.out.println("Give me a  " + L + ": " + L + "!");
                        }
                }

                System.out.println("What does that spell?");

                for (int i = 0; i < cheersNum; i++) {
                        System.out.println(word + "!!!");
                }

        }
}

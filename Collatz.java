// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seedN = Integer.parseInt(args[0]);
		String command = args[1];
		
		int seed = 1;
		int tempNum = 0;

		for (int i = 0; i < seedN; i++) {
			
			tempNum = seed;
			int counter = 1;

			while (tempNum != 1 || counter == 1) {
				if (tempNum % 2 == 0) {
					if (command.equals("v")){
					System.out.print(tempNum + " ");
					}
					tempNum /= 2;
					counter++;
				} else {
					if (command.equals("v")){
					System.out.print(tempNum + " ");
					}
					tempNum = (tempNum * 3) + 1;
					counter++;
				}
			}
			seed += 1;
			if (command.equals("v")){
			System.out.println(1 + " (" + counter + ")");
			}
		}
		if (tempNum == 1) {
			System.out.println("Every one of the first " + (seed - 1) + " hailstone sequences reached 1.");
		} else {
			System.out.println("ERROR");
		}
	}
}

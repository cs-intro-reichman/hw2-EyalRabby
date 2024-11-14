// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {

		int N = Integer.parseInt(args[0]);
		int BIG = 0;
		int smol = 0;

		for (int i = 0; i < N; i++ ) {
			double randomNum = Math.random();
			if (randomNum > 0.5) {
				BIG++;
			} else {
				smol++;
			}
		}

		double ratio = (double) BIG / smol;

		if (smol == 0) {
			System.out.println("Inconcievable!!! Try again.");

		} else {
		System.out.println("> 0.5: " + BIG + " times");
		System.out.println("<= 0.5: " + smol + " times");
		System.out.println("Ratio: " + ratio);
		}
	}
}

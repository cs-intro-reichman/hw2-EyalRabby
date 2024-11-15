// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 

		int calcNum = Integer.parseInt(args[0]);

		double piApprox = 0.0;
		double divider = 1.0;
		double sign = 1.0;

		for (int i = 0; i < calcNum; i++) {
			piApprox += sign * (1.0 / divider);
			sign = -sign;
			divider +=2;
		}

		System.out.println("pi according to Java: 3.141592653589793");
		System.out.println("pi, approximated:     " + piApprox * 4);
	}
}

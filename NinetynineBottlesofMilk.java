package for_loops;

public class NinetynineBottlesofMilk {
	public static void main(String[] args) {
		for (int i = 99; i >= 1; i = i - 1) {
			if (i == 1) {
				System.out.println(i + " bottle of milk on the wall " + i
						+ " bottle of milk take it down, pass it around no more bottles of milk on the wall!");
			} else {
				System.out.println(
						i + " bottles of milk on the wall " + i + " bottles of milk take one down, pass it around "
								+ (i - 1) + " bottles of milk on the wall!");
			}

		}
	}
}

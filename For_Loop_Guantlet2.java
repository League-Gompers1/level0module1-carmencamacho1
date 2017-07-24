package for_loops;

public class For_Loop_Guantlet2 {
	public static void main(String[] args) {
		// for (int i = 99; i >= 0; i = i - 1) {
		// System.out.println(i);
		// }
		// for (int j = 100; j >= 0; j = j - 1) {
		// System.out.println(j);
		// }
		// for(int k = 2;k<=100;k =k+2){
		// System.out.println(k);
		// }
		// for(int l = 1; l<=99;l=l+2){
		// System.out.println(l);
		// }
		// for (int m = 1; m <= 500; m = m + 1) {
		// System.out.print(m + " ");
		// if (m % 2 == 0) {
		// System.out.println("even");
		// } else {
		// System.out.println("odd");
		// }
		// }
		// for (int n = 0; n <= 777; n = n + 7) {
		// System.out.println(n);
		// }
		/*
		 * for (int o = 2004; o <= 2017; o = o + 1) { if (o == 2017) {
		 * System.out.println("This year, " + o + ", I am " + (o - 2004) +
		 * " years old"); } else { System.out.println("In " + o + ", I was " +
		 * (o - 2004) + " years old"); } }
		 */
		/*
		 * for (int i = 0; i < 3; i++) { for (int j = 0; j < 3; j++) {
		 * System.out.println(i + "" + j);
		 * 
		 * } }
		 */
		/*
		 * int i; for (i = 0; i < 3; i++) { System.out.print(i);
		 * System.out.println(); for (int j = 1; j <= 3; j++)
		 * System.out.print((i*3) + j); }
		 */
		int i;
		for (i = 0; i < 10; i++) {
			/* System.out.print(i); */
			System.out.println();
			for (int j = 1; j <= 10; j++)
				System.out.print(((i * 10)+ j) + "\t");
		}
	}
}

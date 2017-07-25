/**
 *
 */
package test_20170724;

/**
 * @author sumire
 *
 */
public class Sosu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//System.out.print("2 ");
		for (int i = 2; i <= 100; i++) {
			int sum = 0;
			for (int k = 1; k <= Math.sqrt((double) i); k++) {
				if (i % k == 0)
					sum++;
			}
			if (sum == 1) {
				System.out.print(i + " ");

			}
		}

	}

}

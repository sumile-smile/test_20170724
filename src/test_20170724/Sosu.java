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
		System.out.println("素数を表示します");
		for (int i = 2; i <= 100; i++) {
			// 割り切れた回数
			int divisibleCount = 0;
			for (int k = 1; k <= Math.sqrt((double) i); k++) {
				if (i % k == 0) {
					divisibleCount++;
				}
				if (divisibleCount >= 2) {
					// 2回以上割れたら素数でない
					break;
				}
			}
			if (divisibleCount == 1) {
				System.out.print(i + " ");
			}
		}

	}

}

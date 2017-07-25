/**
 *
 */
package test_20170724;

/**
 * @author sumire
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("入力された数のフィボナッチ数を出力します");
		String inputValue = ProgrammingTestUtil.getInputValue(System.in);
		if (ProgrammingTestUtil.checkInputValue(inputValue)) {
			long result = fibo(Integer.parseInt(inputValue));
			System.out.println(result);
		}

	}

	static long fibo(int n) {
		long F;
		if (n <= 0) {
			return 0;
		}
		if (n == 1 || n == 2) {
			return 1;
		}
		F = (fibo(n - 1) + fibo(n - 2));
		return F;
	}

}

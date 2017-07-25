/**
 *
 */
package test_20170724;

/**
 * @author sumire
 *
 */
public class Hairetsu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 入力された数の数字の配列を生成し逆にする
		System.out.println("入力された数の数字の配列を生成し逆にする");
		String inputValue = ProgrammingTestUtil.getInputValue(System.in);

		if (ProgrammingTestUtil.checkInputValue(inputValue)) {
			int n = Integer.parseInt(inputValue);

			Integer[] list = new Integer[n];
			// 配列を作成
			for (int a = 0; a < n; a++) {
				list[a] = a;
			}

			// コンソールへ出力
			System.out.print("変換前：");
			ProgrammingTestUtil.printArray(list);

			//逆にする
			list = reverse(list);

			//逆にした配列を出力
			System.out.print("変換後：");
			ProgrammingTestUtil.printArray(list);
		}

	}

	/**
	 * 配列を逆にします
	 */
	private static Integer[] reverse(Integer[] list) {
		int size = list.length;
		for(int j = 0; j < size/2; j++){
		    int t = list[j];
		    list[j] =list[size - j - 1];
		    list[size - j - 1] = t;
		  }
		return list;
	}
}

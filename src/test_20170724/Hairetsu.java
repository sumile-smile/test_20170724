/**
 *
 */
package test_20170724;

import java.util.Scanner;

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
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int n;
		try {
			n = Integer.parseInt(line);

			Integer[] list = new Integer[n];
			System.out.print("変換前：");

			for (int a = 0; a < n; a++) {
				list[a] = a;
				System.out.print(list[a] + " ");
			}
			System.out.println();

			int size = list.length;
			Integer[] result = new Integer[size];

			System.out.print("変換後：");

			int count = 0;
			for (int a = size - 1; a >= 0; a--) {
				result[count] = list[a];
				count++;
				System.out.print(list[a] + " ");
			}

		} catch (NumberFormatException e) {
			// 数字に変換できなかったらERROR
			System.out.println("ERROR");
		}

	}

	/**
	 * 逆にします
	 */
	static Integer[] change(Integer[] list) {
		int size = list.length;
		Integer[] result = new Integer[size];

		System.out.print("変換後：");

		int count = 0;
		for (int a = size - 1; a >= 0; a--) {
			result[count] = list[a];
			count++;
			System.out.print(list[a] + " ");
		}
		return result;
	}
}

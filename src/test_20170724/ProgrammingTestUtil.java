package test_20170724;

import java.io.InputStream;
import java.util.Scanner;

public class ProgrammingTestUtil {

	/**
	 * 入力値を取得
	 */
	public static String getInputValue(InputStream source) {
		Scanner sc = new Scanner(source);
		return sc.nextLine();
	}

	/**
	 * 配列を出力
	 */

	public static void printArray(Integer[] list) {
		for (int a = 0; a < list.length; a++) {
			System.out.print(list[a] + " ");
		}

	}

	/**
	 * 入力チェック（数値）
	 */

	public static boolean checkInputValue(String value) {
		boolean result = true;
		try {
			 Integer.parseInt(value);
		} catch (NumberFormatException e) {
			// 数字に変換できなかったらERROR
			System.out.println("ERROR:入力値が数値でありません。整数を入力してください");
			result = false;
		}
		return result;
	}
}

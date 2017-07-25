/**
 *
 */
package test_20170724;

/**
 * @author sumire
 *
 */
public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("入力された数が3の倍数のときは「Fizz」、5の倍数のときは「Buzz」と表示します");
		String inputValue = ProgrammingTestUtil.getInputValue(System.in);
		String output = "";
		if(ProgrammingTestUtil.checkInputValue(inputValue)){
			int n = Integer.parseInt(inputValue);

			if (n % 3 == 0) {
				output = "Fizz";
			}
			if (n % 5 == 0) {
				output = "Buzz";
			}
			if(output.equals("")){
				output = String.valueOf(output);
			}
			System.out.println(output);
		}
	}
}

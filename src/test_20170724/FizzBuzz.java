/**
 *
 */
package test_20170724;

import java.util.Scanner;

/**
 * @author sumire
 *
 */
public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     String line = sc.nextLine();
	     int n;
	     try {
	    	  n = Integer.parseInt(line);

	  		if(n % 3 == 0){
	  			 System.out.print("Fizz");
	  		}
	  		if(n % 5 == 0){
	  			 System.out.print("Buzz");
	  		}
	  		
	     }catch (NumberFormatException e) {
			// 数字に変換できなかったらERROR
	    	 System.out.println("ERROR");
		}
	}
}

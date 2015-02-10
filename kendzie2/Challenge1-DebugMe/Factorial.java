//UIUC CS125 FALL 2014 MP. File: Factorial.java, CS125 Project: Challenge1-DebugMe, Version: 2015-02-04T10:06:27-0600.122958435

/**
 * A program to calculate a factorial. The given code may contain errors. Fix the
 * given code and add additional code to calculate a factorial and pass the unit
 * tests. Hint sometimes an 'int' just 'aint big enough.
 * 
 * @see Factorial-ReadMe.txt for details on how to complete this program.
 * @author kendzie2
 */
public class Factorial {
	public static void main(String[] args) {
		int max = 0;
		System.out.println("Enter a number between 1 and 20 inclusive.");
		while (max < 1 || max >= 21) {
			max = TextIO.getlnInt();
			if (max >= 21 || max <= 0)
				TextIO.putln("Enter a number between 1 and 20 inclusive.");
		}
		long result = 1;
		for (int i = 1; i <= max; i++){
			result = result * i;
		}
		TextIO.putln(max + "! = " + result);
	}
}
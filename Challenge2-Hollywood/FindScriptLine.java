//UIUC CS125 FALL 2014 MP. File: FindScriptLine.java, CS125 Project: Challenge2-Hollywood, Version: 2015-02-09T07:50:10-0600.598389938
/**
 * A program to search for specific lines and print their line number.
 * See FindScriptLine.txt for more details
 * TODO: add your netid to the line below
 * @author kendzie2
 */
public class FindScriptLine {

	public static void main(String[] args) {
// TODO: Implement the functionality described in FindScriptLine.txt
// TODO: Test your code manually and using the automated unit tests in FindScriptLineTest
		
		String quote;
		boolean output = false;
		int scriptLine = 0;
		TextIO.putln("Please enter the word(s) to search for");
		quote = TextIO.getln();
		String lowerCaseQuote = quote.toLowerCase();
		
		TextIO.readFile("thematrix.txt");
		
		TextIO.putln("Searching for " + "\'" + quote + "\'");
		output = false;
			
		while (false == TextIO.eof()){
			String line = TextIO.getln();
			String lowerCaseLine = line.toLowerCase();
			scriptLine++;
			
			if (lowerCaseLine.indexOf(lowerCaseQuote) >= 0)
				output = true;
			
			if (line.length() <= 0 || lowerCaseLine.indexOf(lowerCaseQuote) < 0)
				output = false;
				
			if (output == true)
				TextIO.putln(scriptLine + " - " + line.trim());
			
		}
		TextIO.putln("Done Searching for \'" + quote + "\'");
	}
}

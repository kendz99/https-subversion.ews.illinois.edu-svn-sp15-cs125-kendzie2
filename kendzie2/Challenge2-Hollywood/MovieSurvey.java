//UIUC CS125 FALL 2014 MP. File: MovieSurvey.java, CS125 Project: Challenge2-Hollywood, Version: 2015-02-09T07:50:10-0600.598389938
/**
 * A program to run a simple survey and report the results. See MovieSurvey.txt
 * for more information. TODO: add your netid to the line below
 * 
 * @author kendzie2
 */
public class MovieSurvey {
	public static void main(String[] arg) {
		// TODO: Write your program here
		// Hints :
		// Formatted output
		// http://math.hws.edu/javanotes/c2/s4.html#basics.4.4
		
		// Don't just copy paste the expected output
		// For grading purposes your code may be tested
		// with other input values.
		int cinema;
		int player;
		int computer;
		int total_i;
		double total_d;
		double inTheater;
		double outTheater;
		
		TextIO.putln("Welcome. We're interested in how people are watching movies this year.\nThanks for your time. - The WRITERS GUILD OF AMERICA.\nPlease tell us about how you've watched movies in the last month.");
		TextIO.putln("How many movies have you seen at the cinema?");
		cinema = TextIO.getlnInt();
		TextIO.putln("How many movies have you seen using a DVD or VHS player?");
		player = TextIO.getlnInt();
		TextIO.putln("How many movies have you seen using a Computer?");
		computer = TextIO.getlnInt();
		TextIO.put ("Summary: " + cinema + " Cinema movies, " + player + " DVD/VHS movies, " + computer + " Computer movies\n");
		total_i = cinema + player + computer;
		total_d = total_i;
		TextIO.putln("Total: " + total_i + " movies");
		inTheater = (cinema / total_d) * 100;
		outTheater = ((player + computer) / total_d) * 100;
		TextIO.put("Fraction of movies seen at a cinema: ");
		TextIO.putf("%.2f", inTheater);
		TextIO.put("%");
		TextIO.put("\nFraction of movies seen outside of a cinema: ");
		TextIO.putf("%.2f", outTheater);
		TextIO.put("%");
	}
}

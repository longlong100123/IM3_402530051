/*
* [A]100
* [TA's Advise]
* 1. Good!
*/

package hw03;
import javax.swing.JOptionPane;

public class GradeAnalyzerTester {
	public static void main(String[] args){
		String input="";
		double score;
		GradeAnalyzer analyzer= new GradeAnalyzer();
		while (true){
			input = JOptionPane.showInputDialog("Enter the score(Enter Q to quit)");
		if (input.equals("Q")||input.equals("q"))
		{
		break;	
		}
		try {
			score= Double.parseDouble(input);
			analyzer.addGrade(score);
		}
		catch(Exception e){
		}
		
	}
		if (analyzer.count>=2)
		{
			analyzer.analyzeGrades();
			System.out.println("You entered "+analyzer.count+" valid grades from 0 to 110.\nInvalid grades are ignored!\n");
			System.out.println("The average = "+analyzer.avg+" with a standard deviation = "+analyzer.standd+"\n");
			System.out.println("The grade distribution is:");
			System.out.println(analyzer.toString());
		}
	}
}

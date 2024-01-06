import java.util.Scanner;

public class Jagged {
	
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		char choice = 'Q';
		int size = 100;// how many row values
		int eSize = 0;
		int [][]grades = new int[size][];
		
		do {
			choice = getChoice();
			
			switch (choice) {
			case 'A':
				eSize = getExamScores(grades, eSize);
			case 'D':
				displayScores(grades,eSize);
			case 'Q':
				break;
				default:
					System.out.println("Invalid Selection");
			}
		}while(choice !='Q');

	}// end of main
	
	
	
		public static char getChoice() {
			String result;
			String menu = "[A]dd scores\n[D]isplay all scores\n";
			menu += "[Q]uit\n Enter selection: ";
			System.out.println(menu);
			result = in.next();

			return result.toUpperCase().charAt(0);

			}// end get choice
	
		public static int getExamScores(int [][]grades , int eSize) {
			//make sure is room
			
			int noExams;
			String mess;
			
			System.out.print("How many exams did student " + eSize + " take");
			noExams = in.nextInt(); //Air check this
			grades[eSize] = new int[noExams];// creates colums for this current row
			
			for(int j = 0; j < noExams; j++) {
			mess = "Enter exam " + (j + 1 ) + " score: ";
			System.out.print(mess);
			grades[eSize][j] = in.nextInt();// check air <<EXPLAIN>>>
			}// end for
			return eSize + 1;// how this works // maybe goes to next index number
			}// end get exam scores
		
		public static void displayScores(int [][]a, int eSize) {
			//check for data here
			
			System.out.println("VID\tEX1\tEX2\tEX3\tEX4\tEX5");
			System.out.println("---\t---\t---\t---\t---\t---");
			
			for(int i = 0; i < eSize; i++) {
				System.out.print(i + "\t");// prints values of the array
			
				for(int j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j] + "\t");// i represent the row prints current row 
				}// end inner for loop
				System.out.println();
			}// End outer for loop
		}// end of display scores


			}// end test class
	
	

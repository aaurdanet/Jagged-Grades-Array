
Jagged Array Operations

The Jagged Java program allows the user to input and display exam scores using a jagged array. It provides options to add scores, display all scores, or quit the program.
Features

    Get Choice Method:
        Takes user input to determine the desired operation: Add scores, Display all scores, or Quit.

java

public static char getChoice()

    Get Exam Scores Method:
        Takes input for the number of exams a student has taken and their respective scores. Dynamically creates columns for the current row in the jagged array.

java

public static int getExamScores(int[][] grades, int eSize)

    Display Scores Method:
        Displays the exam scores for each student in a tabular format.

java

public static void displayScores(int[][] a, int eSize)

    Main Method:
        Initializes the jagged array and enters a loop to interact with the user based on their selected choices.

java

public static void main(String[] args)

Usage

    Clone the repository:

    bash

    git clone https://github.com/yourusername/JaggedArrayOperations.git

    Open the project in your preferred Java development environment.

    Run the Jagged class.

    Interact with the program by entering choices:
        Press 'A' to add scores.
        Press 'D' to display all scores.
        Press 'Q' to quit the program.

java

public class Jagged {
    public static void main(String[] args) {
        // ... (code to set up jagged array)

        char choice = 'Q';
        int size = 100;
        int eSize = 0;
        int[][] grades = new int[size][];

        do {
            choice = getChoice();

            switch (choice) {
                case 'A':
                    eSize = getExamScores(grades, eSize);
                    break;
                case 'D':
                    displayScores(grades, eSize);
                    break;
                case 'Q':
                    break;
                default:
                    System.out.println("Invalid Selection");
            }
        } while (choice != 'Q');
    }
}

Feel free to customize this README based on your project's specific details and preferences. Add more sections or details as needed.

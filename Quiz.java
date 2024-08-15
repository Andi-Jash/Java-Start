import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "What is the largest ocean on Earth?",
            "Who wrote 'Hamlet'?",
            "What is the smallest prime number?"
        };

        String [][] options = {
            {"A. Berlin", "B. Madrid", "C. Paris", "D. Rome"},
            {"A. Earth", "B. Mars", "C. Jupiter", "D. Venus"},
            {"A. Atlantic Ocean", "B. Indian Ocean", "C. Arctic Ocean", "D. Pacific Ocean"},
            {"A. Charles Dickens", "B. Jane Austen", "C. William Shakespeare", "D. Mark Twain"},
            {"A. 0", "B. 1", "C. 2", "D. 3"}
        };

        char[] answers = {'C', 'B', 'D', 'C', 'C'};

        for (int i = 0; i < questions.length; i++){
            System.out.println("Question: " + (i + 1) + ": " + questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.println("Enter your answer: ");
            String userAnswer = scanner.nextLine().toUpperCase();

            if(userAnswer.equals(String.valueOf(answers[i]))){
                score ++;
            }
            else{
                System.out.println("Wrong the correct answer is " + answers[i] + ". " + options[i][answers[i] - 'A']);
            }
            System.out.println();
        }

        System.out.println("Your total score is: " + score + "out of a possible " + questions.length + ".");

        scanner.close();
    }
}

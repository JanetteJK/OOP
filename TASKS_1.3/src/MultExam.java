import java.util.Scanner;

public class MultExam {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int questions = 0;
        while (questions < 10) {
            int num = (int) (Math.random() * 10) + 1;
            int num2 = (int) (Math.random() * 10) + 1;
            System.out.println("What is " + num + " * " + num2 + "?");
            int answer = num * num2;
            int answerGiven = scanner.nextInt();
            if (answer == answerGiven) {
                System.out.println("That's right!\n");
                score = score + 1;
                questions = questions + 1;
            }else {
                System.out.println("That's incorrect.\n");
                questions = questions + 1;
            }
        if (score == 10 && questions == 10) {
            System.out.println("You got a full score!");
            System.out.println("Congratulations for mastering the multiplication tables!");
        }else if (score != 10 && questions == 10){
            System.out.println("Your score was " + score + " out of 10.");
            System.out.println("You got less than full core, starting new set of problems \n");
            score = 0;
            questions = 0;
        }
        }

    }
}

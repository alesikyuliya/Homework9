import java.util.Random;
import java.util.Scanner;

public class Homework9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int pcNumber = random.nextInt(10);

        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter the a number in the range from 0 to 10");
            int tryNumber = scanner.nextInt();
            if (tryNumber == pcNumber){
                System.out.println("You win");
                break;

            }
        }
        scanner.close();


    }

}

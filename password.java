import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = "andijashari";
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Te lutem shkruaje passwordin: ");
            String x = input.nextLine();

            if (!x.equals(password)) {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Wrong! You have " + attempts + " attempts left.");
                } else {
                    System.out.println("Wrong! Get out of here.");
                }
            } else {
                System.out.println("Welcome!");
                break;
            }
        }
        
        input.close();
    }
}
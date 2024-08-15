import java.util.Scanner;

public class parking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.println("Enter the amount of hours you parked here: ");
            int hours = input.nextInt();
            int qmimi = 2;
            System.out.println("Shuma eshte " + (hours * qmimi) + " euro!");
        } catch (Exception e) {
            System.out.println("Please enter a valid integer.");
        } finally {
            input.close();
        }
    }
}
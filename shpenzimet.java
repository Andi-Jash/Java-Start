import java.util.Scanner;

public class shpenzimet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Shkruaj shpenzimet mujore ne ushqim: ");
        int ushqimi = scanner.nextInt();
        
        System.out.println("Shkruaj shpenzimet mujore ne transport: ");
        int transporti = scanner.nextInt();
        
        System.out.println("Shkruaj shumen e qiras: ");
        int qiraja = scanner.nextInt();
        
        if (ushqimi > 100) {
            System.out.println("Ke hargju pak shum kujdes heren tjeter");
        }
        
        if (transporti > 100) {
            System.out.println("Ke hargju shum kujdes heren tjeter");
        }


        int shuma = ushqimi + transporti + qiraja;


        System.out.println("Shpenzimet tua totale ne kete muaj duke perfshir ushqimin, transportin dhe qiran jane " + shuma);
        

        scanner.close();
    }
}


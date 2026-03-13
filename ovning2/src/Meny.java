package src;

import java.util.Scanner;

public class Meny {
    public Meny(){
        Scanner sc = new Scanner(System.in);
        boolean drift = true;
        while(drift) {
            printMenu();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sayHello();
                    break;
                case 2:
                    tellJoke();
                    break;

                case 0:
                    drift = false;
                    break;
            }
        }
        System.out.println("Program avslutat!");
    }
    public void printMenu(){
        System.out.println("===Min meny===");
        System.out.println("1. Säg hej");
        System.out.println("2. Berätta ett skämt");
        System.out.println("0. Avsluta");
        System.out.println("Välj:");
    }
    public void sayHello(){
        System.out.println("Hej på dig!");
    }
    public void tellJoke(){
        System.out.println("Jag köpte skor av en knarklangare");
        System.out.println("Vet inte vad de var spetsade med");
    }
}

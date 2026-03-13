package src;

import java.util.Scanner;

public class Greeting {
    public Greeting(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hej och Välkommen!");
        System.out.println("Var vänlig och skriv in ditt namn!");
        String userName = sc.nextLine();
        System.out.println("Var vänlig och skriv in din ålder");
        int userAge = sc.nextInt();
        System.out.println("Hej "+ userName+", du är " + userAge + " år gammal");


    }
}

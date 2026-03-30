package bok;

import java.util.Scanner;

public class Menu {
    public Menu(){
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("Srkiv in användarnamn");
                String userName = sc.nextLine();
                System.out.println("Skriv in lösernord");
                String userPassword = sc.next();
                break;
            case 0:


        }

    }
}

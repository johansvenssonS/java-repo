import java.util.Scanner;

public class Menu {
    public Menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv in 1");
        int choice = sc.nextInt();
        sc.nextLine(); //För tömma grejen
        switch (choice){
            case 1:
                System.out.println("Srkiv in användarnamn");
                String userName = sc.nextLine();
                System.out.println("Skriv in lösernord");
                String userPassword = sc.nextLine();
                break;
            case 0:


        }

    }
}

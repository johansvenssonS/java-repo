import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class LoanController {
    LoanService loanService = new LoanService();

    Scanner scanner = new Scanner(System.in);


    public void showLoanMenu() {

        boolean active = true;

        while (active) {
            System.out.println("----Member menu----");
            System.out.println("1. Show all Loans");
            System.out.println("0. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ArrayList<Loan> loans = loanService.getAllLoans();
                    for (Loan l : loans) {
                        System.out.println(l.toString());
                    }
                    break;

                case 2:

                    break;

                case 3:
                    break;

                case 4:
                case 5:
                case 6:

                case 0:
                    active = false;
                    break;
            }
        }
    }
}


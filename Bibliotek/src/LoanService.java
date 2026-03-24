import java.util.ArrayList;

public class LoanService {
    LoanRepository loanRepository = new LoanRepository();

    public ArrayList <Loan> getAllLoans(){
        ArrayList <Loan> loans = loanRepository.getAllLoans();
        return loans;
    }
}

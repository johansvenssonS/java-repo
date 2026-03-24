import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

public class LoanRepository {
    private final String URL = "jdbc:mysql://localhost:3307/bibliotek";
    private final String USER = "root";
    private final String PASSWORD = "1234";

    public ArrayList<Loan> getAllLoans(){

        ArrayList<Loan> loans = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery("SELECT * FROM loans");

            while (rs.next()) {
                int id = rs.getInt("id");
                int book_id = rs.getInt("book_id");
                int member_id = rs.getInt("member_id");
                Date loan_date = rs.getDate("loan_date");
                Date due_date = rs.getDate("due_date");
                Date returnDate = rs.getDate("return_date");
                String status = rs.getString("status");

                Loan loan = new Loan(id, book_id, returnDate, status, due_date, loan_date, member_id);
                loans.add(loan);

            }
        } catch (SQLException e) {
            System.out.println("Fel: " + e.getMessage());
        }
        return loans;
        }
}

import java.util.Date;

public class Loan {
    private int id;
    private int bookId;
    private int memberId;
    private Date loanDate;
    private String dueDate;
    private String returnDate;
    private String status;

    public Loan(int bookId, int memberId, Date loanDate, String dueDate, String status) {
        this.bookId = bookId;
        this.memberId = memberId;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.status = status;
    }
    public int getId() {
        return id;
    }

    public int getBookId() {
        return bookId;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getDueDate() {
        return dueDate;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public String getStatus() {
        return status;
    }
    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", bookId=" + bookId +
                ", memberId=" + memberId +
                ", status='" + status + '\'' +
                '}';
    }
}

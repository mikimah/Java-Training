package day2.classes;
import day2.enums.LoanStatus;
import day2.classes.Book;
import day2.classes.Member;
import java.util.Date;
public class Loan {
    private static int totalLoan =0;
    private int loanId;
    private Member member;
    private Book book;
    private Date startDate;
    private Date endDate;
    private LoanStatus status;

    public Loan(Member m,Book b){
        this.loanId = totalLoan+1;
        this.member = m;
        this.book = b;
        this.startDate = new Date();
        this.endDate = new Date(this.startDate.getTime() + 7 * 24 * 60 * 60 * 1000);
        this.status = LoanStatus.BORROWING;
    }

    public boolean returnBook(){
        setStatus(LoanStatus.RETURNED);
        return true;
    }


    @Override
    public String toString() {
        Date temp = new Date();
        if(temp.after(endDate)) setStatus(LoanStatus.OVERDUE);
        return "Id: "+loanId+ " | Member: "+member.getMemName()+" | Book: "+book.getBookName()+" | Status: "+status;
    }

    public static int getTotalLoan() {
        return totalLoan;
    }

    public static void setTotalLoan(int totalLoan) {
        Loan.totalLoan = totalLoan;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LoanStatus getStatus() {
        return status;
    }

    public void setStatus(LoanStatus status) {
        this.status = status;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}

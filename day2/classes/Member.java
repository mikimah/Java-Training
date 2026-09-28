package day2.classes;

import day2.interfaces.LoanAction;

import java.util.ArrayList;
import java.util.List;
import day2.classes.Book;
import day2.enums.BookStatus;

public class Member implements LoanAction {
    private static int totalMem = 0;
    private int memId;
    private String memName;
    private List<Book> borrowBook = new ArrayList<>();

    public Member(String memName) {
        this.memId = totalMem + 1;
        this.memName = memName;

        totalMem++;
    }

    public int getMemId(){
        return memId;
    }

    public String getMemName(){return memName;}

    @Override
    public boolean borrowBook(Book book) throws Exception {
        if (book.geStatus() == BookStatus.AVALIABLE) {
            borrowBook.add(book);
            book.setStatus(BookStatus.NOT_AVALIABLE);
            return true;
        } else
            return false;
    }

    @Override
    public boolean returnBook(Book book) throws Exception {
        if (book.geStatus() == BookStatus.NOT_AVALIABLE) {
            borrowBook.remove(book);
            book.setStatus(BookStatus.AVALIABLE);
            return true;
        } else
            return false;
    }

    @Override
    public String toString() {
        return "Id: " + memId + " | Name: " + memName + " | Borrow: " + borrowBook + "";
    }
}

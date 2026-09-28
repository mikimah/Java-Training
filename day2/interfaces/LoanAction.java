package day2.interfaces;
import day2.classes.Book;

public interface LoanAction {
    boolean borrowBook(Book book) throws Exception;
    boolean returnBook(Book book) throws Exception;
}

package day2.classes;
import day2.enums.BookStatus;

public class Book {
    private static int totalBook = 0;
    private int bookId;
    private  String bookName;
    private BookStatus status;

    public Book(String bookName){
        this.bookId = totalBook + 1;
        this.bookName = bookName;
        this.status = BookStatus.AVALIABLE;

        totalBook++;
    }

    public static int getTotal(){
        return totalBook;
    }
    public String getBookName(){
        return bookName;
    }
    public int getBookId(){
        return bookId;
    }
    public BookStatus geStatus(){
        return status;
    }

    public void setStatus(BookStatus status){
        this.status = status;
    }

    @Override 
    public String toString(){
        return "Id: "+bookId+" | Book Name: "+bookName;
    }
}

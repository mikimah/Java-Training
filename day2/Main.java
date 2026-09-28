package day2;
import day2.classes.*;

public class Main {
    public static void main(String[] args){
        Book book1 = new Book("testing");
        Book book2 = new Book("testing2");
        Loan loan1 =null;
        Loan loan2 = null;
        Member mem1 = new Member("Miki");
        try{if(mem1.borrowBook(book2)){
           loan1 = new Loan(mem1,book2);
        };}catch(Exception e){};
        try{if(mem1.borrowBook(book1)){
            loan2 = new Loan(mem1,book1);
        };}catch(Exception e){};
        System.out.println(mem1);
        System.out.println(loan1);
       
    }
}

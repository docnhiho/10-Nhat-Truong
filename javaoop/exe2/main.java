package javaoop.exe2;

public class main {
    public static void main(String[] args) {
        Member member = new Member("Nhat");
        Book book = new Book("Book1" , "abc" , 2);
        member.borrowBook(book);
        member.displayBorrowedBooks();
    }
}

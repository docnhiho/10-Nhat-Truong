package javaoop.exe2;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }
    public Book findBook(String name){
        for (Book book : books){
            if(book.getTitle().equals(name)){
                return book;
            }
        }
        return null;
    }
}

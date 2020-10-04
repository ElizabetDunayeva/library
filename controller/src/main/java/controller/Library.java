package controller;

import java.util.ArrayList;
import java.util.List;
import models.Book;



public class Library {


    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private Book[] books;
    private int count;

    public Library() {

        books = new Book[1];
        this.count = 0;
    }

    public void addBook(Book p1) {

        int col = books.length;
        count++;
        if (count > books.length) {
            Book newBooks[] = new Book[2*col];

            System.arraycopy(books, 0, newBooks, 0, books.length);
            newBooks[count - 1] = p1;
            books = newBooks;


        } else {
            books[count - 1] = p1;


        }


    }
    public Book[] findByAuthor(String authorName){
        List<Book> findBooks = new ArrayList<Book>();
        for(int i=0; i<count;i++) {
            if(authorName.equalsIgnoreCase(books[i].getAuthor().getName())){
                findBooks.add(books[i]);
            }
        }
       Book[] bnew = findBooks.toArray(new Book[0]);
        return bnew;



    }
}


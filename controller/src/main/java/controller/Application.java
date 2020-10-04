package controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import org.jetbrains.annotations.NotNull;
import models.Book;
import models.Author;



public class Application {
    public static void main(@NotNull String[] args) {

        FactoryOfLibrary factory = new FactoryOfLibrary();
        Library NewLib = factory.createLibrary();

        Author author1 = new Author("Tolstoy",5);
        Author author2 = new Author("Pushkin", 10);
        Author author3 = new Author("Rowling",10);

        Book book11 = new Book("Voina i mir", author1);
        Book book21 = new Book("Posle bala", author1);
        Book book31 = new Book("Anna karenina", author1);

        Book book12 = new Book("Onegin", author2);
        Book book22 = new Book("Carevna", author2);
        Book book32 = new Book("Ryibka", author2);

        Book book13 = new Book("Harry1", author3);
        Book book23 = new Book("Harry2", author3);
        Book book33 = new Book("Harry3", author3);
        Book book43 = new Book("Harry4", author3);
        Book book53 = new Book("Harry5", author3);


        NewLib.addBook(book11);
        NewLib.addBook(book21);
        NewLib.addBook(book31);
        NewLib.addBook(book12);
        NewLib.addBook(book22);
        NewLib.addBook(book32);
        NewLib.addBook(book13);
        NewLib.addBook(book23);
        NewLib.addBook(book33);
        NewLib.addBook(book43);
        NewLib.addBook(book53);

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();


       Book books[] =  NewLib.findByAuthor("Rowling");
       for(int i=0;i<books.length;i++){

           System.out.println(gson.toJson(books[i]));

       }









    }
}

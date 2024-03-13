package ru.skypro;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Author gogol = new Author("Николай", "Гоголь");
        Author gorkiy = new Author(" Максим ", "Горький");

        Book revizor = new Book("Ревизор", 1835, gogol);
        Book mat = new Book("Мать", 1906, gorkiy);

        print(revizor);
        print(mat);

    }
    private static void print(Book book){
        System.out.println("Автор " + book.getAuthor().getName() + " " + book.getAuthor().getSurname() + " ,название: " +
                book.getTitle() + " ,год издания:" + book.getYear());

    }
}
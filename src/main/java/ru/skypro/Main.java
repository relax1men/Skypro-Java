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
        mat.setYear(2024);

    }

    private static void print(Book book) {
        System.out.println(book);

    }
}
package com.university.lab01;

import com.university.lab01.model.Book;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setId(1);
        book1.setTitle("Война и мир");
        book1.setAuthor("Толстой Л.Н.");
        book1.setYear(1893);

        Book book2 = new Book();
        book2.setId(2);
        book2.setTitle("Мастер и Маргарита");
        book2.setAuthor("Булгаков М.А.");
        book2.setYear(1967);

        Book book3 = new Book();
        book3.setId(3);
        book3.setTitle("Преступление и наказание");
        book3.setAuthor("Достоевский Ф.М.");
        book3.setYear(1866);

        System.out.println("=== Список книг ===");
        System.out.println("1. " + book1.getDescription());
        System.out.println("2. " + book2.getDescription());
        System.out.println("3. " + book3.getDescription());
    }
}
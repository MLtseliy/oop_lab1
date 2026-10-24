package com.university.lab01.model;

import java.time.Year;

/**
 * Книга: идентификатор, название, автор и год издания.
 */
public class Book {
    private static final int MIN_YEAR = 0;

    private long id;
    private String title;
    private String author;
    private int year;

    /** @return идентификатор книги */
    public long getId() {
        return id;
    }

    /** @param id идентификатор книги */
    public void setId(long id) {
        this.id = id;
    }

    /** @return название книги */
    public String getTitle() {
        return title;
    }

    /**
     * @param title название книги
     * @throws IllegalArgumentException если название null или пустое
     */
    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Название не может быть пустым");
        }
        this.title = title;
    }

    /** @return автор книги */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author автор книги
     * @throws IllegalArgumentException если автор null или пустой
     */
    public void setAuthor(String author) {
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Автор не может быть пустым");
        }
        this.author = author;
    }

    /** @return год издания */
    public int getYear() {
        return year;
    }

    /**
     * @param year год издания, от 0 до текущего года
     * @throws IllegalArgumentException если год вне допустимого диапазона
     */
    public void setYear(int year) {
        if (year < MIN_YEAR || year > Year.now().getValue()) {
            throw new IllegalArgumentException("Некорректный год: " + year);
        }
        this.year = year;
    }

    /** @return строка вида "Название" — Автор (год) */
    public String getDescription() {
        return "\"" + title + "\" — " + author + " (" + year + ")";
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
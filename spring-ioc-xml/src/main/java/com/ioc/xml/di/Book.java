package com.ioc.xml.di;

public class Book {
    private String author;
    private double money;

    public Book(){};

    public Book(String author, double money) {
        this.author = author;
        this.money = money;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", money=" + money +
                '}';
    }
}

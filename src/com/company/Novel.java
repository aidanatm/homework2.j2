package com.company;

public class Novel extends  Book {
    private  String name;
    private String author;
    private int pages;

    public Novel(String name, String author, int pages) {
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public void print() {
        System.out.println("Название: " + name + "Автор: " + author + "Количество страниц: " + pages);
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        Printable novel = createObjects("Novel");
        Printable fantasy = createObjects("Fantasy");
        Printable psychology = createObjects("Psychology");

        novel.print();
        fantasy.print();
        psychology.print();
    }

    public static Printable createObjects(String className) {
        Printable print = null;
        switch (className) {
            case "Fantasy":
                print = new Fantasy("Harry Potter and the cursed child","Joanne Rowling",480);
                break;
            case "Psychology":
                print = new Psychology("Art of Public Speaking","Dale Carnegie",528);
                break;
            case "Novel":
                print = new Novel("Pride and Prejudice", "Jane Austen", 284);
                break;

        }
        return print;
    }

}

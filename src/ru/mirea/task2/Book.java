package ru.mirea.task2;

public class Book {
    private String author;
    private String izdatel;
    private String name;

    public Book(String author, String izdatel, String name){
    }

    public String getAutor(String author) {
        return author;
    }

    public String getIzdatel(String izdatel) {

        return izdatel;
    }

    public String getName(String name) {

        return name;
    }

    public String printInfo(String author, String izdatel, String name) {
        String info = (author+" "+izdatel+" "+name);
        return info;
    }

    public String toString()
    {
        return author + " " + izdatel + " " + name;
    }

    public static void main(String[] args){
        Book book1 = new Book("Kruchinin T.M", "MIREA", "Posobie");
        System.out.println(book1.toString());
    }

}

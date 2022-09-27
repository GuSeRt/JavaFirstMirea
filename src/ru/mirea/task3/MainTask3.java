package ru.mirea.task3;

public class MainTask3 {

    public static void main(String[] args) {

        // Circle
        Circle c0 = new Circle();
        Circle c1 = new Circle(2);

        System.out.println("radius c0: "+ c0.getRadius());
        c1.setRadius(5);
        System.out.println("radius c1: "+ c1.getRadius());
        System.out.println("c1 circumference: "+ c1.getCircumference());
        System.out.println();

        //Human
        Human Kennedy = new Human();
        Human Steve = new Human(10,10,10);

        if (Kennedy.isAlive()){
            System.out.println("Miracles happen!");
        } else {
            System.out.println("Oswald's carbine are good");
        }
        Steve.sewHand(5);
        Steve.trimHead(5);
        Steve.getHuman();

        //Book
        Book bk0 = new Book();
        Book bk1 = new Book("Pholisipher's Stone","J. K. Rowling",1997);
        Book bk2 = new Book("Chamber of Secrets","J. K. Rinling",1998);
        Book bk3 = new Book("Prisoner of Azkaban","J. K. Rinling",1800);

        System.out.println(bk0);

        bk1.setTitle("Philosopher's Stone");
        bk2.setAuthor("J. K. Rowling");
        bk3.setPublish_year(1999);

        System.out.println(bk1);
        System.out.println(bk2);
        System.out.println(bk3);
    }
}

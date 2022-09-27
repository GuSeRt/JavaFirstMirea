package ru.mirea.task4;

public class TestAuthor {


    public static void main(String[] args) {
        Author a0 = new Author("Margo", "xxx_gamer_xxx@author.com", 'F');
        Author a1 = new Author("Feli", "deli@author.com", 'U');
        Author a2 = new Author("Jessi", "jessi@author.com", 'F');
        Author a3 = new Author("Alex", "alex@author.com", 'M');

        a0.setEmail("margo@author.com");

        System.out.println(a1.getName());
        System.out.println(a2.getEmail());
        System.out.println(a3.getGender());
        System.out.println(a0);
    }
}

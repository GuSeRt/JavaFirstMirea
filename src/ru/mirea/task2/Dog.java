package ru.mirea.task2;



public class Dog {
    int age;
    String name;

    public Dog(String n, int a){
        name = n;
        age = a;
    }

    public String toString()
    {
        return name + " " + age;
    }

    public void setName(String n) {

        name=n;}

    public void setAge(int a) {
        age=a;
    }

    public int HumanDogAge(int a){
        return a*7;
    }

    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Dusya", 3);
        System.out.println(dog1.toString());
        System.out.println(dog1.HumanDogAge(dog1.age));
    }
}

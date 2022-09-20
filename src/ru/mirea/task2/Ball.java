package ru.mirea.task2;

public class Ball {
    private float radius;

    public Ball(float r){
        radius=r;
    }

    public float getRadius() {
        return radius;
    }

    public float getDiametr() {
        return radius*2;
    }

    public void setWidth(float r) {
        radius=r;
    }

    public double getarea(float r){
        double area = 4*3.14*r*r;
        return area;
    }

    public double getVolume(float r){
        double volume;
        volume = (4/3)*3.14*r*r*r;
        return volume;
    }


    public static void main(String[] args){
        Ball ball1 = new Ball(25);
        double a = ball1.getarea(ball1.radius);
        System.out.println(a);
    }
}

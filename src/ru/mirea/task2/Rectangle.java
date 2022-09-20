package ru.mirea.task2;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int w, int h){
        width=w;
        height=h;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int w) {
        width=w;
    }

    public void setHeight(int h) {
        height=h;
    }

    public int getarea(int w,int h){
        int area = w*h;
        return area;
    }


    public static void main(String[] args){
        Rectangle rect = new Rectangle(20, 10);
        int a = rect.getarea(rect.width,rect.height);
        System.out.println(a);
    }
}

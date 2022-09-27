package ru.mirea.task3;

public class Human {
    private int head;
    private int leg;
    private int hand;

    public Human(){
        head = 0;
        leg = 0;
        hand = 0;
    }
    public Human(int head, int leg, int hand){
        this.head = head;
        this.leg = leg;
        this.hand = hand;
    }

    public void trimHead(int x){
        head-=x;
    }
    public void trimLeg(int x){
        leg-=x;
    }
    public void trimHand(int x){
        hand-=x;
    }
    public void sewHead(int x){
        head+=x;
    }
    public void sewLeg(int x){
        leg+=x;
    }
    public void sewHand(int x){
        hand+=x;
    }
    public boolean isAlive(){
        return this.head > 0;
    }
    public void getHuman(){
        System.out.println("\nHead: " + this.head +
                "\nLeg: " + this.leg +
                "\nHand: " + this.hand);
    }
}


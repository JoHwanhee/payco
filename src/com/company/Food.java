package com.company;

public class Food {
    private String name;
    private int price;
    private int remaining;

    public void eat(){
        if(canEat()){
            reduce();
        }
    }

    public String toString(){
        return "this is " + name + "(" + price + ")";
    }

    private boolean canEat(){
        return remaining > 0;
    }

    private void reduce(){
        remaining -= 10;
    }
}

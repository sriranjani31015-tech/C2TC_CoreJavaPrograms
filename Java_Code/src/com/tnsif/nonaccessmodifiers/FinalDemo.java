package com.tnsif.nonaccessmodifiers;

public class FinalDemo {

    final int var = 100;

    final void display() {
        System.out.println("Show the value of var: " + var);
    }

    public static void main(String[] args) {
        FinalDemo fd = new FinalDemo();
        fd.display();
    }
}

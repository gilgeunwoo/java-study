package com.example.javastudy2.cooperation;

public class Bean {
    static int money;
    static int guestCount;

    public Bean() { }

    public void buyAmericano(int money) {
        this.money += money;
        guestCount++;
    }

    public void buyLatte(int money) {
        this.money += money;
        guestCount++;
    }

    public void showInfo() {
        System.out.println("bean user " + guestCount + " money "  + money + " !! ");
    }
}

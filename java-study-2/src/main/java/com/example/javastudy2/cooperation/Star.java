package com.example.javastudy2.cooperation;

public class Star {
    static int money;
    static int guestCount;

    public Star() { }

    public void buyAmericano(int money) {
        this.money += money;
        guestCount++;
    }

    public void buyLatte(int money) {
        this.money += money;
        guestCount++;
    }

    public void showInfo() {
        System.out.println("star user " + guestCount + " money " + money + " !! ");
    }
}

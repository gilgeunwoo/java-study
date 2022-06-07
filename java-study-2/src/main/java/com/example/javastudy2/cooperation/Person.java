package com.example.javastudy2.cooperation;

public class Person {
    public String personName;
    public int age;
    public int money;

    public Person(String personName, int money) {
        this.personName = personName;
        this.money = money;
    }

    public void buyCoffeeInStar(int coffee) {
        Star star = new Star();
        if(coffee == 1) {
            star.buyLatte(4500);
        }
        else if(coffee == 2) {
            star.buyAmericano(4000);
        }
    }

    public void buyCoffeeInBean(int coffee) {
        Bean bean = new Bean();
        if(coffee == 1) {
            bean.buyLatte(4500);
        }
        else if(coffee == 2) {
            bean.buyAmericano(4000);
        }
    }
}

package com.example.javastudy2.cooperation;

public class BuyCoffee {
    public static void main(String[] args) {
        Person personKim = new Person("kim", 10000);
        Person personLee = new Person("lee", 50000);

        Star star = new Star();
        Bean bean = new Bean();

        personKim.buyCoffeeInStar(2);
        personKim.buyCoffeeInStar(2);
        personKim.buyCoffeeInStar(1);
        personLee.buyCoffeeInBean(1);

        star.showInfo();
        bean.showInfo();
    }
}

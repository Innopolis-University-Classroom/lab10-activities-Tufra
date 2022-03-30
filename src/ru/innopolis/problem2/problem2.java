package ru.innopolis.problem2;// your solution here
//fix all the errors including package errors

public class problem2 {
    public static void main(String[] args) {
        Burger bg = new BurgerBuilder()
                .setCheese(true)
                .setLetucci(false)
                .setSize(Size.BIG)
                .setTomato(true)
                .setPeperone(true)
                .build();

        bg.print();
    }
}

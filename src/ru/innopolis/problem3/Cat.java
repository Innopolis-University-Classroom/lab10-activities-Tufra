package ru.innopolis.problem3;

public class Cat implements AbstractAnimal {
    private String color;

    public Cat(String color) {
        this.color = color;
    }

    @Override
    public void talk() {
        System.out.println(color + "cat");
    }
}

package ru.innopolis.problem3;

public class Dog implements AbstractAnimal {
    private String color;

    public Dog(String color) {
        this.color = color;
    }

    @Override
    public void talk() {
        System.out.println(color + "dog");
    }
}

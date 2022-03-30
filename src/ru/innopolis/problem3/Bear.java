package ru.innopolis.problem3;

public class Bear implements AbstractAnimal{
    private String color;

    public Bear(String color) {
        this.color = color;
    }

    @Override
    public void talk() {
        System.out.println(color + "dog");
    }
}

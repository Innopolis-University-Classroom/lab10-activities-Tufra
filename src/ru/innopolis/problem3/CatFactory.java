package ru.innopolis.problem3;

public class CatFactory implements AbstractFactory {
    @Override
    public AbstractAnimal produceYellow() {
        return new Cat("yellow");
    }

    @Override
    public AbstractAnimal produceBrown() {
        return new Cat("brown");
    }

    @Override
    public AbstractAnimal produceWhite() {
        return new Cat("white");
    }
}

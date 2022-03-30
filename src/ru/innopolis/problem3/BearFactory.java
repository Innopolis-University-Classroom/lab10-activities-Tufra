package ru.innopolis.problem3;

public class BearFactory implements AbstractFactory {
    @Override
    public AbstractAnimal produceYellow() {
        return new Bear("yellow");
    }

    @Override
    public AbstractAnimal produceBrown() {
        return new Bear("brown");
    }

    @Override
    public AbstractAnimal produceWhite() {
        return new Bear("white");
    }
}

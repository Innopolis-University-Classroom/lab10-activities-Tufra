package ru.innopolis.problem3;

public class DogFactory implements AbstractFactory {
    @Override
    public AbstractAnimal produceYellow() {
        return new Dog("yellow");
    }

    @Override
    public AbstractAnimal produceBrown() {
        return new Dog("brown");
    }

    @Override
    public AbstractAnimal produceWhite() {
        return new Dog("white");
    }
}

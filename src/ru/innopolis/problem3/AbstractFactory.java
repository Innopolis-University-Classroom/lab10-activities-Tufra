package ru.innopolis.problem3;

public interface AbstractFactory {
    AbstractAnimal produceYellow();
    AbstractAnimal produceBrown();
    AbstractAnimal produceWhite();
}

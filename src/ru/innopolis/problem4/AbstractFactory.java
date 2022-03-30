package ru.innopolis.problem4;

public interface AbstractFactory {
    Door produceDoor(WoodenEmployee employee);
    Door produceDoor(IronEmployee employee);
}

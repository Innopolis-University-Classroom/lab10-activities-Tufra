package ru.innopolis.problem4;

public class WoodenDoorFactory implements AbstractFactory {
    @Override
    public Door produceDoor(WoodenEmployee employee) {
        return new WoodenDoor();
    }

    @Override
    public Door produceDoor(IronEmployee employee) {
        return null;
    }
}

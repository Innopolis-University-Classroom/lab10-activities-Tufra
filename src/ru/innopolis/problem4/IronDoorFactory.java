package ru.innopolis.problem4;

public class IronDoorFactory implements AbstractFactory{
    @Override
    public Door produceDoor(IronEmployee employee) {
        return new IronDoor();
    }

    @Override
    public Door produceDoor(WoodenEmployee employee) {
        return null;
    }
}

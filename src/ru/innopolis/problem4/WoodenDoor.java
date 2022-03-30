package ru.innopolis.problem4;

public class WoodenDoor implements Door{
    @Override
    public void open() {
        System.out.println("opens");
    }

    @Override
    public void close() {
        System.out.println("closes");
    }
}

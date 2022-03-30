package ru.innopolis.problem4;

public class IronDoor implements Door{
    @Override
    public void open() {
        System.out.println("opens");
    }

    @Override
    public void close() {
        System.out.println("closes");
    }
}

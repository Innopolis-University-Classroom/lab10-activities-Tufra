package ru.innopolis.problem3;// your solution here
//fix all the errors including package errors

public class problem3 {
    public static void main(String[] args) {
        AbstractFactory f = new CatFactory();

        f.produceYellow().talk();

        AbstractFactory f2 = new BearFactory();

        f2.produceWhite().talk();
    }
}

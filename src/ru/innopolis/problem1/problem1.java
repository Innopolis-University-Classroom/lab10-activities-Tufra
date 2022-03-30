package ru.innopolis.problem1;
// your solution here
//fix all the errors including package errors
class problem1 {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape(Shapes.CIRCLE);
        circle.print();

        Shape square = ShapeFactory.getShape(Shapes.SQUARE);
        square.print();
    }
}

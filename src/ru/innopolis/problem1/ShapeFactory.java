package ru.innopolis.problem1;

public class ShapeFactory {
    public static Shape getShape(Shapes shape) {
        switch (shape) {
            case CIRCLE: {
                return new Circle();
            }
            case SQUARE: {
                return new Square();
            }
            case RECTANGLE: {
                return new Rectangle();
            }
        }
        return null;
    }
}

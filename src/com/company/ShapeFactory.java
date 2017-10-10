package com.company;

public class ShapeFactory {
    public Shape getShape(String type){
        if (type.equals(null)) {
            return null;
        }
        else if (type.toLowerCase().equals("rectangle")) {
            return new Rectangle();
        }
        else if (type.toLowerCase().equals("triangle")) {
            return new Triangle();
        }
        else if (type.toLowerCase().equals("square")) {
            return new Square();
        }
        return null;
    }
}

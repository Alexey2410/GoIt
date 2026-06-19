package org.goit.module8;

import org.goit.module8.impl.*;

public class ShapeTest {

    private void printName(Shape shape){
        System.out.println(shape.getName());
    }

    static void main(String[] args) {
        ShapeTest shapeTest = new ShapeTest();

        Shape circle = new Circle();
        //Circle
        shapeTest.printName(circle);
        Shape heart = new Heart();
        //Heart
        shapeTest.printName(heart);
        Shape pentagon = new Pentagon();
        //Pentagon
        shapeTest.printName(pentagon);

        Shape rhombus = new Rhombus();
        //Rhombus
        shapeTest.printName(rhombus);
        Shape square = new Square();
        //Square
        shapeTest.printName(square);

        Star star = new Star();
        //Star
        shapeTest.printName(star);

    }
}

package com.codeli4m.examenparcial2;

import com.codeli4m.examenparcial2.models.AreasStorage;
import com.codeli4m.examenparcial2.models.Shape;

import com.codeli4m.examenparcial2.models.Rectangle;
import com.codeli4m.examenparcial2.models.Ellipse;
import com.codeli4m.examenparcial2.models.Coordinates;
import com.codeli4m.examenparcial2.models.Square;
import com.codeli4m.examenparcial2.models.Circle;

/**
 *
 * @author codeli4m
 */
public class ExamenParcial2 {

    public static void main(String[] args) {
        System.out.println("Empezando aplicacion!");
        Coordinates point = new Coordinates(50, 50);
        Coordinates point2 = new Coordinates(180, 60);
        
        // Rectangle class
        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Naranja");
        rectangle.setName('r');
        rectangle.setCenterPoint(point);
        
        rectangle.setWidth(80);
        rectangle.setHeight(150);
        
        // Ellipse class
        Ellipse ellipse = new Ellipse();
        ellipse.setColor("Purpura");
        ellipse.setName('e');
        ellipse.setCenterPoint(point);
        
        ellipse.setMinorAxis(20);
        ellipse.setMajorAxis(30);
        
        // Square class
        Square square = new Square();
        square.setColor("Amarillo");
        square.setName('s');
        square.setCenterPoint(point2);
        
        square.setWidth(80);
        
        // Circle class 
        Circle circle = new Circle();
        circle.setColor("Azul");
        circle.setName('c');
        circle.setCenterPoint(point2);        
        
        circle.setMinorAxis(40);
        
        System.out.println("Making an array of shapes");
        Shape[] shapes = { rectangle, ellipse, square, circle };
        for (Shape shape : shapes) {
            shape.setColor("Blanco");
            shape.translateCenterPoint(800, 820);
            // 6. Imprimir el area de cada objeto
            System.out.println(shape.getInfo());
            double shapeArea = shape.getArea();
            System.out.println("Shape area -> "+shapeArea);
            System.out.println("");
        }
        
        Shape shapeWithMaxArea = AreasStorage.getMaxAreaShape(shapes);
        System.out.println("La figura con el area mas grande es");
        System.out.println(shapeWithMaxArea.getInfo());
    }
}

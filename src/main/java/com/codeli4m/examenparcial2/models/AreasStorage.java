package com.codeli4m.examenparcial2.models;

import java.util.ArrayList;

/**
 *
 * @author codeli4m
 */
abstract public class AreasStorage {
    // What good are static classes? A good use of a static class is in defining one-off, utility and/or library classes where instantiation would not make sense.    
    static public Shape getMaxAreaShape(Shape[] shapes){
        Shape res = null;
        int indexMaxArea = 0;
        double maxArea = shapes[0].getArea();        
        for (int i=0; i<shapes.length; i++ ) {
            double currentArea = shapes[i].getArea();
            if (currentArea > maxArea){
                maxArea = currentArea;
                indexMaxArea = i;
            }
        }
        res = shapes[indexMaxArea];
        return res;
    }
    
    static public Shape getMaxAreaShape(ArrayList<Shape> shapes){
        Shape res = null;
        int indexMaxArea = 0;
        double maxArea = shapes.get(0).getArea();
        for (int i=0; i<shapes.size(); i++ ) {
            double currentShapeArea = shapes.get(i).getArea();
            if (currentShapeArea > maxArea){
                maxArea = currentShapeArea;
                indexMaxArea = i;
            }
        }
        // return the object where indexMaxArea is located
        res = shapes.get(indexMaxArea);
        return res;
    }
}

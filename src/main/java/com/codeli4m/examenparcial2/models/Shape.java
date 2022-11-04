package com.codeli4m.examenparcial2.models;

/**
 *
 * @author codeli4m
 */
public abstract class Shape {
    String color;
    Coordinates centerPoint;
    char name;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Coordinates getCenterPoint() {
        return centerPoint;
    }

    public void setCenterPoint(Coordinates centerPoint) {
        this.centerPoint = centerPoint;
    }
    
    public void moveCenterPoint(int distanceX, int distanceY){
        this.centerPoint.setX(this.centerPoint.getX()+distanceX);
        this.centerPoint.setY(this.centerPoint.getY()+distanceX);        
    }

    public void translateCenterPoint(int finalX, int finalY){
        this.centerPoint.setX(finalX);
        this.centerPoint.setY(finalY);        
    }    
    
    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }
    
    public String getInfo() {
        String info = "";
        info += "Nombre -> "+name+"\n";        
        info += "Color -> "+color+"\n"; 
        info += "Punto centro -> "+"("+centerPoint.getX()+", "+centerPoint.getY()+")";        
        return info;
    }

    public abstract double getArea();   
    
    public abstract double getPerimeter();
    
}

package com.codeli4m.examenparcial2.models;

/**
 *
 * @author codeli4m
 */
public class Rectangle extends Shape{
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (this.width * this.height);
    }

    @Override
    public double getPerimeter() {
        return (this.width * 2 + this.height * 2);
    }
    
    @Override
    public String getInfo(){
        String info = "Rectangulo"+"\n";
        info += super.getInfo()+"\n";
        info += "Ancho -> "+getWidth()+"\n";
        info += "Alto -> "+getHeight()+"\n";
        info += "Perimetro-> "+getPerimeter()+"\n";
        info += "Area -> "+getArea();
        return info;
    }
    
    public void scale(int value){
        this.width = width * value;
        this.height = height * value;
    }
    
}

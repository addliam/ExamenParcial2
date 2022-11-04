package com.codeli4m.examenparcial2.models;

/**
 *
 * @author codeli4m
 */
public class Ellipse extends Shape {
    
    private double minorAxis;
    private double majorAxis;

    public double getMinorAxis() {
        return minorAxis;
    }

    public void setMinorAxis(double minorAxis) {
        this.minorAxis = minorAxis;
    }

    public double getMajorAxis() {
        return majorAxis;
    }

    public void setMajorAxis(double majorAxis) {
        this.majorAxis = majorAxis;
    }
    
    @Override
    public double getArea() {
        return (this.minorAxis * this.majorAxis * Math.PI);
    }

    @Override
    public double getPerimeter() {
        double valueToSquare = (this.minorAxis * this.minorAxis + this.majorAxis * this.majorAxis)/2;
        return (2 * Math.PI * Math.sqrt(valueToSquare));        
    }

    @Override
    public String getInfo(){
        String info = "Ellipse"+"\n";
        info += super.getInfo()+"\n";
        info += "Eje menor -> "+getMinorAxis()+"\n";
        info += "Eje mayor -> "+getMajorAxis()+"\n";
        info += "Perimetro-> "+getPerimeter()+"\n";
        info += "Area -> "+getArea();
        return info;
    }    
    
}

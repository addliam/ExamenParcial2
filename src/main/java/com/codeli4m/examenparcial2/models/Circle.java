package com.codeli4m.examenparcial2.models;

/**
 *
 * @author codeli4m
 */
public class Circle extends Ellipse{
    
    // 4. Violation of Likov's Substitution Principle
    // La solucion es que Cirlcle y Ellipse hereden de Shape pero siendo hermanos
    // Circle - setRadio, area
    // Ellipse - setWidth, setHeight, area
    
    @Override
    public void setMajorAxis(double majorAxis) {
        super.setMajorAxis(majorAxis);
        super.setMinorAxis(majorAxis);        
    }

    @Override
    public void setMinorAxis(double minorAxis) {
        super.setMinorAxis(minorAxis);
        super.setMajorAxis(minorAxis);        
    }
    
    @Override
    public String getInfo(){
        String info = "Circle"+"\n";
        info += super.getInfo();  
        return info;
    }    
    
}

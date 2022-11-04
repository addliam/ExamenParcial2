package com.codeli4m.examenparcial2.models;

/**
 *
 * @author codeli4m
 */
public class Square extends Rectangle{

    // 3. Violation of Likov's Substitution Principle
    // La solucion es que Square y Rectangle hereden de Shape pero siendo hermanos
    // Square - setSize, area
    // Rectangle - setWidth, setHeight, area
    
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);        
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);        
    }
    
    @Override
    public String getInfo(){
        String info = "Square"+"\n";
        info += super.getInfo();  
        return info;
    }
    
}

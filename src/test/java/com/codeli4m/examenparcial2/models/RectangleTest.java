package com.codeli4m.examenparcial2.models;

import com.codeli4m.examenparcial2.models.Coordinates;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author codeli4m
 */
public class RectangleTest {
    
    public RectangleTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//    
//    @BeforeEach
//    public void setUp() {
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    }

    /**
     * Test of getWidth method, of class Rectangle.
     */
    @org.junit.jupiter.api.Test
    public void testGetWidth() {
        System.out.println("getWidth");
        Rectangle instance = new Rectangle();
        instance.setWidth(800);
        double expResult = 800.0;
        double result = instance.getWidth();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setWidth method, of class Rectangle.
     */
    @org.junit.jupiter.api.Test
    public void testSetWidth() {
        System.out.println("setWidth");
        double width = 200.0;
        Rectangle instance = new Rectangle();
        instance.setWidth(width);
        assertEquals(width,instance.getWidth());
    }

    /**
     * Test of getHeight method, of class Rectangle.
     */
    @org.junit.jupiter.api.Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Rectangle instance = new Rectangle();
        instance.setHeight(1800);
        double expResult = 1800.0;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setHeight method, of class Rectangle.
     */
    @org.junit.jupiter.api.Test
    public void testSetHeight() {
        System.out.println("setHeight");
        double height = 220.0;
        Rectangle instance = new Rectangle();
        instance.setHeight(height);
        assertEquals(height,instance.getHeight());
    }

    /**
     * Test of area method, of class Rectangle.
     */
    @org.junit.jupiter.api.Test
    public void testArea() {
        System.out.println("area");
        int expResult = 5000;
        Rectangle instance = new Rectangle();
        instance.setCenterPoint(new Coordinates(30,50));
        instance.setWidth(100);
        instance.setHeight(50);
        double result = instance.getArea();
        assertEquals(expResult, result);
    }    

    /**
     * Test of getPerimeter method, of class Rectangle.
     */
    @org.junit.jupiter.api.Test
    public void testGetPerimeter() {
        System.out.println("getPerimeter");
        Rectangle instance = new Rectangle();
        double expResult = 500.0;
        instance.setWidth(150);
        instance.setHeight(100);
        double result = instance.getPerimeter();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getInfo method, of class Rectangle.
     */
//    @org.junit.jupiter.api.Test
//    public void testGetInfo() {
//        System.out.println("getInfo");
//        Rectangle instance = new Rectangle();
//        String expResult = "";
//        String result = instance.getInfo();
//        assertEquals(expResult, result);
//    }

    /**
     * Test of scale method, of class Rectangle.
     */
    @org.junit.jupiter.api.Test
    public void testScale() {
        System.out.println("scale");
        double expResult[] = { 160, 80 } ;
        Rectangle instance = new Rectangle();
        instance.setWidth(80);
        instance.setHeight(40);
        instance.scale(2);
        double result[] = { instance.getWidth(), instance.getHeight() };
        assertArrayEquals(expResult, result, "The test for scale");
    }
}

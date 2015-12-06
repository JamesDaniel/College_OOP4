/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author t00126681
 */
public class Circle {
    private double radius;
    
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public double getArea()
    {
        return Math.PI * (radius * radius);
    }
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }
}

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
public class Car {
    private double fuel;
    private double efficiency;
    
    public Car(double efficiency)
    {
        this.efficiency = efficiency; 
        this.fuel = 0;
    }
    public void drive(double miles)
    {
        this.fuel -= miles / efficiency;
    }
    public double getFuel()
    {
        return fuel;
    }
    public void addFuel(double fuel)
    {
        this.fuel += fuel;
    }
}

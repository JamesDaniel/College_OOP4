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
public class Die {
    private int faceValue;
    public Die()
    {
        this.faceValue = 1;
    }
    public int roll()
    {   
        faceValue = (int)(Math.random() * 6) + 1;
        return faceValue;
    }
    public int getFaceValue()
    {
        return faceValue;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.JOptionPane;

/**
 *
 * @author t00126681
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c1 = new Circle(5); // input 5
        
        double area = c1.getArea();
        
        JOptionPane.showMessageDialog(null, area);      //expect 78.5
        JOptionPane.showMessageDialog(null, c1.getPerimeter()); //expect 31.4
        
        //Car myCar = new Car(30);
        //myCar.addFuel(20);
        //myCar.drive(90);
        //JOptionPane.showMessageDialog(null, "fuel left is: " + myCar.getFuel() + " gallons."); // expect 17
        
        //Die d1 = new Die();
        //System.out.println(d1.getFaceValue());
        //System.out.println(d1.roll());
        //System.out.println(d1.getFaceValue());
        
        //String[] stringList = {"hello", "yellow", "bellow", "jellow"};
        //System.out.println(search(stringList,"yellow")  ); // expect 1
        //System.out.println(search(stringList,"pellow")  ); // expect -1
        //System.out.println(search(stringList,"hello")  ); // expect 0
        //System.out.println(search(stringList,"jellow")  ); // expect 3
        
    }
    public static int search(String[] stringList, String searchString)
    {
        for (int i = 0; i < stringList.length; i++)
        {
            if (searchString.equals(stringList[i]))
                return i;
        }
        return -1;
    }
}

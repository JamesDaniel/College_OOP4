/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author t00126681
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList strings2 = new ArrayList<String>();
        LinkedList strings1 = new LinkedList<String>();
        String[] strings3 = new String[50000];

        try {
            File file = new File("files\\synsets.txt");
            Scanner in = new Scanner(file);

            while (in.hasNext()) {
                strings1.add(in.next());
            }
        } catch (Exception e) {
            System.out.println("File not found");
        }
        
        long timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 1000; j++)
            {
                strings1.get(j); // list is your list 
            }
        }
        long timeAfter = System.currentTimeMillis();
        
        System.out.println("it took" + (timeAfter - timeBefore) + "milliseconds.");
        System.exit(0);

    }

}

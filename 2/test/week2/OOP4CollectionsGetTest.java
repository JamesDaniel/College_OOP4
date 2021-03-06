/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;
import org.junit.Test;

/**
 *
 * @author SoftwareDev
 */
public class OOP4CollectionsGetTest {
    public static int reps = 1000;
    @Test
    public void testArrayGet() {
        String[] strings = new String[50000];
        int currentIndex = 0;
        
        try {
            File file = new File("files\\synsets.txt");
            Scanner in = new Scanner(file);

            while (in.hasNext()) {
                strings[currentIndex] = in.next();
                currentIndex++;
            }
        } catch (Exception e) {
            System.out.println("File not found");
        }
        String temp = "";
        for(int i = 0; i < reps; i++) {
            for(int j = 0; j < reps/10; j++)
                temp = strings[j]; // list is your list 
        }
    }
    @Test
    public void testArrayListGet() {
        ArrayList strings = new ArrayList<String>();
        
        try {
            File file = new File("files\\synsets.txt");
            Scanner in = new Scanner(file);

            while (in.hasNext()) {
                strings.add(in.next());
            }
        } catch (Exception e) {
            System.out.println("File not found");
        }
        for(int i = 0; i < reps; i++) {
            for(int j = 0; j < reps/10; j++)
                strings.get(j); // list is your list 
        }
    }
    
    @Test
    public void testLinkedListGet() {
        LinkedList strings = new LinkedList<String>();
        
        try {
            File file = new File("files\\synsets.txt");
            Scanner in = new Scanner(file);

            while (in.hasNext()) {
                strings.add(in.next());
            }
        } catch (Exception e) {
            System.out.println("File not found");
        }
        for(int i = 0; i < reps; i++) {
            for(int j = 0; j < reps/10; j++)
                strings.get(j); // list is your list 
        }
    }
    
    @Test
    public void testVectorGet() {
        Vector strings = new Vector<String>();
        
        try {
            File file = new File("files\\synsets.txt");
            Scanner in = new Scanner(file);

            while (in.hasNext()) {
                strings.add(in.next());
            }
        } catch (Exception e) {
            System.out.println("File not found");
        }
        for(int i = 0; i < reps; i++) {
            for(int j = 0; j < reps/10; j++)
                strings.get(j); // list is your list 
        }
    }
    
}

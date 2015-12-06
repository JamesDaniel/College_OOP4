/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Vector;
import org.junit.Test;

/**
 *
 * @author SoftwareDev
 */
public class OOP4CollectionsInsertTest {

    public static int reps = 1000;

    @Test
    public void testArrayListInsert() {
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

        int half = strings.size() / 2;
        String s = "test";
        ListIterator it = strings.listIterator(half);
        for (int i = 0; i < reps * 10; i++) {
            it.add(s);
        }

    }

    @Test
    public void testLinkedListInsert() {
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

        int half = strings.size() / 2;
        String s = "test";
        ListIterator it = strings.listIterator(half);
        for (int i = 0; i < reps * 10; i++) {
            it.add(s);
        }

    }
    
    @Test
    public void testVectorInsert() {
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

        int half = strings.size() / 2;
        String s = "test";
        ListIterator it = strings.listIterator(half);
        for (int i = 0; i < reps * 10; i++) {
            it.add(s);
        }

    }
}

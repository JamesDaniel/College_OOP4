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
public class OOP4CollectionsRemoveTest {
    public static int reps = 1000;
    @Test
    public void testArrayListRemove() {
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

        ListIterator it = strings.listIterator(3);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }

    }
    @Test
    public void testLinkedListRemove() {
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

        ListIterator it = strings.listIterator(3);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }

    }
    @Test
    public void testVectorRemove() {
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

        ListIterator it = strings.listIterator(3);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }

    }

}

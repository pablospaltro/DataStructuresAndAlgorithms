package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        // In most situations an arrayList can be faster and flexible,
        // however, in case of using a lot of inserting or deleting,
        // a linkedList might be better / efficient

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for(int i = 0; i < 1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }

        // --------------- linkedList: ---------------
        startTime = System.nanoTime();
        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        //getting the first element:
        //linkedList.get(0);

        //getting an element right in the middle:
        //linkedList.get(500000);

        //getting the last element:
        //linkedList.get(999999);

        //removing elements:
        linkedList.remove(0);

        //linkedList.remove(500000);

        //linkedList.remove(999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList:\t" + elapsedTime + " ns");


        // --------------- arrayList: ---------------
        startTime = System.nanoTime();

        //getting the first element:
        //arrayList.get(0);

        //getting an element right in the middle:
        //arrayList.get(500000);

        //getting the last element:
        //arrayList.get(999999);

        //removing elements:
        arrayList.remove(0);

        //arrayList.remove(500000);

        //arrayList.remove(999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayList:\t" + elapsedTime + " ns");

    }
}

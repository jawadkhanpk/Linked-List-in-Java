package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here


        LinkedList<String> list = new LinkedList<String>();

        list.add("F");
        list.add("B");
        list.add("D");
        list.add("E");
        list.add("C");
        System.out.println("Original contents of list: " + list);

        list.addLast("Z");

        list.addFirst("A");

        list.add(1, "A2");

        list.remove("F");

        list.remove(2);
        System.out.println("Contents of list after deletion: " + list);

        list.removeFirst();
        list.removeLast();

        System.out.println("List after deleting first and last: " + list);

        Object val = list.get(2);

        list.set(2, (String) val + " Changed");
        System.out.println("List after change: " + list);


    }
}

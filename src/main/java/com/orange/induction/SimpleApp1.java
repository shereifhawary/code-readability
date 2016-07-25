package com.orange.induction;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by tdph5945 on 2016-05-29.
 */
public class SimpleApp1 {


    /**
     * the below code have a problem that the line seperator is only working on windows.
     * it is easy to change it with a constant var.
     * <p>
     * also we need to change the * to be a parameter not a build in local var.
     */
    public static String printTriangle(int numberOfLines) {
        StringBuilder linesContainer =
                new StringBuilder();
        for (int i = 0; i < numberOfLines; i++) {
            for (int j = 0; j <= i; j++) {
                linesContainer.append("*");
            }
            linesContainer.append("\n\r");
        }
        return linesContainer.toString();
    }

    /**
     * we need to have the same behaviour of the set but ordered
     */

    public static Set<Integer> getStoriedItems() {
        Set<Integer> store = new TreeSet<Integer>();
        store.add(1);
        store.add(20);
        store.add(300);
        store.add(300);
        store.add(4040);
        store.add(4040);
        store.add(51111);
        store.add(51111);
        return store;
    }

    public static void main(String... args) {
        System.out.println(printTriangle(5));

        Set<Integer> store = getStoriedItems();
        for (Integer key : store) {
            System.out.println(key);
        }
    }
}

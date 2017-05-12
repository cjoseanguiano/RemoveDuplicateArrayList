package com.devix.company;

import java.util.ArrayList;
import java.util.HashSet;

import static com.devix.company.Program.removeDuplicate;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("A");
        list.add("A");
        list.add("B");
        list.add("C");

        ArrayList<String> unique = removeDuplicate(list);
        for (String element : unique) {
            System.out.println(element);
        }
    }
}

class Program {
    static ArrayList<String> removeDuplicate(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();
        HashSet<String> set = new HashSet<>();

        for (String item : list) {
            if (!set.contains(item)) {
                result.add(item);
                set.add(item);
            }
        }
        return result;
    }

}

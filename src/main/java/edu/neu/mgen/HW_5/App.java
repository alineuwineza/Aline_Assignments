
package edu.neu.mgen.HW_5;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        String str = "Oakland";

        System.out.println("1. String:");
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 2: " + str.charAt(2));
        System.out.println("Substring: " + str.substring(3));
        System.out.println("Uppercase: " + str.toUpperCase());

        int[] abc = {1, 3, 5, 2, 5};

        System.out.println("\n2. Array:");
        System.out.println("Length: " + abc.length);
        System.out.println("Last member: " + abc[abc.length - 1]);

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Austin");
        cities.add("Houston");
        cities.add("Oakland");
        cities.add("Paris");
        cities.add("San Francisco");
        cities.add("Seattle");

        cities.remove("Paris");

        System.out.println("\n3. ArrayList after removing Paris:");
        System.out.println(cities);
    }
}

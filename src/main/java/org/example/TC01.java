package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TC01 {
    public static void main(String[] args) {
        String str = "Komrelly Srinivas Reddy";
        //print all duplicate chars along with their count
        Map<Character, Integer> hmap = new HashMap<Character, Integer>();
        char[] charArray = str.toCharArray();
        for (char ch : charArray) {
            if (hmap.containsKey(ch)) {
                hmap.put(ch, hmap.get(ch) + 1);
            } else {
                hmap.put(ch, 1);
            }
        }
        Set<Character> keys = hmap.keySet();
        for (Character key : keys) {
            if (hmap.get(key) > 1) {
                System.out.println(key + "  is " + hmap.get(key) + " times");
            }
        }
    }
}

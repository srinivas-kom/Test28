package org.example;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TC03 {
    public static void main(String[] args) {
        String str = "Komrelly Nitisha Reddy";
        Map<Character, Integer> hmap = new HashMap<Character, Integer>();
        char[] carray = str.toCharArray();
        for (char ch1 : carray) {
            if(hmap.containsKey(ch1)) {
                hmap.put(ch1,hmap.get(ch1)+1);
            }else {
                hmap.put(ch1,1);
            }
        }
        Set<Character> set = hmap.keySet();
        for(Character ch2 : set) {
            if(hmap.get(ch2) > 1) {
                System.out.println((ch2 + " is " + hmap.get(ch2) + " times"));
            }
        }
    }
}

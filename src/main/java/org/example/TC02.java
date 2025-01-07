package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TC02 {
    public static void main(String[] args) {
        String str = "Komrelly Deepika Reddy";
        //print all the duplicate char along with their count
        Map<Character, Integer> hmap = new HashMap<Character, Integer>();
        char[] chars = str.toCharArray();
        for(int i=0; i<chars.length;i++) {
             if(hmap.containsKey(chars[i])) {
                hmap.put(chars[i],hmap.get(chars[i])+1);
            }else {
                 hmap.put(chars[i],1);
            }
        }
        Set<Character> set = hmap.keySet();
        for(Character st : set) {
            if(hmap.get(st) > 1) {
                System.out.println(st + " is " + hmap.get(st));
            }
        }
    }
}

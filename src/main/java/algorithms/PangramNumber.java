package algorithms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*pangram - meaning - a sentence containing every letter of the alphabet.*/

public class PangramNumber {
    public static void main(String[] args) {

        String str = "abcdefghijklmnopqrstuvwxy";

        System.out.println("'" + str + "'" + " pangram - " + check(str));
    }

    public static boolean check(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : word.toCharArray()) {
            Integer count = map.get(c);

            if (count == null) {
                count = 1;
            } else {
                count++;
            }

            map.put(c, count);
        }

        char a = 'a';
        char z = 'z' + 1;

        boolean isPangram = true;

        while (a != z) {
            Integer value = map.get(a);
            if (value == null) {
                isPangram = false;
                break;
            }
            a++;
        }

        return isPangram;
    }

    public static String isPangram(List<String> pangram) {
        for (String p : pangram) {
            if (!check(p)) {
                return "0";
            }
        }
        return "1";
    }
}


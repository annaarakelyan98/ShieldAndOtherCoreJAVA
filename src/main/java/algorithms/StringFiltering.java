package algorithms;

import java.util.ArrayList;
import java.util.List;

public class StringFiltering {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add("def");
        list.add("ee");
        list.add("aaa");
        list.add("qwe");
        // should print "def", "qwe"

        System.out.println(filterString(list));
    }

    //1st way
    static List<String> filterString(ArrayList<String> list) {
        List<String> list1 = new ArrayList<>();
        for (String l : list) {
            if (l.contains("e") && l.length() > 2) {
                list1.add(l);
            } else {
                System.out.println("In these words 'e' doesn't exist");
            }
        }
        return list1;
    }
}
/*
 * TODO: write a method **filterStrings** which retains strings that are longer than 2 chars and contain 'e' char
 * 
 */

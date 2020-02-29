package Workspace_Praticing.TestingCollection;


import java.util.*;

public class Loop {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();

        ls.add("A");
        ls.add("B");
        ls.add("C");


        Map<String, Integer> hm = new HashMap<>();


        //cach 1
        for (int i = 0; i < ls.size(); i++) {
            System.out.println(ls.get(i));
        }
        //cach 2
        ls.forEach(index -> {
            System.out.println(index + "");
        });
        //cach 3
        for (String str:ls) {
            System.out.println(str);
        }
        //cach 4
        Iterator<String> ite = ls.iterator();
        while(ite.hasNext()) {
            String item = (String) ite.next(); //Ep kieu neu can
            System.out.println(item);
        }
        //cach 5
        ls.forEach(System.out::print);

    }
}

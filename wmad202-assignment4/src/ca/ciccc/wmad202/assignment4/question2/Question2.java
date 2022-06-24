package ca.ciccc.wmad202.assignment4.question2;

import java.util.*;

public class Question2 {
    public static void test() {
        HashMap<String, HashSet<String>> listOfHashMap= createHashMap();
        System.out.println(listOfHashMap);

    }
    public static HashMap<String, HashSet<String>> createHashMap() {
        Scanner input = new Scanner(System.in);
        HashMap<String, HashSet<String>> wordMap = new HashMap<>();
        HashSet<String> words = new HashSet<>();
        HashSet<String> a = new HashSet<>();
        HashSet<String> b = new HashSet<>();
        HashSet<String> c = new HashSet<>();
        HashSet<String> d = new HashSet<>();
        HashSet<String> e = new HashSet<>();
        HashSet<String> f = new HashSet<>();
        HashSet<String> g = new HashSet<>();
        HashSet<String> h = new HashSet<>();
        HashSet<String> i = new HashSet<>();
        HashSet<String> j = new HashSet<>();
        HashSet<String> k = new HashSet<>();
        HashSet<String> l = new HashSet<>();
        HashSet<String> m = new HashSet<>();
        HashSet<String> n = new HashSet<>();
        HashSet<String> o = new HashSet<>();
        HashSet<String> p = new HashSet<>();
        HashSet<String> q = new HashSet<>();
        HashSet<String> r = new HashSet<>();
        HashSet<String> s = new HashSet<>();
        HashSet<String> t = new HashSet<>();
        HashSet<String> u = new HashSet<>();
        HashSet<String> v = new HashSet<>();
        HashSet<String> w = new HashSet<>();
        HashSet<String> x = new HashSet<>();
        HashSet<String> y = new HashSet<>();
        HashSet<String> z = new HashSet<>();
        System.out.println("Please enter a word: ");
        String word = input.nextLine();
        while (!word.equalsIgnoreCase("exit")) {
            words.add(word);
            System.out.println("Please enter a word: ");
            word = input.nextLine();
        }
        for (String element : words) {
            if (element.charAt(0) == 'a') {
                a.add(element);
            } else if (element.charAt(0) == 'b') {
                b.add(element);
            } else if (element.charAt(0) == 'c') {
                c.add(element);
            } else if (element.charAt(0) == 'd') {
                d.add(element);
            } else if (element.charAt(0) == 'e') {
                e.add(element);
            } else if (element.charAt(0) == 'f') {
                f.add(element);
            } else if (element.charAt(0) == 'g') {
                g.add(element);
            } else if (element.charAt(0) == 'h') {
                h.add(element);
            } else if (element.charAt(0) == 'i') {
                i.add(element);
            } else if (element.charAt(0) == 'j') {
                j.add(element);
            } else if (element.charAt(0) == 'k') {
                k.add(element);
            } else if (element.charAt(0) == 'l') {
                l.add(element);
            } else if (element.charAt(0) == 'm') {
                m.add(element);
            } else if (element.charAt(0) == 'n') {
                n.add(element);
            } else if (element.charAt(0) == 'o') {
                o.add(element);
            } else if (element.charAt(0) == 'p') {
                p.add(element);
            } else if (element.charAt(0) == 'q') {
                q.add(element);
            } else if (element.charAt(0) == 'r') {
                r.add(element);
            } else if (element.charAt(0) == 's') {
                s.add(element);
            } else if (element.charAt(0) == 't') {
                t.add(element);
            } else if (element.charAt(0) == 'u') {
                u.add(element);
            } else if (element.charAt(0) == 'w') {
                w.add(element);
            } else if (element.charAt(0) == 'v') {
                v.add(element);
            } else if (element.charAt(0) == 'x') {
                x.add(element);
            } else if (element.charAt(0) == 'y') {
                y.add(element);
            } else if (element.charAt(0) == 'z') {
                z.add(element);
            }
        }
        wordMap.put("a",a);
        wordMap.put("b",b);
        wordMap.put("c",c);
        wordMap.put("d",d);
        wordMap.put("e",e);
        wordMap.put("f",f);
        wordMap.put("g",g);
        wordMap.put("h",h);
        wordMap.put("i",i);
        wordMap.put("j",j);
        wordMap.put("k",k);
        wordMap.put("l",l);
        wordMap.put("m",m);
        wordMap.put("n",n);
        wordMap.put("o",o);
        wordMap.put("p",p);
        wordMap.put("q",q);
        wordMap.put("r",r);
        wordMap.put("s",s);
        wordMap.put("t",t);
        wordMap.put("u",u);
        wordMap.put("v",v);
        wordMap.put("w",w);
        wordMap.put("x",x);
        wordMap.put("y",y);
        wordMap.put("z",z);
        return wordMap;
    }

}



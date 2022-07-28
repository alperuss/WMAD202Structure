package ca.ciccc.wmad202.assignment10.question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class TestExceptions2<T> {
    public static class Container<T> {
        List<T> list;

        Container(List<T> list){
            this.list = list;
        }

        List<T> getList(){
            return list;
        }
    }

    public static <T> int evaluateList(Container<T> container, Predicate<T>
            predicate1, Predicate<T> predicate2) throws Predicate2Exception, Predicate1Exception {

        int count = 0;

        for(T t: container.getList()){
            if (predicate1.test(t)) {
                if(predicate2.test(t)) {
                    count++;
                } else {
                    throw new Predicate2Exception("Predicate2");
                }
            } else {
                throw new Predicate1Exception("Predicate1");
            }
        }

        return count;
    }

    public static void test() throws Predicate1Exception, Predicate2Exception {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Exceptions", "are", "not", "fun", "kidding", "they", "are", "fun"));
        Container<String> container = new Container<>(list);
        TestExceptions2.evaluateList(container, s->s.length()>4, s-> s.contains("a"));
    }
}

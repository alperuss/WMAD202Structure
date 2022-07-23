package ca.ciccc.wmad202.lecture.functionalInterface;

import java.util.function.*;

public class Test {
    public static void main() {

        // #1
        AddThree addThree = new AddThree();
        Long addThreeValue = addThree.apply(132L);


        // #2
        Function<Long, Long> adder = (value) -> value + 3;



        Long resultLambda = adder.apply((long) 8);
        System.out.println("resultLambda = " + resultLambda);

        // #2
        CheckForNull checkForNull = new CheckForNull();
//        Predicate predicate = (value) -> value != null;

        UnaryOperator<Person> unaryOperator =
                (person) -> { person.name = "New Name"; return person; };

        Person mostafa = new Person("Mostafa");
        unaryOperator.apply(mostafa);

        BinaryOperator<MyValue> binaryOperator =
                (value1, value2) -> { value1.add(value2); return value1; };



        Supplier<Integer> generator = () -> (int) (Math.random() * 1000D);
        generator.get();

        Consumer<Integer> consumer = (value) -> System.out.println(value);
        consumer.accept(3);
    }
}

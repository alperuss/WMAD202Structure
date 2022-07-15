package ca.ciccc.wmad202.assignment7.question3;

import java.util.ArrayList;

public class TestQuestion3 {
    public static void run(){
        ArrayList<String> cars=new ArrayList<>();
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Mclaren");
        cars.add("Volkswagen");

        ElementsExchange<String> elements=new ElementsExchange<>(cars);
        System.out.println(elements.getElements());
        elements.exchangeElements(0,2);
        elements.exchangeElements(1,3);

        System.out.println(elements.getElements());
    }
}

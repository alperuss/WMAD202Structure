package ca.ciccc.wmad202.assignment9.question1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.function.Supplier;

public class SupplierExample {
    public static void test(){
        LocalDate birthday = LocalDate.of(1994, 1, 6);
        Supplier<LocalDateTime> s = () -> LocalDateTime.now();
        LocalDateTime time= s.get();
        System.out.println(Period.between(birthday, LocalDate.from(time)).getYears());



    }
}

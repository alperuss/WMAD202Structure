package ca.ciccc.wmad202.lambda.examples;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Person {
    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    public Person(String name, LocalDate birthday, Sex gender, String emailAddress){
        this.name=name;
        this.birthday=birthday;
        this.gender=gender;
        this.emailAddress=emailAddress;

    }

    public int getAge() {
        return Period.between(birthday, LocalDate.now()).getYears();    }

    public void printPerson() {
        // ...

    }

    public String getEmailAddress(){
        return this.emailAddress;
    }
    public Sex getGender(){
        return this.gender;
    }
    interface CheckPerson {
        boolean test(Person p);
    }
    interface Predicate<T> {
        boolean test(T t);
    }

    class CheckPersonEligibleForSelectiveService implements CheckPerson {
        public boolean test(Person p) {
            return p.gender == Person.Sex.MALE &&
                    p.getAge() >= 18 &&
                    p.getAge() <= 25;
        }

        public static void printPersonsWithPredicate(List<Person> roster, Predicate<Person> tester) {
            for (Person p : roster) {
                if (tester.test(p)) {
                    p.printPerson();
                }
            }
        }
        public static void processPersonsWithFunction(
                List<Person> roster,
                Predicate<Person> tester,
                Function<Person, String> mapper,
                Consumer<String> block) {
            for (Person p : roster) {
                if (tester.test(p)) {
                    String data = mapper.apply(p);
                    block.accept(data);
                }
            }
        }
        public static void processPersonsWithBinaryOperator(
                List<Person> roster,
                Predicate<Person> tester,
                BinaryOperator<Person> mapper) {
            Person u=new Person("empty",LocalDate.of(1999,1,1),Sex.MALE,
                    "empty");
            for (Person p : roster) {
                if (tester.test(p)) {
                     mapper.apply(p,u);

                }
            }
        }
        public static void processPersonsWithBiFunction(
                List<Person> roster,
                Predicate<Person> tester,
                BiFunction<Person, String,String> mapper,
                Consumer<String> block) {
            String s=null;
            for (Person p : roster) {
                if (tester.test(p)) {
                    String data = mapper.apply(p,s);
                    block.accept(data);
                }
            }
        }

        public static void processPersons(List<Person> roster, Predicate<Person> tester, Consumer<Person> block) {
            for (Person p : roster) {
                if (tester.test(p)) {
                    block.accept(p);
                }
            }
        }
        public static void processPersonsWithBiConsumer(List<Person> roster,
                                                        Predicate<Person> tester,
                                                        BiConsumer<Person,String> biPerson) {
            for (Person p : roster) {
                if (tester.test(p)) {
                    String s="";
                    biPerson.accept(p,s);
                }
            }
        }


        public static <X, Y> void processElements(
                Iterable<X> source,
                Predicate<X> tester,
                Function <X, Y> mapper,
                Consumer<Y> block) {
            for (X p : source) {
                if (tester.test(p)) {
                    Y data = mapper.apply(p);
                    block.accept(data);
                }
            }
        }
    }


    public static void main(String[] args){
        LocalDate birthdate = LocalDate.of(1994, 1, 6);
        Person a=new Person("Alper", birthdate,Sex.MALE,"alperus93@gmail.com");
        List<Person> roster=new ArrayList<>();
        roster.add(a);
        Person.CheckPersonEligibleForSelectiveService check= a.new CheckPersonEligibleForSelectiveService();
                    //Approach 7


//        check.processPersons(
//                roster,
//                p -> p.getGender() == Person.Sex.MALE
//                        && p.getAge() >= 18
//                        && p.getAge() <= 25,
//                p -> p.printPerson()
//        );


//        check.processPersonsWithFunction(
//                roster,
//                p -> p.getGender() == Person.Sex.MALE
//                        && p.getAge() >= 18
//                        && p.getAge() <= 30,
//                p -> p.getEmailAddress(),
//                email -> System.out.println(email)
//        );


                        //Approach 8
//        check.processElements(
//                roster,
//                p -> p.getGender() == Person.Sex.MALE
//                        && p.getAge() >= 18
//                        && p.getAge() <= 25,
//                p -> p.getEmailAddress(),
//                email -> System.out.println(email)
//        );


//        check.processPersonsWithBiConsumer(               BiConsumer
//                roster,
//                p -> p.getGender() == Person.Sex.MALE
//                        && p.getAge() >= 18
//                        && p.getAge() <= 30,
//                (p,s) -> p.getEmailAddress()
//        );


//        check.processPersonsWithBiFunction(               BiFunction
//                roster,
//                p -> p.getGender() == Person.Sex.MALE
//                        && p.getAge() >= 18
//                        && p.getAge() <= 30,
//                (p,s) -> p.getEmailAddress(),
//                email -> System.out.println(email)
//        );










    }


}

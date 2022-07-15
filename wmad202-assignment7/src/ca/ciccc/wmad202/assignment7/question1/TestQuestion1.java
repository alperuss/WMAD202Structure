package ca.ciccc.wmad202.assignment7.question1;

import java.util.ArrayList;

public class TestQuestion1 {
    public static void run(){
        ArrayList<Student> students=new ArrayList<>();
        Student student1=new Student(20,"Jack",2.5f);
        Student student2=new Student(22,"George",2.2f);
        Student student3=new Student(25,"Anabelle",3f);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        Count<Student> studentCount= new Count<>(students);
        System.out.println("Number of students has bigger than 2.3 gpa-----> "+studentCount.countNumberOfElementsWithSpecificProperty());

        ArrayList<Book> books=new ArrayList<>();
        Book book1= new Book("J. K. Rowling","Harry Potter and the Sorcerer's Stone",223);
        Book book2= new Book("J. K. Rowling","Harry Potter and the Chamber of Secrets",251);
        Book book3= new Book("J. K. Rowling","Harry Potter and the Prisoner of Azkaban",317);
        Book book4= new Book("J. K. Rowling","Harry Potter and the Goblet of Fire",636);
        Book book5= new Book("J. K. Rowling","Harry Potter and the Order of the Phoenix",766);
        Book book6= new Book("J. K. Rowling","Harry Potter and the Half-Blood Prince",607);
        Book book7= new Book("J. K. Rowling","Harry Potter and the Deathly Hallows",607);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        Count<Book> bookCount= new Count<>(books);
        System.out.println("Number of books has more than 300 pages-----> "+bookCount.countNumberOfElementsWithSpecificProperty());

        ArrayList<Account> accounts= new ArrayList<>();
        Account account1= new Account(2,"Albert",300);
        Account account2= new Account(3,"Alice",220);
        Account account3= new Account(4,"Bob",110);
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        Count<Account> accountCount= new Count<>(accounts);
        System.out.println("Number of accounts has more than 200 dollar-----> "+accountCount.countNumberOfElementsWithSpecificProperty());

    }
}

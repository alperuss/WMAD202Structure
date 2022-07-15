package ca.ciccc.wmad202.assignment7.question4;

import ca.ciccc.wmad202.assignment7.question1.Account;

import java.util.ArrayList;

public class TestQuestion4 {
    public static void run(){
        ListItem<Account> accounts= new ListItem<>();
        Account account1= new Account(1,"Alper",250);
        Account account2= new Account(2,"Bobbie",300);
        Account account3= new Account(3,"Charlie",150);
        accounts.addItemToList(account1);
        accounts.addItemToList(account2);
        accounts.addItemToList(account3);
        System.out.println(accounts.performOperation());

        accounts.removeItemFromTheList(account2);






    }
}

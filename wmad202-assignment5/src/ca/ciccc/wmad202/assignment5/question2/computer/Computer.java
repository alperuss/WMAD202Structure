package ca.ciccc.wmad202.assignment5.question2.computer;

import ca.ciccc.wmad202.assignment5.question2.product.Product;

import java.util.ArrayList;
import java.util.HashMap;

public class Computer {

    private String user;
    private HashMap<Computer_Program,String> users;

    public Computer(String user){
        this.user=user;
        this.users=new HashMap<>();

    }
    public void getComputerInfo(){
        for(Computer_Program c: this.users.keySet()){
            System.out.println(c.getCodes() + ": "+ c);
        }
    }


}

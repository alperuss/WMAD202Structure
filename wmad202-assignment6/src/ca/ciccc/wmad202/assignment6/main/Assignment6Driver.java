package ca.ciccc.wmad202.assignment6.main;

import ca.ciccc.wmad202.assignment6.question0.Product;
import ca.ciccc.wmad202.assignment6.question1.Cloth;
import ca.ciccc.wmad202.assignment6.question1.Drink;
import ca.ciccc.wmad202.assignment6.question1.Food;
import ca.ciccc.wmad202.assignment6.question1.Material;
import ca.ciccc.wmad202.assignment6.question2.ShoppingCart;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Assignment6Driver {
    public static void run(){

        Product product= new Product(110,"Diet Pepsi",2,"USA");

        Drink drink= new Drink(102,"Coca Cola", 2,"USA",false,330);
        ArrayList<String> foodIngredients= new ArrayList<>();
        foodIngredients.add("garlic");
        foodIngredients.add("oil");
        Food food= new Food(201,"beef",15,"Canada",500,1,foodIngredients);
        ArrayList<Material> materials= new ArrayList<>();
        materials.add(new Material(10,"cotton"));
        materials.add(new Material(20,"nylon"));
        Cloth cloth = new Cloth(500,"pant",40,"Canada",materials);

        System.out.println("=============Problem 2================");
        Drink pepsi= new Drink(412,"Pepsi", 2,"USA",false,150);
        Drink gingerZero= new Drink(183,"Ginger Zero", 3,"Canada",true,200);
        ArrayList<String> chickenIngredients= new ArrayList<>();
        chickenIngredients.add("oil");
        chickenIngredients.add("cheese");
        Food chicken= new Food(100,"chicken",8,"Canada",350,4,chickenIngredients);
        ArrayList<String> pastaIngredients= new ArrayList<>();
        chickenIngredients.add("meat");
        chickenIngredients.add("spinach");
        Food pasta= new Food(101,"pasta",18,"Canada",250,3,pastaIngredients);
        ArrayList<Material> clothMaterials=new ArrayList<>();
        clothMaterials.add(new Material(10,"cotton"));
        clothMaterials.add(new Material(11,"Nylon"));
        Cloth tshirt = new Cloth(701,"T-shirt",15,"China",clothMaterials);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(pepsi);
        cart.addItem(chicken);
        cart.addItem(gingerZero);
        cart.addItem(tshirt);
        cart.addItem(pasta);
        cart.addItem(drink);
        cart.addItem(food);
        cart.addItem(cloth);
        cart.addItem(product);

        System.out.println("Total amount is " + cart.totalCart()+"$");
        cart.printCart();
    }
}

package ca.ciccc.wmad202.assignment6.question1;

import ca.ciccc.wmad202.assignment6.question0.Product;

import java.util.ArrayList;

public class Food extends Product {

    private int foodID;
    private String foodName;
    private float foodPrice;
    private String foodMadeInCountry;
    private int foodCalorie;
    private int foodSize;
    private ArrayList<String> foodIngredients;
    public Food(int productId, String productName, float productPrice, String productMadeInCountry,int foodCalorie,int foodSize,ArrayList<String> foodIngredients) {
        super(productId, productName, productPrice, productMadeInCountry);
        this.foodID=productId;
        this.foodName=productName;
        this.foodPrice=productPrice;
        this.foodMadeInCountry=productMadeInCountry;
        this.foodCalorie=foodCalorie;
        this.foodSize=foodSize;
        this.foodIngredients=foodIngredients;
    }
}

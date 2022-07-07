package ca.ciccc.wmad202.assignment6.question1;

import ca.ciccc.wmad202.assignment6.question0.Product;

public class Drink extends Product {
    private int drinkID;
    private String drinkName;
    private float drinkPrice;
    private String drinkMadeInCountry;
    private boolean isDrinkDiet;
    private int drinkSize;


    public Drink(int productId, String productName, float productPrice, String productMadeInCountry,boolean isDrinkDiet,int drinkSize) {
        super(productId, productName, productPrice, productMadeInCountry

        );
        this.drinkID=productId;
        this.drinkName=productName;
        this.drinkMadeInCountry=productMadeInCountry;
        this.drinkPrice=productPrice;
        this.isDrinkDiet=isDrinkDiet;
        this.drinkSize=drinkSize;
    }
}

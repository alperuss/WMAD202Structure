package ca.ciccc.wmad202.assignment6.question1;

import ca.ciccc.wmad202.assignment6.question0.Product;

public class Drink extends Product {

    private boolean isDrinkDiet;
    private int drinkSize;


    public Drink(int productId, String productName, float productPrice, String productMadeInCountry,boolean isDrinkDiet,int drinkSize) {
        super(productId, productName, productPrice, productMadeInCountry

        );

        this.isDrinkDiet=isDrinkDiet;
        this.drinkSize=drinkSize;
    }
}

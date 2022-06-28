package ca.ciccc.wmad202.assignment5.question2.product;

import java.util.ArrayList;
import java.util.HashMap;

public class Invoice {
    private HashMap<Product,Integer> products;
    private float totalPrice;

    public Invoice(){
        this.products= new HashMap<>();
        this.products=products;
    }
    public ArrayList<String> getProducts(){
        ArrayList<String> allProducts= new ArrayList<>();
        for(Product c: this.products.keySet()){
            allProducts.add(String.valueOf(c));
        }
        return allProducts;
    }
    public float getTotalPrice(){
        float total=0;
        for(Product c: this.products.keySet()){
           total=total + this.products.get(c);
        }
        return total;
    }
}

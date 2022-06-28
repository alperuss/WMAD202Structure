package ca.ciccc.wmad202.assignment5.question2.product;

public class Product {
    private String name;
    private float price;

    public Product(String name,float price){
        this.name=name;
        this.price=price;
    }
    public float getPrice(){
        return this.price;
    }
}

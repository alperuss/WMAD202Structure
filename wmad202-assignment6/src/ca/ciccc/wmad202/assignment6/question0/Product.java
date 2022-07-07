package ca.ciccc.wmad202.assignment6.question0;

public class Product extends Object {
    private int productId;
    private String productName;
    private float productPrice;
    private String productMadeInCountry;
     public Product(int productId,String productName,float productPrice,String productMadeInCountry){
         this.productId=productId;
         this.productName=productName;
         this.productPrice=productPrice;
         this.productMadeInCountry=productMadeInCountry;
     }
     public String getProductName(){
         return this.productName;
     }
     public float getProductPrice(){
         return this.productPrice;
     }

}

package ca.ciccc.wmad202.assignment6.question1;

import ca.ciccc.wmad202.assignment6.question0.Product;

import java.util.ArrayList;

public class Cloth extends Product {
    private int clothID;
    private String clothName;
    private float clothPrice;
    private String clothMadeInCountry;
    private ArrayList<Material> clothMaterials;

    public Cloth(int productId, String productName, float productPrice, String productMadeInCountry,ArrayList<Material> clothMaterials) {
        super(productId, productName, productPrice, productMadeInCountry);

        this.clothID=productId;
        this.clothName=productName;
        this.clothMadeInCountry=productMadeInCountry;
        this.clothPrice=productPrice;
    }
}

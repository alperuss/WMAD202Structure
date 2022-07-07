package ca.ciccc.wmad202.assignment6.question2;

import ca.ciccc.wmad202.assignment6.question0.Product;

public interface IShoppingCart {
    void addItem(Product product);
    float totalCart();
    void printCart();
}

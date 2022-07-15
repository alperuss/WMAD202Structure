package ca.ciccc.wmad202.assignment7.question3;

import java.util.ArrayList;

public class ElementsExchange<E> {
    ArrayList<E> elements;
    public ElementsExchange(ArrayList<E> elements){
        this.elements=elements;
    }
    public void exchangeElements(Integer s1,Integer s2){
        E element1=this.elements.get(s1);
        E element2=this.elements.get(s2);

        this.elements.set(s1,element2);
        this.elements.set(s2,element1);
    }
    public ArrayList<E> getElements(){
       return this.elements;
    }
}

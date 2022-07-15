package ca.ciccc.wmad202.assignment7.question4;

import ca.ciccc.wmad202.assignment7.question1.IHasProperty;

import java.util.ArrayList;

public class ListItem<E extends IHasProperty>{

    ArrayList<E> list= new ArrayList<>();

    public ListItem(){
        this.list=new ArrayList<>();
    }

    public void addItemToList(E item){
        this.list.add(item);
    }
    public void removeItemFromTheList(E item){
        this.list.remove(item);
    }

    public ArrayList<E> performOperation(){
        ArrayList<E> operation= new ArrayList<>();
        for(E element:this.list){
            if(element.HasProperty()){
                operation.add(element);
            }
        }
        if(operation.isEmpty()){
            return null;
        }
        else{
            return operation;
        }


    }



}

package ca.ciccc.wmad202.assignment5.question2.book;

import java.util.ArrayList;

public class Book {
    private int bookPages;
    private ArrayList<String> bookWords;

    public Book(int bookPages,ArrayList<String> bookWords){
        this.bookPages=bookPages;
        this.bookWords=bookWords;
    }
    public int getBookWords(){
        return this.bookWords.size();

    }
    public int getWordOccurrence(String word){
        int counter=0;
        for(String i:this.bookWords){
            if(i.equals(word)){
                counter++;
            }
        }
        return counter;
    }
}

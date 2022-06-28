package ca.ciccc.wmad202.assignment5.question2.computer;

import java.util.ArrayList;

public class Computer_Program {
    private String name;
    private ArrayList<String> codes;
    private String version;

    public Computer_Program(){
        this.name="New Program";
        this.codes= new ArrayList<>();
        this.version="0.0";
    }
    public Computer_Program(String name,ArrayList<String> codes,String version){
        this.name=name;
        this.codes=codes;
        this.version=version;
    }

    public String getName(){
        return this.name;
    }
    public String getVersion(){
        return this.version;
    }
    public ArrayList<String> getCodes(){
        return this.codes;
    }
}

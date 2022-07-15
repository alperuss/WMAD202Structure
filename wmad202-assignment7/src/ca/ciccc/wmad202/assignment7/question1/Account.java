package ca.ciccc.wmad202.assignment7.question1;

public class Account implements IHasProperty{
    private Integer id;
    private String name;
    private Integer amount;
    public Account(Integer id,String name,Integer amount ){
        this.id=id;
        this.name=name;
        this.amount=amount;
    }
    @Override
    public boolean HasProperty() {
        return this.amount>=200;
    }

    public String toString(){
        return "Account ID: "+ this.id + " Account Name: "+ this.name+" Account Amount: " + this.amount;
    }
}

package ca.ciccc.wmad202.assignment7.question1;

public class Book implements IHasProperty{
    private String author;
    private String name;
    private Integer page;
    public Book(String author,String name,Integer page){
        this.author=author;
        this.name=name;
        this.page=page;
    }
    @Override
    public boolean HasProperty() {
        return this.page>300;
    }
}

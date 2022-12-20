package entity;

public class Karlson extends Entity{
    public Karlson(String name, int age){
        super(name,age);
    }
    @Override
    public String toString(){
        return getName();
    }

}

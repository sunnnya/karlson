package entity;

import utils.Beautifulness;
import utils.Copyable;

public class Karlson extends Human implements Copyable {
    public Karlson(String name, int age, Beautifulness beautifulness){
        super(name,age, beautifulness);
    }
    public void setBeautifulness(Beautifulness beat){
        this.beautifulness = beat;
    }
    public Beautifulness getBeautifulness(){
        return this.beautifulness;
    }
    public void checkBeautifulness(){
        System.out.println(this.getName() + " имеет внешность " + this.getBeautifulness().translation());
    }
    private Beautifulness beautifulness = Beautifulness.NON;
    @Override
    public String toString(){
        return getName();
    }
    @Override
    public Object copy() {
        Karlson copy = new Karlson(name,age, beautifulness);
        return copy;
    }
}

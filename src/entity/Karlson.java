package entity;

import utils.Beautifulness;
import utils.Copyable;
import utils.Dryness;

public class Karlson extends Human implements Copyable {
    Beautifulness beautifulness;
    Dryness dryness;
    public Karlson(String name, int age, Beautifulness beautifulness, Dryness dryness){
        super(name,age);
        this.beautifulness = beautifulness;
        this.dryness = dryness;
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
    public Dryness getDryness(){
        return this.dryness;
    }
    public void setDryness(Dryness dryness){
        this.dryness = dryness;
    }
    public void checkDryness(){
        System.out.println(this.getName() + " на данный момент " + this.getDryness().translation());
    }


    @Override
    public String toString(){
        return getName();
    }
    @Override
    public Karlson copy() {
        Karlson copy = new Karlson(name,age, beautifulness, dryness);
        return copy;
    }
}

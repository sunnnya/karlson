package entity;

import utils.Emotes;
import utils.Emotionable;

public class Freken extends Human{
    public Freken(String name, int age){
        super(name, age);
    }
    public void wash(){
        System.out.println(this.getName() + " моет посуду");
    }
    public void think(){
        System.out.println(this.getName() + " раздумывает о великом");
    }

}


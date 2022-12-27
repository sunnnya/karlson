package entity;

import utils.Emotes;
import utils.Washable;

public class Freken extends Human{
    public Freken(String name, int age){
        super(name, age);
    }
    public void wash(Washable wash){
        System.out.println(this.getName() + " моет " + wash.toString());
        wash.wash();
    }
    public void remember(Object memories){
        System.out.println(this.getName() + " вспомнила о " + memories.toString());
    }
    public void look(Object person, Emotes emotes){
        System.out.println(this.getName() + " посмотрела на " + person.toString() + " с " + emotes.translation());
    }
    public void think(){
        System.out.println(this.getName() + " раздумывает о великом");
    }

}


package entity;

import exceptions.checked.UnmovableException;
import objects.Obj;
import utils.Emotes;
import utils.Washable;

public class Freken extends Human {
    public Freken(String name, int age){
        super(name, age);
    }
    private boolean sit = true;
    public void wash(Washable wash){
        System.out.println(this.getName() + " моет " + wash.toString());
        wash.wash();
    }
    public void remember(Object memories){
        System.out.println(this.getName() + " вспомнила о " + memories.toString());
    }
    public void standUp(){
        System.out.println(this.getName() + " встала");
        this.sit = false;
    }
    public void look(Human person, Emotes emotes){
        System.out.println(this.getName() + " посмотрела на " + person.toString() + " с " + emotes.translation());
    }
    public void move(Obj obj) throws UnmovableException{
        if(obj.getWeight() > 50){
            throw new UnmovableException();
        }
        System.out.println(this.getName() + " с упорством двинула " + obj.toString());
    }
    @Override
    public String toString(){
        return getName();
    }
}


package objects;

public class Obj {
    private final String name;
    public Obj(String name){
        this.name = name;
    }
    public void create(){
        System.out.println("Создан объект " + this.name);
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}

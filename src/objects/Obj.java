package objects;

public class Obj {
    private final String name;
    private int weight;

    public Obj(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    public int getWeight(){
        return this.weight;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}

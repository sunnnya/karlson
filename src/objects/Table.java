package objects;

public class Table extends Obj{
    private int weight;

    public Table(String name, int weight){
        super(name);
        this.weight = weight;
    }
    public int getWeight(){
        return this.weight;
    }

}

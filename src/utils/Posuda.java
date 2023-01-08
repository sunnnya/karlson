package utils;

public class Posuda implements Washable{
    private String name;
    public Posuda(String name){
        this.name = name;
    }
    public String getName( ){
        return this.name;
    }
    @Override
    public void wash() {
        System.out.println(this.name + " теперь чистая!");
    }
    @Override
    public String toString(){
        return getName();
    }
}

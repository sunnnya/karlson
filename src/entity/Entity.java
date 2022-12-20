package entity;

import location.Locatable;
import location.Location;
import java.util.Objects;

public abstract class Entity implements Locatable {
    protected Location location;
    public Entity(String name,int age){
        setName(name);
        setAge(age);
    }
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    @Override
    public Location getLocation() {
        return this.location;
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
    }
    @Override
    public String toString() {
        return "имя= " + this.name + ", возраст= " + this.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object oth) {
        if (this == oth) return true;
        if (oth == null) return false;
        if (!oth.getClass().equals(this.getClass())) return false;

        Entity other = (Entity) oth;
        return name.equals(other.name) && location.equals(other.location);
    }
}



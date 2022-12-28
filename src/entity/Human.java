package entity;


import location.Locatable;
import location.Location;
import utils.Beautifulness;
import utils.Emotes;
import utils.Emotionable;

public abstract class Human extends Entity implements Emotionable, Locatable {
    private Location location;
    private Emotes emotes = Emotes.OK;
    public Human(String name, int age){
        super(name,age);
    }
    public void say (String text){
        System.out.println(this.getName() + " сказал: " + text);
    }

    @Override
    public void act(Emotes emote){
        this.emotes = emote;
        System.out.println(this.getName() + " испытывает " + this.getEmote().translation());
    }
    @Override
    public Emotes getEmote(){
        return this.emotes;
    }
    @Override
    public void setLocation(Location loc){
        this.location = loc;
        System.out.println(this.getName() + " находится в " + loc);
    }
    @Override
    public Location getLocation(){
        return this.location;
    }
}

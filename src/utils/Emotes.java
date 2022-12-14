package utils;

public enum Emotes {
    NEDOVOL("недовольство"),
    VOZBUZH("возбуждение"),
    NEDOUM("неудомевание"),
    OK("ничего");
private String translation;
    public String translation(){
        return this.translation;
    }
    Emotes(String translation){
        this.translation = translation;
    }
}

package utils;

public enum Dryness {
    DRY("Сухой"),
    WET("Мокрый");

    private String translation;
    public String translation(){
        return this.translation;
    }
    Dryness(String translation) {
        this.translation = translation;
    }
}

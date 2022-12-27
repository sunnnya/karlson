package utils;

public enum Beautifulness {
    BEAUTY("Красивый"),
    DEFAULT("Ни рыба ни мясо"),
    NON("Никакой");

    private String translation;
    public String translation(){
        return this.translation;
    }
    Beautifulness(String translation) {
        this.translation = translation;
        }
    }
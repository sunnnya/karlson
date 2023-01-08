package exceptions.unchecked;

public class WrongAgeException extends Error{
    public WrongAgeException(String description){
        super(description);
    }
}

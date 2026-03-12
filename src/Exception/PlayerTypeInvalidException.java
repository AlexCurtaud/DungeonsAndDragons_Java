package Exception;

public class PlayerTypeInvalidException extends Exception {
    public PlayerTypeInvalidException(String message) {
        super("The Character class you're trying to select doesn't exist." + message);
    }
    // this("") call the previous constructor with a null parameter
    public PlayerTypeInvalidException() {
        this("");
    }
}

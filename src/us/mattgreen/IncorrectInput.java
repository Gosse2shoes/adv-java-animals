package us.mattgreen;

public class IncorrectInput extends Exception{
    public IncorrectInput(){
        super("User did not enter in the right input");
    }
}

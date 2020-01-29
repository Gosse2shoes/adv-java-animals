package us.mattgreen;

public class EmptyInput extends Exception {
    public EmptyInput(){
        super("User left the input empty");
    }
}

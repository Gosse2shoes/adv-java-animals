package us.mattgreen;

public class InputTypeVerifier {
    public static int number(String input) throws IncorrectInput, EmptyInput{
        if(input.isBlank()|input.isEmpty()){
            EmptyInput emptyInput = new EmptyInput();
            throw emptyInput;
        }
        else{
            for(char user: input.toCharArray()){
                if(!Character.isDigit(user)){
                    IncorrectInput wrong = new IncorrectInput();
                    throw wrong;
                }
            }
            return Integer.parseInt(input);
        }
    }
    public static boolean TorF(String input) throws IncorrectInput, EmptyInput{
        if(input.isBlank()|input.isEmpty()){
            EmptyInput emptyInput = new EmptyInput();
            throw emptyInput;
        }
        else{
           input = input.toLowerCase();
           if(input.equals("true")){
               return true;
           }else if(input.equals("false")){
               return false;
           }else{
               IncorrectInput incorrectInput = new IncorrectInput();
               throw incorrectInput;
           }
        }
    }
}

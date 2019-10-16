package Algorytmy2;

public class Zadanie4 {

    public static boolean IsPalindromString(String text){
        text = GetLetters(text.toLowerCase());
        String reverse = Reverse(text);
        if(text.equals(reverse)){
            return true;
        }

        return false;
    }
    public static String GetLetters(String text){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < text.length(); i++){
            char tempChar = text.charAt(i);
            if(Character.isLetterOrDigit(tempChar)){
                result.append(tempChar);
            }
        }
        return result.toString();
    }
    public static String Reverse(String input){
        if(input == null || input.isEmpty()){
            return input;
        }

        return input.charAt(input.length()- 1) + Reverse(input.substring(0, input.length() - 1));
    }
}

package Algorytmy2;

public class Zadanie9 {
    public static String Reverse(String text){
        if(text == null || text.isEmpty()){
            return text;
        }
        String reverse = "";
        for(int i = text.length() -1; i>=0; i--){
            reverse = reverse + text.charAt(i);
        }

        return reverse;
    }
}

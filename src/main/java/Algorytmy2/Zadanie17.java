package Algorytmy2;

public class Zadanie17{
    public static int counter = 0;
    public static void permutation(String input){
        permutation("", input);
    }
    private static void permutation(String perm, String word) {
        if (word.isEmpty()) {
            System.out.println(++counter + ": " + perm + word);

        } else {
            for (int i = 0; i < word.length(); i++) {
                permutation(perm + word.charAt(i), word.substring(0, i)
                        + word.substring(i + 1, word.length()));
            }
        }

    }
}

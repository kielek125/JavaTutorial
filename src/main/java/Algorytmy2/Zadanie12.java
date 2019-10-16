package Algorytmy2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Zadanie12 {

    public static void PrintDuplicateCharacters(String word) {
        char[] characters = word.toCharArray();

        Map<Character, Integer> charMap = new HashMap<>();
        for (Character ch : characters) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }

        System.out.println("Lista duplikatów dla poszczególnych liter dla zdania: " + word);
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}

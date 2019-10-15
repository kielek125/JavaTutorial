package Algorytmy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Zadanie3 {
    public static int[] divide(List<Integer> list1, List<Integer> list2) {

        List<Integer> results = new ArrayList<Integer>();
        List<Boolean> list = new ArrayList<>();
        for(int i : list1){
            for(int j : list2){
                if(i % j == 0){
                    list.add(true);
                }
                else{
                    list.add(false);
                }
            }
            if(!list.stream().anyMatch(x -> !x)){
                results.add(i);
            }
            list.clear();
        }
        return results.stream().mapToInt(Integer::intValue).toArray();
    }
}

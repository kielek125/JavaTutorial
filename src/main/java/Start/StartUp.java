package Start;


import Algorytmy2.Zadanie2;
import Algorytmy2.Zadanie4;
import Algorytmy2.Zadanie5;
import Algorytmy2.Zadanie6.Zadanie6Test;
import Algorytmy2.Zadanie7;
import Generycznosc2.*;

import java.util.*;

public class StartUp {
    public static void main(String[] args) {

        try{
            long numer = 153;
            System.out.println(Zadanie7.IsArmstrongNumber(9474));
            System.out.println(Zadanie7.IsArmstrongNumber(numer));
            System.out.println(Zadanie7.IsArmstrongNumber(407));
            System.out.println(Zadanie7.IsArmstrongNumber(371));
            System.out.println(Zadanie7.IsArmstrongNumber(93084));
            System.out.println(Zadanie7.IsArmstrongNumber(548834));
            System.out.println(Zadanie7.IsArmstrongNumber(548835));

        }catch (Exception ex){
            System.out.println(ex);
        }

    }

}



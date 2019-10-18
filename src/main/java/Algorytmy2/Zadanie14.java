package Algorytmy2;

import java.time.LocalDate;

public class Zadanie14 {
    public static boolean IsLeapYear1(int year){
        return LocalDate.of(year, 1,1).isLeapYear();
    }
    public static boolean IsLeapYear2(int year){
        return (year%400 == 0) || ((year%100) != 0 && (year%4 == 0));
    }
}

package Algorytmy;

import java.util.HashMap;
import java.util.Map;

public class Zadanie9 {

    private static String zero = "zero";
    private static String[] jednosci = { "", " jeden ", " dwa ", " trzy ",
            " cztery ", " pięć ", " sześć ", " siedem ", " osiem ", " dziewięć " };
    private static String[] dziesiatki = { "", " dziesięć ", " dwadzieścia ",
            " trzydzieści ", " czterdzieści ", " pięćdziesiąt ",
            " sześćdziesiąt ", " siedemdziesiąt ", " osiemdziesiąt ",
            " dziewięćdziesiąt "};
    private static String[] nascie = { "dziesięć", " jedenaście ", " dwanaście ",
            " trzynaście ", " czternaście ", " piętnaście ", " szesnaście ",
            " siedemnaście ", " osiemnaście ", " dziewiętnaście "};
    private static String[] setki = { "", " sto ", " dwieście ", " trzysta ",
            " czterysta ", " pięćset ", " sześćset ",
            " siedemset ", " osiemset ", " dziewięćset " };
    private static String[][] rzedy = {{" tysiąc ", " tysiące ", " tysięcy "},
        {" milion ", " miliony ", " milionów "},
        {" miliard ", " miliardy ", " miliardów "},
            {" bilion ", " biliony ", " bilionów "},
            {" biliard ", " biliardy ", " biliardów "}};

    public static String LiczbaSlownie(long wartosc)
    {
        StringBuffer sb = new StringBuffer();

        if (wartosc == 0){
            return zero;
        }
        if(String.valueOf(wartosc).length() > 18){
            int temp = String.valueOf(wartosc).length();
            return zero;
        }
        long jednosc = wartosc % 10;
        long dziesiątki = wartosc % 100;
        long setne = (wartosc % 1000) / 100;

        if (dziesiątki > 10 && dziesiątki < 20){
            sb.insert(0, nascie[(int)jednosc]);
        }
        else
        {
            sb.insert(0, jednosci[(int)jednosc]);
            sb.insert(0, dziesiatki[(int)dziesiątki / 10]);
        }
        sb.insert(0, setki[(int)setne]);

        //Pozostałe rzędy wielkości
        wartosc = wartosc / 1000;
        int rzad = 0;
        while (wartosc > 0)
        {
            jednosc = wartosc % 10;
            dziesiątki = wartosc % 100;
            setne = (wartosc % 1000) / 100;
            boolean rzadIstnieje = wartosc % 1000 != 0;
            if ((wartosc % 1000) / 10 == 0)
            {
                //nie ma dziesiątek i setek
                if (jednosc == 1){
                    sb.insert(0, rzedy[rzad][0]);
                }
                else if (jednosc >= 2 && jednosc <= 4){
                    sb.insert(0, rzedy[rzad][1]);
                }
                else if (rzadIstnieje){
                    sb.insert(0, rzedy[rzad][2]);
                }
                if (jednosc > 1){
                    sb.insert(0, jednosci[(int)jednosc]);
                }
            }
            else
            {
                if (dziesiątki >= 10 && dziesiątki < 20)
                {
                    sb.insert(0, rzedy[rzad][2]);
                    sb.insert(0, nascie[(int)dziesiątki % 10]);
                }
                else
                {
                    if (jednosc >= 2 && jednosc <= 4){
                        sb.insert(0, rzedy[rzad][1]);
                    }
                    else if (rzadIstnieje){
                        sb.insert(0, rzedy[rzad][2]);
                    }
                    sb.insert(0, jednosci[(int)jednosc]);
                    sb.insert(0, dziesiatki[(int)dziesiątki / 10]);
                }
                sb.insert(0, setki[(int)setne]);
            }
            rzad++;
            wartosc = wartosc / 1000;
        }
        return sb.toString();
    }
}

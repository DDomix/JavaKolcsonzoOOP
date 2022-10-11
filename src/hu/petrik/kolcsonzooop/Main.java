package hu.petrik.kolcsonzooop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<kolcsonozheto> katalógus=new ArrayList<>();

    public static void main(String[] args) {
	    Konyv konyv1=new Konyv("Harry Potter"," J.K Rowling","AAABBBCCC-XDDXDDXD");
        DVD dvd1=new DVD("Star Wars IV",121);
        DVD dvd2=new DVD("Avengers : Endgame",183);
        Ujsag ujsag1=new Ujsag("Képes Spor",2007,23);

        kolcsonozheto kolcsonozheto=new kolcsonozheto() {
            @Override
            public String megjelenithetoNev() {
                return null;
            }

            @Override
            public int meddigkolcsonozheto() {
                return 0;
            }
        };

        System.out.println(konyv1.getSzerzo());
        System.out.println(konyv1.megjelenithetoNev());
        katalógus.add(konyv1);
        katalógus.add(dvd1);
        katalógus.add(dvd2);
        katalógus.add(ujsag1);
        for (kolcsonozheto k:katalógus){
            System.out.println(k.megjelenithetoNev()+ " "+k.meddigkolcsonozheto());
        }
    }
}

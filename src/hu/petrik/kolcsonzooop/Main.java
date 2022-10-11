package hu.petrik.kolcsonzooop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    static List<kolcsonozheto> katalogus =new ArrayList<>();
    static List<DVD> dvdk=new ArrayList<>();


    public static void main(String[] args) {
	    Konyv konyv1=new Konyv("Harry Potter"," J.K Rowling","AAABBBCCC-XDDXDDXD");
	    Konyv konyv2=new Konyv("A nagy gatsby","F. Scott Fritzgerald","CCCBAA-XDDGLOL");
        DVD dvd1=new DVD("Star Wars IV",121);
        DVD dvd2=new DVD("Avengers : Endgame",183);
        DVD dvd3=new DVD("Harry Potter",135);
        Ujsag ujsag1=new Ujsag("Képes Sport",2007,23);

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
        katalogus.add(konyv1);
        katalogus.add(konyv2);
        katalogus.add(dvd1);
        katalogus.add(dvd2);
        katalogus.add(dvd3);
        dvdk.add(dvd1);
        dvdk.add(dvd2);
        dvdk.add(dvd3);
        katalogus.add(ujsag1);
        for (kolcsonozheto k: katalogus){
            System.out.println(k.megjelenithetoNev()+ " "+k.meddigkolcsonozheto());
        }
        Collections.sort(dvdk);
        for (DVD d:dvdk) {
            System.out.println(d.megjelenithetoNev()+ " "+d.getHossz());
        }
    }
}

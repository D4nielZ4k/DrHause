package com.company;

import com.company.model.Logik;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        Logik logik = new Logik();
        Sort sort = new Sort();
        // System.out.println(logik.lekarze());
        // System.out.println(logik.pacjeci().get(12));
        //  System.out.println(logik.wizyty().get(21));

     System.out.println("* - znajdź lekarza ktory miał najwięcej wizyt");
     System.out.println(sort.najwiecejWizyt());

     System.out.println("* - znajdź pacjenta który miał najwięcej wizyt");
     sort.najwiecejWizytPacjent();

     System.out.println("specalizacja która cieszy się największym ppowodzeniem - " + sort.najpopularniejszaSpec());

     System.out.println("\n" + "* - którego roku było najwięcej wizyt?");
     System.out.println(sort.najwięcejWizyt());

        System.out.println(" wypisz top 5 najstarszych lekarzy");
        System.out.println(sort.najstarszyLekarz());


    }
}

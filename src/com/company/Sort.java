package com.company;

import com.company.model.Lekarz;
import com.company.model.Logik;
import com.company.model.Pacjent;
import com.company.model.Wizyta;
import java.util.Comparator;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Sort {

    Logik logik = new Logik();

    // znajdź lekarza ktory miał najwięcej wizyt
    public Lekarz najwiecejWizyt() throws IOException {
        ArrayList<Lekarz> lekarze = logik.lekarze();
        ArrayList<Wizyta> wizyty = logik.wizyty();
        List<Integer> idLekarzy = new ArrayList<>();
        for (int i = 0; i < wizyty.size(); i++) {
            idLekarzy.add(wizyty.get(i).getIdLekarza());
        }

        List<Lekarz> lek = lekarze.stream().filter(lekarz -> lekarz.getId_Lekarza().equals(mostCommon(idLekarzy))).toList();
        return lek.get(0);
    }

    //znajdź pacjenta który miał najwięcej wizyt
    public void najwiecejWizytPacjent() throws IOException {
        ArrayList<Pacjent> pacjeci = logik.pacjeci();
        ArrayList<Wizyta> wizyty = logik.wizyty();
        List<Integer> idPacjeta = new ArrayList<>();
        for (int i = 0; i < wizyty.size(); i++) {
            idPacjeta.add(wizyty.get(i).getIdPacjeta());
        }
        System.out.println(pacjeci.stream().filter(lekarz -> lekarz.getIdPacjeta().equals(mostCommon(idPacjeta))).collect(Collectors.toList()));
    }

    // która specalizacja cieszy się największym ppowodzeniem
    public String najpopularniejszaSpec() throws IOException {
        return najwiecejWizyt().getSpecjalnosc();
    }

    //* - którego roku było najwięcej wizyt?

    public String najwięcejWizyt() throws IOException {
        ArrayList<Wizyta> wizyty = logik.wizyty();
        List<String> rokWizyty = new ArrayList<>();
        for (int i = 0; i < wizyty.size(); i++) {
            rokWizyty.add(String.valueOf(wizyty.get(i).getDataWizyty().getYear()));
        }

        return mostCommon(rokWizyty);
    }





    // - wypisz top 5 najstarszych lekarzy
    public  ArrayList<Lekarz> najstarszyLekarz() throws IOException {
        ArrayList<Lekarz> lekarze = logik.lekarze();
        ArrayList<Lekarz> najstarsi = new ArrayList<>();

        Comparator<Lekarz> comparator = (c1, c2) -> {
            return Long.compare(c1.getDataUrodzenia().getYear(), (long) c2.getDataUrodzenia().getYear());
        };
        Collections.sort(lekarze, comparator);

        najstarsi.add(lekarze.get(0));
        najstarsi.add(lekarze.get(1));
        najstarsi.add(lekarze.get(2));
        najstarsi.add(lekarze.get(3));
        najstarsi.add(lekarze.get(4));
        return najstarsi;
    }


    public static <T> T mostCommon(List<T> list) {
        Map<T, Integer> map = new HashMap<>();

        for (T t : list) {
            Integer val = map.get(t);
            map.put(t, val == null ? 1 : val + 1);
        }

        Map.Entry<T, Integer> max = null;

        for (Map.Entry<T, Integer> e : map.entrySet()) {
            if (max == null || e.getValue() > max.getValue())
                max = e;
        }

        return max.getKey();
    }

}

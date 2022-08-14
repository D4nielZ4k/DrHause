package com.company.model;


import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Logik {

    public ArrayList<Lekarz> lekarze() throws IOException {
        File file = new File("src/files/lekarze.txt");
        Scanner s = new Scanner(file);
        ArrayList<Lekarz> lekarzeLista = new ArrayList<>();

        ArrayList<String> stringList = new ArrayList<String>();
        FileInputStream stream;
        try {
            stream = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(new DataInputStream(stream)));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                stringList.add(strLine);
            }
        } catch (IOException e) {
            System.out.println("no byla by lipa");
        }

        for (int i = 1; i < stringList.size(); i++) {
            String string = stringList.get(i);
            String[] items = string.split("\t");

            Integer id = Integer.valueOf(items[0]);
            String nazwisko = items[1];
            String imie = items[2];
            String specjalnosc = items[3];
            LocalDate dataUrodzenia = LocalDate.parse(items[4]);
            String nip = items[5];
            String pesel = items[6];

            Lekarz newLekarz = new Lekarz(id, nazwisko, imie, specjalnosc, dataUrodzenia, nip, pesel);
            lekarzeLista.add(newLekarz);

        }
        return lekarzeLista;

    }


    public ArrayList<Pacjent> pacjeci() throws IOException {
        File file = new File("src/files/pacjenci.txt");
        Scanner s = new Scanner(file);
        ArrayList<Pacjent> pacjeciLista = new ArrayList<>();

        ArrayList<String> stringList = new ArrayList<String>();
        FileInputStream stream;
        try {
            stream = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(new DataInputStream(stream)));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                stringList.add(strLine);
            }
        } catch (IOException e) {
            System.out.println("no byla by lipa");
        }

        for (int i = 1; i < stringList.size(); i++) {
            String string = stringList.get(i);
            String[] items = string.split("\t");

            Integer id = Integer.valueOf(items[0]);
            String nazwisko = items[1];
            String imie = items[2];
            String pesel = items[3];
            LocalDate dataUrodzenia = LocalDate.parse(items[4], DateTimeFormatter.ofPattern("u-M-d"));


            Pacjent nowy = new Pacjent(id, nazwisko, imie, pesel, dataUrodzenia);
            pacjeciLista.add(nowy);

        }
        return pacjeciLista;
    }


    public ArrayList<Wizyta> wizyty() throws IOException {
        File file = new File("src/files/wizyty.txt");
        Scanner s = new Scanner(file);
        ArrayList<Wizyta> wizytyLista = new ArrayList<>();

        ArrayList<String> stringList = new ArrayList<String>();
        FileInputStream stream;
        try {
            stream = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(new DataInputStream(stream)));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                stringList.add(strLine);
            }
        } catch (IOException e) {
            System.out.println("no byla by lipa");
        }

        for (int i = 1; i < stringList.size(); i++) {
            String string = stringList.get(i);
            String[] items = string.split("\t");

            Integer idLekarza = Integer.valueOf(items[0]);
            Integer idPacjeta = Integer.valueOf(items[1]);
            LocalDate dataWizyty = LocalDate.parse(items[2], DateTimeFormatter.ofPattern("u-M-d"));


            Wizyta nowaWizyta = new Wizyta(idLekarza, idPacjeta, dataWizyty);
            wizytyLista.add(nowaWizyta);

        }
        return wizytyLista;
    }


}

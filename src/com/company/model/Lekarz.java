package com.company.model;

import java.time.LocalDate;

public class Lekarz {
    Integer id_Lekarza;
    String nazwisko;
    String imie;
    String specjalnosc;
    LocalDate dataUrodzenia;
    String nip;
    String pesel;

    public Lekarz(Integer id_Lekarza, String nazwisko, String imie, String specjalnosc, LocalDate dataUrodzenia, String nip, String pesel) {
        this.id_Lekarza = id_Lekarza;
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.specjalnosc = specjalnosc;
        this.dataUrodzenia = dataUrodzenia;
        this.nip = nip;
        this.pesel = pesel;
    }

    public Integer getId_Lekarza() {
        return id_Lekarza;
    }

    public void setId_Lekarza(Integer id_Lekarza) {
        this.id_Lekarza = id_Lekarza;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getSpecjalnosc() {
        return specjalnosc;
    }

    public void setSpecjalnosc(String specjalnosc) {
        this.specjalnosc = specjalnosc;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Lekarz{" +
                "ID = " + id_Lekarza +
                ", nazwisko='" + nazwisko + '\'' +
                ", imie='" + imie + '\'' +
                ", specjalnosc='" + specjalnosc + '\'' +
                ", dataUrodzenia=" + dataUrodzenia + "\n"+
                '}';
    }
}

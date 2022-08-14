package com.company.model;

import java.time.LocalDate;

public class Pacjent {
    Integer idPacjeta;
    String nazwisko;
    String imie;
    String pesel;
    LocalDate dataurodzenia;


    public Pacjent(Integer idPacjeta, String nazwisko, String imie, String pesel, LocalDate dataurodzenia) {
        this.idPacjeta = idPacjeta;
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.pesel = pesel;
        this.dataurodzenia = dataurodzenia;
    }

    @Override
    public String toString() {
        return "Pacjent{" +
                "idPacjeta=" + idPacjeta +
                ", nazwisko='" + nazwisko + '\'' +
                ", imie='" + imie + '\'' +
                ", pesel='" + pesel + '\'' +
                ", dataurodzenia=" + dataurodzenia +
                '}';
    }

    public Integer getIdPacjeta() {
        return idPacjeta;
    }

    public void setIdPacjeta(Integer idPacjeta) {
        this.idPacjeta = idPacjeta;
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

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public LocalDate getDataurodzenia() {
        return dataurodzenia;
    }

    public void setDataurodzenia(LocalDate dataurodzenia) {
        this.dataurodzenia = dataurodzenia;
    }
}

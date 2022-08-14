package com.company.model;

import java.time.LocalDate;

public class Wizyta {
    Integer idLekarza;
    Integer idPacjeta;
    LocalDate dataWizyty;

    public Wizyta(Integer idLekarza, Integer idPacjeta, LocalDate dataWizyty) {
        this.idLekarza = idLekarza;
        this.idPacjeta = idPacjeta;
        this.dataWizyty = dataWizyty;
    }

    public Integer getIdLekarza() {
        return idLekarza;
    }

    public void setIdLekarza(Integer idLekarza) {
        this.idLekarza = idLekarza;
    }

    public Integer getIdPacjeta() {
        return idPacjeta;
    }

    public void setIdPacjeta(Integer idPacjeta) {
        this.idPacjeta = idPacjeta;
    }

    public LocalDate getDataWizyty() {
        return dataWizyty;
    }

    public void setDataWizyty(LocalDate dataWizyty) {
        this.dataWizyty = dataWizyty;
    }

    @Override
    public String toString() {
        return "Wizyta{" +
                "idLekarza=" + idLekarza +
                ", idPacjeta=" + idPacjeta +
                ", dataWizyty=" + dataWizyty +
                '}';
    }
}

package com.example.fme.discover_istanbul;

/**
 * Created by FME on 17.12.2017.
 */

public class Sport {
    int id;
    String baslik;
    String yazar;
    String kategori;

    public Sport() {
    }

    public Sport(String baslik, String yazar,String kategori) {
        this.baslik = baslik;
        this.yazar = yazar;
        this.kategori = kategori;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}

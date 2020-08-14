package com.ness.petagram;

public class Mascotas {
    private String nombre;
    private int    imgMascota;

    public Mascotas(int imgMascota, String nombre){
        this.imgMascota = imgMascota;
        this.nombre     = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImgMascota() {
        return imgMascota;
    }

    public void setImgMascota(int imgMascota) {
        this.imgMascota = imgMascota;
    }
}

package com.educacionitbootcamp.practica9.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "ropa")
public class Ropa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRopa;

    @Column(length = 100, nullable = false)
    private String marca;

    @Column(length = 100)
    private String tipo;

    @Column(nullable = false)
    private float precio;

    public Ropa(){}

    public Ropa(String marca, String tipo, float precio){
        this.marca = marca;
        this.precio = precio;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Ropa{" +
                "idRopa=" + idRopa +
                ", marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                '}';
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getIdRopa() {
        return idRopa;
    }

    public void setIdRopa(int idRopa) {
        this.idRopa = idRopa;
    }
}

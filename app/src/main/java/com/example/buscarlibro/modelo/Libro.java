package com.example.buscarlibro.modelo;

import java.io.Serializable;

public class Libro{
    private String titulo, auto, año, paginas, categoria, detalle;
    private int imagen;

    public Libro(String titulo, String auto, String año, String paginas, String categoria, String detalle, int imagen) {
        this.titulo = titulo;
        this.auto = auto;
        this.año = año;
        this.paginas = paginas;
        this.categoria = categoria;
        this.detalle = detalle;
        this.imagen = imagen;
    }

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }
}

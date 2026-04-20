package com.example.buscarlibro;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.buscarlibro.modelo.Libro;

import java.util.ArrayList;
import java.util.List;

public class DetalleLibroViewModel extends AndroidViewModel {
    private MutableLiveData<List<Libro>> listaLibroMuteable = new MutableLiveData<>();
    private List<Libro> libros;
    private Libro libro0,libro1,libro2,libro3,libro4,libro5;

    public DetalleLibroViewModel(@NonNull Application application) {
        super(application);
        libros= new ArrayList<>();
        libro1 = new Libro(
                "Cien años de soledad",
                "Gabriel García Márquez",
                "1967",
                "471",
                "Novela",
                "Una historia sobre la familia Buendía en Macondo",
                R.drawable.cienanosdesoledad
        );
        libro2 = new Libro(
                "Don Quijote de la Mancha",
                "Miguel de Cervantes",
                "1605",
                "863",
                "Clásico",
                "Las aventuras de un caballero que confunde la realidad",
                R.drawable.donquijote
        );
        libro3 = new Libro(
                "El principito",
                "Antoine de Saint-Exupéry",
                "1943",
                "96",
                "Fábula",
                "Un niño de otro planeta enseña sobre la vida y la amistad",
                R.drawable.elprincipito
        );
        libro4 = new Libro(
                "Harry Potter y la piedra filosofal",
                "J.K. Rowling",
                "1997",
                "223",
                "Fantasía",
                "Un niño descubre que es un mago y comienza su aventura en Hogwarts.",
                R.drawable.harry1
        );

        libro5 = new Libro(
                "Harry Potter y la cámara secreta",
                "J.K. Rowling",
                "1998",
                "251",
                "Fantasía",
                "Harry regresa a Hogwarts donde una misteriosa cámara pone en peligro a los estudiantes.",
                R.drawable.harry2
        );
        libro0 = new Libro(
                "Libro No Encontrado",
                "-",
                "-",
                "-",
                "-",
                "El libro que esta buscando no se encuentra en la biblioteca",
                 R.drawable.noencontrado
        );
    }
    public MutableLiveData<List<Libro>> getListaLibroMuteable() {
        return listaLibroMuteable;
    }
    public void listarLibros(String libro){
        if (libro != null) {
            libro = libro.toLowerCase();

            switch (libro){
                case "el principito": libros.add(libro3); break;
                case "don quijote de la mancha": libros.add(libro2); break;
                case "cien años de soledad": libros.add(libro1); break;
                case "harry potter":libros.add(libro4);libros.add(libro5);break;
                default: libros.add(libro0); break;
            }
        } else {
            libros.add(libro0);
        }

        listaLibroMuteable.setValue(libros);
    }

}

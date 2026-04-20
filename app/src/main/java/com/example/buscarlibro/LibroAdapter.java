package com.example.buscarlibro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.buscarlibro.databinding.ItemBinding;
import com.example.buscarlibro.modelo.Libro;

import java.util.List;

public class LibroAdapter extends ArrayAdapter<Libro> {
    private List<Libro> listaLibros;
    private Context context;
    private LayoutInflater li;
    private int itemMostrar;


    public LibroAdapter(@NonNull Context context, int resource, @NonNull List<Libro> objects,LayoutInflater li) {
        super(context, resource, objects);
        this.listaLibros= objects;
        this.context=context;
        this.li=li;
        this.itemMostrar=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View item=convertView;
         ItemBinding binding;
        if (item == null) {
            binding = ItemBinding.inflate(li, parent, false);
            item = binding.getRoot();
            item.setTag(binding);
        }else {
            binding = (ItemBinding) item.getTag();
        }
        Libro libro=listaLibros.get(position);
        binding.imagen.setImageResource(libro.getImagen());
        binding.tvTitulo.setText(libro.getTitulo());
        binding.tvAutor.setText(libro.getAuto());
        binding.tvAnoPaginas.setText("Año: "+libro.getAño()+"\nPaginas: "+libro.getPaginas());
        binding.tvCategoria.setText(libro.getCategoria());
        binding.tvDetalle.setText(libro.getDetalle());

        return item;
    }

    @Override
    public int getCount() {
        return listaLibros.size();
    }
}

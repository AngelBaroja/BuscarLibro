package com.example.buscarlibro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.buscarlibro.databinding.ActivityDetalleLibroBinding;
import com.example.buscarlibro.databinding.ActivityMainBinding;
import com.example.buscarlibro.modelo.Libro;

import java.util.List;

public class DetalleLibro extends AppCompatActivity {
    private DetalleLibroViewModel vm;
    private ActivityDetalleLibroBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDetalleLibroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        vm= ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(DetalleLibroViewModel.class);
        vm.listarLibros(getIntent().getStringExtra("libro"));
        vm.getListaLibroMuteable().observe(this, new Observer<List<Libro>>() {
            @Override
            public void onChanged(List<Libro> libros) {
                LibroAdapter la=new LibroAdapter(DetalleLibro.this,R.layout.item,libros,getLayoutInflater());
                binding.listado.setAdapter(la);
            }
        });
        binding.bVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DetalleLibro.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
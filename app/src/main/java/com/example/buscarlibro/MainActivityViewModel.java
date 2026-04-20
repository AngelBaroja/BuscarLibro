package com.example.buscarlibro;

import static androidx.core.content.ContextCompat.startActivity;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.buscarlibro.modelo.Libro;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    public MainActivityViewModel(@NonNull Application application) {
        super(application);

    }


}

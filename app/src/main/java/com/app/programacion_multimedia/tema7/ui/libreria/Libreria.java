package com.app.programacion_multimedia.tema7.ui.libreria;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.programacion_multimedia.R;
import com.app.programacion_multimedia.databinding.T7Actividad2LibreriaBinding;
import com.app.programacion_multimedia.tema7.ui.add.AddLibros;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Libreria extends Fragment {

    private boolean isAgregar = false;
    private AddLibros fr;
    private T7Actividad2LibreriaBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {

    View v = inflater.inflate(R.layout.t7_actividad2_libreria, container, false);

        RecyclerView recyclerLibros = v.findViewById(R.id.recyclerLibros);
        FloatingActionButton fabAgregar = v.findViewById(R.id.fabAgregar);


    fabAgregar.setOnClickListener(v1 -> {


    });

    return v;

    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
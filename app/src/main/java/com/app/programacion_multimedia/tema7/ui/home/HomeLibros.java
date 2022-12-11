package com.app.programacion_multimedia.tema7.ui.home;

import android.app.Fragment;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.app.programacion_multimedia.R;
import com.app.programacion_multimedia.databinding.T7Actividad2AddBinding;
import com.app.programacion_multimedia.tema7.ui.add.AddLibros;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class HomeLibros extends Fragment {

    private T7Actividad2AddBinding binding;
    private RecyclerView recyclerLibros;
    private FloatingActionButton fabAgregar;
    private boolean isAgregar = false;
    private AddLibros fr;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {

    View v = inflater.inflate(R.layout.t7_actividad2_home, container, false);

    recyclerLibros = v.findViewById(R.id.recyclerLibros);
    fabAgregar = v.findViewById(R.id.fabAgregar);


    fabAgregar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {


        }
    });

    return v;

    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
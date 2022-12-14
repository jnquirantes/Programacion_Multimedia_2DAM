package com.app.programacion_multimedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.app.programacion_multimedia.tema7.T7_Actividad2;

public class FragHecho2 extends Fragment {

    private boolean tema7 = MainActivity.tema7;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_hecho, container, false);

        view.findViewById(R.id.bTarea).setOnClickListener(v -> {
            if (tema7) {
                startActivity(new Intent(FragHecho2.this.getContext(), T7_Actividad2.class));
            }
        });

        return view;
    }
}
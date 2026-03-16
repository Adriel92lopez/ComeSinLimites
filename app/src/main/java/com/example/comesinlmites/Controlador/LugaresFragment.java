package com.example.comesinlmites.Controlador;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.comesinlmites.Adapter.ComidaAdapter;
import com.example.comesinlmites.R;

import java.util.Arrays;
import java.util.List;

public class LugaresFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerComidas);

        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));

        List<String> lugares = Arrays.asList(
                "Restaurante Vegano",
                "Pizzería sin Gluten",
                "Café Saludable",
                "Mercado Orgánico",
                "Casa de Pastas",
                "Panadería Vegana"
        );

        recyclerView.setAdapter(new ComidaAdapter(lugares));

        return view;
    }
}

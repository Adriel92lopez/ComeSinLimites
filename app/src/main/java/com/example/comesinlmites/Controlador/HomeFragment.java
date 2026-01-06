package com.example.comesinlmites.Controlador;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.comesinlmites.Adapter.ComidaAdapter;
import com.example.comesinlmites.R;

import java.util.Arrays;
import java.util.List;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerComidas);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));

        List<String> comidas = Arrays.asList(
                "Pizza", "Hamburguesa", "Empanadas",
                "Pasta", "Tacos", "Sushi"
        );

        recyclerView.setAdapter(new ComidaAdapter(comidas));

        return view;
    }
}

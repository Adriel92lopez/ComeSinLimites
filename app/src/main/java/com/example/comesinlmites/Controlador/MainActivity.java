package com.example.comesinlmites.Controlador;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.comesinlmites.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setSupportActionBar(findViewById(R.id.toolbar));

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, new HomeFragment())
                .commit();
    }
}


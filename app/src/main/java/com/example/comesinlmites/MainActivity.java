package com.example.comesinlmites;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.comesinlmites.Controlador.LoginActivity;
import com.example.comesinlmites.databinding.ActivityMainBinding;
import com.example.comesinlmites.Utils.SessionManager;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private SessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // 🔹 Inicializar sesión
        session = new SessionManager(this);

        // Toolbar
        if (binding.toolbar != null) {
            setSupportActionBar(binding.toolbar);
        }

        // NavHostFragment
        NavHostFragment navHostFragment =
                (NavHostFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.nav_host_fragment_content_main);

        if (navHostFragment != null) {

            NavController navController = navHostFragment.getNavController();

            appBarConfiguration =
                    new AppBarConfiguration.Builder(navController.getGraph()).build();

            NavigationUI.setupActionBarWithNavController(
                    this,
                    navController,
                    appBarConfiguration
            );

            // Bottom Navigation
            NavigationUI.setupWithNavController(
                    binding.bottomNavigation,
                    navController
            );
        }

        // 🔥 =========================
        // 🔥 MANEJO DEL DRAWER (HEADER)
        // 🔥 =========================

        // Obtener el header del Navigation Drawer
        View headerView = binding.navigationView.getHeaderView(0);

        TextView tvNombre = headerView.findViewById(R.id.tvNombre);
        TextView tvEmail = headerView.findViewById(R.id.tvEmail);
        TextView tvLogin = headerView.findViewById(R.id.tvLogin);

        // 👉 Si está logueado
        if (session.isLogged()) {
            String email = session.getEmail();

            tvNombre.setText(email.split("@")[0]); // nombre simple
            tvEmail.setText(email);
            tvLogin.setVisibility(View.GONE);

        } else {
            // 👉 Si NO está logueado
            tvNombre.setText("Invitado");
            tvEmail.setText("");
            tvLogin.setVisibility(View.VISIBLE);
        }

        // 👉 Click en "Iniciar sesión"
        tvLogin.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController =
                Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}

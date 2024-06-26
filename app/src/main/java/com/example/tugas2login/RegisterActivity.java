package com.example.tugas2login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegisterActivity extends AppCompatActivity {

    Button masukkelogin;
    Button masukkeregis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        masukkelogin = findViewById(R.id.btnlogin);

        masukkelogin.setOnClickListener(v -> {
            Intent masuk = new Intent(RegisterActivity.this, masuklogin.class);
            startActivity(masuk);
        });

        masukkeregis = findViewById(R.id.btnregis);

        masukkeregis.setOnClickListener(v -> {
            Intent masukreg = new Intent(RegisterActivity.this, masukregister.class);
            startActivity(masukreg);
        });
   }
}
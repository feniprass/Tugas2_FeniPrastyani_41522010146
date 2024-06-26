package com.example.tugas2login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;




public class tampilanawal extends AppCompatActivity {

    Button scan;
    Button reedemvaganza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tampilanawal);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });

        scan = findViewById(R.id.btnscanbarcode);

        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent scanbotol = new Intent(tampilanawal.this, scantutup1.class);
                startActivity(scanbotol);
            }
        });

        reedemvaganza = findViewById(R.id.btnreedemvaganza);

        reedemvaganza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reedemhadiah = new Intent(tampilanawal.this, reedemvaganza.class);
                startActivity(reedemhadiah);
            }
        });
    }
}
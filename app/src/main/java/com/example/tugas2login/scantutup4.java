package com.example.tugas2login;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class scantutup4 extends AppCompatActivity {

    Button savektp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scantutup4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        savektp = findViewById(R.id.btnkliksave);

        savektp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent scanktp = new Intent(scantutup4.this,scanktp.class);
                startActivity(scanktp);
            }
        });
    }
}
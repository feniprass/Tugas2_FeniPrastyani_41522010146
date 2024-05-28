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

public class scantutup1 extends AppCompatActivity {

    Button submit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scantutup1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        submit1 = findViewById(R.id.btnkliksubmit1);

        submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahsubmit = new Intent(scantutup1.this, scantutup2.class);
                startActivity(pindahsubmit);
            }
        });

    }
}
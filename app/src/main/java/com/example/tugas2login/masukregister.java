package com.example.tugas2login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class masukregister extends AppCompatActivity  {

    EditText namalengkap;
    EditText emailreg;
    EditText katasandireg;
    EditText konfirkatasandireg;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_masukregister);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        namalengkap = findViewById(R.id.btnnamaregis);
        emailreg = findViewById(R.id.btnemailregis);
        katasandireg = findViewById(R.id.btnkatasandiregis);
        konfirkatasandireg = findViewById(R.id.btnkonfirregis);
        register = findViewById(R.id.btnklikregis);



        register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (namalengkap.getText().toString().equals("feni prastyani") && emailreg.getText().toString().equals("feniprastyani03@gmail.com") && katasandireg.getText().toString().equals("pepenii") && konfirkatasandireg.getText().toString().equals("pepenii")) {
                    Toast.makeText(masukregister.this, "Berhasil Masuk", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(masukregister.this, "Gagal Masuk", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

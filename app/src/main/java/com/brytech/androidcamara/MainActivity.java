package com.brytech.androidcamara;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn_foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_foto = findViewById(R.id.Btn_foto);
        Iniciar_Control();
    }

    private void Iniciar_Control() {

        View.OnClickListener B = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.Btn_foto) {
                    Intent inten = new Intent(getApplicationContext(), Camara.class);
                    startActivity(inten);
                }
            }
        };
        btn_foto.setOnClickListener(B);
    }
}
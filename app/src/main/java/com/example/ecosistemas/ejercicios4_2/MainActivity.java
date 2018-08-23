package com.example.ecosistemas.ejercicios4_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_main_to_form;
    private TextView tv_main_status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_main_to_form = findViewById(R.id.btn_main_to_form);
        tv_main_status = findViewById(R.id.tv_main_status);

        btn_main_to_form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent solicitud = new Intent(getApplicationContext(), UserFormActivity.class);

                startActivity(solicitud);
            }
        });
    }
}

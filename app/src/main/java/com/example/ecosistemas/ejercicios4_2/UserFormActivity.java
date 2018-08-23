package com.example.ecosistemas.ejercicios4_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class UserFormActivity extends AppCompatActivity {

    private EditText edt_userform_name;
    private EditText edt_userform_email;
    private EditText edt_userform_userform;

    private Button btn_userform_finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_form);

        Intent solicitud = getIntent();

        edt_userform_name = findViewById(R.id.edt_userform_name);
        edt_userform_email = findViewById(R.id.edt_userform_email);
        edt_userform_userform = findViewById(R.id.edt_userform_nick);

        btn_userform_finish = findViewById(R.id.btn_userform_finish);
    }
}

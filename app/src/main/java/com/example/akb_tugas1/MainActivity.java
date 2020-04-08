package com.example.akb_tugas1;

/**
Nama    : Siti Safira Nadifa
NIM     : 10117904
Kelas   : IF-6K
log History
 - 8 April 2020 20:30 Layouting Main Activity
 - 8 April 2020 22:00 Layouting Login Activity
 - 9 April 2020 24:09 Layouting Biodata
 - 9 April 2020 24:25 Layouting Say Hi
 - 9 April 2020 24:40 Function mulai
 - 9 April 2020 24:40 Function masuk

*/

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonStart (View view) {
        Intent intent;
        intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

}

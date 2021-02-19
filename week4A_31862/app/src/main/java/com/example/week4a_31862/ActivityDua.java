package com.example.week4a_31862;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityDua extends AppCompatActivity {
    private TextView tvPesanDiterima;
    private EditText stJawaban;
    private Button btnBalasKirim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);
        tvPesanDiterima = findViewById(R.id.pesanDiterima);
        stJawaban = findViewById(R.id.pesanBalik);
        btnBalasKirim = findViewById(R.id.kirimBalik);
        Intent mainIntent = getIntent();
                String pesanDiterima =
                        mainIntent.getStringExtra("PesanDariMain");
                tvPesanDiterima.setText(pesanDiterima);
    }
    public void kirimBalik(View view){
        String jawaban = stJawaban.getText().toString();
        Intent balasIntent = new Intent();
        balasIntent.putExtra("Jawaban", jawaban);
        setResult(RESULT_OK, balasIntent);
        finish();
    }
}
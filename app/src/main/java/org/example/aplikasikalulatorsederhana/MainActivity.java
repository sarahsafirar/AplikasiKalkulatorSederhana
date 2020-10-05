package org.example.aplikasikalulatorsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText angka1;
    EditText angka2;
    TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka1 = findViewById(R.id.angka1EditText);
        angka2 = findViewById(R.id.angka2EditText);
        hasilTextView = findViewById(R.id.hasilTextView);

    }

    public void tambah(View view) {
        int nilai1 = Integer.parseInt(angka1.getText().toString());
        int nilai2 = Integer.parseInt(angka2.getText().toString());
        int hasil = nilai1 + nilai2;
        hasilTextView.setText(String.valueOf(hasil));
    }

    public void minus(View view) {
        int nilai1 = Integer.parseInt(angka1.getText().toString());
        int nilai2 = Integer.parseInt(angka2.getText().toString());
        int hasil = nilai1 - nilai2;
        hasilTextView.setText(String.valueOf(hasil));
    }

    public void kali(View view) {
        int nilai1 = Integer.parseInt(angka1.getText().toString());
        int nilai2 = Integer.parseInt(angka2.getText().toString());
        int hasil = nilai1 * nilai2;
        hasilTextView.setText(String.valueOf(hasil));
    }

    public void bagi(View view) {
        int nilai1 = Integer.parseInt(angka1.getText().toString());
        float nilai2 = Integer.parseInt(angka2.getText().toString());
        float hasil = nilai1 / nilai2;
        hasilTextView.setText(String.valueOf(hasil));
    }

    public void bersihkan(View view) {
        angka1.setText("");
        angka2.setText("");
        hasilTextView.setText("0");
        angka1.requestFocus();
    }

}
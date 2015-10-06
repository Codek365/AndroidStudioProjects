package com.codek365.lession_oop2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SanPham keo =new SanPham();
        keo.TenSP = "Chocolate";
        keo.setGia(100);
        Toast.makeText(MainActivity.this, "" + keo.getGia(),Toast.LENGTH_LONG).show();
    }
}

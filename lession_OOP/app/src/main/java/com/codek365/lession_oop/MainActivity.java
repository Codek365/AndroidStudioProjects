package com.codek365.lession_oop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnChon;
    TextView txtvTen;
    ImageView imgvHinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnChon = (Button) findViewById(R.id.buttonChon);
        txtvTen = (TextView) findViewById(R.id.editTextTen);
        imgvHinh = (ImageView) findViewById(R.id.imageViewHinh);

        btnChon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<ConThu> mang = new ArrayList<ConThu>();
                mang.add(new ConThu("Cho muc", R.drawable.chomuc));
                mang.add(new ConThu("Chuon Chuon", R.drawable.chuonchuon));
                mang.add(new ConThu("Con Cho", R.drawable.concho));
                mang.add(new ConThu("Con Heo", R.drawable.conheo));
                mang.add(new ConThu("Con Khi", R.drawable.conkhi));

                Random r = new Random();
                int n = r.nextInt(mang.size());

                ConThu abc = mang.get(n);

                txtvTen.setText(abc.Ten);
                imgvHinh.setImageResource(abc.Hinh);
            }
        });


    }
}

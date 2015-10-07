package com.example.you_tek.lession_listview_custom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.SinhVien);

        ArrayList<SinhVien> mangSinhVien = new ArrayList<SinhVien>();
        mangSinhVien.add(new SinhVien("nguyen van A", 1986));
        mangSinhVien.add(new SinhVien("nguyen van B", 1987));
        mangSinhVien.add(new SinhVien("nguyen van c",1988));
        mangSinhVien.add(new SinhVien("nguyen van D",1989));
        mangSinhVien.add(new SinhVien("nguyen van E",1990));
        mangSinhVien.add(new SinhVien("nguyen van F",1991));

        ListAdapter adapter = new ListAdapter(
                MainActivity.this,
                R.layout.activity_dong_sinh_vien,
                mangSinhVien
        );

        lv.setAdapter(adapter);






    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

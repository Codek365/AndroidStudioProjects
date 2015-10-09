package com.example.you_tek.lession_listview_custom;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

        lv = (ListView)findViewById(R.id.listViewSinhVien);

        ArrayList<SinhVien> mangSinhVien = new ArrayList<SinhVien>();

        mangSinhVien.add(new SinhVien("Nguyen van a",1990));
        mangSinhVien.add(new SinhVien("Nguyen van b",1991));
        mangSinhVien.add(new SinhVien("Nguyen van c",1992));
        mangSinhVien.add(new SinhVien("Nguyen van d",1993));
        mangSinhVien.add(new SinhVien("Nguyen van e",1994));

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

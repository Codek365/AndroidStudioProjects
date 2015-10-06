package com.codek365.lession_listview_import;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText edtHoten;
    Button btnvSave;
    ListView lvDanhSach;
    ArrayList<String> mang;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtHoten = (EditText) findViewById(R.id.editTextHoten);
        lvDanhSach = (ListView) findViewById(R.id.listViewDanhsach);
        btnvSave = (Button) findViewById(R.id.buttonSave);

        mang = new ArrayList<String>();

        btnvSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mang.add(edtHoten.getText().toString());

                ArrayAdapter adapter = new ArrayAdapter(
                  MainActivity.this,
                        android.R.layout.simple_list_item_1,
                        mang

                );

                lvDanhSach.setAdapter(adapter);
            }
        });



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

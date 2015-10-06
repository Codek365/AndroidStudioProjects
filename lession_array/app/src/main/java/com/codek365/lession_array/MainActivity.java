package com.codek365.lession_array;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnvButton;
    ImageView imgvImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button = findViewById(R.id.buttonNumber);
        ImageView = findViewById(R.id.imageView);

        ArrayList<Integer> mang = new ArrayList<>(Integer);



//        String s = getnumber();
//        Toast.makeText(MainActivity.this, s, Toast.LENGTH_LONG).show();
    }

    public String getnumber(){
        ArrayList<String> mang = new ArrayList<String>();

        mang.add("A");
        mang.add("B");
        mang.add("C");
        mang.add("1");
        mang.add("2");
        mang.add("3");
        String s = "";
        for (int i = 1; i<10; i++){
            Random r = new Random();
            int n = r.nextInt(mang.size());
            s = s + mang.get(n);
        }

        return s;
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

package com.example.hoang.baitapcustomadapter;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<ConThu> mang=new ArrayList<ConThu>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.listViewconthu);


        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                new LayHinhTuInternet().execute("http://khoapham.vn/images/zoo/2.png");
                new LayHinhTuInternet().execute("http://khoapham.vn/images/zoo/3.png");
                new LayHinhTuInternet().execute("http://khoapham.vn/images/zoo/4.png");
            }
        });
    }
    class LayHinhTuInternet extends AsyncTask<String,Integer,Bitmap> {
        @Override
        protected Bitmap doInBackground(String... params) {
            Bitmap bmp = null;
            try {
                URL u = new URL(params[0]);
                bmp= BitmapFactory.decodeStream(u.openConnection().getInputStream());

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return bmp;


        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            //ArrayList<ConThu> mang=new ArrayList<ConThu>();
            mang.add(new ConThu("Con chó", bitmap));
            ListAdapter adapter = new ListAdapter(MainActivity.this,R.layout.activity_dong_conthu,mang);
            lv.setAdapter(adapter);
        }
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

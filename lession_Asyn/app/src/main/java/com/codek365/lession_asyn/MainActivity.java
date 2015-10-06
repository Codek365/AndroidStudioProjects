package com.codek365.lession_asyn;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    Button btnNut;
    ImageView imgvHinh;
    EditText etinput;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNut  = (Button) findViewById(R.id.btnvNut);
        imgvHinh = (ImageView) findViewById(R.id.imageViewHinh);
        etinput = (EditText) findViewById(R.id.editText);

        btnNut.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        new taiHinhTuInternet().execute("http://khoapham.vn/media/images/logoKhoaPham2.png");
                    }
                });

                Log.v("EditText", etinput.getText().toString());
            }
        });



    }

    class taiHinhTuInternet extends AsyncTask<String, Integer, Bitmap> {


        protected Bitmap doInBackground(String... params) {
            Bitmap bmp = null;
            URL u = null;
            try {
                u = new URL(params[0]);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            try {
                bmp = BitmapFactory.decodeStream(
                        u.openConnection().getInputStream());

            } catch (IOException e) {
                e.printStackTrace();
            } return bmp;

        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            imgvHinh.setImageBitmap(bitmap);
//            Toast.makeText(MainActivity.this,"jsdkaj",Toast.LENGTH_SHORT).show();
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

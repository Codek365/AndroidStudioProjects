package com.codek365.lession_timer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtvCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtvCount = (TextView) findViewById(R.id.textViewCount);

        new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                int n = Integer.parseInt(txtvCount.getText().toString());
                n = n - 1;


                txtvCount.setText(String.valueOf(n));
            }

            @Override
            public void onFinish() {
                txtvCount.setText("Xong!");
            }
        }.start();


    }
}

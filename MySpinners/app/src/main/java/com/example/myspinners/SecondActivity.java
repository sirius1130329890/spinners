package com.example.myspinners;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.r0adkll.slidr.Slidr;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        int defaultValue = 0;
        Intent intent = getIntent();
        int name = intent.getIntExtra("name", 0);
        int name2 = intent.getIntExtra("name2", 0);
        int name3 = intent.getIntExtra("name3", 0);
        int name4 = intent.getIntExtra("name4", 0);
        int name5 = intent.getIntExtra("name5", 0);
        int name6 = intent.getIntExtra("name6", 0);
        int[] res = {name, name2, name3, name4, name5, name6};
        int n, m = 0;
        for (n = 0; n < res.length; n++) {
            if (res[n] != 0) {
                m++;
            }

        }
        int sum = (res[0] + res[1] + res[2] + res[3] + res[4] + res[5]) / m;
        TextView text1 = findViewById(R.id.textForest);
        TextView text3 = findViewById(R.id.textView3);
        if (sum<=4){
            text3.setText(R.string.ptu);
        }

        String sum1 = Integer.toString(sum);
        text1.setText(sum1);
        Slidr.attach(this);


    }
}

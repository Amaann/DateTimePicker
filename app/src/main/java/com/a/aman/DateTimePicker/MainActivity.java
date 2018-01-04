package com.a.aman.DateTimePicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;




public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Time now = new Time();

        final DatePicker dp =findViewById(R.id.idDatePicker);


        final Button BtDateReset =(findViewById(R.id.btDateReset));

        BtDateReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                now.setToNow();

                dp.updateDate(now.year, now.month, now.monthDay);

            }
        });





    }
}
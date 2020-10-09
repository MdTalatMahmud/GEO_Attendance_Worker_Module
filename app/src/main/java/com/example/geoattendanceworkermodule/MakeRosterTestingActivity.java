package com.example.geoattendanceworkermodule;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MakeRosterTestingActivity extends AppCompatActivity {

    Calendar now = Calendar.getInstance();
    TimePickerDialog tpd;
    DatePickerDialog dpd;


    private EditText setHourEditText, setMinuteEditText;
    private EditText setDateEditText, setMonthEditText, setYearEditText;
    private Button setRosterButton;
    private TextView todayDateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_roster_testing);

        //hour & minute setup
        setHourEditText = findViewById(R.id.hourEditTextID);
        setMinuteEditText = findViewById(R.id.minuteEditTextID);


        //date setup
//        final Calendar calendar = Calendar.getInstance();
//        todayDateTextView = findViewById(R.id.todayDateTextViewID);

        setRosterButton = findViewById(R.id.setRosterBtnID);


        

//        final int currentDate = calendar.get(Calendar.DAY_OF_MONTH);
//        final int currentMonth = calendar.get(Calendar.MONTH);
//        final int currentYear = calendar.get(Calendar.YEAR);
//
//        final int date = Integer.parseInt(setDateEditText.getText().toString());
//        final int month = Integer.parseInt(setMonthEditText.getText().toString());
//        final int year = Integer.parseInt(setYearEditText.getText().toString());

        setRosterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int hour = Integer.parseInt(setHourEditText.getText().toString());
                int minute = Integer.parseInt(setMinuteEditText.getText().toString());

//                int date = Integer.parseInt(setDateEditText.getText().toString());
//                int month = Integer.parseInt(setMonthEditText.getText().toString());
//                int year = Integer.parseInt(setYearEditText.getText().toString());
//
//                int currentDate = calendar.get(Calendar.DAY_OF_MONTH);
//                int currentMonth = calendar.get(Calendar.MONTH);
//                int currentYear = calendar.get(Calendar.YEAR);

                Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);
                intent.putExtra(AlarmClock.EXTRA_HOUR, hour);
                intent.putExtra(AlarmClock.EXTRA_MINUTES, minute);

//                intent.putExtra(AlarmClock.EXTRA_DAYS, date);
//                intent.putExtra(AlarmClock);

                if (hour<=24 && minute<=60){
                    startActivity(intent);
                }
//                if (currentDate==(date-1) && currentMonth==(month-1) && currentYear==(year-1)){
//                    Toast.makeText(MakeRosterTestingActivity.this,"work time", Toast.LENGTH_SHORT).show();
//                }

            }
        });
    }


}
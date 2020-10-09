package com.example.geoattendanceworkermodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MakeRosterTestingActivity extends AppCompatActivity {

    private EditText setHourEditText, setMinuteEditText;
    private Button setRosterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_roster_testing);

        setHourEditText = findViewById(R.id.hourEditTextID);
        setMinuteEditText = findViewById(R.id.minuteEditTextID);

        setRosterButton = findViewById(R.id.setRosterBtnID);

        setRosterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hour = Integer.parseInt(setHourEditText.getText().toString());
                int minute = Integer.parseInt(setMinuteEditText.getText().toString());

                Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);
                intent.putExtra(AlarmClock.EXTRA_HOUR, hour);
                intent.putExtra(AlarmClock.EXTRA_MINUTES, minute);

                if (hour<=24 && minute<=60){
                    startActivity(intent);
                }

            }
        });
    }
}
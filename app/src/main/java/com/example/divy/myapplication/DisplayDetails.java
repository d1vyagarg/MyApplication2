package com.example.divy.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class DisplayDetails extends AppCompatActivity {

    public final String TAG="FirstAPP";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_details);
        Log.d(TAG, "Registration app second activity created");
        Intent intent = getIntent();
        String message[] = intent.getStringArrayExtra(EXTRA_MESSAGE);
        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textname);
        textView.setText(message[0]);
        TextView textroll=findViewById(R.id.textroll);
        textroll.setText(message[1]);
        TextView textbranch=findViewById(R.id.textbranch);
        textbranch.setText(message[2]);
        TextView textcourse1=findViewById(R.id.course1);
        textcourse1.setText(message[3]);
        TextView textcourse2=findViewById(R.id.course2);
        textcourse2.setText(message[4]);
        TextView textcourse3=findViewById(R.id.course3);
        textcourse3.setText(message[5]);
        TextView textcourse4=findViewById(R.id.course4);
        textcourse4.setText(message[6]);

    }
    public void onStart()
    {
        super.onStart();
        Toast.makeText(this, "secondactivity started", Toast.LENGTH_LONG).show();
        Log.d(TAG,"Status of secondactivity changed from create to start");
    }
    public void onResume()
    {
        super.onResume();
        Toast.makeText(this, "secondactivity resumed", Toast.LENGTH_LONG).show();
        Log.d(TAG,"Status of secondactivity changed from start to resume");
    }
    public void onPause()
    {
        super.onPause();
        Toast.makeText(this, "secondactivity Paused", Toast.LENGTH_LONG).show();
        Log.d(TAG,"Status of secondactivity changed from resume to pause");
    }
    public void onStop()
    {
        super.onStop();
        Toast.makeText(this, "secondactivity Stopped", Toast.LENGTH_LONG).show();
        Log.d(TAG,"Status of secondactivity changed from resume to stop");
    }
    public void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(this, "secondactivity Destroyed", Toast.LENGTH_LONG).show();
        Log.d(TAG,"Status of secondactivity changed from resume to destroyed");
    }

}

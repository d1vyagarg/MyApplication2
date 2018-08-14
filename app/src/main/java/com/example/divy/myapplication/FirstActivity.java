package com.example.divy.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class FirstActivity extends AppCompatActivity {

    public final String TAG="FirstAPP";
    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    EditText editText5;
    EditText editText6;
    EditText editText7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Log.d(TAG, "Registration app first activity created");
        editText1 = (EditText) findViewById(R.id.textname);
         editText2 = (EditText) findViewById(R.id.textroll);
         editText3 = (EditText) findViewById(R.id.textbranch);
         editText4 = (EditText) findViewById(R.id.course1);
         editText5 = (EditText) findViewById(R.id.course2);
        editText6 = (EditText) findViewById(R.id.course3);
         editText7 = (EditText) findViewById(R.id.course4);
    }

    public void clear(View V)
    {
        Toast.makeText(this, "Clear button was clicked", Toast.LENGTH_LONG).show();
        editText1.getText().clear();
        editText2.getText().clear();
        editText3.getText().clear();
        editText4.getText().clear();
        editText5.getText().clear();
        editText6.getText().clear();
        editText7.getText().clear();
    }
    public void submit(View V)
    {
        String message[]=new String[8];
        Intent intent = new Intent(getApplicationContext(), DisplayDetails.class);
        Toast.makeText(this, "Submit button was clicked", Toast.LENGTH_LONG).show();
         message[0] = editText1.getText().toString();
        message[1] = editText2.getText().toString();
        message[2] = editText3.getText().toString();
        message[3] = editText4.getText().toString();
        message[4] = editText5.getText().toString();
        message[5] = editText6.getText().toString();
        message[6] = editText7.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    public void onStart()
    {
        super.onStart();
        Toast.makeText(this, "firstactivity started", Toast.LENGTH_LONG).show();
        Log.d(TAG,"Status of firstactivity changed from create to start");
    }
    public void onResume()
    {
        super.onResume();
        Toast.makeText(this, "firstactivity resumed", Toast.LENGTH_LONG).show();
        Log.d(TAG,"Status of firstactivity changed from start to resume");
    }
    public void onPause()
    {
        super.onPause();
        Toast.makeText(this, "firstactivity Paused", Toast.LENGTH_LONG).show();
        Log.d(TAG,"Status of firstactivity changed from resume to pause");
    }
    public void onStop()
    {
        super.onStop();
        Toast.makeText(this, "Firstactivity Stopped", Toast.LENGTH_LONG).show();
        Log.d(TAG,"Status of firstactivity changed from resume to stop");
    }
    public void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(this, "Firstactivity Destroyed", Toast.LENGTH_LONG).show();
        Log.d(TAG,"Status of firstactivity changed from resume to destroyed");
    }



}

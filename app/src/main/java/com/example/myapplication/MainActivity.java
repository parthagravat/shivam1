package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;

public class MainActivity extends AppCompatActivity {


    public File myFile;
    public String myPath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myPath = Environment.getExternalStorageDirectory().getPath() + "/Shivam Bills/";
        myFile = new File(myPath);
        boolean success = true;
        if (!myFile.exists()) {
            //Toast.makeText(MainActivity.this, "Directory Does Not Exist, Create It", Toast.LENGTH_SHORT).show();
            success = myFile.mkdir();
        }
        if (success) {
            //Toast.makeText(MainActivity.this, "Directory Created", Toast.LENGTH_SHORT).show();
        } else {
            //Toast.makeText(MainActivity.this, "Failed - Error", Toast.LENGTH_SHORT).show();
        }

    }


    // From CNC button onclick go to cnc bill activity
    public void goto_cnc_bill(View view) {
        startActivity(new Intent(getApplicationContext(), Cnc_Bill.class));
    }

    // From VMC button onclick go to vmc bill activity
    public void goto_vmc_bill(View view) {
    }
}

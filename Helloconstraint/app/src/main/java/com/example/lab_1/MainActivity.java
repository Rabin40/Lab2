package com.example.lab_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    Button button_1, button_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        button_1 = findViewById(R.id.button_count);
        button_2 = findViewById(R.id.zero);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

        if(mCount%2 == 0){
            button_1.setBackgroundColor(Color.GREEN);
        }
        else{
            button_1.setBackgroundColor(Color.RED);
        }
    }

    public void showzero(View view) {
        mCount = 0;
        String StringmShowCount;
        int intmShowCount;
        StringmShowCount = mShowCount.getText().toString();
        intmShowCount = Integer.parseInt(StringmShowCount);
        if(mShowCount != null) {
            if(intmShowCount == 0){
                button_2.setBackgroundColor(Color.DKGRAY);
            }
            else{
                button_2.setBackgroundColor(Color.BLUE);
            }

            button_2.setBackgroundColor(Color.DKGRAY);

            mShowCount.setText(Integer.toString(mCount));
        }
    }
}
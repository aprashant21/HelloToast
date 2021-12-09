package com.thebigoceaan.hellotoast;

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
    private Button button_count;
    private Button button_zero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting references
        mShowCount = findViewById(R.id.show_count);
        button_count=findViewById(R.id.button_count);
        button_zero = findViewById(R.id.button_zero);

    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
            button_zero.setBackgroundColor(Color.parseColor("#FFB6C1"));
            Integer count = Integer.parseInt(mShowCount.getText().toString());
            if ( count % 2 == 0 ){
                button_count.setBackgroundColor(Color.CYAN);
            }
            else{
                button_count.setBackgroundColor(Color.parseColor("#FF6200EE"));
            }
        }
    }
    public void showToast(View view){
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }
    public void countZero(View view){
        mCount = 0;
        button_zero.setBackgroundColor(Color.parseColor("#808080"));
        mShowCount.setText(Integer.toString(mCount));
   }
}
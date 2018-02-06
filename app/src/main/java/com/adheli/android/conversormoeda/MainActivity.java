package com.adheli.android.conversormoeda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static class ViewHolder {
        EditText editRealValue;
        EditText editDollarValue;
        EditText editEuroValue;
        Button buttonCalc;
    }

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.editRealValue = findViewById(R.id.editRealValue);
        this.mViewHolder.editDollarValue = findViewById(R.id.editDollarValue);
        this.mViewHolder.editEuroValue = findViewById(R.id.editEuroValue);
        this.mViewHolder.buttonCalc = findViewById(R.id.buttonCalc);
    }
}

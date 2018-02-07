package com.adheli.android.conversormoeda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static class ViewHolder {
        EditText editRealValue;
        TextView textDollarValue;
        TextView textEuroValue;
        Button buttonCalc;
    }

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.editRealValue = findViewById(R.id.editRealValue);
        this.mViewHolder.textDollarValue = findViewById(R.id.textDollarValue);
        this.mViewHolder.textEuroValue = findViewById(R.id.textEuroValue);
        this.mViewHolder.buttonCalc = findViewById(R.id.buttonCalc);

        this.mViewHolder.buttonCalc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();

        if (viewId == R.id.buttonCalc) {
            this.calculate();
        }
    }

    private void calculate() {
        double realValue = Double.valueOf(this.mViewHolder.editRealValue.getText().toString());

        double dValue = realValue * 3.34;
        this.mViewHolder.textDollarValue.setText(String.format("%.2f", dValue));

        double eValue = realValue * 4.76;
        this.mViewHolder.textEuroValue.setText(String.format("%.2f", eValue));
    }
}

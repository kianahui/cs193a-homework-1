package com.example.kianahui.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class TipActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip);
    }

    public void getTip(View view) {
        TextView tipText = (TextView) findViewById(R.id.tip);
        EditText total = (EditText) findViewById(R.id.total);
        Double totalAmount = Double.parseDouble(total.getText().toString());
        if (totalAmount == 0) return;
        double tip = 0;
        if (view.getId() == R.id.button1) {
            tip = 0.1 * totalAmount;
        } else if (view.getId() == R.id.button2) {
            tip = 0.15 * totalAmount;
        } else if (view.getId() == R.id.button3) {
            tip = 0.2 * totalAmount;
        } else {
            tip = 0.25 * totalAmount;
        }
        // round to two decimal places
        tip = Math.round(tip * 100);
        tip /= 100;
        tipText.setText(String.valueOf(tip));
    }
}

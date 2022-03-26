package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText x = findViewById(R.id.number1);
        EditText y = findViewById(R.id.number2);
        EditText z = findViewById(R.id.number3);
        EditText w = findViewById(R.id.number4);

        Button c = (Button) findViewById(R.id.button1);
        TextView result = findViewById(R.id.result);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(x.getText().toString());
                int number2 = Integer.parseInt(y.getText().toString());
                int number3 = Integer.parseInt(z.getText().toString());
                int number4 = Integer.parseInt(w.getText().toString());
                double x = ((0.15 * number1) + (0.25 * number2) + (0.30 * number3) + (0.30 * number4));
                result.setText(x + "");
            }
        });
        ///setup reset button
        Button reset = (Button) findViewById(R.id.resetbutton);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x.setText(null);
                x.dispatchDisplayHint(View.INVISIBLE);

                y.setText(null);
                y.dispatchDisplayHint(View.INVISIBLE);

                z.setText(null);
                z.dispatchDisplayHint(View.INVISIBLE);

                w.setText(null);
                w.dispatchDisplayHint(View.INVISIBLE);

            }


        });
    }
}
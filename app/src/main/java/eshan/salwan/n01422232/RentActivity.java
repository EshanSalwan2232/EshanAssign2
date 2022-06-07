package eshan.salwan.n01422232;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RentActivity extends MenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rent_activity);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        // TextView textView = findViewById(R.id.textView);
        ImageButton imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton);
                RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2);
                RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3);

                if (rb1.isChecked()) {
                    Intent aprt = new Intent(RentActivity.this, VisitActivity.class);
                    startActivity(aprt);
                } else if (rb2.isChecked()) {
                    Intent detach = new Intent(RentActivity.this, VisitActivity.class);
                    startActivity(detach);
                } else if (rb3.isChecked()) {
                    Intent semi = new Intent(RentActivity.this, VisitActivity.class);
                    startActivity(semi);
                }

            }
        });
    }
}
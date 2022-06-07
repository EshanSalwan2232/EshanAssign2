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
    public static final String KEY1 = "img1";
    public static final String KEY2 = "img2";
    public static final String KEY3 = "img3";

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
                    aprt.putExtra("text", "Apartment Options");
                    aprt.putExtra(KEY1, R.drawable.apartment1);
                    aprt.putExtra(KEY2, R.drawable.apartment2);
                    aprt.putExtra(KEY3, R.drawable.apartment2);
                    aprt.putExtra("CB1", "");
                    aprt.putExtra("CB2", "");
                    aprt.putExtra("CB3", "");
                    startActivity(aprt);
                } else if (rb2.isChecked()) {
                    Intent detach = new Intent(RentActivity.this, VisitActivity.class);
                    detach.putExtra("text", "Detached Home Options");
                    detach.putExtra(KEY1, R.drawable.detached1);
                    detach.putExtra(KEY2, R.drawable.detached2);
                    detach.putExtra(KEY3, R.drawable.detached3);
                    detach.putExtra("CB1", "");
                    detach.putExtra("CB2", "");
                    detach.putExtra("CB3", "");
                    startActivity(detach);
                } else if (rb3.isChecked()) {
                    Intent semi = new Intent(RentActivity.this, VisitActivity.class);
                    semi.putExtra("text", "Semi-Detached Home Options");
                    semi.putExtra(KEY1, R.drawable.semi1);
                    semi.putExtra(KEY2, R.drawable.semi2);
                    semi.putExtra(KEY3, R.drawable.semi3);
                    semi.putExtra("CB1", "");
                    semi.putExtra("CB2", "");
                    semi.putExtra("CB3", "");
                    startActivity(semi);
                }

            }
        });
    }
}
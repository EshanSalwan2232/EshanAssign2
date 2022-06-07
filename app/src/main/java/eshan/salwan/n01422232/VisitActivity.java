package eshan.salwan.n01422232;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class VisitActivity extends MenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visit_activity);
       /* Intent aprt = getIntent();
        Intent detach = getIntent();
        Intent semi = getIntent();
        String text1 = aprt.getStringExtra("text");
        String text2 = detach.getStringExtra("text");
        String text3 = semi.getStringExtra("text");
        ((TextView)findViewById(R.id.textView)).setText(text1); */

        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton);
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3);

        if (rb1.isChecked()) {
            Intent aprt = getIntent();
            String text = aprt.getStringExtra("text");
            ((TextView)findViewById(R.id.textView)).setText(text);
/*
            Intent intent = getIntent();
            ImageView img1 = findViewById(R.id.imageView2);
            int aimg1 = intent.getIntExtra(RentActivity.KEY1,1);
            img1.setImageResource(aimg1);

            ImageView img2 = findViewById(R.id.imageView3);
            int aimg2 = intent.getIntExtra(RentActivity.KEY2,1);
            img2.setImageResource(aimg2);

            ImageView img3 = findViewById(R.id.imageView3);
            int aimg3 = intent.getIntExtra(RentActivity.KEY3,1);
            img3.setImageResource(aimg3);

*/
        } else if (rb2.isChecked()) {
            Intent detach = getIntent();

            String text = detach.getStringExtra("text");
            ((TextView)findViewById(R.id.textView)).setText(text);
            /*
            detach.putExtra("img1", "");
            detach.putExtra("img2", "");
            detach.putExtra("img3", "");
            detach.putExtra("CB1", "");
            detach.putExtra("CB2", "");
            detach.putExtra("CB3", "");
            startActivity(detach);

             */
        } else if (rb3.isChecked()) {
            Intent semi = getIntent();

            String text = semi.getStringExtra("text");
            ((TextView)findViewById(R.id.textView)).setText(text);
            /*
            semi.putExtra("img1", "");
            semi.putExtra("img2", "");
            semi.putExtra("img3", "");
            semi.putExtra("CB1", "");
            semi.putExtra("CB2", "");
            semi.putExtra("CB3", "");
            startActivity(semi);

             */
        }
    }
}
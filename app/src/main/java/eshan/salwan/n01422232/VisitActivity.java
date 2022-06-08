//Eshan Salwan, n01422232, RNB
package eshan.salwan.n01422232;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
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
        Button btn = (Button)findViewById(R.id.button2);
        CheckBox cb1 = (CheckBox)findViewById(R.id.checkBox);
        CheckBox cb2 = (CheckBox)findViewById(R.id.checkBox2);
        CheckBox cb3 = (CheckBox)findViewById(R.id.checkBox3);



        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (cb1.isChecked() || cb2.isChecked() || cb3.isChecked()){
                    startActivity(new Intent(VisitActivity.this, PaymentActivity.class));
                }else {
                    cb1.setError("Please pick a option");
                    cb2.setError("Please pick a option");
                    cb3.setError("Please pick a option");
                }
            }
        });
    }
}

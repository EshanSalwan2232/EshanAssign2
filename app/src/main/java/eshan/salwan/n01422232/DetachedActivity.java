package eshan.salwan.n01422232;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class DetachedActivity extends MenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detached_activity);
        Button btn = (Button) findViewById(R.id.button3);
        CheckBox cb1 = (CheckBox) findViewById(R.id.detachBox1);
        CheckBox cb2 = (CheckBox) findViewById(R.id.detachBox2);
        CheckBox cb3 = (CheckBox) findViewById(R.id.detachBox3);


        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (cb1.isChecked() || cb2.isChecked() || cb3.isChecked()) {
                    startActivity(new Intent(DetachedActivity.this, PaymentActivity.class));
                } else {
                    cb1.setError("Please pick a option");
                    cb2.setError("Please pick a option");
                    cb3.setError("Please pick a option");
                }
            }
        });
    }
}

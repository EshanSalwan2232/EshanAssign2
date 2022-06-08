package eshan.salwan.n01422232;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetachedActivity extends MenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detached_activity);
        Button btn = (Button)findViewById(R.id.button3);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(DetachedActivity.this, PaymentActivity.class));
            }
        });
    }
}
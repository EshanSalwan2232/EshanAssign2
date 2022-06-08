package eshan.salwan.n01422232;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class PaymentActivity extends AppCompatActivity {
    EditText email;
    ImageButton done;
    EditText Name;
    EditText Phone;
    EditText Credit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_activity);
        email = (EditText)findViewById(R.id.editTextPostalAddress);
        done = (ImageButton) findViewById(R.id.imageButton2);
        Name= (EditText)findViewById(R.id.editTextPersonName);
        Phone = (EditText)findViewById(R.id.editTextPhone);
        Credit = (EditText)findViewById(R.id.editTextNumber);
        done.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                if(Name.getText().toString().trim().equalsIgnoreCase("")){
                    Name.setError("Enter Name");
                }
                if(email.getText().toString().trim().equalsIgnoreCase("")){
                    email.setError("Enter Email Address");
                }
                if(Phone.getText().toString().trim().equalsIgnoreCase("")){
                    Phone.setError("Enter Phone Number");
                }
                if(Credit.getText().toString().trim().equalsIgnoreCase("")){
                    Credit.setError("Enter Credit Card Number");
                }

                AlertDialog.Builder Alert = AlertDialog.Builder(context);

                Alert
                        .setTitle("AlertDialog");
                        .setMesssage("Your request is being processed");

            }
        });
        Name.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Name.setError(null);
                email.setError(null);
                Phone.setError(null);
                Credit.setError(null);
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable s) {
                Name.setError(null);
                email.setError(null);
                Phone.setError(null);
                Credit.setError(null);
            }
        });
    }
}
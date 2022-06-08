package eshan.salwan.n01422232;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class PaymentActivity extends MenuActivity {
    EditText email;
    ImageButton done;
    EditText Name;
    EditText Phone;
    EditText Credit;
    final Context context = this;
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
            public void onClick(View view) {
                if (error()) {


                    AlertDialog.Builder Alert = new AlertDialog.Builder(context);

                    Alert
                            .setTitle("AlertDialog")
                            .setMessage("Your request is being processed")
                            .setCancelable(false)
                            .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Intent i = new Intent(PaymentActivity.this, SalwanActivity.class);
                                    startActivity(i);
                                }
                            })
                            .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alertDialog = Alert.create();
                    alertDialog.show();
                }
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
    private boolean error() {
        if (Name.getText().toString().trim().equalsIgnoreCase("")) {
            Name.setError("Enter Name");
            return false;
        }
        if (email.getText().toString().trim().equalsIgnoreCase("")) {
            email.setError("Enter Email Address");
            return false;
        }
        if (Phone.getText().toString().trim().equalsIgnoreCase("")) {
            Phone.setError("Enter Phone Number");
            return false;
        }
        if (Credit.getText().toString().trim().equalsIgnoreCase("")) {
            Credit.setError("Enter Credit Card Number");
            return false;
        }
        return true;
    }
}
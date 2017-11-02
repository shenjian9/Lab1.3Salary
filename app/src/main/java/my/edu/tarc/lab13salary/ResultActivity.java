package my.edu.tarc.lab13salary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private TextView textViewMonthlyPayment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //To get the intent
        Intent intent = getIntent(); // Asking "who called me?"
        double payment = intent.getDoubleExtra(MainActivity.LOAN_PAYMENT,0);


        String status = intent.getStringExtra(MainActivity.LOAN_STATUS);

        // TODO: display outputs
        TextView TextViewMonthlyPayment =(TextView)findViewById(R.id.textViewMonthlyPayment);
        TextView TextViewStatus = (TextView)findViewById(R.id.textViewStatus);

        TextViewMonthlyPayment.setText(payment+"");
        TextViewStatus.setText(status);




    }
    public void closeActivity(View view){
        //Terminate an activity
        finish();
    }
}

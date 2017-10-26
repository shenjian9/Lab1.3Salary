package my.edu.tarc.lab13salary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextSalary , editTextVehicle, editTextDownPayment, editTextInterestRate,editTextReplaymentMonth;
    private TextView textViewMonthPayment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextSalary = (EditText) findViewById(R.id.editTextSalary);
        editTextVehicle = (EditText) findViewById(R.id.editTextVehiclePrice);
        editTextDownPayment = (EditText) findViewById(R.id.editTextDownPayment);
        editTextInterestRate = (EditText) findViewById(R.id.editTextInterestRate);
        editTextReplaymentMonth = (EditText) findViewById(R.id.editTextRepaymentMonth);

    }
}

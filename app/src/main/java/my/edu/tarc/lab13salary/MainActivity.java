package my.edu.tarc.lab13salary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String LOAN_PAYMENT = "payment" ;
    public static final String LOAN_STATUS = "status" ;

    private EditText editTextSalary , editTextVehicle, editTextDownPayment, editTextInterestRate,editTextReplaymentMonth;

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
    public void CalculateLoanPayment(View view){
        //TODO: calculate repayment amount and determine
        double VehiclePrice = Double.parseDouble(editTextVehicle.getText().toString());
        double DownnPayment = Double.parseDouble(editTextDownPayment.getText().toString());
        double Repayment_Month = Double.parseDouble(editTextReplaymentMonth.getText().toString());
        double InterstRate = Double.parseDouble(editTextInterestRate.getText().toString())/100;
        double Salary = Double.parseDouble((editTextSalary.getText().toString()));

        double TotalInterest = (VehiclePrice-DownnPayment)*InterstRate*(Repayment_Month/12);
        double TotalLoan = (VehiclePrice-DownnPayment)+TotalInterest;
        double MonthlyPayment = TotalLoan/Repayment_Month;
        String status;

        if(MonthlyPayment<=(Salary*0.3))
        {
            //the status of loan application

            status="Approve";
        }
        else
        {
            //the status of loan application

            status="Not Approve";
        }

        //define Intent object
        //This is an Explicit Intent
        Intent intent =new Intent(this,ResultActivity.class);
        //Use the putExtra method to pass data
        //format:putExtra(TAG,value)
        intent.putExtra(LOAN_PAYMENT, MonthlyPayment);
        intent.putExtra(LOAN_STATUS, status);




        startActivity(intent);
    }
}


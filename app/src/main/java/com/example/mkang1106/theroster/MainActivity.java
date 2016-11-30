package com.example.mkang1106.theroster;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.DatePicker;
import android.widget.EditText;
import android.view.View;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    int mYear,mMonth,mDay;
    EditText txtDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDate = (EditText) findViewById(R.id.editText2);
    }

    //November 30
   public void  DateOfBirth()
   {
       // Get Current Date
       final Calendar c = Calendar.getInstance();
       mYear = c.get(Calendar.YEAR);
       mMonth = c.get(Calendar.MONTH);
       mDay = c.get(Calendar.DAY_OF_MONTH);


       DatePickerDialog datePickerDialog = new DatePickerDialog(this,
               new DatePickerDialog.OnDateSetListener() {

                   @Override
                   public void onDateSet(DatePicker view, int year,
                                         int monthOfYear, int dayOfMonth) {

                       txtDate.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                   }
               }, mYear, mMonth, mDay);
       datePickerDialog.show();

   }
}

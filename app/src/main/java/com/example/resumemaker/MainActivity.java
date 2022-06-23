package com.example.resumemaker;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CursorAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] cityName = {"surat", "baruch", "navsari", "vadodara", "Ahmedabad", "rajkot", "junagadh", "amreli", "bhuj"};
    String[] stateName={"kerala","bihar","punjab","gujarat","rajasthan","goa","maharashtra","asaam","sikkim"};
    Spinner citySpinner,stateSpinner;
    String gender = "",hobbies="",skill="";

    EditText firstNameEdt, lastNameEdt, emailEdt, phoneNumEdt, addEdt, sclNameEdt, clgNameEdt, aboutSelfEdt;
    RadioGroup genderRadioGp;
    CheckBox danceCb, drawCb, singCb, trevelCb, designCb, cLunCb, kotlinCb, javaCb;

    AppCompatButton submitBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerView();
        initView();



    }

    private void initView() {
        firstNameEdt = findViewById(R.id.firstNameEdt);
        lastNameEdt = findViewById(R.id.lastNameEdt);
        emailEdt = findViewById(R.id.emailEdt);
        phoneNumEdt = findViewById(R.id.phoneNumEdt);
        addEdt = findViewById(R.id.addEdt);
        sclNameEdt = findViewById(R.id.sclNameEdt);
        clgNameEdt = findViewById(R.id.clgNameEdt);
        aboutSelfEdt = findViewById(R.id.aboutSelfEdt);
        genderRadioGp = findViewById(R.id.genderRadioGp);
        //checkbox id:
        danceCb = findViewById(R.id.danceCb);
        drawCb = findViewById(R.id.drawCb);
        singCb = findViewById(R.id.singCb);
        trevelCb = findViewById(R.id.trevelCb);
        designCb = findViewById(R.id.designCb);
        cLunCb = findViewById(R.id.cLunCb);
        kotlinCb = findViewById(R.id.kotlinCb);
        javaCb = findViewById(R.id.javaCb);

        submitBtn = findViewById(R.id.submitBtn);

        citySpinner=findViewById(R.id.citySpinner);
        stateSpinner=findViewById(R.id.stateSpinner);



        submitBtn.setOnClickListener(view -> {
            String Firstname = firstNameEdt.getText().toString();
            String Lastname = lastNameEdt.getText().toString();
            String Email = emailEdt.getText().toString();
            String PhoneNum = phoneNumEdt.getText().toString();
            String Address = addEdt.getText().toString();
            String Schoolname = sclNameEdt.getText().toString();
            String Collegename = clgNameEdt.getText().toString();
            String AboutSelf = aboutSelfEdt.getText().toString();
           String CityName= citySpinner.getSelectedItem().toString();
           String StateName=stateSpinner.getSelectedItem().toString();
            if(danceCb.isChecked())
            {
                hobbies+=danceCb.getText().toString();
            }
            if(drawCb.isChecked())
            {
                hobbies+=drawCb.getText().toString();
            }
            if(singCb.isChecked())
            {
                hobbies+=singCb.getText().toString();
            }
            if(trevelCb.isChecked())
            {
                hobbies+=trevelCb.getText().toString();
            }

            if(designCb.isChecked())
            {
                skill+=designCb.getText().toString();
            }
            if(cLunCb.isChecked())
            {
                skill+=cLunCb.getText().toString();
            }if(javaCb.isChecked())
            {
                skill+=javaCb.getText().toString();
            }
            if(kotlinCb.isChecked())
            {
                skill+=kotlinCb.getText().toString();
            }



            if (Firstname.isEmpty()) {
                Toast.makeText(this, "PLEASE ENTER YOUR FIRST NAME", Toast.LENGTH_SHORT).show();
            } else if (Firstname.length() > 15 && Firstname.length() < 6) {
                Toast.makeText(this, "ENTER CORRECT  FIRST NAME", Toast.LENGTH_SHORT).show();
            } else if (Lastname.isEmpty()) {
                Toast.makeText(this, "PLEASE ENTER YOUR LAST NAME", Toast.LENGTH_SHORT).show();
            } else if (Lastname.length() > 16 && Lastname.length() < 6) {
                Toast.makeText(this, " ENTER CORRECT LAST NAME", Toast.LENGTH_SHORT).show();
            } else if (Email.isEmpty()) {
                Toast.makeText(this, "PLEASE ENTER YOUR EMAIL", Toast.LENGTH_SHORT).show();
            } else if (PhoneNum.isEmpty()) {
                Toast.makeText(this, "PLEASE ENTER YOUR PHONE NUMBER", Toast.LENGTH_SHORT).show();
            } else if (PhoneNum.length() < 10 && PhoneNum.length() > 10) {
                Toast.makeText(this, " ENTER YOUR CORRECT PHONE NUMBER", Toast.LENGTH_SHORT).show();
            } else if (Address.isEmpty()) {
                Toast.makeText(this, "PLEASE ENTER YOUR ADDRESS", Toast.LENGTH_SHORT).show();
            } else if (Schoolname.isEmpty()) {
                Toast.makeText(this, "PLEASE ENTER YOUR SCHOOL NAME", Toast.LENGTH_SHORT).show();
            } else if (Collegename.isEmpty()) {
                Toast.makeText(this, "PLEASE ENTER YOUR COLLEGE NAME", Toast.LENGTH_SHORT).show();}
                else if (CityName.isEmpty()) {
                    Toast.makeText(this, "PLEASE ENTER YOUR CITY NAME", Toast.LENGTH_SHORT).show();
            }
            else if (StateName.isEmpty()) {
                Toast.makeText(this, "PLEASE ENTER YOUR STATE NAME", Toast.LENGTH_SHORT).show();
            }else if (gender.isEmpty()) {
                Toast.makeText(this, "PLEASE ENTER YOUR GENDER", Toast.LENGTH_SHORT).show();
            }
            else if (AboutSelf.isEmpty()) {
                Toast.makeText(this, "PLEASE ENTER ABOUT YOUR SELF", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "SUCCESS", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, secondPage.class);


                i.putExtra("firstname", Firstname);
                i.putExtra("lastname", Lastname);
                i.putExtra("emailId", Email);
                i.putExtra("phoneNum", PhoneNum);
                i.putExtra("address", Address);
                i.putExtra("schoolName", Schoolname);
                i.putExtra("collegename", Collegename);
                i.putExtra("gender", gender);
                i.putExtra("hobbies",hobbies );
                i.putExtra("skill",skill );
                i.putExtra("cityName",cityName);
                i.putExtra("stateName",stateName);


                startActivity(i);
            }
        });
        genderRadioGp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int id = radioGroup.getCheckedRadioButtonId();
                RadioButton radioButton = genderRadioGp.findViewById(i);

                if (radioButton.getText().equals("female")) {
                    gender = "female";
                } else if (radioButton.getText().equals("male")) {
                    gender = "male";
                } else {
                    gender = "other";
                }
            }
        });
    }



    public void spinnerView() {

        citySpinner = findViewById(R.id.citySpinner);
        CustomAdapter customAdapter= new CustomAdapter(this,cityName);
        citySpinner.setAdapter(customAdapter);

      stateSpinner=findViewById(R.id.stateSpinner);
        CustomAdapterState cr= new CustomAdapterState(this,stateName);
        stateSpinner.setAdapter(cr);

    }

    public void onBackPressed()
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Exit Alert");
        builder.setMessage("Are you sure you want to exit?");

        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.finish();
            }
        });

        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });


        AlertDialog d= builder.create();
        d.setCancelable(false);
        d.show();

    }

}
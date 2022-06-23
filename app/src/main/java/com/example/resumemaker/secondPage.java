package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class secondPage extends AppCompatActivity {

    String Firstname,Lastname,Email,PhoneNum,Address,SchoolName,CollegeName,Gender,CityName,StateName,skill,hobbies;
    TextView firstNameTxt, lastNameTxt, emailTxt, phoneNumTxt, addTxt, sclNameTxt, clgNameTxt,genderTxt,cityNameTxt,stateNameTxt,skillsCbTxt,hobbiesCbTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        designView();

    }

    private void designView() {
        firstNameTxt = findViewById(R.id.firstNameTxt);
        lastNameTxt = findViewById(R.id.lastNameTxt);
        emailTxt = findViewById(R.id.emailTxt);
        phoneNumTxt = findViewById(R.id.phoneNumTxt);
        addTxt = findViewById(R.id.addTxt);
        sclNameTxt = findViewById(R.id.sclNameTxt);
        clgNameTxt = findViewById(R.id.clgNameTxt);
        genderTxt=findViewById(R.id.genderTxt);

        cityNameTxt=findViewById(R.id.cityNameTxt);
        stateNameTxt=findViewById(R.id.stateNameTxt);

        skillsCbTxt=findViewById(R.id.skillsCbTxt);

        hobbiesCbTxt=findViewById(R.id.hobbiesCbTxt);




        if(getIntent()!=null)
        {
            Firstname=getIntent().getStringExtra("firstname");
            Lastname=getIntent().getStringExtra("lastname");
            Email=getIntent().getStringExtra("emailId");
            PhoneNum=getIntent().getStringExtra("phoneNum");
            Address=getIntent().getStringExtra("address");
            SchoolName=getIntent().getStringExtra("schoolName");
            CollegeName=getIntent().getStringExtra("collegename");
            Gender=getIntent().getStringExtra("gender");

            CityName=getIntent().getStringExtra("cityName");
            StateName=getIntent().getStringExtra("stateName");

            hobbies=getIntent().getStringExtra("hobbies");
            skill=getIntent().getStringExtra("skill");




            firstNameTxt.setText(Firstname);
            lastNameTxt.setText(Lastname);
            emailTxt.setText(Email);
            phoneNumTxt.setText(PhoneNum);
            addTxt.setText(Address);
            sclNameTxt.setText(SchoolName);
            clgNameTxt.setText(CollegeName);
            genderTxt.setText(Gender);

            skillsCbTxt.setText(skill);
            hobbiesCbTxt.setText(hobbies);



        }
    }
}
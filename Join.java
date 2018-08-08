package com.example.brunelle.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.RadioButton;

public class Join extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        Button button = (Button) findViewById(R.id.joinButton);
        button.setOnClickListener(new MyClass());

    }

    public class MyClass implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            EditText firstNameEditText = (EditText) findViewById(R.id.firstNameEditText);
            String firstName = firstNameEditText.getText().toString();

            EditText lastNameEditText = (EditText) findViewById(R.id.lastNameEditText);
            String lastName = lastNameEditText.getText().toString();

            EditText ageEditText = (EditText) findViewById(R.id.ageEditText);
            String ageText = ageEditText.getText().toString();
            Integer age = Integer.valueOf(ageText);

            RadioGroup sexRadioGroup = (RadioGroup) findViewById(R.id.sexRadioGroup);
            int selectedId = sexRadioGroup.getCheckedRadioButtonId();
            RadioButton sexRadioButton = (RadioButton) findViewById(selectedId);
            String sex = sexRadioButton.getText().toString();

            Person person = new Person(firstName, lastName, age, sex);


        }

    }
}

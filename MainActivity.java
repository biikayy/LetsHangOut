package com.example.brunelle.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
        //        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        //                .setAction("Action", null).show();
        //    }
        //});

        Button button = (Button) findViewById(R.id.joinButton);
        button.setOnClickListener(new MyClass());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
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

            firstNameEditText.setText("");
            lastNameEditText.setText("");
            ageEditText.setText("");
            sexRadioGroup.clearCheck();

            setContentView(R.layout.fragment_activities);

        }
    }

}

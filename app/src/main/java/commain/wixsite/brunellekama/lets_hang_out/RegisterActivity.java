package commain.wixsite.brunellekama.lets_hang_out;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //Next Button Click Event
        Button next_button = (Button) findViewById(R.id.next_button);
        next_button.setOnClickListener(new nextClick());
    }

    public class nextClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            EditText firstname_editText = (EditText) findViewById(R.id.firstName_editText);
            EditText lastname_editText = (EditText) findViewById(R.id.lastName_editText);
            EditText username_editText = (EditText) findViewById(R.id.registerUsername_editText);
            EditText register_password_editText = (EditText) findViewById(R.id.registerPassword_editText);
            EditText confirm_password_editText = (EditText) findViewById(R.id.confirmPassword_editText);

/*
            String firstname;
            firstname = firstname_editText.getText().toString();

            String lastname;
            lastname = lastname_editText.getText().toString();

            String username;
            username = username_editText.getText().toString();

            String password;
            password = register_password_editText.getText().toString();

            String confirm_password;
            confirm_password = confirm_password_editText.getText().toString();

            if (password.equals(confirm_password)) {
                User user = new User(firstname, lastname, password);
            }
            else {
                throw new java.lang.Error("Passwords do not match");
            }
*/
            //Move to registration
            Intent i = new Intent(RegisterActivity.this, ScheduleAcvitity.class);
            startActivity(i);
        }
    }

}

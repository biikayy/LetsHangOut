package commain.wixsite.brunellekama.lets_hang_out;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Login Button Click Event
        Button login_button = (Button) findViewById(R.id.login_button);
        login_button.setOnClickListener(new loginClick());

        //Register Button Click Event
        Button register_button = (Button) findViewById(R.id.register_button);
        register_button.setOnClickListener(new registerClick());
    }

    public class loginClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            EditText password_editText = (EditText) findViewById(R.id.password_editText);
            EditText username_editText = (EditText) findViewById(R.id.loginUsername_editText);

/*
            String username;
            username = username_editText.getText().toString();

            String password;
            password = password_editText.getText().toString();

            Database database = new Database();
            User user;
            user = database.getUser(username, password);
*/
        }
    }

    public class registerClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            //Move to registration
            Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(i);
        }
    }

}
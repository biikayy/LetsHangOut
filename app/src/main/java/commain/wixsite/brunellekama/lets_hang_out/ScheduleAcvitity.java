package commain.wixsite.brunellekama.lets_hang_out;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;


public class ScheduleAcvitity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        //Login Button Click Event
        Button addEvent_button = (Button) findViewById(R.id.addEvent_button);
        addEvent_button.setOnClickListener(new addEventClick());

        //Register Button Click Event
        Button confirmRegistration_button = (Button) findViewById(R.id.confirmRegistration_button);
        confirmRegistration_button.setOnClickListener(new confirmRegistrationClick());
    }

    public class addEventClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            //Move to registration
            //Intent i = new Intent();
            //startActivity(i);
        }
    }

    public class confirmRegistrationClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            //Move to registration
            //Intent i = new Intent();
            //startActivity(i);
        }
    }
}

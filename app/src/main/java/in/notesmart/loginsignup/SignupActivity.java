package in.notesmart.loginsignup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    CardView male_button,female_button;
    ImageView male_img, female_img;
    EditText username;
    TextView register_button;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.animation_in, R.anim.animation_out);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        male_button = findViewById(R.id.male_button);
        female_button = findViewById(R.id.female_button);
        male_img = findViewById(R.id.male_img);
        female_img = findViewById(R.id.female_img);
        username = findViewById(R.id.username);
        register_button = findViewById(R.id.register_button);


        male_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                male_img.setImageDrawable(getDrawable(R.drawable.icon_user_male));
                female_img.setImageDrawable(getDrawable(R.drawable.icon_user_female_white_shirt));
            }
        });
        female_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                male_img.setImageDrawable(getDrawable(R.drawable.icon_user_male_white_shirt));
                female_img.setImageDrawable(getDrawable(R.drawable.icon_user_female));
            }
        });
        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().isEmpty())
                    Toast.makeText(SignupActivity.this, "Please Enter Username first", Toast.LENGTH_SHORT).show();
                else if (!username.getText().toString().isEmpty())
                    Toast.makeText(SignupActivity.this, "Successfully registered as " + username.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

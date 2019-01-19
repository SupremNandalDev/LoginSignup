package in.notesmart.loginsignup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    CardView new_reg_card, login_card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        new_reg_card = findViewById(R.id.new_reg_card);
        login_card = findViewById(R.id.login_card);

        new_reg_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, SignupActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.animation_in, R.anim.animation_out);
            }
        });
        login_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, LoginActivty.class);
                startActivity(intent);
                overridePendingTransition(R.anim.animation_in, R.anim.animation_out);
            }
        });
    }
}

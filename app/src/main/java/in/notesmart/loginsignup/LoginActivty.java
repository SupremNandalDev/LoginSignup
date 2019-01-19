package in.notesmart.loginsignup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class LoginActivty extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.animation_in, R.anim.animation_out);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activty);
    }
}

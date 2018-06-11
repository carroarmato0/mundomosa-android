package be.carroarmato0.mundomosa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.view_login);

        Log.d("Mediamosa", "onCreate called");

        btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("Mediamosa", "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("Mediamosa", "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("Mediamosa", "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("Mediamosa", "onStop called");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("Mediamosa", "onDestroy called");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                Log.d("Mediamosa", "Login button clicked");

                if (validateLoginButton()) {
                    setContentView(R.layout.activity_main);
                }
                break;
        }
    }

    private boolean validateLoginButton() {
        EditText editText_username = findViewById(R.id.txt_username);
        EditText editText_password = findViewById(R.id.txt_password);

        String txt_username = editText_username.getText().toString();
        String txt_password = editText_password.getText().toString();

        txt_username = txt_username.trim();
        txt_password = txt_password.trim();

        if (txt_username.isEmpty() || txt_password.isEmpty()) {
            Toast.makeText(this, R.string.error_enter_usrname_pass, Toast.LENGTH_SHORT).show();
            return false;
        } else if (txt_username.equals(R.string.username_email_hint) || txt_password.equals(R.string.password_hint))  {
            Toast.makeText(this, R.string.error_enter_usrname_pass, Toast.LENGTH_SHORT).show();
            return false;
        } else {
            return true;
        }

    }
}

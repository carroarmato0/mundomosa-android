package be.carroarmato0.mundomosa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Mediamosa", "onCreate called");
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
}

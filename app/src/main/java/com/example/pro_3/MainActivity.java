package com.example.pro_3;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
       Toast toast= Toast.makeText(getApplicationContext(),"onCreate called",Toast.LENGTH_SHORT);
       toast.show();
        Log.d("LifeCycle","onCreated invokde");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast toast=Toast.makeText(getApplicationContext(),"onPause",Toast.LENGTH_SHORT);
        toast.show();;
        Log.d("Lifecycle","onPause invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast toast=Toast.makeText(getApplicationContext(),"onRestart Called",Toast.LENGTH_SHORT);
        toast.show();
        Log.d("Lifecycle","onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast toast=Toast.makeText(getApplicationContext(),"onDestroy Called",Toast.LENGTH_SHORT);
        toast.show();
        Log.d("Lifecycle","onDesrtoy invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast toast=Toast.makeText(getApplicationContext(),"onResume Called",Toast.LENGTH_SHORT);
        toast.show();
        Log.d("Lifecycle","onResume Called");
    }
}
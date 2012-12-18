package com.example.cricket.front;

import android.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import com.example.cricket.front.*;

public class FrontActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_front, menu);
        return true;
    }
}

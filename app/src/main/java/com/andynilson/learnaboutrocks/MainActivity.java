package com.andynilson.learnaboutrocks;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void navigateToActivity(View view) {
        Intent intent = null;

        if (view.getId() == R.id.igneous_button) {
            intent = new Intent(this, IgneousActivity.class);
        } else if (view.getId() == R.id.metamorphic_button) {
            intent = new Intent(this, MetamorphicActivity.class);
        } else if (view.getId() == R.id.sedimentary_button) {
            intent = new Intent(this, SedimentaryActivity.class);
        }

        startActivity(intent);
    }
}

package com.example.rajohns.materialtest;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;

import com.gc.materialdesign.views.ProgressBarCircularIndeterminate;


public class MainActivity extends ActionBarActivity {
    public ProgressBarCircularIndeterminate loadingIndicator;
    public ProgressBarCircularIndeterminate loadingIndicator2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadingIndicator = (ProgressBarCircularIndeterminate)findViewById(R.id.progressBarCircularIndeterminate);
        loadingIndicator.setVisibility(View.GONE);

        loadingIndicator2 = (ProgressBarCircularIndeterminate)findViewById(R.id.progressBarCircularIndeterminate2);
        loadingIndicator2.setVisibility(View.INVISIBLE);
    }

    /**
     * GONE CRASHES
     */
    public void loginTapped(View v) {
        if (loadingIndicator.getVisibility() == View.GONE) {
            loadingIndicator.setVisibility(View.VISIBLE);
        }
        else {
            loadingIndicator.setVisibility(View.GONE);
        }
    }

    /**
     * INVISIBLE WORKS FINE
     */
    public void loginTapped2(View v) {
        if (loadingIndicator2.getVisibility() == View.INVISIBLE) {
            loadingIndicator2.setVisibility(View.VISIBLE);
        }
        else {
            loadingIndicator2.setVisibility(View.INVISIBLE);
        }
    }
}

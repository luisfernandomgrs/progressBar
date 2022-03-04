package com.luisfernandomgrs.learning.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBarHorizontal;
    private ProgressBar progressBarCircle;
    private int countProgressBarHorizontal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize my objects
        setTitle(R.string.titleAplication);

        progressBarHorizontal = findViewById(R.id.progressBarHorizontal);
        progressBarCircle = findViewById(R.id.progressBarCircle);

        countProgressBarHorizontal = 0;
        progressBarHorizontal.setProgress(countProgressBarHorizontal);
        progressBarHorizontal.setMax(10);

        progressBarCircle.setVisibility(View.GONE);
    }

    public void carregarProgressBarHorizontal(View view) {
        if (progressBarHorizontal.getProgress() < progressBarHorizontal.getMax()) {
            progressBarCircle.setVisibility(View.VISIBLE);
            progressBarHorizontal.setProgress(++this.countProgressBarHorizontal);
        }
        else {
            progressBarCircle.setVisibility(View.GONE);
            this.countProgressBarHorizontal = 0;
            progressBarHorizontal.setProgress(this.countProgressBarHorizontal);
        }

    }
}
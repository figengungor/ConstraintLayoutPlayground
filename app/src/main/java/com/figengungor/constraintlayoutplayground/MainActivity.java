package com.figengungor.constraintlayoutplayground;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onConstraintsButtonClicked(View view) {
        startActivity(new Intent(this, ConstraintsActivity.class));
    }

    public void onChainsButtonClicked(View view) {
        startActivity(new Intent(this, ChainsActivity.class));
    }

    public void onGuidelinesButtonClicked(View view) {
        startActivity(new Intent(this, GuidelinesActivity.class));
    }

    public void onDimensionsButtonClicked(View view) {
        startActivity(new Intent(this, DimensionsActivity.class));
    }

    public void onBarriersButtonClicked(View view) {
        startActivity(new Intent(this, BarriersActivity.class));
    }

    public void onBackgroundButtonClicked(View view) {
        startActivity(new Intent(this, BackgroundActivity.class));
    }

    public void onLinearLayoutButtonClicked(View view) {
        startActivity(new Intent(this, LinearLayoutActivity.class));
    }


    public void onPercentLayoutButtonClicked(View view) {
        startActivity(new Intent(this, PercentLayoutActivity.class));
    }

    public void onRelativeLayoutButtonClicked(View view) {
        startActivity(new Intent(this, RelativeLayoutActivity.class));
    }

    public void onCentringButtonClicked(View view) {
        startActivity(new Intent(this, CentringActivity.class));
    }

    public void onConstraintSetButtonClicked(View view) {
        startActivity(new Intent(this, ConstraintSetActivity.class));
    }
}

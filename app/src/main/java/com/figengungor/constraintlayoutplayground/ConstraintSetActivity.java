package com.figengungor.constraintlayoutplayground;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.transition.TransitionManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ConstraintSetActivity extends AppCompatActivity {

    private static final String SHOW_BIG_IMAGE = "showBigImage";
    ConstraintLayout constraintLayout;
    ConstraintSet constraintSet = new ConstraintSet();
    ConstraintSet constraintSetBigImage = new ConstraintSet();
    boolean showBigImage = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_set);
        constraintLayout = (ConstraintLayout) findViewById(R.id.constraint_layout);
        constraintSet.clone(constraintLayout);
        constraintSetBigImage.clone(this, R.layout.activity_constraint_set_big_image);

        if (savedInstanceState != null) {
            boolean previous = savedInstanceState.getBoolean(SHOW_BIG_IMAGE);
            if (previous != showBigImage) {
                showBigImage = previous;
                applyConstraintSet();
            }
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putBoolean(SHOW_BIG_IMAGE, showBigImage);
        super.onSaveInstanceState(outState);
    }

    public void changeConstraintSet(View view) {
        TransitionManager.beginDelayedTransition(constraintLayout);
        showBigImage = !showBigImage;
        applyConstraintSet();
    }

    public void applyConstraintSet(){
        if(showBigImage) {
            constraintSetBigImage.applyTo(constraintLayout);
        } else{
            constraintSet.applyTo(constraintLayout);
        }
    }
}

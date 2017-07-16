package com.figengungor.constraintlayoutplayground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class RelativeLayoutActivity extends AppCompatActivity {

    Button loginButton;
    ImageButton logoutButton;
    TextView loginStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
        loginButton = (Button) findViewById(R.id.login_button);
        logoutButton = (ImageButton) findViewById(R.id.logout_image_button);
        loginStatus = (TextView) findViewById(R.id.login_status_text_view);
    }


    public void onLoginClicked(View view) {
        loginStatus.setText(getString(R.string.logged_in_status));
        loginButton.setVisibility(View.GONE);
        logoutButton.setVisibility(View.VISIBLE);

    }

    public void onLogoutClicked(View view) {
        loginStatus.setText(getString(R.string.not_logged_in_status));
        loginButton.setVisibility(View.VISIBLE);
        logoutButton.setVisibility(View.GONE);
    }
}

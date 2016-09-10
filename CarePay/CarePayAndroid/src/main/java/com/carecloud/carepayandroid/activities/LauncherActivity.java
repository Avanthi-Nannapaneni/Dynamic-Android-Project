package com.carecloud.carepayandroid.activities;
import android.app.Fragment;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.carecloud.carepayandroid.R;
import com.carecloud.carepaylibray.fragments.SignIn;
import com.carecloud.carepaylibray.models.ScreenModel;

public class LauncherActivity extends AppCompatActivity {
    ScreenModel model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);


        if(savedInstanceState == null) {

            SignIn fragment = new SignIn();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frame_holder, fragment,"signin")
                    .commit();
        }
    }

}

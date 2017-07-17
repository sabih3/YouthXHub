package org.tensorflow.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by Netaq on 7/16/2017.
 */

public class SplashActivity extends Activity{
    private static final long SPLASH_DISPLAY_LENGTH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);


        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {

                    Intent intent = new Intent(SplashActivity.this, ClassifierActivity.class);
                    startActivity(intent);
                    finish();

            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}

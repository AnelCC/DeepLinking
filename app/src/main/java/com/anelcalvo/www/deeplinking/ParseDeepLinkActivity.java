package com.anelcalvo.www.deeplinking;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by anel.cc on 4/18/18.
 */

public class ParseDeepLinkActivity  extends AppCompatActivity {



    public static final String PREFERENCE_DEEP_LINK_HOME = "/2018/04/";
    public static final String FIRST_DEEP_LINK = "/2018/04/blog-post.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        if (intent == null || intent.getData() == null) {
            finish();
        }

        openDeepLink(intent.getData());

        // Finish this activity
        finish();
    }

    private void openDeepLink(Uri deepLink) {
        String path = deepLink.getPath();

        if (PREFERENCE_DEEP_LINK_HOME.equals(path)) {
            // Launch preferences
            startActivity(new Intent(this, SecondActivity.class));
        } else if (FIRST_DEEP_LINK.equals(path)) {
            // Launch the inbox activity
            startActivity(new Intent(this, FirstActivity.class));
        } else {
            // Fall back to the main activity
            startActivity(new Intent(this, MainActivity.class));
        }
    }
}

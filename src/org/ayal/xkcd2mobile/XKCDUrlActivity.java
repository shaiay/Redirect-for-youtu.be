package org.ayal.xkcd2mobile;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class XKCDUrlActivity extends Activity {
    private static final String XKCD_M = "http://m.xkcd.com/%s";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String LastPathSegment = getIntent().getData().getLastPathSegment();
        if (LastPathSegment==null) {
            LastPathSegment = "";
        }
        
        String uriString = String.format(XKCD_M,LastPathSegment);
        Intent intent = new Intent();
        intent.setData(Uri.parse(uriString));
        startActivity(intent);
        finish();
    }

}

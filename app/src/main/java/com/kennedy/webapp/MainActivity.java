package com.kennedy.webapp;

import android.os.Build;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {

    WebView web;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        web= findViewById(R.id.web);


        if(Build.VERSION.SDK_INT>=24){ try{ Method m = StrictMode.class.getMethod("disableDeathOnFileUriExposure");
            m.invoke(null); }catch(Exception e){ e.printStackTrace(); } }


        web.loadUrl("file:///android_asset/home.html");
    }
}

package com.smk.mishipaychallenge.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadMishiPaySite();
    }

    private void loadMishiPaySite() {
        WebView webViewHome = findViewById(R.id.webViewHomePage);
        webViewHome.loadUrl("https://mishipay.com/");
    }

    public void goToProfilePage(View view){
        Intent intent = intent = new Intent(this, io.ionic.starter.MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.startActivity(intent);
    }
}

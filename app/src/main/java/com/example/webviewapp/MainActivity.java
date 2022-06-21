package com.example.webviewapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.principal_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.itemWebView:
                Intent webviewIntent = new Intent(getApplicationContext(), WebViewActivity.class);
                startActivity(webviewIntent);
                return true;

            case R.id.itemAcercaDe:
                Intent acercaDeIntent = new Intent(getApplicationContext(), AcercaDeActivity.class);
                startActivity(acercaDeIntent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
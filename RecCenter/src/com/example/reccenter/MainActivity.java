package com.example.reccenter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
    	Intent intent = new Intent(this, MetsPage.class);
        startActivity(intent);
    }
    public void sendMap(View view) {
    	Intent intent = new Intent(this, MapScreen.class);
        startActivity(intent);
    }
    public void sendEquipment(View view) {
    	Intent intent = new Intent(this, DisplayEquipment.class);
        startActivity(intent);
    }
}

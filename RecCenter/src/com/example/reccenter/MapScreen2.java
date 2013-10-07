package com.example.reccenter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MapScreen2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_screen2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.map_screen2, menu);
		return true;
	}
    public void sendFloor(View view) {
    	Intent intent = new Intent(this, MapScreen.class);
        startActivity(intent);
    }
    public void sendCardio(View view) {
    	Intent intent = new Intent(this, CardioSection.class);
        startActivity(intent);
    }
}

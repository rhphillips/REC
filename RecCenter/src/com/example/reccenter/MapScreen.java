package com.example.reccenter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MapScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_screen);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.map_screen, menu);
		return true;
	}
    public void sendPool(View view) {
    	Intent intent = new Intent(this, PoolPage.class);
        startActivity(intent);
    }
    public void sendWall(View view) {
    	Intent intent = new Intent(this, Climbing_wall.class);
        startActivity(intent);
    }
    public void sendFloor(View view) {
    	Intent intent = new Intent(this, MapScreen2.class);
        startActivity(intent);
    }
    public void sendStrength(View view) {
    	Intent intent = new Intent(this, StrengthTrainingMenu.class);
        startActivity(intent);
    }    
}

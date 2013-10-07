package com.example.reccenter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Climbing_wall extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_climbing_wall);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.climbing_wall, menu);
		return true;
	}

}

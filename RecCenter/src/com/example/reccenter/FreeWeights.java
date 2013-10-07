package com.example.reccenter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class FreeWeights extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_free_weights);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.free_weights, menu);
		return true;
	}

}

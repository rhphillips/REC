package com.example.reccenter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class StrengthTrainingMenu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_strength_training_menu);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.strength_training_menu, menu);
		return true;
	}
    public void sendBE(View view) {
    	Intent intent = new Intent(this, BackExtensionMachine.class);
        startActivity(intent);
    }
    public void sendBF(View view) {
    	Intent intent = new Intent(this, BackFlyMachine.class);
        startActivity(intent);
    }
    public void sendBC(View view) {
    	Intent intent = new Intent(this, BicepCurlMachine.class);
        startActivity(intent);
    }
    public void sendCP(View view) {
    	Intent intent = new Intent(this, ChestPress.class);
        startActivity(intent);
    }
    public void sendIP(View view) {
    	Intent intent = new Intent(this, InclinePress.class);
        startActivity(intent);
    }
    public void sendLP(View view) {
    	Intent intent = new Intent(this, LatPulldown.class);
        startActivity(intent);
    }
    public void sendLE(View view) {
    	Intent intent = new Intent(this, LegExtension.class);
        startActivity(intent);
    }
    public void sendPF(View view) {
    	Intent intent = new Intent(this, PecFlyMachine.class);
        startActivity(intent);
    }
    public void sendRCP(View view) {
    	Intent intent = new Intent(this, RotaryChestPress.class);
        startActivity(intent);
    }
    public void sendRIP(View view) {
    	Intent intent = new Intent(this, RotaryInclinePress.class);
        startActivity(intent);
    }
    public void sendRLP(View view) {
    	Intent intent = new Intent(this, RotaryLatPulldown.class);
        startActivity(intent);
    }
    public void sendRSR(View view) {
    	Intent intent = new Intent(this, RotarySeatedRow.class);
        startActivity(intent);
    }
    public void sendRSP(View view) {
    	Intent intent = new Intent(this, RotaryShoulderPress.class);
        startActivity(intent);
    }
    public void sendSLC(View view) {
    	Intent intent = new Intent(this, SeatedLegCurl.class);
        startActivity(intent);
    }
    public void sendSR(View view) {
    	Intent intent = new Intent(this, SeatedRow.class);
        startActivity(intent);
    }
    public void sendSP(View view) {
    	Intent intent = new Intent(this, ShoulderPress.class);
        startActivity(intent);
    }
    public void sendTE(View view) {
    	Intent intent = new Intent(this, TricepExtensionMachine.class);
        startActivity(intent);
    }    
    public void sendAbs(View view) {
    	Intent intent = new Intent(this, AbCrunchMachine.class);
        startActivity(intent);
    }    
    public void sendLegPress(View view) {
    	Intent intent = new Intent(this, LegPress.class);
        startActivity(intent);
    }
    public void sendHipAd1(View view) {
    	Intent intent = new Intent(this, HipAdduction.class);
        startActivity(intent);
    }    
    public void sendHipAd2(View view) {
    	Intent intent = new Intent(this, HipAbduction.class);
        startActivity(intent);
    }    
    public void sendFree(View view) {
    	Intent intent = new Intent(this, FreeWeights.class);
        startActivity(intent);
    }    
}

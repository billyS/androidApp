package com.billy.locationapp;

import com.billy.locationapp.LocationUtils.MyLocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LocationActivity extends Activity{

	Button displayLocation;
	TextView display;
	String displayText="";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.location_activity);
		
		displayLocation = (Button) findViewById(R.id.bDisplayLocation);

		display = (TextView) findViewById(R.id.tvLocationDisplay);
		
        //Firebase fb = new Firebase(getResources().getString(R.string.fbURL));
        
        LocationManager lm = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
        
        final MyLocationListener listener = new MyLocationListener();
        
        // Register the listener with the Location Manager to receive location updates
        lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, listener);
        		
        
        //fb.setValue(location);
		
		displayLocation.setOnClickListener(new View.OnClickListener() 
		{
			@Override
			public void onClick(View v) 
			{
					display.setText(listener.toString(listener.getLatitude()));
			}
		});
		
	}
	

}

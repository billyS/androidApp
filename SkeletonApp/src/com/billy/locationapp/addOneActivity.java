package com.billy.locationapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class addOneActivity extends Activity{

	int counter;
	Button add, subtract;
	TextView display;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		counter= 0;
		add = (Button) findViewById(R.id.bAdd);
		subtract = (Button) findViewById(R.id.bSub);
		display = (TextView) findViewById(R.id.tvDisplay);
		
		add.setOnClickListener(new View.OnClickListener() 
		{
			@Override
			public void onClick(View v) 
			{
				counter++;
				display.setText("counter value is:" + counter);
			}
		});
		
		subtract.setOnClickListener(new View.OnClickListener() 
		{
			@Override
			public void onClick(View v) 
			{
				counter--;
				display.setText("counter value is:" + counter);
			}
		});
		
		
	}

	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mymenu, menu);
		return true;
	}*/
	
}

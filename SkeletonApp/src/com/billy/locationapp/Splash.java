package com.billy.locationapp;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity 
{
	MediaPlayer mPlayer;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.splash);
		
		mPlayer = MediaPlayer.create(Splash.this, R.raw.newsintro);
		mPlayer.start();
		
		Thread timer = new Thread(){
			public void run(){
				try {
					sleep(5000);
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}finally {
					Intent openMainActivity = new Intent("com.billy.locationapp.MYMENU");
					startActivity(openMainActivity);
				}}};
		timer.start();
	}

	@Override
	protected void onPause() {
		super.onPause();
		mPlayer.release();
		finish();
	}
	

}

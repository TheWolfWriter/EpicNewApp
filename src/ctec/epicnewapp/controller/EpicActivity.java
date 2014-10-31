package ctec.epicnewapp.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class EpicActivity extends Activity
{
	private Button firstScreenButton;
	private Button appFancyShmancyBlueButton;
	private Button appMellowYellowButton;
	private Button appBloodRedButton;
	private RelativeLayout appLayout;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_epic);
		
		firstScreenButton = (Button) findViewById(R.id.firstScreenButton);
		appFancyShmancyBlueButton = (Button) findViewById(R.id.fancyShmancyBlueButton);
		appMellowYellowButton = (Button) findViewById(R.id.mellowYellowButton);
		appBloodRedButton = (Button) findViewById(R.id.bloodRedButton);
		
		appLayout = (RelativeLayout) findViewById(R.id.Screen1Layout);
		
		setupListeners();
	}
	
	private void setupListeners()
	{
		firstScreenButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View currentView)
			{
				Intent myIntent = new Intent(currentView.getContext(), SecondEpicActivity.class);
				startActivityForResult(myIntent, 0);
			}
		});
		
		appFancyShmancyBlueButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				appLayout.setBackgroundResource(R.color.fancyShmancyBlue);
			}
		});
		
		appMellowYellowButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				appLayout.setBackgroundResource(R.color.mellowYellow);
			}
		});
		
		appBloodRedButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				appLayout.setBackgroundResource(R.color.bloodRed);
			}
		});
	}
}

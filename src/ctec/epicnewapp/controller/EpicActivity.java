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
	public Button firstScreenButton;
	public Button appFancyShmancyBlueButton;
	public Button appMellowYellowButton;
	public Button appBloodRedButton;
	public Button appWickedGreenButton;
	public Button appNothingRhymesWithThisOrangeButton;
	public Button appPoppingPurpleButton;
	private RelativeLayout appLayout;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_epic);
		
		appFancyShmancyBlueButton = (Button) findViewById(R.id.fancyShmancyBlueButton);
		appMellowYellowButton = (Button) findViewById(R.id.mellowYellowButton);
		appBloodRedButton = (Button) findViewById(R.id.bloodRedButton);
		appWickedGreenButton = (Button) findViewById(R.id.wickedGreenButton);
		appNothingRhymesWithThisOrangeButton = (Button) findViewById(R.id.nothingRhymesWithThisOrangeButton);
		appPoppingPurpleButton = (Button) findViewById(R.id.poppingPurpleButton);
		
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
		
		appWickedGreenButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				appLayout.setBackgroundResource(R.color.wickedGreen);
			}
		});
		
		appNothingRhymesWithThisOrangeButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				appLayout.setBackgroundResource(R.color.nothingRhymesWithThisOrange);
			}
		});
		
		appPoppingPurpleButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				appLayout.setBackgroundResource(R.color.poppingPurple);
			}
		});
	}
}

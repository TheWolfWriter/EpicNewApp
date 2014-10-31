package ctec.epicnewapp.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class SecondEpicActivity extends Activity
{
	private Button secondEpicButton;
	private Button appWickedGreenButton;
	private Button appNothingRhymesWithThisOrangeButton;
	private Button appPoppingPurpleButton;
	private RelativeLayout appLayout;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second_epic);
		
		secondEpicButton = (Button) findViewById(R.id.secondEpicButton);
		appWickedGreenButton = (Button) findViewById(R.id.wickedGreenButton2);
		appNothingRhymesWithThisOrangeButton = (Button) findViewById(R.id.nothingRhymesWithThisOrangeButton2);
		appPoppingPurpleButton = (Button) findViewById(R.id.poppingPurpleButton2);
		
		appLayout = (RelativeLayout) findViewById(R.id.Screen2Layout);
		
		setupListeners();
	}
	
	private void setupListeners()
	{
		secondEpicButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View currentView)
			{
				Intent currentIntent = new Intent();
				setResult(RESULT_OK, currentIntent);
				finish();
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

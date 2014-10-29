package ctec.epicnewapp.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SecondEpicActivity extends Activity
{
	private Button secondEpicButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second_epic);
		
		secondEpicButton = (Button) findViewById(R.id.secondEpicButton);
		
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
	}
}

package com.example.ebolavirusinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends ActionBarActivity implements OnClickListener {

	Button btnWhat, btnTransmission, btnSigns, btnDiagnosis, btnVaccine, btnPrevetion, btnReduce, btnControl, btnGallery;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btnWhat = (Button) findViewById(R.id.buttonWhat);
		btnTransmission = (Button) findViewById(R.id.buttonTransmission);
		btnSigns = (Button) findViewById(R.id.buttonSigns);
		btnDiagnosis = (Button) findViewById(R.id.buttonDiagnosis);
		btnVaccine = (Button) findViewById(R.id.buttonVaccine);
		btnPrevetion = (Button) findViewById(R.id.buttonPrevention);
		btnReduce = (Button) findViewById(R.id.buttonReducing);
		btnControl = (Button) findViewById(R.id.buttonControlling);
		btnGallery = (Button) findViewById(R.id.buttonGallery);

		btnWhat.setOnClickListener(this);
		btnTransmission.setOnClickListener(this);
		btnSigns.setOnClickListener(this);
		btnDiagnosis.setOnClickListener(this);
		btnVaccine.setOnClickListener(this);
		btnPrevetion.setOnClickListener(this);
		btnReduce.setOnClickListener(this);
		btnControl.setOnClickListener(this);
		btnGallery.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.buttonWhat:
			Intent i = new Intent("com.example.ebolavirusinfo.WHATISEBOLA");
			startActivity(i);
			break;
		case R.id.buttonTransmission:
			i = new Intent("com.example.ebolavirusinfo.TRANSMISSION");
			startActivity(i);
			break;
		case R.id.buttonSigns:
			i = new Intent("com.example.ebolavirusinfo.SIGNSANDSYMPTOMS");
			startActivity(i);
			break;
		case R.id.buttonDiagnosis:
			i = new Intent("com.example.ebolavirusinfo.DIAGNOSIS");
			startActivity(i);
			break;
		case R.id.buttonVaccine:
			i = new Intent("com.example.ebolavirusinfo.VACCINEANDTREATMENT");
			startActivity(i);
			break;
		case R.id.buttonPrevention:
			i = new Intent("com.example.ebolavirusinfo.PREVENTIONANDCONTROL");
			startActivity(i);
			break;
		case R.id.buttonReducing:
			i = new Intent("com.example.ebolavirusinfo.REDUCINGTHERISK");
			startActivity(i);
			break;
		case R.id.buttonControlling:
			i = new Intent("com.example.ebolavirusinfo.CONTROLLINGINFECTION");
			startActivity(i);
			break;
		case R.id.buttonGallery:
			i = new Intent("com.example.ebolavirusinfo.GALLERYACTIVITY");
			startActivity(i);
			break;

		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		MenuInflater blowUp = getMenuInflater();
		blowUp.inflate(R.menu.main, menu);
		// Inflate the menu; this adds items to the action bar if it is present.
		// getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		// int id = item.getItemId();

		switch (item.getItemId()) {
		case R.id.aboutUs:
			Intent i = new Intent("com.example.ebolavirusinfo.ABOUTUS");
			startActivity(i);
			break;
		case R.id.contact:
			i = new Intent("com.example.ebolavirusinfo.CONTACTUS");
			startActivity(i);
			break;
		case R.id.exit:
			finish();
			break;
		}

		return false;// super.onOptionsItemSelected(item);
	}
}

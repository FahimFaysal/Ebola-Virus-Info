package com.example.ebolavirusinfo;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class VaccineAndTreatment extends Activity {
	String st1, st2, st3;
	WebView wv1, wv2, wv3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.vaccineandtreatment);
		// TextViewEx txtViewEx = (TextViewEx) findViewById(R.id.textViewEx);
		// txtViewEx.setText("Insert your content here", true); // true: enables justification
		String htmlText = "<html><body style=\"text-align:justify\"> %s </body></Html>";

		String st1 = "No licensed vaccine for EVD is available. Several vaccines are being tested, but none are available for clinical use.";
		wv1 = (WebView) findViewById(R.id.webview1);
		wv1.loadData(String.format(htmlText, st1), "text/html", "utf-8");

		st2 = "Severely ill patients require intensive supportive care. Patients are frequently dehydrated and require oral rehydration with solutions containing electrolytes or intravenous fluids.";
		wv2 = (WebView) findViewById(R.id.webview2);
		wv2.loadData(String.format(htmlText, st2), "text/html", "utf-8");

		st3 = "No specific treatment is available. New drug therapies are being evaluated.";
		wv3 = (WebView) findViewById(R.id.webview3);
		wv3.loadData(String.format(htmlText, st3), "text/html", "utf-8");
	}

}

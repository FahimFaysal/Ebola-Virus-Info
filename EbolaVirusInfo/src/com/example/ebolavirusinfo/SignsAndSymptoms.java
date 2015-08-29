package com.example.ebolavirusinfo;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class SignsAndSymptoms  extends Activity{
	String st1, st2, st3;
	WebView wv1, wv2, wv3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.signsandsymptoms);
		// TextViewEx txtViewEx = (TextViewEx) findViewById(R.id.textViewEx);
		// txtViewEx.setText("Insert your content here", true); // true: enables justification
		String htmlText = "<html><body style=\"text-align:justify\"> %s </body></Html>";

		String st1 = "EVD is a severe acute viral illness often characterized by the sudden onset of fever, intense weakness, muscle pain, headache and sore throat. This is followed by vomiting, diarrhoea, rash, impaired kidney and liver function, and in some cases, both internal and external bleeding. Laboratory findings include low white blood cell and platelet counts and elevated liver enzymes.";
		wv1 = (WebView) findViewById(R.id.webview1);
		wv1.loadData(String.format(htmlText, st1), "text/html", "utf-8");

		st2 = "People are infectious as long as their blood and secretions contain the virus. Ebola virus was isolated from semen 61 days after onset of illness in a man who was infected in a laboratory.";
		wv2 = (WebView) findViewById(R.id.webview2);
		wv2.loadData(String.format(htmlText, st2), "text/html", "utf-8");

		st3 = "The incubation period, that is, the time interval from infection with the virus to onset of symptoms, is 2 to 21 days.";
		wv3 = (WebView) findViewById(R.id.webview3);
		wv3.loadData(String.format(htmlText, st3), "text/html", "utf-8");
	}
	
	
	
}
package com.example.ebolavirusinfo;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ControllingInfection extends Activity {
	String st1, st2, st3, st4;
	WebView wv1, wv2, wv3, wv4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.controllinginfection);
		// TextViewEx txtViewEx = (TextViewEx) findViewById(R.id.textViewEx);
		// txtViewEx.setText("Insert your content here", true); // true: enables justification
		String htmlText = "<html><body style=\"text-align:justify\"> %s </body></Html>";

		st1 = "Human-to-human transmission of the Ebola virus is primarily associated with direct or indirect contact with blood and body fluids. Transmission to health-care workers has been reported when appropriate infection control measures have not been observed.";
		wv1 = (WebView) findViewById(R.id.webview1);
		wv1.loadData(String.format(htmlText, st1), "text/html", "utf-8");
		
		st2 = "It is not always possible to identify patients with EBV early because initial symptoms may be non-specific. For this reason, it is important that health-care workers apply standard precautions consistently with all patients – regardless of their diagnosis – in all work practices at all times. These include basic hand hygiene, respiratory hygiene, the use of personal protective equipment (according to the risk of splashes or other contact with infected materials), safe injection practices and safe burial practices.";
		wv2 = (WebView) findViewById(R.id.webview2);
		wv2.loadData(String.format(htmlText, st2), "text/html", "utf-8");
		
		st3 = "Health-care workers caring for patients with suspected or confirmed Ebola virus should apply, in addition to standard precautions, other infection control measures to avoid any exposure to the patient’s blood and body fluids and direct unprotected contact with the possibly contaminated environment. When in close contact (within 1 metre) of patients with EBV, health-care workers should wear face protection (a face shield or a medical mask and goggles), a clean, non-sterile long-sleeved gown, and gloves (sterile gloves for some procedures).";
		wv3 = (WebView) findViewById(R.id.webview3);
		wv3.loadData(String.format(htmlText, st3), "text/html", "utf-8");
		
		st4 = "Laboratory workers are also at risk. Samples taken from suspected human and animal Ebola cases for diagnosis should be handled by trained staff and processed in suitably equipped laboratories.";
		wv4 = (WebView) findViewById(R.id.webview4);
		wv4.loadData(String.format(htmlText, st4), "text/html", "utf-8");

	}

}

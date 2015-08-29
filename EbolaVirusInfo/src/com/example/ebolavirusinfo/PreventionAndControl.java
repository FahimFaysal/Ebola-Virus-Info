package com.example.ebolavirusinfo;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.ebolavirusinfo.R;


public class PreventionAndControl extends Activity {
	String st1, st2, st3, st4;
	WebView wv1, wv2, wv3, wv4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.preventionandcontrol);
		// TextViewEx txtViewEx = (TextViewEx) findViewById(R.id.textViewEx);
		// txtViewEx.setText("Insert your content here", true); // true: enables justification
		String htmlText = "<html><body style=\"text-align:justify\"> %s </body></Html>";

		String st1 = "Controlling Reston ebolavirus in domestic animals";
		wv1 = (WebView) findViewById(R.id.webview1);
		wv1.loadData(String.format(htmlText, st1), "text/html", "utf-8");

		st2 = "No animal vaccine against RESTV is available. Routine cleaning and disinfection of pig or monkey farms (with sodium hypochlorite or other detergents) should be effective in inactivating the virus.";
		wv2 = (WebView) findViewById(R.id.webview2);
		wv2.loadData(String.format(htmlText, st2), "text/html", "utf-8");

		st3 = "If an outbreak is suspected, the premises should be quarantined immediately. Culling of infected animals, with close supervision of burial or incineration of carcasses, may be necessary to reduce the risk of animal-to-human transmission. Restricting or banning the movement of animals from infected farms to other areas can reduce the spread of the disease.";
		wv3 = (WebView) findViewById(R.id.webview3);
		wv3.loadData(String.format(htmlText, st3), "text/html", "utf-8");

		st4 = "As RESTV outbreaks in pigs and monkeys have preceded human infections, the establishment of an active animal health surveillance system to detect new cases is essential in providing early warning for veterinary and human public health authorities.";
		wv4 = (WebView) findViewById(R.id.webview4);
		wv4.loadData(String.format(htmlText, st4), "text/html", "utf-8");
	}

}

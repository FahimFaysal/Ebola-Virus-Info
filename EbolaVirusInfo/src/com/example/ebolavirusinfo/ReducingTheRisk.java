package com.example.ebolavirusinfo;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ReducingTheRisk extends Activity {
	String st1, st2, st3, st4, st5, st6;
	WebView wv1, wv2, wv3, wv4, wv5, wv6;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.reducingtherisk);
		// TextViewEx txtViewEx = (TextViewEx) findViewById(R.id.textViewEx);
		// txtViewEx.setText("Insert your content here", true); // true: enables justification
		String htmlText = "<html><body style=\"text-align:justify\"> %s </body></Html>";

		String st1 = "In the absence of effective treatment and a human vaccine, raising awareness of the risk factors for Ebola infection and the protective measures individuals can take is the only way to reduce human infection and death.";
		wv1 = (WebView) findViewById(R.id.webview1);
		wv1.loadData(String.format(htmlText, st1), "text/html", "utf-8");

		st2 = "In Africa, during EVD outbreaks, educational public health messages for risk reduction should focus on several factors:";
		wv2 = (WebView) findViewById(R.id.webview2);
		wv2.loadData(String.format(htmlText, st2), "text/html", "utf-8");

		st3 = "Reducing the risk of wildlife-to-human transmission from contact with infected fruit bats or monkeys/apes and the consumption of their raw meat. Animals should be handled with gloves and other appropriate protective clothing. Animal products (blood and meat) should be thoroughly cooked before consumption";
		wv3 = (WebView) findViewById(R.id.webview3);
		wv3.loadData(String.format(htmlText, st3), "text/html", "utf-8");

		st4 = "Reducing the risk of human-to-human transmission in the community arising from direct or close contact with infected patients, particularly with their bodily fluids. Close physical contact with Ebola patients should be avoided. Gloves and appropriate personal protective equipment should be worn when taking care of ill patients at home. Regular hand washing is required after visiting patients in hospital, as well as after taking care of patients at home.";
		wv4 = (WebView) findViewById(R.id.webview4);
		wv4.loadData(String.format(htmlText, st4), "text/html", "utf-8");

		st5 = "Communities affected by Ebola should inform the population about the nature of the disease and about outbreak containment measures, including burial of the dead. People who have died from Ebola should be promptly and safely buried.";
		wv5 = (WebView) findViewById(R.id.webview5);
		wv5.loadData(String.format(htmlText, st5), "text/html", "utf-8");
		
		st6 = "Pig farms in Africa can play a role in the amplification of infection because of the presence of fruit bats on these farms. Appropriate biosecurity measures should be in place to limit transmission. For RESTV, educational public health messages should focus on reducing the risk of pig-to-human transmission as a result of unsafe animal husbandry and slaughtering practices, and unsafe consumption of fresh blood, raw milk or animal tissue. Gloves and other appropriate protective clothing should be worn when handling sick animals or their tissues and when slaughtering animals. In regions where RESTV has been reported in pigs, all animal products (blood, meat and milk) should be thoroughly cooked before eating.";
		wv6 = (WebView) findViewById(R.id.webview6);
		wv6.loadData(String.format(htmlText, st6), "text/html", "utf-8");
	}

}

package com.example.ebolavirusinfo;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Transmission extends Activity {
	String st1, st2, st3, st4, st5, st6, st7, st8;
	WebView wv1, wv2, wv3, wv4, wv5, wv6, wv7, wv8;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.transmission);
		// TextViewEx txtViewEx = (TextViewEx) findViewById(R.id.textViewEx);
		// txtViewEx.setText("Insert your content here", true); // true: enables justification
		String htmlText = "<html><body style=\"text-align:justify\"> %s </body></Html>";

		String st1 = "Ebola is introduced into the human population through close contact with the blood, secretions, organs or other bodily fluids of infected animals.";
		wv1 = (WebView) findViewById(R.id.webview1);
		wv1.loadData(String.format(htmlText, st1), "text/html", "utf-8");

		st2 = "In Africa, infection has been documented through the handling of infected chimpanzees, gorillas, fruit bats, monkeys, forest antelope and porcupines found ill or dead or in the rainforest.";
		wv2 = (WebView) findViewById(R.id.webview2);
		wv2.loadData(String.format(htmlText, st2), "text/html", "utf-8");

		st3 = "Ebola then spreads in the community through human-to-human transmission, with infection resulting from direct contact (through broken skin or mucous membranes) with the blood, secretions, organs or other bodily fluids of infected people, and indirect contact with environments contaminated with such fluids.";
		wv3 = (WebView) findViewById(R.id.webview3);
		wv3.loadData(String.format(htmlText, st3), "text/html", "utf-8");

		st4 = "Burial ceremonies in which mourners have direct contact with the body of the deceased person can also play a role in the transmission of Ebola.";
		wv4 = (WebView) findViewById(R.id.webview4);
		wv4.loadData(String.format(htmlText, st4), "text/html", "utf-8");

		st5 = "Men who have recovered from the disease can still transmit the virus through their semen for up to 7 weeks after recovery from illness.";
		wv5 = (WebView) findViewById(R.id.webview5);
		wv5.loadData(String.format(htmlText, st5), "text/html", "utf-8");

		st6 = "Health-care workers have frequently been infected while treating patients with suspected or confirmed EVD.";
		wv6 = (WebView) findViewById(R.id.webview6);
		wv6.loadData(String.format(htmlText, st6), "text/html", "utf-8");

		st7 = "Among workers in contact with monkeys or pigs infected with Reston ebolavirus, several infections have been documented in people who were clinically asymptomatic. Thus, RESTV appears less capable of causing disease in humans than other Ebola species.";
		wv7 = (WebView) findViewById(R.id.webview7);
		wv7.loadData(String.format(htmlText, st7), "text/html", "utf-8");

		st8 = "However, the only available evidence available comes from healthy adult males. It would be premature to extrapolate the health effects of the virus to all population groups, such as immuno-compromised persons, persons with underlying medical conditions, pregnant women and children.";
		wv8 = (WebView) findViewById(R.id.webview8);
		wv8.loadData(String.format(htmlText, st8), "text/html", "utf-8");
	}

}
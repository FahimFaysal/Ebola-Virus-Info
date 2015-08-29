package com.example.ebolavirusinfo;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WhatIsEbola extends Activity {
	String st1, st2, st3, st4, st5;
	WebView wv1, wv2, wv3, wv4, wv5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.whatisebola);
		// TextViewEx txtViewEx = (TextViewEx) findViewById(R.id.textViewEx);
		// txtViewEx.setText("Insert your content here", true); // true: enables justification
		String htmlText = "<html><body style=\"text-align:justify\"> %s </body></Html>";
		
		String st1 = "Ebola virus- formerly designated Zaire ebolavirus- is the sole member of the Zaire ebolavirus species, and the most dangerous of the five known viruses within the genus ebolavirus.";
		wv1 = (WebView) findViewById(R.id.webview1);
		wv1.loadData(String.format(htmlText, st1), "text/html", "utf-8");
		
		st2 = "Four of the five known ebolaviruses cause a severe and often fatal hemorrhagic fever in humans and other primates, known as ebola virus disease, according to Wikipedia. Its natural reservoir is believed to be bats, particularly fruit bats, and it is primarily transmitted between humans and from animals to humans, through body fluids.";
		wv2 = (WebView) findViewById(R.id.webview2);
		wv2.loadData(String.format(htmlText, st2), "text/html", "utf-8");
		
		st3 = "Ebola first appeared in 1976 in 2 simultaneous outbreaks, in Nzara, Sudan, and in Yambuku, Democratic Republic of Congo. The latter was in a village situated near the Ebola River, from which the disease takes its name.";
		wv3 = (WebView) findViewById(R.id.webview3);
		wv3.loadData(String.format(htmlText, st3), "text/html", "utf-8");
		
		st4 = "Genus Ebolavirus is 1 of 3 members of the Filoviridae family (filovirus), along with genus Marburgvirus and genus Cuevavirus. Genus Ebolavirus comprises 5 distinct species:";
		wv4 = (WebView) findViewById(R.id.webview4);
		wv4.loadData(String.format(htmlText, st4), "text/html", "utf-8");
		
		st5 = "BDBV, EBOV, and SUDV have been associated with large EVD outbreaks in Africa, whereas RESTV and TAFV have not. The RESTV species, found in Philippines and the People’s Republic of China, can infect humans, but no illness or death in humans from this species has been reported to date.";
		wv5 = (WebView) findViewById(R.id.webview5);
		wv5.loadData(String.format(htmlText, st5), "text/html", "utf-8");
	}

}

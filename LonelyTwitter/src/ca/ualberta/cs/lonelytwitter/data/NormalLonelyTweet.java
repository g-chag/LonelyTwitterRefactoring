package ca.ualberta.cs.lonelytwitter.data;

import java.io.Serializable;
import java.util.Date;

import android.util.Log;

import ca.ualberta.cs.lonelytwitter.LonelyTweet;

public class NormalLonelyTweet extends LonelyTweet implements Serializable {

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
		if (tweetBody.trim().length() == 0 || tweetBody.trim().length() > 10) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		String importantstring = "IMPORTANT" + getTweetDate() + " | " + getTweetBody();
		Log.i("TAG", importantstring);
		return importantstring;
	}
}

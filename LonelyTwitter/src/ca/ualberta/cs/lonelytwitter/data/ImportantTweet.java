package ca.ualberta.cs.lonelytwitter.data;

import ca.ualberta.cs.lonelytwitter.LonelyTweet;

public class ImportantTweet extends LonelyTweet {
	
	public ImportantTweet() {
	}
		@Override
		public boolean isValid() {
			if (tweetBody.trim().length() == 0 || tweetBody.trim().length() > 20) {
				return false;
			}

			return true;
		}
			
}

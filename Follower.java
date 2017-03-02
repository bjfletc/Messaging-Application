import java.util.*;

public class Follower {

	private String followersName;
	private String followersNumber;
	private boolean sms;

	Follower (String name, String number, boolean enableSMS) {
		followersName = name;
		followersNumber = number;
		sms = enableSMS;
	}

	Follower () {
        followersName = "Anonymous";
        followersNumber = "9999999999";
        sms = false;
    }

	/**
	 * Creating Setter Methods
	 */

	public void setFollowersName(String name) {
		followersName = name;
	}

	public void setFollowersNumber(String number) {
		followersNumber = number;
	}

	public void setSMS(boolean enableSMS) {
		sms = enableSMS;
	}

	/**
	 * Creating Getter Methods
	 */

	public String getFollowersName() {
		return followersName;
	}

	public String getFollowersNumber() {
		return followersNumber;
	}

	public boolean getSMS() {
		return sms;
	}
}
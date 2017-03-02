import java.util.*;
import java.io.*;

public class DroidFollowers {
	
	public static void main(String[] args) {
		int numFollowers;
		Scanner scan = new Scanner(System.in);
		String tmpName = "";
		String tmpNum = "";
		boolean smsState = false;
		PrintWriter result;
		PrintWriter arraySize;
		String scanYN;

		try {  // Create the output stream.
            result = new PrintWriter(new FileWriter("result.txt"));
        }
        catch (IOException e) {
            System.out.println("Can't open file result.dat!");
            System.out.println("Error: " + e);
            return;        // End the program.
        }

        try {  // Create the output stream.
            arraySize = new PrintWriter(new FileWriter("arraySize.txt"));
        }
        catch (IOException e) {
            System.out.println("Can't open file result.dat!");
            System.out.println("Error: " + e);
            return;        // End the program.
        }



		System.out.println("How many followers?");
		numFollowers = scan.nextInt();

		arraySize.println(Integer.toString(numFollowers));
        arraySize.flush();
        arraySize.close();

		Follower[] followersArray;
		followersArray = new Follower[numFollowers];

		for (int i = 0; i < followersArray.length; i++) {
			followersArray[i] = new Follower();

			System.out.print("What is this followers name: ");
			tmpName = scan.next();
			followersArray[i].setFollowersName(tmpName);
			System.out.println();

			System.out.print("What about their number: ");
			tmpNum = scan.next();
			followersArray[i].setFollowersNumber(tmpNum);
			System.out.println();

			System.out.print("Do you want them to receive text notifications (Y/N)?: ");
			scanYN = scan.next();
			if (scanYN == "Y") {
				smsState = true;
			} else {
				smsState = false;
			}
			followersArray[i].setSMS(smsState);
			System.out.println();
		}

		// Print Out Current Followers

		for (int i = 0; i < numFollowers; i++) {
			result.println(followersArray[i].getFollowersName());
			result.println(followersArray[i].getFollowersNumber());
			if (followersArray[i].getSMS() == true) {
				result.println("Y");
			} else {
				result.println("N");
			}
			result.println();
			result.flush();
		}

		result.close();
	}

}
import java.util.*;
import java.io.*;

public class MainActivity {
	public static void main(String[] args) {

		int arraySize = 0;
		// System.out.println(Integer.toString(arraySize));

		try (BufferedReader br1 = new BufferedReader(new FileReader("arraySize.txt"))) {
    		String line;
    		while ((line = br1.readLine()) != null) {
       			arraySize = Integer.parseInt(line);
    		}
    	} catch (FileNotFoundException e) {
    		return;
    	} catch (IOException e) {
    		return;
    	}

    	System.out.println(Integer.toString(arraySize));

		Follower[] followers = new Follower[arraySize];
		for (int i = 0; i < arraySize; i++) {
			followers[i] = new Follower();
		}

		int lineNumber = 0;
		int followerNumber = 0;

		try (BufferedReader br = new BufferedReader(new FileReader("result.txt"))) {
    		String line;
    		while ((line = br.readLine()) != null) {
       			
       			if (followerNumber == arraySize) {
       				break;
       			}
       			if (lineNumber == 0) {
       				followers[followerNumber].setFollowersName(line);
       				lineNumber = lineNumber + 1;
       			} else if (lineNumber == 1) {
       				followers[followerNumber].setFollowersNumber(line);
       				lineNumber = lineNumber + 1;
       			} else if (lineNumber == 2) {
       				followers[followerNumber].setSMS(true);
       				lineNumber = lineNumber + 1;
       			} else if (lineNumber == 3) {
       				lineNumber = 0;
       				followerNumber = followerNumber + 1;
       			}
       			
       			
    		}
    	} catch (FileNotFoundException e) {
    		return;
    	} catch (IOException e) {
    		return;
    	}

    	System.out.println();

    	for (int i = 0; i < arraySize; i++) {
    		System.out.println(followers[i].getFollowersName());
    		System.out.println(followers[i].getFollowersNumber());
    		System.out.println();
    	}
    }
}
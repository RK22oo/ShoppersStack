package genericUtility;


import java.util.Random;

public class JavaUtility {

	public int getRandomNumber(int broundryValue) {
		int randomNumber = new Random().nextInt(broundryValue);
		return randomNumber;
	}
}

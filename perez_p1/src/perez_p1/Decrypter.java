package perez_p1;

public class Decrypter {
	private int decryptedNum;
	public void decrypt(int number) {
		
		
		
		int fourthDigit, thirdDigit, secondDigit, firstDigit, temp, decryptedNum;
		
		fourthDigit = number / 1000;
		thirdDigit = (number - fourthDigit * 1000) / 100;
		secondDigit = (number - fourthDigit * 1000 - thirdDigit * 100) / 10;
		firstDigit = (number - fourthDigit * 1000 - thirdDigit * 100 - secondDigit * 10) / 1;
		
		//	Replace each digit with the result of adding 7 to the digit
		//  Get the remainder after dividing new value by 10
		fourthDigit = (fourthDigit + 3) % 10;
		thirdDigit = (thirdDigit + 3) % 10;
		secondDigit = (secondDigit + 3) % 10;
		firstDigit = (firstDigit + 3) % 10;
		
		//	swap the first digit with the third
		temp = firstDigit;
		firstDigit = thirdDigit;
		thirdDigit = temp;
		
		//	swap the second digit with the fourth
		temp = secondDigit;
		secondDigit = fourthDigit;
		fourthDigit = temp; 
		
		
		decryptedNum = (fourthDigit * 1000) + (thirdDigit * 100) + (secondDigit * 10) + (firstDigit);
		setDecryptedNum(decryptedNum, number);
		

		
	}
	public int getDecryptedNum() {
		return this.decryptedNum;

	}
	public void setDecryptedNum(int decryptedNum, int number) {
		if (number >= 0 && number <= 9999) {
			this.decryptedNum = decryptedNum;

		}
	}
	public void displayDecryptedNum(int number) {
		if (number >= 0 && number <= 9999) {
			int fourthDigit, thirdDigit, secondDigit, firstDigit;
			fourthDigit = decryptedNum / 1000;
			thirdDigit = (decryptedNum - fourthDigit * 1000) / 100;
			secondDigit = (decryptedNum - fourthDigit * 1000 - thirdDigit * 100) / 10;
			firstDigit = (decryptedNum - fourthDigit * 1000 - thirdDigit * 100 - secondDigit * 10) / 1;
			
			//	Print encrypted integer
				System.out.print(fourthDigit);
				System.out.print(thirdDigit);
				System.out.print(secondDigit);
				System.out.println(firstDigit);
		
		}
	}
}



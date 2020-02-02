package perez_p1;


public class Encrypter {
	private int encryptedNum;
	public void Encrypt(int number) {
		
		
		int fourthDigit, thirdDigit, secondDigit, firstDigit, temp;
		fourthDigit = number / 1000;
		thirdDigit = (number - fourthDigit * 1000) / 100;
		secondDigit = (number - fourthDigit * 1000 - thirdDigit * 100) / 10;
		firstDigit = (number - fourthDigit * 1000 - thirdDigit * 100 - secondDigit * 10) / 1;
		
		//	Encryption: Replace each digit with the result of adding 7 to the digit
		// 	Encryption: get the remainder after dividing new value by 10
		fourthDigit = (fourthDigit + 7) % 10;
		thirdDigit = (thirdDigit + 7) % 10;
		secondDigit = (secondDigit + 7) % 10;
		firstDigit = (firstDigit + 7) % 10;
		
		//	Encryption: swap the first digit with the third
		temp = firstDigit;
		firstDigit = thirdDigit;
		thirdDigit = temp;
		
		//	Encryption: swap the second digit with the fourth
		temp = secondDigit;
		secondDigit = fourthDigit;
		fourthDigit = temp; 
		
		
		int encryptedNum = (fourthDigit * 1000) + (thirdDigit * 100) + (secondDigit * 10) + (firstDigit);
		
		setEncryptedNum(encryptedNum, number);
		
		
	}
	
	public int getEncryptedNum() {
		return this.encryptedNum;

	}
	public void setEncryptedNum(int encryptedNum, int number) {
		if (number >= 0 && number <= 9999) {
			this.encryptedNum = encryptedNum;

		} else {
			System.out.println("Error: Input must be a 4-digit number.");
		}
	}
	public void displayEncryptedNum(int number) {
		if (number >= 0 && number <= 9999) {
			int fourthDigit, thirdDigit, secondDigit, firstDigit;
			fourthDigit = encryptedNum / 1000;
			thirdDigit = (encryptedNum - fourthDigit * 1000) / 100;
			secondDigit = (encryptedNum - fourthDigit * 1000 - thirdDigit * 100) / 10;
			firstDigit = (encryptedNum - fourthDigit * 1000 - thirdDigit * 100 - secondDigit * 10) / 1;
			
			//	Print encrypted integer
				System.out.print(fourthDigit);
				System.out.print(thirdDigit);
				System.out.print(secondDigit);
				System.out.println(firstDigit);
		}
	}
}

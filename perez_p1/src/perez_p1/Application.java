package perez_p1;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		
		//	Encrypt data
		//	Data transmitted as four-digit integers
		//	Read four-digit integer entered by user
		Scanner input = new Scanner(System.in);

		while (1 != 0){
			System.out.print("Press 1 for encryption, Press 2 for decryption, Press 3 to exit: ");
			int choice = input.nextInt();
			
			if (choice == 1) {
				
				System.out.printf("Enter four-digit integer for encryption: ");			
				int num1 = input.nextInt();
				Encrypter Encrypter = new Encrypter();
				Encrypter.Encrypt(num1);
				Encrypter.getEncryptedNum();
				Encrypter.displayEncryptedNum(num1);
			} else if (choice == 2) {
				System.out.printf("Enter four-digit integer for decryption: ");			
				int num2 = input.nextInt();
				Decrypter Decrypter = new Decrypter();
				Decrypter.decrypt(num2);
				Decrypter.getDecryptedNum();
				Decrypter.displayDecryptedNum(num2);
				
			} else if (choice == 3) {
				System.out.println("Application ended.");
				input.close();
				break;
			} else {
				System.out.printf("Enter a valid input\n");
			}
		}
		
		
	}

}

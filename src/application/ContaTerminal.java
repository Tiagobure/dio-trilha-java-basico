package application;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		System.out.print("Please enter you name: ");
		String name = sc.nextLine(); 
		
		System.out.print("Please enter the account number: ");
 
		int number = sc.nextInt();
		sc.nextLine(); 
		System.out.print("Please enter the Agency number: ");
        String agency= sc.nextLine();
		
		System.out.print("your balance: ");
		double balance = sc.nextDouble();
		
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, "
				+ "sua agência é %s, conta %d e "
				+ "seu saldo %.2f já está disponível para saque"
				,name,agency,number,balance);
		

	}

}

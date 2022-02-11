package encapsulatio;

import java.util.Scanner;

public class User

{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the pin: ");

			int pin=sc.nextInt();
			Bank obj=new Bank();
			obj.setter(pin);
			obj.getter();
sc.close();
	}

}

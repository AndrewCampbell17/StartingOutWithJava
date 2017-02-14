package chapter2;

import java.util.Scanner;

public class CookieCalories {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of cookies that you at: ");
		int cookiesAte = sc.nextInt();
		int servingSize = 40/10;
		int caloriesPerCookie = 300/servingSize;
		int totalCalories = cookiesAte * caloriesPerCookie;
		
		System.out.println("Total calories consumed: " + totalCalories);
		

	}

}

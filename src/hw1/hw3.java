package hw1;

import java.util.Scanner;

public class hw3 {
	public static void main(String[] args) {

		
//1判斷三角形
		Scanner triangleScanner=new Scanner(System.in);
		int a = triangleScanner.nextInt();
		int b = triangleScanner.nextInt();
		int c = triangleScanner.nextInt();
		
		int[] side = {a,b,c};
		
		
		
		
//2隨機猜數字	
		Scanner numScanner =new Scanner(System.in);
		int guess;
		int guessTimes = 0;
		
		while (true) {
		System.out.println("Input a number(0~9):");
		guess= numScanner.nextInt();
			if(guess != (int)(Math.random()*10)+1) {
				System.out.println("You guessed wrong,please continue");
				guessTimes++;
			}else {
				System.out.println("You got it!");
				System.out.println(	);
			}
		
	}
		
	}
}

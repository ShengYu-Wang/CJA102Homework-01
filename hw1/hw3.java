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
		
		
		System.out.println("===================1===================");
		
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
				System.out.println("You tried " + (guessTimes + 1) + " times."	);
				break;
			}
		
	}
		System.out.println("===================2===================");
		
//3樂透
		Scanner owenHateNum = new Scanner(System.in);
		
		System.out.println("阿文你討厭什麼數字:");
		int hateNum = owenHateNum.nextInt();
		
		System.out.println("阿文能選的數字:");
		int count = 0;
		for(int i = 1 ;i <= 49 ;i++) {
			//數字轉為字串去比對
			if(String.valueOf(i).contains(String.valueOf(hateNum))) {
				continue;
			}
			//%數字格式 2d距離
			System.out.printf("%2d ", i);
            count++;
            //計算10個數字後換行
            if (count % 10 == 0) {
                System.out.println();
            }

		}
		System.out.println("\n總共可以選擇的號碼有 " + count + " 個！");
        
		owenHateNum.close();
		System.out.println("===================3===================");

	}
}

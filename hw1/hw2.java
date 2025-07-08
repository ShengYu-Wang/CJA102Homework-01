package hw1;

public class hw2 {
	private static String j;

	public static void main(String[] args) {
//1請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)	
		int sum1 = 0;

		for (int i = 0; i <= 1000; i += 2) {

			sum1 += i;
		}

		System.out.println(sum1);
		System.out.println();

//2請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int sum2 = 1;
		for (int i = 1; i <= 10; i++) {
			sum2 *= i;
		}
		System.out.println(sum2);
		System.out.println();

//3請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int sum3 = 1;
		int n3 = 1;
		while (n3 <= 10) {
			sum3 *= n3;
			n3++;
		}

		System.out.println(sum3);
		System.out.println();

//4請設計一隻Java程式,輸出結果為以下:1 4 9 16 25 36 49 64 81 100(平方根)
		for (int i = 0; i <= 10; i++) {

			System.out.print(i * i + "\t");

		}

		System.out.println();
		System.out.println();

//5阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		int count = 0;
		for(int i = 1; i <= 49; i++) {
			if (i == 4) {
				continue;
			}
			System.out.printf("%2d",i);
			count ++;
			
			if (count % 10 ==0 ){
				System.out.println();
			}
		}

//6請設計一隻Java程式,輸出結果為以下:數字倒三角
		for (int i = 9; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
//7請設計一隻Java程式,輸出結果為以下:正三角Ａ～Ｆ
		for (int i = 1; i <= 6; i++) {
			switch (i) {
			case 1:
				for (int j = 1; j <= i; j++) {
					System.out.print('A');
				}
				break;
			case 2:
				for (int j = 1; j <= i; j++) {
					System.out.print('B');
				}
				break;
			case 3:
				for (int j = 1; j <= i; j++) {
					System.out.print('C');
				}
				break;
			case 4:
				for (int j = 1; j <= i; j++) {
					System.out.print('D');
				}
				break;
			case 5:
				for (int j = 1; j <= i; j++) {
					System.out.print('E');
				}
				break;
			case 6:
				for (int j = 1; j <= i; j++) {
					System.out.print('F');
				}
				break;
			}
			System.out.println();
		}
	}
}
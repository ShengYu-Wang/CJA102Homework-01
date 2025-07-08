package hw1;

public class hw1 {
	public static void main(String[] arg) {
//github金鑰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
//1請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a = 12;
		int b = 6;
		
		System.out.println(a * b);
		System.out.println(a + b);

////2請設計一隻Java程式,計算200顆蛋共是幾打幾顆?
		int eggs = 200;
		int dozen = 12;
		double howMach = eggs / dozen;
		
		System.out.println(howMach);

//3請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int n = 256559;
		final int SEC_PER_MIN = 60;
		final int MIN_PER_HR = 60;
		final int HR_PER_DAY = 24;
		
		double second = n % SEC_PER_MIN;
		double minute = (n / SEC_PER_MIN) % SEC_PER_MIN;
		double hour = ((n / SEC_PER_MIN) / SEC_PER_MIN) % MIN_PER_HR;
		double day = ((n / SEC_PER_MIN) / SEC_PER_MIN) / MIN_PER_HR;

		System.out.println(day + "天" + hour + "小時" + minute + "分" + second + "秒");

//4請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI = 3.14159265358979;
		int r = 5;
		
		System.out.println("圓周長為:" + 2 * PI * r);
		System.out.println("園面積為:" + PI * (r * r));

//5某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢
		double money = 1_500_000; // 複利合FV = PV本金 * (1 + R利率)^y年
		double r1 = 0.02;
		double rare = (1 + r1) * (1 + r1) * (1 + r1) * (1 + r1) * (1 + r1) * 
				(1 + r1) * (1 + r1) * (1 + r1) * (1 + r1)* (1 + r1);
		
//				System.out.println("本金加利息為:"+money*Math.pow((1+r1),10));
		
		System.out.println("本金加利息為:" + money * rare);

//6請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
		System.out.println(5 + 5);// 資料型態為int+int,因此retrun為10
		System.out.println(5 + '5');// 資料型態為int+Unicode5
		System.out.println(5 + "5");// 資料型態為int+String,因此retrun為55
	}
}
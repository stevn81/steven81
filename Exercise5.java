package javabook1;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length!=1) {
			System.out.println("USAGE: java Exercise");
			System.exit(0);
			
		}
		int money = Integer.parseInt(args[0]);
		
		System.out.println("money="+money);
		
		int[] coinUnit = {500, 100, 50, 10 };
		int[] coin = {5, 5, 5, 5};
		
		for(int i=0; i<coinUnit.length; i++) {
			int coinNum = 0;
			
			coinNum = money/coinUnit[i];
			
			if(coin[i] >= coinNum) {
				coin[i] -= coinNum;
			} else {
				coinNum = coin[i];
				coin[i] = 0;
			}
			money -= coinNum*coinUnit[i];
			System.out.println(coinUnit[i]+"��: "+coinNum);
		}
		
		if(money > 0) {
			System.out.println("�Ž������� �����մϴ�.");
			System.exit(0); // ���α׷��� �����Ѵ�.
			}
			System.out.println("=���� ������ ���� =");
			for(int i=0;i<coinUnit.length;i++) {
				
				System.out.println(coinUnit[i]+"��:" +coin[i]);
				
		}
		

	}

}

package com.gc.lists;


public class CodeChallenge {

	public static void main(String arg[]) {
		int amount = 532;
		countingMoney(amount);
		
	}
	
	public static void countingMoney (int total) {
		
		int [] money = {100, 50, 20 ,5, 1};
		int [] moneyCount = new int [5];
		//goal is to determine least amount of bills to break down $532
		// 5 -$100, 1 - $20, 2 - $5, 2 -$1

		for (int  i = 0; i < money.length; i++) {
			if (total >= money[i]) {
				moneyCount[i] = total/ money[i];
				total = total - moneyCount[i] * money[i];
				
			}
		}
		
		System.out.println("Result");
		for (int i = 0; i < money.length; i++) {
		if (moneyCount[i]!= 0);
		System.out.println(money[i] +":"+ moneyCount[i]);
		}
		
		
	}

}

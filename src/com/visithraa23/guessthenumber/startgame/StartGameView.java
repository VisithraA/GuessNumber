package com.visithraa23.guessthenumber.startgame;

import java.util.Scanner;

public class StartGameView {
	private StartGameViewModel viewModel;

	public StartGameView() {
		viewModel = new StartGameViewModel(this);
	}

	public void startTheGame() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ending range");
		int endRange=sc.nextInt();
		int n=5;
		Boolean check=false;
		for(int i=0;i<5;i++) {
			System.out.println("\nYou have" +n-- +" chances...");
			System.out.println("Enter the Number");
			int enteredNum=sc.nextInt();
			check=viewModel.checkNumber(enteredNum,endRange);
			if(check==true)
				break;
		}
		if(check==false)
			System.out.println("Sorry...Better luck next time");
		
	}

	public void printOutput(String outPut) {
		System.out.println(outPut);
	}
	
	

}

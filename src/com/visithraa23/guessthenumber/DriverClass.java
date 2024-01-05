package com.visithraa23.guessthenumber;

import java.util.Scanner;

import com.visithraa23.guessthenumber.startgame.StartGameView;

public class DriverClass {
	public static void main(String[] args) {
		DriverClass driverClass=new DriverClass();
		driverClass.start();
	}

	private void start() {
		Scanner sc=new Scanner(System.in);
		Boolean condition=true;
		do {
			System.out.println("Enter the Input...\n1.Start\n2.Exit");
				int input=sc.nextInt();
				switch (input) {
				case 1: {
					StartGameView startGameView=new StartGameView();
					startGameView.startTheGame();
					break;
				}
				case 2:
					condition=false;
					break;
				default:
					System.out.println("Enter the Valid Input...");
			}
		} while (condition);
	}
}

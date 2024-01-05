package com.visithraa23.guessthenumber.startgame;

import com.visithraa23.guessthenumber.repository.Repository;

public class StartGameViewModel {

	private StartGameView gameView;
	private Repository repository;

	public StartGameViewModel(StartGameView startGameView) {
		gameView = startGameView;
		repository=Repository.getInstance();
	}

	public Boolean checkNumber(int enteredNum, int endRange) {
		int generateNum=repository.generateNumber(enteredNum,endRange);
		if(enteredNum==generateNum) {
			gameView.printOutput("Your answer is Correct");
			return true;
		}
		else if(enteredNum>generateNum) {
			gameView.printOutput("Your answer is too high");
			return false;
		}
		else  {
			gameView.printOutput("Your answer is too low");
			return false;
		}
		
	}	
	

}

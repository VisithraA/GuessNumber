package com.visithraa23.guessthenumber.repository;

import java.util.Random;

public class Repository {
	private static Repository repository;
	
	public static Repository getInstance() {
		if(repository==null)
			repository=new Repository();
		return repository;
	}

	public int generateNumber(int enteredNum, int endRange) {
		Random random=new Random();
		
		return random.nextInt(endRange)+1;
	}

}

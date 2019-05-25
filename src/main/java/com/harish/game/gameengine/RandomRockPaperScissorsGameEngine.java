package com.harish.game.gameengine;

import java.security.SecureRandom;

/**
 * This is an implementation of {@link RockPaperScissorsGameEngine}. This
 * generates a random computer answers for the game of Rock, paper and Scissors
 * 
 * @author Harish Vashishth
 *
 */
public class RandomRockPaperScissorsGameEngine implements RockPaperScissorsGameEngine {

	private static final SecureRandom random = new SecureRandom();

	@Override
	public RockPaperScissorsEnum generateComputerResponse() {
		int x = random.nextInt(RockPaperScissorsEnum.values().length);
		return RockPaperScissorsEnum.values()[x];
	}

	@Override
	public RockPaperScissorsResult processResultOfGame(RockPaperScissorsEnum userInput,
			RockPaperScissorsEnum computerInput) {
		if (userInput == null || computerInput == null) {
			// throws exception
		}

		RockPaperScissorsResult results = null;

		if (userInput.equals(computerInput)) {
			results = RockPaperScissorsResult.TIE;
		} else if (userInput.beats(computerInput)) {
			results = RockPaperScissorsResult.WIN;
		} else {
			results = RockPaperScissorsResult.LOSE;
		}

		return results;
	}

}

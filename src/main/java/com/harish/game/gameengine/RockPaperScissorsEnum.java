/**
 * 
 */
package com.harish.game.gameengine;

/**
 * This enum contains all the possible values for the Game of Rock, paper and
 * Scissors
 * 
 * @author Harish Vashishth
 *
 */
public enum RockPaperScissorsEnum {

	ROCK {
		@Override
		public boolean beats(RockPaperScissorsEnum other) {
			return other == SCISSORS;
		}
	},
	PAPER {
		@Override
		public boolean beats(RockPaperScissorsEnum other) {
			return other == ROCK;
		}
	},
	SCISSORS {
		@Override
		public boolean beats(RockPaperScissorsEnum other) {
			return other == PAPER;
		}
	};

	/**
	 * This method returns true if the this enum value beats the input Enum value in
	 * the game of Rock, paper and Scissors
	 * 
	 * @param other
	 * @return
	 */
	public abstract boolean beats(RockPaperScissorsEnum other);
}

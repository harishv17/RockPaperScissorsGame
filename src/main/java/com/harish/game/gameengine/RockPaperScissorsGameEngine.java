/**
 * 
 */
package com.harish.game.gameengine;

/**
 * @author Harish Vashishth
 *
 */
public interface RockPaperScissorsGameEngine {

	/**
	 * This method generates the computer response for the Game of Rock,
	 * paper and Scissors
	 * 
	 * @return The enum value of type {@link RockPaperScissorsEnum}, that represents
	 *         the Computer answer
	 */
	public RockPaperScissorsEnum generateComputerResponse();

	/**
	 * This method process the result for the Game of Game of Rock, paper and
	 * Scissors and returns result of game as a type of
	 * {@link RockPaperScissorsResult}. It returns enum value Win if user wins, Lose
	 * if user losses or Tie if its a tie
	 * 
	 * @param userInput     The Enum value of type {@link RockPaperScissorsEnum},
	 *                      that represents the User answer
	 * @param computerInput The Enum value of type {@link RockPaperScissorsEnum},
	 *                      that represents the Computer answer
	 * @return The enum value of type {@link RockPaperScissorsResult}, that
	 *         represents the result of the game.
	 */
	public RockPaperScissorsResult processResultOfGame(RockPaperScissorsEnum userInput,
			RockPaperScissorsEnum computerInput);

}

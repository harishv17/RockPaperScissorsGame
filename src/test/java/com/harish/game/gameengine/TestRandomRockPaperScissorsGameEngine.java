package com.harish.game.gameengine;
import com.harish.game.gameengine.RandomRockPaperScissorsGameEngine;
import com.harish.game.gameengine.RockPaperScissorsEnum;
import com.harish.game.gameengine.RockPaperScissorsGameEngine;
import com.harish.game.gameengine.RockPaperScissorsResult;

import junit.framework.TestCase;

/**
 * @author Harish Vashishrh
 *
 */
public class TestRandomRockPaperScissorsGameEngine extends TestCase {

	private RockPaperScissorsGameEngine randomGameEngine = new RandomRockPaperScissorsGameEngine();

	protected void setUp() throws Exception {
		super.setUp();
	}

	/**
	 * Test method for
	 * {@link com.harish.game.gameengine.RandomRockPaperScissorsGameEngine#generateComputerResponse()}.
	 */
	public void testGenerateComputerResponse() {

		RockPaperScissorsEnum computerResponse = randomGameEngine.generateComputerResponse();
		assertNotNull(computerResponse);
	}

	/**
	 * Test method for
	 * {@link com.harish.game.gameengine.RandomRockPaperScissorsGameEngine#processResultOfGame(com.harish.game.gameengine.RockPaperScissorsEnum, com.harish.game.gameengine.RockPaperScissorsEnum)}.
	 */
	public void testProcessResultOfGame_TieScenario() {

		// tie scenario
		RockPaperScissorsEnum computerResponse = RockPaperScissorsEnum.PAPER;
		RockPaperScissorsEnum userResponse = RockPaperScissorsEnum.PAPER;

		RockPaperScissorsResult gameResult = randomGameEngine.processResultOfGame(userResponse, computerResponse);
		testResult(gameResult, RockPaperScissorsResult.TIE);

		computerResponse = RockPaperScissorsEnum.ROCK;
		userResponse = RockPaperScissorsEnum.ROCK;

		gameResult = randomGameEngine.processResultOfGame(userResponse, computerResponse);
		testResult(gameResult, RockPaperScissorsResult.TIE);

		computerResponse = RockPaperScissorsEnum.SCISSORS;
		userResponse = RockPaperScissorsEnum.SCISSORS;

		gameResult = randomGameEngine.processResultOfGame(userResponse, computerResponse);
		testResult(gameResult, RockPaperScissorsResult.TIE);

	}

	/**
	 * Test method for
	 * {@link com.harish.game.gameengine.RandomRockPaperScissorsGameEngine#processResultOfGame(com.harish.game.gameengine.RockPaperScissorsEnum, com.harish.game.gameengine.RockPaperScissorsEnum)}.
	 */
	public void testProcessResultOfGame_WinScenario() {

		// win scenario
		RockPaperScissorsEnum computerResponse = RockPaperScissorsEnum.ROCK;
		RockPaperScissorsEnum userResponse = RockPaperScissorsEnum.PAPER;

		RockPaperScissorsResult gameResult = randomGameEngine.processResultOfGame(userResponse, computerResponse);
		testResult(gameResult, RockPaperScissorsResult.WIN);

		computerResponse = RockPaperScissorsEnum.PAPER;
		userResponse = RockPaperScissorsEnum.SCISSORS;

		gameResult = randomGameEngine.processResultOfGame(userResponse, computerResponse);
		testResult(gameResult, RockPaperScissorsResult.WIN);

		computerResponse = RockPaperScissorsEnum.SCISSORS;
		userResponse = RockPaperScissorsEnum.ROCK;

		gameResult = randomGameEngine.processResultOfGame(userResponse, computerResponse);
		testResult(gameResult, RockPaperScissorsResult.WIN);

	}

	/**
	 * Test method for
	 * {@link com.harish.game.gameengine.RandomRockPaperScissorsGameEngine#processResultOfGame(com.harish.game.gameengine.RockPaperScissorsEnum, com.harish.game.gameengine.RockPaperScissorsEnum)}.
	 */
	public void testProcessResultOfGame_LoseScenario() {

		// win scenario
		RockPaperScissorsEnum computerResponse = RockPaperScissorsEnum.PAPER;
		RockPaperScissorsEnum userResponse = RockPaperScissorsEnum.ROCK;

		RockPaperScissorsResult gameResult = randomGameEngine.processResultOfGame(userResponse, computerResponse);
		testResult(gameResult, RockPaperScissorsResult.LOSE);

		computerResponse = RockPaperScissorsEnum.SCISSORS;
		userResponse = RockPaperScissorsEnum.PAPER;

		gameResult = randomGameEngine.processResultOfGame(userResponse, computerResponse);
		testResult(gameResult, RockPaperScissorsResult.LOSE);

		computerResponse = RockPaperScissorsEnum.ROCK;
		userResponse = RockPaperScissorsEnum.SCISSORS;

		gameResult = randomGameEngine.processResultOfGame(userResponse, computerResponse);
		testResult(gameResult, RockPaperScissorsResult.LOSE);

	}

	private void testResult(RockPaperScissorsResult gameResult, RockPaperScissorsResult expectedResult) {
		assertNotNull(gameResult);
		assertEquals(expectedResult, gameResult);
	}

}

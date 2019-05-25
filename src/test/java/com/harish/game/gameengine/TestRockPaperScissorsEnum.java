/**
 * 
 */
package com.harish.game.gameengine;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author vashi
 *
 */
public class TestRockPaperScissorsEnum {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for
	 * {@link com.harish.game.gameengine.RockPaperScissorsEnum#beats(com.harish.game.gameengine.RockPaperScissorsEnum)}.
	 */
	
	@Test
	public void testBeats() {
		assertTrue(RockPaperScissorsEnum.ROCK.beats(RockPaperScissorsEnum.SCISSORS));
		assertTrue(RockPaperScissorsEnum.SCISSORS.beats(RockPaperScissorsEnum.PAPER));
		assertTrue(RockPaperScissorsEnum.PAPER.beats(RockPaperScissorsEnum.ROCK));
	}

}

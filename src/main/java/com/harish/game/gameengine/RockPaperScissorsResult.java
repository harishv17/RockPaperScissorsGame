/**
 * 
 */
package com.harish.game.gameengine;

/**
 * This enum contains all the possible results for the Game of Rock, paper and
 * 
 * @author Harish Vashishth
 *
 */
public enum RockPaperScissorsResult {

	WIN("You Win!!"), LOSE("You loose!!"), TIE("Its a tie!!");

	private RockPaperScissorsResult(String resultMessage) {
		this.setResultMessage(resultMessage);
	}

	/**
	 * @return the resultMessage
	 */
	public String getResultMessage() {
		return resultMessage;
	}

	/**
	 * @param resultMessage the resultMessage to set
	 */
	private void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	private String resultMessage;
}

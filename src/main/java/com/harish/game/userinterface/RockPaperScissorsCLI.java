/**
 * 
 */
package com.harish.game.userinterface;

import java.util.Scanner;

import com.harish.game.gameengine.RandomRockPaperScissorsGameEngine;
import com.harish.game.gameengine.RockPaperScissorsEnum;
import com.harish.game.gameengine.RockPaperScissorsGameEngine;
import com.harish.game.gameengine.RockPaperScissorsResult;

/**
 * @author vashi
 *
 */
public class RockPaperScissorsCLI {

	private static RockPaperScissorsGameEngine gameEngine = new RandomRockPaperScissorsGameEngine();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("---------------------------------------------------");
		System.out.println("Rock Paper Scissors Game");
		System.out.println("---------------------------------------------------");
		loop: while (true) {

			showMainMenu();
			String userInput = getUserInputInUpperCase(scan);
			switch (userInput) {
			case "1":
				playGame(scan);
				break;
			case "2":
				System.out.println("See you later!!");
				break loop;
			default:
				System.out.println("\nInvalid input");
				continue;
			}
		}

	}

	private static void playGame(Scanner scan) {

		System.out.println("\nChoose rock, scissors, or paper:");
		String userInput = getUserInputInUpperCase(scan);
		try {
			System.out.println("You choose:" + userInput);
			RockPaperScissorsEnum userValue = RockPaperScissorsEnum.valueOf(userInput);
			RockPaperScissorsEnum computerValue = gameEngine.generateComputerResponse();
			if (computerValue == null) {
				System.out.println("System error");
			} else {
				System.out.println("Computer choose:" + computerValue.toString());
				RockPaperScissorsResult result = gameEngine.processResultOfGame(userValue, computerValue);
				System.out.println("Result of the game:" + result != null ? result.getResultMessage() : "System Error");
			}

		} catch (IllegalArgumentException e) {
			System.out.println("\nInvalid input");
		}
	}

	private static void showMainMenu() {
		System.out.println("--------------------------");
		System.out.println("\nChoose your options:");
		System.out.println("1. Play");
		System.out.println("2. Exit");
		System.out.println("--------------------------");
	}

	private static String getUserInputInUpperCase(Scanner scan) {
		return scan.next().toUpperCase();
	}

}

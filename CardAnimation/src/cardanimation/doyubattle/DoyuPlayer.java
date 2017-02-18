/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package doyubattle;

import java.util.Scanner;

import DoyuInterface.StrategyInterface;

public class DoyuPlayer {
	Scanner sc = new Scanner(System.in);
	StrategyInterface defend = Factory.createObject("Defend");
	StrategyInterface attack = Factory.createObject("Attack");

	DoyuPlayer() {

	}

	public void beginBattle(String strategy) {

		int hand = 5;

		DoyuMoves dm = new DoyuMoves();
		DoyuCard dc = new DoyuCard();
		dm.generateCPUDeck(dc);
		dm.generatePlayerDeck(dc);

		if (strategy == "Attack") {

			for (int i = 0; i < 30; i++) {
				System.out.println("\n" + ".........PLAYER's ATTACK TURN........");
				playerTurn(dc, i, hand);
				hand++;

				System.out.println(".........OPPONENT's DEFEND TURN........");
				cpuTurn(dc, i);
			}
		} else if (strategy == "Defend") {
			for (int i = 0; i < 30; i++) {
				System.out.println("\n" + ".........OPPONENT's ATTACK TURN........");
				cpuTurn(dc, i);

				System.out.println("\n" + ".........PLAYER's DEFEND TURN........");
				playerTurn(dc, i, hand);
				hand++;
			}
		}
	}

	public void playerTurn(DoyuCard dc, int i, int hand) {
		int choice;
		System.out.println("Select the card listed below to Attack..");
		for (int j = 0; j < 5; j++) {
			System.out.print(j + 1 + ")");
			System.out.print(dc.playerdeck[j][0] + " " + dc.playerdeck[j][1]);
			System.out.print("   ");
		}
		choice = sc.nextInt();
		if (choice > hand || choice < 1) {
			System.out.println("Quitting battle");
			System.exit(0);
		}
		dc.setSelectedchoice(choice);
		attack.performStrategy(dc, "cpu"); // Attacking cpu
		defend.performStrategy(dc, "cpu"); // CPU defending

		if (hand < 29) {
			dc.playerdeck[choice - 1][0] = dc.playerdeck[hand + 1][0];
			dc.playerdeck[choice - 1][1] = dc.playerdeck[hand + 1][1];
		}
	}

	public void cpuTurn(DoyuCard dc, int i) {

		String s[][] = dc.getCpudeck();
		System.out.println("Opponent battles with  " + s[i][0] + " " + s[i][1]);
		dc.setCPUSelectedchoice(i + 1);
		attack.performStrategy(dc, "player"); // Attacking player
		defend.performStrategy(dc, "player"); // player defending
	}
}

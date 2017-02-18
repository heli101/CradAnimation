/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package doyubattle;

/**
 *
 * @author karthick
 */
public class DoyuMoves {

	String deck[] = {"Drain", "Attack", "Defense", "Heal", "Damage", "Regeneration", "Paralysis",
			"Drainkarma", "Karma", "Poison", "CurePoison", "Counter", "SpecialAttack", "SpecialDefend",
			"Dispell" };
	int i, j, random, tmp_random, x;
	public String playerdeck[][] = new String[30][2];
	public String cpudeck[][] = new String[30][2];

	public void generateCPUDeck(DoyuCard dc) {
		for (i = 0; i < 30; i++) {
			random = (int) ((Math.random() * 100) % 15);
			tmp_random = (x = (int) ((Math.random() * 100) % 4) * 5) > 0 ? x : 5;
			cpudeck[i][0] = deck[random];
			cpudeck[i][1] = Integer.toString(tmp_random);

		}
		dc.setCpudeck(cpudeck);
	}

	public void generatePlayerDeck(DoyuCard dc) {
		for (i = 0; i < 30; i++) {
			random = (int) ((Math.random() * 100) % 15);
			tmp_random = (x = (int) ((Math.random() * 100) % 4) * 5) > 0 ? x : 5;
			playerdeck[i][0] = deck[random];
			playerdeck[i][1] = Integer.toString(tmp_random);

		}
		dc.setPlayerdeck(playerdeck);
	}

}

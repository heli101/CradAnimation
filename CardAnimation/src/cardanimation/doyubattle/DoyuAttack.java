/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doyubattle;

import DoyuInterface.StrategyInterface;

public class DoyuAttack implements StrategyInterface {

	DoyuAttack() {
	}

	@Override
	public void performStrategy(DoyuCard dc, String target) {

		int health = 0, attack_pt = 0, defend_pt = 0, regeneration_pt = 0, karma_pt = 0, poison_pt = 0, counter_pt = 0,
				sp_attack_pt = 0, sp_defend_pt = 0;

		int target_health = 0, target_attack_pt = 0, target_defend_pt = 0, target_regeneration_pt = 0,
				target_karma_pt = 0, target_poison_pt = 0, target_counter_pt = 0;

		String s[][] = null;
		int tmp_select = 0;

		if (target == "cpu") {
			tmp_select = dc.getSelectedchoice();
			s = dc.getPlayerdeck();

			health = dc.getPlayerhealth();
			attack_pt = dc.player_attack_pt;
			defend_pt = dc.player_defend_pt;
			regeneration_pt = dc.player_regeneration_pt;
			karma_pt = dc.player_karma_pt;
			poison_pt = dc.player_poison_pt;
			counter_pt = dc.player_counter_pt;
			sp_attack_pt = dc.player_SpecialAttack_pt;
			sp_defend_pt = dc.player_SpecialDefend_pt;

			target_health = dc.getCpuhealth();
			target_attack_pt = dc.cpu_attack_pt;
			target_defend_pt = dc.cpu_defend_pt;
			target_regeneration_pt = dc.cpu_regeneration_pt;
			target_karma_pt = dc.cpu_karma_pt;
			target_poison_pt = dc.cpu_poison_pt;
			target_counter_pt = dc.cpu_counter_pt;

		} else if (target == "player") {
			tmp_select = dc.getCPUSelectedchoice();
			s = dc.getCpudeck();

			health = dc.getCpuhealth();
			attack_pt = dc.cpu_attack_pt;
			defend_pt = dc.cpu_defend_pt;
			regeneration_pt = dc.cpu_regeneration_pt;
			karma_pt = dc.cpu_karma_pt;
			poison_pt = dc.cpu_poison_pt;
			counter_pt = dc.cpu_counter_pt;
			sp_attack_pt = dc.cpu_SpecialAttack_pt;
			sp_defend_pt = dc.cpu_SpecialDefend_pt;

			target_health = dc.getPlayerhealth();
			target_attack_pt = dc.player_attack_pt;
			target_defend_pt = dc.player_defend_pt;
			target_regeneration_pt = dc.player_regeneration_pt;
			target_karma_pt = dc.player_karma_pt;
			target_poison_pt = dc.player_poison_pt;
			target_counter_pt = dc.player_counter_pt;

		}

		if (s[tmp_select - 1][0] == "Drain") {
			System.out.println("Draining the opponent by " + Integer.parseInt(s[tmp_select - 1][1]) + " points");
			target_health -= Integer.parseInt(s[tmp_select - 1][1]);
			health += Integer.parseInt(s[tmp_select - 1][1]);

		} else if (s[tmp_select - 1][0] == "Attack") {
			attack_pt = Integer.parseInt(s[tmp_select - 1][1]);
			System.out.println("Increasing the attack level by " + attack_pt + " points in next one Attack");

		} else if (s[tmp_select - 1][0] == "Defense") {
			defend_pt = Integer.parseInt(s[tmp_select - 1][1]);
			System.out
					.println("Decreases the attack level of opponent by " + defend_pt + " points for next one Attack");

		} else if (s[tmp_select - 1][0] == "Heal") {
			health += Integer.parseInt(s[tmp_select - 1][1]);
			System.out.println("Healing by " + Integer.parseInt(s[tmp_select - 1][1]) + " points");

		} else if (s[tmp_select - 1][0] == "Damage") {
			target_health -= (Integer.parseInt(s[tmp_select - 1][1]) + attack_pt + sp_attack_pt);
			System.out.println("Damaging the opponent by " + Integer.parseInt(s[tmp_select - 1][1]) + " points");

		} else if (s[tmp_select - 1][0] == "Regeneration") {
			regeneration_pt = Integer.parseInt(s[tmp_select - 1][1]);
			System.out.println("Regeneration card will give the extra health point every turn");
			System.out.println("Increasing the health points " + regeneration_pt);

		} else if (s[tmp_select - 1][0] == "Paralysis") {
			System.out.println("When you throw this card no any effect will happen");

		} else if (s[tmp_select - 1][0] == "Drainkarma") {
			if (karma_pt < 100) {
				karma_pt += Integer.parseInt(s[tmp_select - 1][1]);
				target_karma_pt -= Integer.parseInt(s[tmp_select - 1][1]);
				System.out.println("Draining the opponent by " + Integer.parseInt(s[tmp_select - 1][1]) + " points");

			} else {
				System.out.println("Generate new card");
				karma_pt -= (100 - Integer.parseInt(s[tmp_select - 1][1]));
				target_karma_pt -= Integer.parseInt(s[tmp_select - 1][1]);
			}

		} else if (s[tmp_select - 1][0] == "Karma") {
			if (karma_pt < 100) {
				karma_pt += Integer.parseInt(s[tmp_select - 1][1]);
				System.out.println("Increase karma point");

			} else {
				System.out.println("Generate new card");
				karma_pt -= (100 - Integer.parseInt(s[tmp_select - 1][1]));

			}

		} else if (s[tmp_select - 1][0] == "Poison") {
			target_poison_pt = Integer.parseInt(s[tmp_select - 1][1]);
			System.out.println("Poisoning the opponent by" + Integer.parseInt(s[tmp_select - 1][1]) + " points");

		} else if (s[tmp_select - 1][0] == "CurePoison") {
			poison_pt = 0;
			System.out.println("Curing the poison");

		} else if (s[tmp_select - 1][0] == "Counter") {
			counter_pt = Integer.parseInt(s[tmp_select - 1][1]);
			System.out.println("Apply counter attack level by " + counter_pt + " points");

		} else if (s[tmp_select - 1][0] == "SpecialAttack") {
			sp_attack_pt = Integer.parseInt(s[tmp_select - 1][1]);
			System.out.println(
					"Increasing pernamently the attack level by " + sp_attack_pt + " points in next one Attack");

		} else if (s[tmp_select - 1][0] == "SpecialDefend") {
			sp_defend_pt = Integer.parseInt(s[tmp_select - 1][1]);
			System.out.println("Decreases pernamently the attack level of opponent by "
					+ Integer.parseInt(s[tmp_select - 1][1]) + " points for next one Attack");

		} else if (s[tmp_select - 1][0] == "Dispell") {
			target_counter_pt = 0;
			target_attack_pt = 0;
			target_defend_pt = 0;
			target_regeneration_pt = 0;
			System.out.println("Erase all non-pernament positive effect of player");

		}

		if (target == "cpu") {

			dc.setPlayerhealth(health);
			dc.player_attack_pt = attack_pt;
			dc.player_defend_pt = defend_pt;
			dc.player_regeneration_pt = regeneration_pt;
			dc.player_karma_pt = karma_pt;
			dc.player_poison_pt = poison_pt;
			dc.player_counter_pt = counter_pt;
			dc.player_SpecialAttack_pt = sp_attack_pt;
			dc.player_SpecialDefend_pt = sp_defend_pt;

			dc.setCpuhealth(target_health);
			dc.cpu_attack_pt = target_attack_pt;
			dc.cpu_defend_pt = target_defend_pt;
			dc.cpu_regeneration_pt = target_regeneration_pt;
			dc.cpu_karma_pt = target_karma_pt;
			dc.cpu_poison_pt = target_poison_pt;
			dc.cpu_counter_pt = target_counter_pt;

		} else if (target == "player") {

			dc.setCpuhealth(health);
			dc.cpu_attack_pt = attack_pt;
			dc.cpu_defend_pt = defend_pt;
			dc.cpu_regeneration_pt = regeneration_pt;
			dc.cpu_karma_pt = karma_pt;
			dc.cpu_poison_pt = poison_pt;
			dc.cpu_counter_pt = counter_pt;
			dc.cpu_SpecialAttack_pt = sp_attack_pt;
			dc.cpu_SpecialDefend_pt = sp_defend_pt;

			dc.setPlayerhealth(target_health);
			dc.player_attack_pt = target_attack_pt;
			dc.player_defend_pt = target_defend_pt;
			dc.player_regeneration_pt = target_regeneration_pt;
			dc.player_karma_pt = target_karma_pt;
			dc.player_poison_pt = target_poison_pt;
			dc.player_counter_pt = target_counter_pt;

		}
	}
}

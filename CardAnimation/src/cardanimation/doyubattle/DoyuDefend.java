package doyubattle;

import DoyuInterface.StrategyInterface;

public class DoyuDefend implements StrategyInterface {

	DoyuDefend() {

	}

	@Override
	public void performStrategy(DoyuCard dc, String target) {

		int health = 0, defend_pt = 0, sp_defend_pt = 0, counter_pt = 0;

		int opp_health = 0;
		
		String s[][] = null;
		int tmp_select = 0;

		if (target == "cpu") {
			tmp_select = dc.getSelectedchoice();
			s = dc.getPlayerdeck();

			health = dc.getCpuhealth();
			defend_pt = dc.cpu_defend_pt;
			sp_defend_pt = dc.cpu_SpecialDefend_pt;
			counter_pt = dc.cpu_counter_pt;
			
			opp_health = dc.getPlayerhealth();

		} else if (target == "player") {
			tmp_select = dc.getCPUSelectedchoice();
			s = dc.getCpudeck();

			health = dc.getPlayerhealth();
			defend_pt = dc.player_defend_pt;
			sp_defend_pt = dc.player_SpecialDefend_pt;
			counter_pt = dc.player_counter_pt;
			
			opp_health = dc.getCpuhealth();
			
		}

		if (s[tmp_select - 1][0] == "Damage") {
			health += (defend_pt + sp_defend_pt);
			opp_health -= counter_pt;
			
			System.out.println("Defending the opponent's attack");
		}
		
		if (target == "cpu") {
			dc.setCpuhealth(health);
			dc.setPlayerhealth(opp_health);
			
		} else if (target == "player") {
			dc.setPlayerhealth(health);
			dc.setCpuhealth(opp_health);
		}

		dc.setCpuhealth(dc.getCpuhealth() + dc.cpu_regeneration_pt - dc.cpu_poison_pt);
		dc.setPlayerhealth(dc.getPlayerhealth() + dc.player_regeneration_pt - dc.player_poison_pt);
		
		System.out.println(
				"Player-Current Health:--> " + dc.getPlayerhealth() + "  CPU-Current Health:--> " + dc.getCpuhealth());
		if (dc.getCpuhealth() <= 0) {
			System.out.println("CONGRATS..GAME OVER...YOU WON!!!");
			System.exit(0);
		}

		if (dc.getPlayerhealth() <= 0) {
			System.out.println("SORRY..GAME OVER...YOU LOST!!!");
			System.exit(0);
		}
	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package doyubattle;


public class DoyuCard extends DoyuMoves {
	private int selectedchoice;
	private int CPUselectedchoice;
	int playerhealth = 100, cpuhealth = 100, playerkarma = 0, cpukarma = 0;

	int player_attack_pt = 0, player_defend_pt = 0, player_regeneration_pt = 0, player_karma_pt = 0,
			player_counter_pt = 0, player_SpecialAttack_pt = 0, player_SpecialDefend_pt = 0, player_poison_pt = 0;

	int cpu_attack_pt = 0, cpu_defend_pt = 0, cpu_regeneration_pt = 0, cpu_karma_pt = 0, cpu_counter_pt = 0,
			cpu_SpecialAttack_pt = 0, cpu_SpecialDefend_pt = 0, cpu_poison_pt = 0;
	
	public int getPlayerkarma() {
		return playerkarma;
	}

	public void setPlayerkarma(int playerkarma) {
		this.playerkarma = playerkarma;
	}

	public int getCpukarma() {
		return cpukarma;
	}

	public void setCpukarma(int cpukarma) {
		this.cpukarma = cpukarma;
	}

	public int getSelectedchoice() {
		return selectedchoice;
	}

	public void setSelectedchoice(int selectedchoice) {
		this.selectedchoice = selectedchoice;
	}

	public int getCPUSelectedchoice() {
		return CPUselectedchoice;
	}

	public void setCPUSelectedchoice(int selectedchoice) {
		this.CPUselectedchoice = selectedchoice;
	}

	public String[][] getPlayerdeck() {
		return playerdeck;
	}

	public void setPlayerdeck(String[][] playerdeck) {
		this.playerdeck = playerdeck;
	}

	public String[][] getCpudeck() {
		return cpudeck;
	}

	public void setCpudeck(String[][] cpudeck) {
		this.cpudeck = cpudeck;
	}

	public int getPlayerhealth() {
		return playerhealth;
	}

	public void setPlayerhealth(int playerhealth) {
		this.playerhealth = playerhealth;
	}

	public int getCpuhealth() {
		return cpuhealth;
	}

	public void setCpuhealth(int cpuhealth) {
		this.cpuhealth = cpuhealth;
	}

}

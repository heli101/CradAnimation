/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package doyubattle;

import java.util.Scanner;

/**
 *
 * @author karthick
 */
public class DoyuDriver {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		int choice, strategy;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Shall we begin/quit the battle(Enter the number): 1)Begin   2)Quit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Please select your Strategy: 1)Attack   2)Defend");
				strategy = sc.nextInt();
				if (strategy == 1) {
					System.out.println("You opted to  ATTACK in battle!!Get Ready");
					DoyuPlayer dp = new DoyuPlayer();
					dp.beginBattle("Attack");
				} else if (strategy == 2) {
					System.out.println("You opted to DEFEND in battle!!Get Ready!!");
					DoyuPlayer dp = new DoyuPlayer();
					dp.beginBattle("Defend");
				} else {
					System.out.println("Invalid option..Please Try Again..");
					break;
				}
				break;
			case 2:
				System.out.println("Quitting battle");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid option entered..Please try again..");
			}
		}
	}
}

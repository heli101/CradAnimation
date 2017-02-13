/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardanimation;


import java.util.Scanner;

/**
 *
 * @author heli1
 */
public class CardPlayer {
    int cntr=5;
  CardPlayer(){
    
    beginBattle();
    }
  Card c=new Card();
  
  public void beginBattle()
  {  
  Scanner sc=new Scanner(System.in);
  int choice;
  System.out.println("Ready to Battle...");
  System.out.println("You are gonna play in Attack mode and CPU will defense your Attack..");
  CardAttack ca=new CardAttack();
  ca.genDeck(c);
  String s[][]=c.getCurrentplayerdeck();
  
  System.out.println("Select the card listed below to Attack..");
  for(int k=0;k<25;k++)
  {
      if(c.getCpulife()<=0)
      {
          System.out.println("CONGRATS..GAME OVER...YOU WON!!!");
          break;
      }
      else if(c.getPlayerlife()<=0)
      {
          System.out.println("HaHa!! YOU ARE DEAD..BETTER LUCK NEXT TIME!!!");
          break;
      }
  for(int i=0;i<5;i++)
  {
      System.out.print(i+1+")");
      for(int j=0;j<3;j++)
      {
          System.out.print(s[i][j]+" ");
      }
      System.out.print("   ");
  }
  choice=sc.nextInt();
  c.setSelectedchoice(choice);
  ca.applyPlayerAttack(c);
  ca.applyCPUAttack(c,k);
  if(cntr<29)
  {
  s[choice-1][0]=s[cntr++][0];
  s[choice-1][1]=s[cntr][1];
  }
  }
  
      System.out.println("Sorry!!You ran out of battle card");
      if(c.getCpulife()>c.getPlayerlife()){
          System.out.println("HaHa!! YOU ARE DEAD..BETTER LUCK NEXT TIME!!!");
       }else{
          System.out.println("CONGRATS..GAME OVER...YOU WON!!!");
      }
 
  System.out.println();
  }
  
  }

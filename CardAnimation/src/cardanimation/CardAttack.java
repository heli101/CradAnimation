/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardanimation;

/**
 *
 * @author heli1
 */
public class CardAttack extends CardMove
{
     int player_attack_pt=0 , cpu_attack_pt=0;
     String deck[]={"Alchohol","blugerees","sport","music","restaurant"};
    int i,j;
    CardMove cm=new CardMove();

    public void genDeck(Card c) 
    {
      CardMove cm=new CardMove(c);
      cm.generateCPUDeck();
      cm.generatePlayerDeck();
     cm.genCurrentCpuDeck();
      cm.genCurrentPlayerDeck();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void applyPlayerAttack(Card c) 
    {
       
        int tmp_select=c.selectedchoice;
        int tmp1_select = c.selectedchoice;
        
        System.out.println(tmp_select);
        String s[][]=c.getCurrentplayerdeck();
        String s1[][]=c.getCurrentcpudeck();
        System.out.println(s[tmp_select-1][0]+" "+s[tmp_select-1][1]+" "+s[tmp_select-1][2]);
        System.out.println(s1[tmp_select-1][0]+" "+s1[tmp_select-1][1]+ " "+s1[tmp_select][2]);
        int random=(int) ((Math.random()*100)%5);
        if(c.getCpulife()<=0)
        {
            System.out.println("CONGRATS..GAME OVER...YOU WON!!!");
        }
        else if(s[tmp_select-1][0].equals(deck[random]))
        {
            if(s[tmp_select-1][1] == s1[tmp_select-1][2])
            {
                System.out.println("oppnent card will be kill by player");
            }
            else
            {
            System.out.println("draining the opponent's life" + (Integer.parseInt(s[tmp_select-1][1])+player_attack_pt)+" points");
              
            c.setCpulife(c.getCpulife()-(Integer.parseInt(s[tmp_select-1][1])+player_attack_pt));
            }
        }
        else{
                random=(int) ((Math.random()*100)%5);
                int temp =(int) ((Math.random()*100)%5);
        
         if(s[tmp_select-1][1].equals(deck[random]) && s[tmp1_select-1][1].equals(temp))
        {
            Card cr = new Card();
            System.out.println("generate new deck" + c.playerdeck);
            if(s[tmp_select-1][1] == s1[tmp_select-1][2])
            {
                System.out.println("oppnent card will be kill by player");
            }
            else
            {
            System.out.println("draining the opponent's life" + (Integer.parseInt(s[tmp_select-1][1])+player_attack_pt)+" points");
              
            c.setCpulife(c.getCpulife()-(Integer.parseInt(s[tmp_select-1][1])+player_attack_pt));
            }
        }
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void applyCPUAttack(Card c, int k) 
    {
       // int tmp_select=c.selectedchoice;
        
       
        String cpu[][]=c.getCurrentcpudeck();
        String player[][]=c.getCurrentplayerdeck();
        System.out.println(cpu[k][0]+" "+cpu[k][1]+" "+cpu[k][2]);
        System.out.println(player[k][0]+" "+player[k][1]+ " "+player[k][2]);
        if(c.getPlayerlife()<=0)
        {
            System.out.println("CONGRATS..GAME OVER...YOU WON!!!");
        }
        else if(cpu[k][0].equals(deck[random]))
        {
            if(cpu[k][1] == player[k][2])
            {
                System.out.println("oppnent card will be kill by player");
            }
            else
            {
            System.out.println("draining the opponent's life" + (Integer.parseInt(cpu[k-1][1])+player_attack_pt)+" points");
              
            c.setCpulife(c.getCpulife()-(Integer.parseInt(cpu[k][1])+player_attack_pt));
            }
        }
        else {
            random=(int) ((Math.random()*100)%5);
                int temp =(int) ((Math.random()*100)%5);
            
        
            if(cpu[k][1].equals(deck[random]) && cpu[k][1].equals(temp))
        {
            System.out.println("generate new deck" + c.cpudeck);
            if(cpu[k][1] == player[k][2])
            {
                System.out.println("oppnent card will be kill by player");
            }
            else
            {
            System.out.println("draining the opponent's life" + (Integer.parseInt(cpu[k][1])+player_attack_pt)+" points");
              
            c.setCpulife(c.getCpulife()-(Integer.parseInt(cpu[k][1])+player_attack_pt));
            }
        }
        }
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       
    
}

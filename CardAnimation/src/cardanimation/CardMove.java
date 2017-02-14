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
public class CardMove implements CardStrategy
{
    Card c;
    int i,j,random,tmp_random,x,tmp1_random;
    public String cpudeck[][]=new String[25][3];
    public String playerdeck[][]=new String[25][3];
    public String currentplayerdeck[][]=new String[25][3];
    public String currentcpudeck[][]=new String[25][3];
    public CardMove() 
    {
        
    }
    CardMove(Card c)
    {
       this.c=c;
       this.c.cpulife=cpulife;
       this.c.playerlife=playerlife;
    }

    @Override
    public void generatePlayerDeck() 
    {
        for(i=0;i<25;i++)
        {
          
        random=(int) ((Math.random()*100)%5);
        tmp_random=(x=(int) ((Math.random()*100)%4)*4)>0?x:2;
        tmp1_random=(x=(int) ((Math.random()*100)%4)*5)>0?x:3;
        playerdeck[i][0]=deck[random];
        playerdeck[i][1]=Integer.toString(tmp_random); // as hammer
        playerdeck[i][2]=Integer.toString(tmp1_random); // as life
        System.out.println(playerdeck[i][0]+" "+playerdeck[i][1]+ " " + playerdeck[i][2]);
        }
       
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void generateCPUDeck() 
    {
        for(i=0;i<25;i++)
        {
          
         random=(int) ((Math.random()*100)%5);
        tmp_random=(x=(int) ((Math.random()*100)%2)*4)>0?x:2;
        tmp1_random=(x=(int) ((Math.random()*100)%3)*5)>0?x:3;
        cpudeck[i][0]=deck[random];
        cpudeck[i][1]=Integer.toString(tmp_random);
        cpudeck[i][2]=Integer.toString(tmp1_random);
        System.out.println(cpudeck[i][0]+" "+cpudeck[i][1]+" "+cpudeck[i][2]);
        }
        c.setCurrentcpudeck(cpudeck);
    }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    public void genCurrentPlayerDeck()
    {
         System.out.println("CurrentPlayerDeck:");
      for(i=0;i<25;i++)
      {
          for(j=0;j<3;j++)
      {             
          currentplayerdeck[i][j]=playerdeck[i][j];
          System.out.print(currentplayerdeck[i][j]+" ");
      }  
          System.out.println();
      }
     
      c.setCurrentplayerdeck(currentplayerdeck);
    }
    public void genCurrentCpuDeck(){
        System.out.println("CurrentCPUDeck:");
      for(i=0;i<5;i++)
      {
          for(j=0;j<3;j++)
          {             
          currentcpudeck[i][j]=cpudeck[i][j];
          System.out.print(currentcpudeck[i][j]);
      }  
         System.out.println(); 
      }
    }
    
}

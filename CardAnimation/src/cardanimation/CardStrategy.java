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
public interface CardStrategy 
{
     public int cpulife=30;
  public int playerlife=30;
  String deck[]={"Alchohol","blugerees","sport","music","restaurant"};
  public void generatePlayerDeck();
  public void generateCPUDeck();
}

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
public class Card extends CardMove
{
    public int cpulife;
    public int playerlife;
    int selectedchoice;
    
    public Card() 
    {
     String currentplayerdeck[][]=new String[5][3];
     String currentcpudeck[][]=new String[5][3];
    }

    public int getCpulife() {
        return cpulife;
    }

    public void setCpulife(int cpulife) {
        this.cpulife = cpulife;
    }

    public int getPlayerlife() {
        return playerlife;
    }

    public void setPlayerlife(int playerlife) {
        this.playerlife = playerlife;
    }

    public int getSelectedchoice() {
        return selectedchoice;
    }

    public void setSelectedchoice(int selectedchoice) {
        this.selectedchoice = selectedchoice;
    }

    public String[][] getCurrentplayerdeck() {
        return currentplayerdeck;
    }

    public void setCurrentplayerdeck(String[][] currentplayerdeck) {
        this.currentplayerdeck = currentplayerdeck;
    }

    public String[][] getCurrentcpudeck() {
        return currentcpudeck;
    }

    public void setCurrentcpudeck(String[][] currentcpudeck) {
        this.currentcpudeck = currentcpudeck;
    }

    
    
   
    
}

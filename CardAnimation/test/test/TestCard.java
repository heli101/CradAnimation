/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import cardanimation.CardAttack;
import cardanimation.CardMove;
import cardanimation.CardPlayer;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 *
 * @author heli1
 */
public class TestCard extends TestCase
{
    //Declaring object for testing
    protected CardMove move1 , move2;
    protected CardAttack attack1 , attack2;
    protected CardPlayer player1 , player2;
    
    protected void setUp()
    {
        player1 = new CardPlayer();
    }
    /**
     * Overridden TestCase Method. 
     * @return
     */
    public static Test suite() {
        return new TestSuite(TestCard.class);
    }
    public static void main(String[] args)
    {
        junit.textui.TestRunner.run(suite());
    }
    
     public void testGroupScale() {
         player1.beginBattle();
     }
     
}

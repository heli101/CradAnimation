/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package doyubattle;

import DoyuInterface.StrategyInterface;

/**
 *
 * @author karthick
 */
public class Factory {
    public static StrategyInterface createObject(String type){
        if(type=="Attack"){
        return new DoyuAttack(); 
        }
        else if(type=="Defend"){
            return new DoyuDefend();
        }
        return null;
    }

}

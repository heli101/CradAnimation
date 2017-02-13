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
public class CardAnimation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
        // TODO code application logic here
         int choice;
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("Shall we begin/quit the battle(Enter the number): 1)Begin   2)Quit");
        choice=sc.nextInt();
        switch(choice){
            case 1 : System.out.println("You opted to battle..Get Ready!!");
                    CardPlayer p=new CardPlayer();
                     break;
            case 2 : System.out.println("Quitting battle");System.exit(1);
                     break;
            default: System.out.println("Invalid option entered..Please try again.."); 
        }
        }
    }
    }
    


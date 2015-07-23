/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.SolarTrails.view;

import byui.cit260.SolarTrails.control.GameControl;
import byui.cit260.SolarTrails.control.MapControl;
import byui.cit260.SolarTrails.model.Discovery;
import byui.cit260.SolarTrails.model.Ship;
import static java.lang.System.in;
import java.lang.reflect.Array;
import java.util.Scanner;
import solartrails.SolarTrails;

/**
 *
 * @author jeff
 */
public class TravelMenuView extends View{
    
    public TravelMenuView(){
    super( "\n"
            + "\n------------------------------------"
            + "\n  Where would you like to Travel to?"
            + "\n------------------------------------"
            + "\n| Ship Menu                        |"
            + "\n------------------------------------"
            + "\nF - place one"
            + "\nD - place two"
            + "\nA - place three"
            + "\nQ - Quit"
            + "\n------------------------------------");
    }
    
    @Override
    public boolean doAction(Object obj) {
        
        
        
        return false;
    }
    private int getRow() {
      int row;
 
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a row");
      row = in.nextInt();
      
        return row;
   
   }
    private int getColumn() {
      int column;
 
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a column");
      column = in.nextInt();
      
        return column;
   
   }

    private void displayLocationMenu() {
        System.out.println("*** displayLocationMenu function called ***");
    }

    private void displayTimeLapsed() {
     System.out.println("*** displayLocationMenu function called ***");    
    }
}
    

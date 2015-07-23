/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solartrails;


import byui.cit260.SolarTrails.model.Player;
import byui.cit260.SolarTrails.model.Ship;
import byui.cit260.SolarTrails.model.Falcon;
import byui.cit260.SolarTrails.model.Discovery;
import byui.cit260.SolarTrails.model.Daedalus;
import byui.cit260.SolarTrails.model.Crew;
import byui.cit260.SolarTrails.model.Actor;
import byui.cit260.SolarTrails.model.CrewMember;
import byui.cit260.SolarTrails.model.Engineer;
import byui.cit260.SolarTrails.model.HarvestFuel;
import byui.cit260.SolarTrails.model.Hunt;
import byui.cit260.SolarTrails.model.Yeoman;
import byui.cit260.SolarTrails.model.Inventory;
import byui.cit260.SolarTrails.model.Map;
import byui.cit260.SolarTrails.model.Location;
import byui.cit260.SolarTrails.model.ObjectScene;
import byui.cit260.SolarTrails.model.OpenSpaceScene;
import byui.cit260.SolarTrails.model.PlanetScene;
import byui.cit260.SolarTrails.model.RandomEvent;
import byui.cit260.SolarTrails.model.RepairShip;
import byui.cit260.SolarTrails.model.ResearchObject;
import byui.cit260.SolarTrails.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author jeff
 */
public class SolarTrails {

    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            SolarTrails.inFile = 
                    new BufferedReader (new InputStreamReader(System.in));
            SolarTrails.outFile = new PrintWriter (System.out, true);
            
            StartProgramView.startProgramView = new StartProgramView();
            
            
            try {
                //open log file
                String filePath = "log.txt";
                SolarTrails.logFile = new PrintWriter(filePath);
            } catch (Throwable e) {
                System.out.println("exception: " + e.toString() +
                               "\nCause: " + e.getCause() +
                               "\nMessage: " + e.getMessage());
            }
            
            // create StartProgram View
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.startProgram();
            return;
        } catch (Throwable e) {
            System.out.println("exception: " + e.toString() +
                               "\nCause: " + e.getCause() +
                               "\nMessage: " + e.getMessage());
        
            e.printStackTrace();;
        }
        finally {
            try {
                if (SolarTrails.inFile !=null)
                    SolarTrails.inFile.close();
                
                if (SolarTrails.outFile !=null)
                    SolarTrails.inFile.close();
                
                if (SolarTrails.logFile !=null)
                    SolarTrails.logFile.close();
                
            } catch (IOException ex) {
               System.out.println("errors closing files");
               return;
            }
        }
        
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        SolarTrails.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        SolarTrails.player = player;
    }
    public static PrintWriter getOutFile() {
        return outFile;
    }
    public static void setOutFile (PrintWriter outFile) {
        SolarTrails.outFile = outFile;
    }
    public static BufferedReader getInFile() {
        return inFile;
    }
    public static void setInFile (BufferedReader inFile) {
        SolarTrails.inFile = inFile;
    }
    public static PrintWriter getLogFile () {
        return logFile;
    }
    public static void setLogFile (PrintWriter logFile) {
        SolarTrails.logFile = logFile;
    }
    
}

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
import byui.cit260.SolarTrails.model.Yeoman;

/**
 *
 * @author jeff
 */
public class SolarTrails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Player call test
        Player playerOne = new Player();
        
        playerOne.setName("Mr. Davis");
        playerOne.setHighScore(1200.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //ship call test
        
        Ship shipOne = new Ship();
        shipOne.setName("Falcon");
        shipOne.setDescription("this is a test description");
        shipOne.setMinCrew(1);
        shipOne.setMaxCrew(4);
        shipOne.setCargoCapacity(344.0);
        shipOne.setSpeed(3000000.0);
        
        
        String shipInfo = shipOne.toString();
        System.out.println(shipInfo);
        
        //falcon
        Falcon falconOne = new Falcon();
        falconOne.setName("ship name");
        falconOne.setDescription("this is a test description");
        falconOne.setCargoCapacity(33444.0);
        falconOne.setSpeed(300340000.0);
        
        
        String falconInfo = falconOne.toString();
        System.out.println(falconInfo);
        
        //Discovery
        Discovery discoveryOne = new Discovery();
        discoveryOne.setName("ship name");
        discoveryOne.setDescription("this is a test description");
        discoveryOne.setCargoCapacity(33444.0);
        discoveryOne.setSpeed(3003.0);
        
        
        String discoveryInfo = discoveryOne.toString();
        System.out.println(discoveryInfo);
        
         //Daedalus
        Daedalus daedalusOne = new Daedalus();
        daedalusOne.setName("ship name");
        daedalusOne.setDescription("this is a test description");
        daedalusOne.setCargoCapacity(33444.0);
        daedalusOne.setSpeed(3003.0);
        
        
        String daedalusInfo = daedalusOne.toString();
        System.out.println(daedalusInfo);
        
        //crew
        Crew crewOne = new Crew();
        crewOne.setCrewSize(20);
        crewOne.setCrewComposition(33444.0);
        
        
        String crewInfo = crewOne.toString();
        System.out.println(crewInfo);
        
        //actor
        Actor actorOne = new Actor();
        actorOne.setName("this is my name");
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
        
        //CrewMember
        CrewMember crewMemberOne = new CrewMember();
        crewMemberOne.setName("this is my name");
        crewMemberOne.setSpecialization("this is my name");
        
        String crewMemberInfo = crewMemberOne.toString();
        System.out.println(crewMemberInfo);
        
        //Engineer
        Engineer engineerOne = new Engineer();
        engineerOne.setName("this is my name");
        engineerOne.setDescription("this is my name");
        engineerOne.setAttributes("this is my name");
        
        
        String engineerInfo = engineerOne.toString();
        System.out.println(engineerInfo);
        
        //yeoman
        Yeoman yeomanOne = new Yeoman();
        yeomanOne.setName("this is my name");
        yeomanOne.setDescription("this is my name");
        yeomanOne.setAttributes("this is my name");
        
        
        String yeomanInfo = yeomanOne.toString();
        System.out.println(yeomanInfo);
        
        
    }
    
}

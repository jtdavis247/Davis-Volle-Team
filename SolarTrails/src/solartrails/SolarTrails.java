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

/**
 *
 * @author jeff
 */
public class SolarTrails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Player
        Player playerOne = new Player();
        
        playerOne.setName("Mr. Davis");
        playerOne.setHighScore(1200.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        // Ship
        Ship shipOne = new Ship();
        
        shipOne.setName("Falcon");
        shipOne.setDescription("this is a test description");
        shipOne.setMinCrew(1);
        shipOne.setMaxCrew(4);
        shipOne.setCargoCapacity(344.0);
        shipOne.setSpeed(3000000.0);
        
        String shipInfo = shipOne.toString();
        System.out.println(shipInfo);
        
        // Falcon
        Falcon falconOne = new Falcon();
        
        falconOne.setName("ship name");
        falconOne.setDescription("this is a test description");
        falconOne.setCargoCapacity(33444.0);
        falconOne.setSpeed(300340000.0);
        
        String falconInfo = falconOne.toString();
        System.out.println(falconInfo);
        
        // Discovery
        Discovery discoveryOne = new Discovery();
        
        discoveryOne.setName("ship name");
        discoveryOne.setDescription("this is a test description");
        discoveryOne.setCargoCapacity(33444.0);
        discoveryOne.setSpeed(3003.0);
        
        String discoveryInfo = discoveryOne.toString();
        System.out.println(discoveryInfo);
        
        // Daedalus
        Daedalus daedalusOne = new Daedalus();
        
        daedalusOne.setName("ship name");
        daedalusOne.setDescription("this is a test description");
        daedalusOne.setCargoCapacity(33444.0);
        daedalusOne.setSpeed(3003.0);
        
        String daedalusInfo = daedalusOne.toString();
        System.out.println(daedalusInfo);
        
        // Crew
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
        
        // CrewMember
        CrewMember crewMemberOne = new CrewMember();
        
        crewMemberOne.setName("this is my name");
        crewMemberOne.setSpecialization("this is my name");
        
        String crewMemberInfo = crewMemberOne.toString();
        System.out.println(crewMemberInfo);
        
        // Engineer
        Engineer engineerOne = new Engineer();
        
        engineerOne.setName("this is my name");
        engineerOne.setDescription("this is my name");
        engineerOne.setAttributes("this is my name");
        
        String engineerInfo = engineerOne.toString();
        System.out.println(engineerInfo);
        
        // Yeoman
        Yeoman yeomanOne = new Yeoman();
        
        yeomanOne.setName("this is my name");
        yeomanOne.setDescription("this is my name");
        yeomanOne.setAttributes("this is my name");
        
        String yeomanInfo = yeomanOne.toString();
        System.out.println(yeomanInfo);
        
        // Inventory
        Inventory inventoryOne = new Inventory();
        
        inventoryOne.setInventoryType("Food");
        inventoryOne.setTypeQuantity(32);
        
        String inventoryInfo = inventoryOne.toString();
        System.out.println(inventoryInfo);
        
        // Map
        Map mapOne = new Map();
        
        mapOne.setRowCount(5);
        mapOne.setColumnCount(5);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        // Location
        Location locationOne = new Location();
        
        locationOne.setColumn(1);
        locationOne.setRow(2);
        locationOne.setVisited(true);
        locationOne.setEvent("Random Event");
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        // Planet Scene
        PlanetScene planetSceneOne = new PlanetScene();
        
        planetSceneOne.setDescription("This is a planet");
        planetSceneOne.setTravelTime(12);
        planetSceneOne.setSymbol("Pl");
        planetSceneOne.setAvailableActions("Actions");
        
        String planetSceneInfo = planetSceneOne.toString();
        System.out.println(planetSceneInfo);
        
        // Object Scene
        ObjectScene objectSceneOne = new ObjectScene();
        
        objectSceneOne.setDescription("This is the object");
        objectSceneOne.setTravelTime(11);
        objectSceneOne.setSymbol("Ob");
        objectSceneOne.setAvailableActions("Actions");
        
        String objectSceneInfo = objectSceneOne.toString();
        System.out.println(objectSceneInfo);
        
        // Open Space Scene
        OpenSpaceScene openSpaceSceneOne = new OpenSpaceScene();
        
        openSpaceSceneOne.setDescription("Space!");
        openSpaceSceneOne.setTravelTime(10);
        openSpaceSceneOne.setAvailableActions("Actions");
        
        String openSpaceSceneInfo = openSpaceSceneOne.toString();
        System.out.println(openSpaceSceneInfo);
        
        // Hunt
        Hunt huntOne = new Hunt();
        
        huntOne.setDescription("Hunt");
        huntOne.setFoodAvailable(32);
        huntOne.setWaterAvailable(40);
        
        String huntInfo = huntOne.toString();
        System.out.println(huntInfo);
        
        // Harvest Fuel
        HarvestFuel harvestFuelOne = new HarvestFuel();
        
        harvestFuelOne.setDescription("Harvest Fuel");
        harvestFuelOne.setFuelAvailable(12);
        
        String harvestFuelInfo = harvestFuelOne.toString();
        System.out.println(harvestFuelInfo);
        
        // Research Object
        ResearchObject researchObjectOne = new ResearchObject();
        
        researchObjectOne.setDescription("Research Object");
        researchObjectOne.setInfoLearned(3);
        
        String researchObjectInfo = researchObjectOne.toString();
        System.out.println(researchObjectInfo);
        
        // Random Event
        RandomEvent randomEventOne = new RandomEvent();
        
        randomEventOne.setDescription("Random Event");
        randomEventOne.setEffects("Effects");
        
        String randomEventInfo = randomEventOne.toString();
        System.out.println(randomEventInfo);
        
        // Repair Ship
        RepairShip repairShipOne = new RepairShip();
        
        repairShipOne.setDamage(12);
        repairShipOne.setAmountRepaired(8);
        
        String repairShipInfo = repairShipOne.toString();
        System.out.println(repairShipInfo);
    }
    
}

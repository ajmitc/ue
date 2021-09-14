package ue.game;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Game{
    public static final int MAX_GODS_HAND_USES = 6;
    public static final int MAX_HITPOINTS = 6;
    public static final int MAX_STORE = 4;

    private Phase phase;
    private PhaseStep phaseStep;

    private Action userAction;
    private LocationName searchLocation;

    private TimeTrack timeTrack = new TimeTrack();
    private int godsHandUsesLeft = MAX_GODS_HAND_USES;

    private int hitpoints = MAX_HITPOINTS;

    private Map<Component, Integer> stores = new HashMap<>();

    private List<Location> locations = new ArrayList<>();

    // Event -> Location Number
    private Map<Event, Integer> eventCycles = new HashMap<>();

    public Game(){
        phase = Phase.SETUP;
        phaseStep = PhaseStep.START_PHASE;

        locations.add(new Location(1, LocationName.HALEBEARD_PEAK, new int[]{-1, -1, 0, -1, 0, 0}, Construct.SEAL_OF_BALANCE, Component.SILVER, Treasure.ICE_PLATE));
        locations.add(new Location(2, LocationName.THE_GREAT_WILDS, new int[]{-1, 0, 0, -1, 0, 0}, Construct.HERMETIC_MIRROR, Component.QUARTZ, Treasure.BRACELET_OF_IOS));
        locations.add(new Location(3, LocationName.ROOT_STRANGLED_MARSHES, new int[]{-1, 0, -1, 0, -1, 0}, Construct.VOID_GATE, Component.GUM, Treasure.SHIMMERING_MOONLACE));
        locations.add(new Location(4, LocationName.GLASSROCK_CANYON, new int[]{-1, 0, -1, 0, -1, 0}, Construct.GOLDEN_CHASSIS, Component.SILICA, Treasure.SCALE_OF_THE_INFINITY_WURM));
        locations.add(new Location(5, LocationName.RUINED_CITY_OF_THE_ANCIENTS, new int[]{-1, 0, 0, -1, 0, 0}, Construct.SCRYING_LENS, Component.WAX, Treasure.THE_ANCIENT_RECORD));
        locations.add(new Location(6, LocationName.THE_FIERY_MAW, new int[]{-1, -1, 0, -1, 0, 0}, Construct.CRYSTAL_BATTERY, Component.LEAD, Treasure.THE_MOLTEN_SHARD));
    }

    public void setPhase(Phase phase){
        this.phase = phase;
        this.phaseStep = PhaseStep.START_PHASE;
    }

    public void setPhaseStep(PhaseStep phaseStep){
        this.phaseStep = phaseStep;
    }

    public Phase getPhase(){
        return phase;
    }

    public PhaseStep getPhaseStep(){
        return phaseStep;
    }

    public TimeTrack getTimeTrack(){ return timeTrack; }

    public int getHitpoints(){ return hitpoints; }
    public void adjHitpoints(int amount){
        hitpoints += amount;
        if (hitpoints < 0)
            hitpoints = 0;
        if (hitpoints > MAX_HITPOINTS)
            hitpoints = MAX_HITPOINTS;
    }

    public Map<Component, Integer> getStores(){ return stores; }

    public int getComponentStore(Component c){ return stores.get(c); }

    public void storeComponent(Component component){
        int currentValue = stores.get(component);
        if (currentValue < MAX_STORE){
            stores.put(component, currentValue + 1);
        }
    }

    public List<Location> getLocations(){ return locations; }
    public Location getLocation(LocationName name){
        for (Location loc: locations){
            if (loc.getName() == name)
                return loc;
        }
        return null;
    }

    public Map<Event, Integer> getEventCycles(){return eventCycles;}

    public void setUserAction(Action action){userAction = action;}
    public Action getUserAction(){return userAction;}
    public void setSearchLocation(LocationName name){searchLocation = name;}
    public LocationName getSearchLocation(){return searchLocation;}
}

package ue.game.location;

import java.util.ArrayList;
import java.util.List;

public class Location{
    private static final int MAX_SEARCH_ATTEMPTS = 6;

    private LocationName name;
    private int number;
    private int visits = 0;
    private int[] visitTimeReduction;
    private List<SearchAttempt> searchAttempts = new ArrayList<>(MAX_SEARCH_ATTEMPTS);
    private Construct construct;
    private Component component;
    private Treasure treasure;

    public Location(int number, LocationName name, int[] visitTimeReduction, Construct construct, Component component, Treasure treasure){
        this.number = number;
        this.name = name;
        this.visitTimeReduction = visitTimeReduction;
        this.construct = construct;
        this.component = component;
        this.treasure = treasure;
    }

    public SearchAttempt getAvailableSearchAttempt(){
        if (searchAttempts.size() < MAX_SEARCH_ATTEMPTS){
            SearchAttempt searchAttempt = new SearchAttempt();
            searchAttempts.add(searchAttempt);
        }
        return -1;
    }

    public SearchAttempt getSearchAttempt(int i){

    }

    public void resetSearchBoxes(){
        for (int i = 0; i < MAX_SEARCH_ATTEMPTS; ++i){
            if (searchAttempts[i] != null){
                searchAttempts[i].reset();
            }
        }
    }

    public int getNumber(){ return number; }

	public LocationName getName() {
		return name;
	}

	public void setName(LocationName name) {
		this.name = name;
	}

	public int getVisits() {
		return visits;
	}

	public void setVisits(int visits) {
		this.visits = visits;
	}

    public boolean shouldReduceTime(){
        for (int i = 0; i < visitTimeReduction.length; ++i){
            if (visits == visitTimeReduction[i])
                return true;
        }
        return false;
    }

    public Construct getConstruct(){return construct;}
    public Component getComponent(){return component;}
    public Treasure getTreasure(){return treasure;}
}

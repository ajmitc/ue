package ue.game.chart;

import ue.game.location.LocationName;
import ue.game.monster.Monster;

public class MonsterChart{
    public Monster getEncounter(LocationName locationName, int level){
        switch(locationName){
            case GLASSROCK_CANYON:
                switch(level){
                    case 1:
                        return new Monster("Feisty Gremlin", 1, 1, 5, 6);
                    case 2:
                        return new Monster("Glasswing Drake", 1, 1, 6, 6);
                    case 3:
                        return new Monster("Reaching Claws", 1, 2, 6, 6, true);
                    case 4:
                        return new Monster("Terrible Wurm", 1, 3, 6, 6);
                    case 5:
                        return new Monster("Leviathan Serpent", 1, 4, 6, 6);
                }
                break;
            case HALEBEARD_PEAK:
                switch(level){
                    case 1:
                        return new Monster("Ice Bear", 1, 1, 5, 6);
                    case 2:
                        return new Monster("Roving Bandits", 1, 1, 6, 6);
                    case 3:
                        return new Monster("Blood Wolves", 1, 2, 6, 6);
                    case 4:
                        return new Monster("Horse Eater Hawk", 1, 3, 6, 6);
                    case 5:
                        return new Monster("Giant of the Peaks", 1, 4, 6, 6);
                }
                break;
            case ROOT_STRANGLED_MARSHES:
                switch(level){
                    case 1:
                        return new Monster("Gemscale Boa", 1, 1, 5, 6);
                    case 2:
                        return new Monster("Ancient Alligator", 1, 2, 6, 6);
                    case 3:
                        return new Monster("Land Shark", 1, 2, 6, 6);
                    case 4:
                        return new Monster("Abyssal Leech", 1, 3, 6, 6);
                    case 5:
                        return new Monster("Dweller in the Tides", 1, 4, 6, 6);
                }
                break;
            case RUINED_CITY_OF_THE_ANCIENTS:
                switch(level){
                    case 1:
                        return new Monster("Grave Robbers", 1, 1, 5, 6);
                    case 2:
                        return new Monster("Ghost Lights", 1, 1, 6, 6, true);
                    case 3:
                        return new Monster("Vengeful Shade", 1, 2, 6, 6, true);
                    case 4:
                        return new Monster("Nightmare Crab", 1, 3, 6, 6);
                    case 5:
                        return new Monster("The Unnamed", 1, 4, 6, 6, true);
                }
                break;
            case THE_FIERY_MAW:
                switch(level){
                    case 1:
                        return new Monster("Minor Imp", 1, 1, 5, 6);
                    case 2:
                        return new Monster("Renegade Warlock", 1, 2, 5, 6);
                    case 3:
                        return new Monster("Giant Flame Lizard", 1, 3, 5, 6);
                    case 4:
                        return new Monster("Spark Elemental", 1, 3, 6, 6, true);
                    case 5:
                        return new Monster("Volcano Spirit", 1, 4, 6, 6, true);
                }
                break;
            case THE_GREAT_WILDS:
                switch(level){
                    case 1:
                        return new Monster("Rogue Thief", 1, 1, 5, 6);
                    case 2:
                        return new Monster("Blanket of Crows", 1, 1, 6, 6);
                    case 3:
                        return new Monster("Hornback Bison", 1, 1, 6, 6);
                    case 4:
                        return new Monster("Grassyback Troll", 1, 3, 5, 6);
                    case 5:
                        return new Monster("Thunder King", 1, 4, 6, 6, true);
                }
                break;
        }
        return null;
    }

    private MonsterChart(){}
}

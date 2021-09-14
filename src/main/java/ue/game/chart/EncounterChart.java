package ue.game.chart;

public class EncounterChart{
    public int getEncounterLevel(int searchResult){
        if ((searchResult >= 100 && searchResult <= 199) || (searchResult <= -1 && searchResult >= -100))
            return 1;
        if ((searchResult >= 100 && searchResult <= 299) || (searchResult <= -101 && searchResult >= -200))
            return 2;
        if ((searchResult >= 300 && searchResult <= 399) || (searchResult <= -201 && searchResult >= -300))
            return 3;
        if ((searchResult >= 400 && searchResult <= 499) || (searchResult <= -301 && searchResult >= -400))
            return 4;
        return 5;
    }

    private EncounterChart(){}
}

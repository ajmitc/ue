package ue.game;

public class TimeTrack{
    public static final int MAX_DAYS = 22;
    public static final int MAX_DOOMSDAY_SKULLS = 8;
    private static final int[] EVENT_DAYS = {2, 5, 8, 11, 14, 17, 20};

    private int day = MAX_TIME;

    public int getDaysLeft(){
        return day;
    }

    public boolean hasEvent(){
        for (int t: EVENT_DAYS){
            if (day == t)
                return true;
        }
        return false;
    }

    public void decDay(){
        day -= 1;
    }
}

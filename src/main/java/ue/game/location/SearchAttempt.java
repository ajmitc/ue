package ue.game.location;

/**
 * Player rolls 2 die and writes each number in one of the empty boxes.
 * Once all boxes are full, subtract the top number from bottom number to
 * get search result and compare with Search Result Table.
 */
public class SearchAttempt{
    private static final int MAX_COLUMNS = 3;

    private Integer[] topRow = new Integer[MAX_COLUMNS];
    private Integer[] bottomRow = new Integer[MAX_COLUMNS];

    public SearchAttempt(){

    }

    public int getTopRowNumber(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < MAX_COLUMNS; ++i){
            sb.append(topRow[i]);
        }
        return Integer.decode(sb.toString());
    }

    public int getBottomRowNumber(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < MAX_COLUMNS; ++i){
            sb.append(bottomRow[i]);
        }
        return Integer.decode(sb.toString());
    }

    public void reset(){
        for (int i = 0; i < MAX_COLUMNS; ++i){
            topRow[i] = null;
            bottomRow[i] = null;
        }
    }

    public Integer getTopRow(int col){
        return topRow[col];
    }

    public Integer getBottomRow(int col){
        return bottomRow[col];
    }

    public void setTopRow(int col, int value){
        topRow[col] = value;
    }

    public void setBottomRow(int col, int value){
        bottomRow[col] = value;
    }
}

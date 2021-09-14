package ue.game.chart;

public class SearchChart{
    public static SearchResult getSearchResult(int searchResult){
        if (searchResult == 0)
            return SearchResult.FIND_ACTIVATED_CONSTRUCT_AND_5_ENERGY;
        if (searchResult < 0 || searchResult >= 100)
            return SearchResult.ENCOUNTER;
        if (searchResult >= 11)
            return SearchResult.FIND_COMPONENT;
        return SearchResult.FIND_CONSTRUCT;
    }

    private SearchChart(){}
}

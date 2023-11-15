package org.example;

public class En_auge implements TrendingState {
    @Override
    public void setTrending(Song song) {
        song.setTrendingState(new En_auge());
    }
}

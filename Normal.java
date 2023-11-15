package org.example;

public class Normal implements TrendingState {

    @Override
    public void setTrending(Song song) {
        TrendingState newState = new Normal();

        // Design Pattern -> Strategy (???)
        if (song.getReproducciones() > 90) {
            newState = new En_auge();
        } else {
            newState = new En_tendencia();
        }

        song.setTrendingState(newState);

    }

}
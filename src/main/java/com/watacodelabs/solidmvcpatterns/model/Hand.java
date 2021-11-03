package com.watacodelabs.solidmvcpatterns.model;

import java.util.ArrayList;

public class Hand {
    ArrayList<PlayingCard> cards;

    public Hand() {
        this.cards = new ArrayList<PlayingCard>();
    }

    public void addCard(PlayingCard pc){
        cards.add(pc);
    }

    public PlayingCard getCard(int index) {
        return cards.get(index);
    }

    public PlayingCard removeCard() {
        return cards.remove(0);
    }
}

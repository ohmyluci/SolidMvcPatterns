package com.watacodelabs.solidmvcpatterns.model;

public class PlayingCard {
    Rank rank;
    Suit suit;
    boolean faceUp;

    public PlayingCard(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        this.faceUp = false;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public boolean isFaceUp() {
        return faceUp;
    }

    public void setFaceUp(boolean faceUp) {
        this.faceUp = faceUp;
    }
}

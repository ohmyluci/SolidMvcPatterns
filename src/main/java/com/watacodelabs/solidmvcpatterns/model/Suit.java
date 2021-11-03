package com.watacodelabs.solidmvcpatterns.model;

public enum Suit {
    DIAMONDS(1),
    HEARTS(2),
    SPADES(3),
    CLUBS(4);

    int suit;

    Suit(int suit) {
        this.suit = suit;
    }

    public int getSuit() {
        return suit;
    }
}


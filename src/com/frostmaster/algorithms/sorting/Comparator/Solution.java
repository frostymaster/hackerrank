package com.frostmaster.algorithms.sorting.Comparator;

import java.util.Comparator;

public class Solution implements Comparator<Player> {

    public int compare(Player a, Player b) {
        if(a.score != b.score) {
            return b.score - a.score;
        }
        return a.name.compareTo(b.name);
    }

}

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

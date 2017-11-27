package com.stephenslatky.logic;

public class Basic_Rules extends Rule_Set {

    public Basic_Rules() {
        set_locations();
    }

    public void set_locations() {//TODO Some of these are off. You put a colum in there for
        // the center of the screen but never accounted for it.
        this.player_1_loc = new int[][] {{0,0}, {0,1}, {0,2}, {0,3},{0,4},
                {12,0}, {12,1},
                {4,10}, {4,9}, {4,8},
                {6,10}, {6,9}, {6,8}, {6,7}, {6,6}
                };
        this.player_2_loc = new int[][] {{0,10}, {0,9}, {0,8}, {0,7},{0,6},
                {12,10}, {12,9},
                {4,0}, {4,1}, {4,2},
                {6,0}, {6,1}, {6,2}, {6,3}, {6,4}
        };
    }
}
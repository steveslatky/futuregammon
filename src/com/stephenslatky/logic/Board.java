package com.stephenslatky.logic;

public class Board {

    private int box[][];
    public Dice dice;
    private int rows_c;
    private int columns_c;
    private Rule_Set rule_set;
    public int PLAYER_1 = 1;
    public int PLAYER_2 = 2;

    public Board(int rows, int columns){
        this.box = new int[rows][columns];
        this.rows_c = rows;
        this.columns_c = columns;


    }

    public void init_board(Rule_Set rule_set){
        int x;
        int y;
        for (int[] piece_loc : rule_set.player_1_loc ){
            x = piece_loc[0]; y = piece_loc[1];
           // Piece piece = new Piece(PLAYER_1);
            this.box[y][x] = PLAYER_1;
        }
        for (int[] piece_loc : rule_set.player_2_loc ){
            x = piece_loc[0]; y = piece_loc[1];
           // Piece piece = new Piece(PLAYER_1);
            this.box[y][x] = PLAYER_2;
        }
        return;
    }

    @Override
    public String toString() {
        String line;
        for( int y = 0; y < rows_c; y++){
            line = "";
            for (int x = 0; x < columns_c; x++ ){
                line = line + box[y][x];
            }
            System.out.print(line + "\n");
        }
        return super.toString();
    }
}

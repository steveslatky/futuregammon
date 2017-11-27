package com.stephenslatky.logic;

import com.stephenslatky.gui.Board_View;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Board_View board_view = new Board_View();

        Board board = new Board(11,13);
        Basic_Rules basic_Rules = new Basic_Rules();
        board.init_board(basic_Rules);
        board.toString();
    }
}

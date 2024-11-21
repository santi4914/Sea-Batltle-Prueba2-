package com.battleship.battleshipfpoe.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlayerBoard {
    private List<List<Integer>> matrixPlayer;
    private List<Integer> shipsTouched;
    private List<Integer> sunkenShips;
    private List<Integer> waterShots;

    public PlayerBoard() {
        matrixPlayer = new ArrayList<>();
        generateBoardPlayer();
    }

    public void generateBoardPlayer() {
        for (int i = 0; i < 10; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                row.add(0);
            }
            matrixPlayer.add(row);
        }
    }



    public List<List<Integer>> getMatrixPlayer() {
        return matrixPlayer;
    }
}

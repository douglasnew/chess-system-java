/*
 * COPYRIGHT FH 2019 - ALL RIGHTS RESERVED.
 * 
 * This software is only to be used for the purpose for which it has been
 * provided. No part of it is to be reproduced, disassembled, transmitted,
 * stored in a retrieval system nor translated in any human or computer
 * language in any way or for any other purposes whatsoever without the prior
 * written consent of FH.
 */
package boardgame;


/**
 * @author FH - donascimento
 *
 */
public class Piece {
    
    protected Position position;
    private Board board;
    
    /**
     * Create a new instance of Piece
     * @param board
     */
    public Piece(Board board) {
        this.board = board;
        position = null;
    }
    
    /**
     * Retrieve the value of board.
     *
     * @return the board
     */
    protected Board getBoard() {
        return board;
    }

}

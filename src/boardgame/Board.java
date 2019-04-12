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
public class Board {
    
    private int rows;
    private int columns;
    private Piece[][] pieces;
    
    /**
     * Create a new instance of Board
     * @param rows
     * @param columns
     */
    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    /**
     * Retrieve the value of columns.
     *
     * @return the columns
     */
    public int getColumns() {
        return columns;
    }

    /**
     * Set a new value to columns.
     * 
     * @param columns the columns to set
     */
    public void setColumns(int columns) {
        this.columns = columns;
    }

    /**
     * Retrieve the value of rows.
     *
     * @return the rows
     */
    public int getRows() {
        return rows;
    }
    
    /**
     * Set a new value to rows.
     * 
     * @param rows the rows to set
     */
    public void setRows(int rows) {
        this.rows = rows;
    }

    
}

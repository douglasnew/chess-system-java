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
public class Position {
    
    private int row;
    private int column;
    
    /**
     * Create a new instance of Position
     * @param row
     * @param column
     */
    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }
    
    /**
     * Retrieve the value of row.
     *
     * @return the row
     */
    public int getRow() {
        return row;
    }
    
    /**
     * Set a new value to row.
     * 
     * @param row the row to set
     */
    public void setRow(int row) {
        this.row = row;
    }
    
    /**
     * Retrieve the value of column.
     *
     * @return the column
     */
    public int getColumn() {
        return column;
    }
    
    /**
     * Set a new value to column.
     * 
     * @param column the column to set
     */
    public void setColumn(int column) {
        this.column = column;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return row + ", " + column;
    }
    
}

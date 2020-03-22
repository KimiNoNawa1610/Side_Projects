/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessgame;

/**
 *
 * @author votha
 */
public abstract class ChessTile {
    int tileposition;
    
    public ChessTile(int position){
        this.tileposition=position;
    }
    
    public abstract boolean isOccupied();
    
    public abstract Piece getPiece();
    
}

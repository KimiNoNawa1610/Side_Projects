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
public class LegalMove {
    
    public Board board;
    
    public Piece Piece;
    
    public int destination;
    
    public LegalMove(Board mboard, Piece mpiece, int mdestination){
        this.Piece=mpiece;
        this.board=mboard;
        this.destination=mdestination;
    }
    
    
}

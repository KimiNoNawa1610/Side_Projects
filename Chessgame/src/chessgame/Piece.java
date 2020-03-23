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
public abstract class Piece {
    
    public enum pieces{
        Pawn,Kinght,Rook,Bishop,Queen,King
    }
    public enum PiecesType{
        Black, White
    }
    
    private int coordinate;
    
    private PiecesType type;
    
    public int getCoordinate(){
        return coordinate;
    }
    
    public PiecesType getPiecesType(){
        return type;
    }
    
    public Piece(PiecesType Type, int Coordinate){
        this.type=Type;
        this.coordinate=Coordinate;
    }
    
    public abstract void move();
    
    
   
}

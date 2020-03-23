/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessgame;

import java.util.List;

/**
 *
 * @author votha
 */
public class Knight extends Piece {
    
    private static int[] CanMove={-17,-15,-10,-6,6,10,15,17};

    public Knight(PiecesType Type, int Coordinate) {
        super(Type, Coordinate);
    }
    
    @Override
    public List<LegalMove> isLegalMove(Board n){
        
        int destination;
        
        
        
        
    }
}

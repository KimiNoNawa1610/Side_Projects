/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessgame;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author votha
 */
public abstract class ChessTile {
    private final int tileposition;
    
    private static final Map<Integer,EmptyTile> First_Tile= CreateTile();
    
    private static Map<Integer, EmptyTile> CreateTile(){
        
        Map<Integer, EmptyTile> emptytile= new HashMap<>();
        
        for(int tile=0;tile<64;tile++){
            emptytile.put(tile,new EmptyTile(tile));
        }
        
        return Collections.unmodifiableMap(emptytile);
    }
    
    
    public int getTileposition(){
        return tileposition;
    }
    
    public Map<Integer, EmptyTile> getFirstTile(){
        return First_Tile;
    }
    
    private ChessTile(int position){
        this.tileposition=position;
    }
    
    public static ChessTile NewTile(int coordinate,Piece piece){
        if(piece!=null){
            return new OccupiedTile(coordinate,piece);
        }
        else{
            return First_Tile.get(coordinate);
        }
    }
    
    public abstract boolean isOccupied();
    
    public abstract Piece getPiece();
    
    public static final class EmptyTile extends ChessTile{
        private EmptyTile(int coordinate){
            super(coordinate);
        }
        
        @Override
        public boolean isOccupied(){
            return false;
        }
        
        @Override
        public Piece getPiece(){
            return null;
        }
    }
    
    public static final class OccupiedTile extends ChessTile{
        private final Piece pieceonTile;
        
        private OccupiedTile(int coordinate, Piece ontile){
            super(coordinate);
            this.pieceonTile=ontile;
        }
        @Override
        public boolean isOccupied(){
            return true;
        }
        
        @Override
        public Piece getPiece(){
            return pieceonTile;
        }
        
    }
}

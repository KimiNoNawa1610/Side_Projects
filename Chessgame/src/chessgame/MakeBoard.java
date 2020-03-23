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
public class MakeBoard {
    public static boolean[]FirstColumn=initializeColumn(0);
    public static boolean[]SecondColumn=initializeColumn(1);
    public static boolean[]SeventhColumn=initializeColumn(6);
    public static boolean[]EighthColumn=initializeColumn(7);
    
    public static int TileRange=64;
    public static int numTile_per_row=8;
    
    private MakeBoard(){
        throw new RuntimeException("Cannot initialize the board");
        
    }
    
    private static boolean[] initializeColumn(int number){
        boolean[] column=new boolean[TileRange];
        do{
            column[number]=true;
            number =number+numTile_per_row;
        }while(number<TileRange);
        
        return column;
    }
    
    public static boolean isValidCoordinate(int coordinate){
        return coordinate>=0 && coordinate<64;
    }
}

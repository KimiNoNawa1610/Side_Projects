/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Floyd;

import java.util.ArrayList;

/**
 *
 * @author votha
 */
public class TortoiseandHare {
    public int FindDuplication(ArrayList<Integer> nums){
        int tortoise=nums.get(0);
        int hare=nums.get(0);
        boolean condition=true;
        while(condition){
            tortoise=nums.get(tortoise);
            hare=nums.get(nums.get(hare));
            if(tortoise==hare){
                condition=false;
            }
        }
        int point1=nums.get(0);
        int point2=tortoise;
        while(point1!=point2){
            point1=nums.get(point1);
            point2=nums.get(point2);
            
        }
        return point1;
    }

    
    
}

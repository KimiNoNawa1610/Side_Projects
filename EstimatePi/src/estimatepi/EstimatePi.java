/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estimatepi;


/**
 * Estimate pi class use to estimate pi
 * this class using the pi-circle algorithm to estimate pi
 * @author votha
 */
public class EstimatePi {
      private int numbpoint_in_circle=0;
      private int numbpoint_in_total=0;
      private int estimate=0;
      /**
       * Setter method to set the accuracy of the estimation
       * @param input 
       */
      public void setEstimation(int input){
          estimate=input;
      }
      /**
       * EstimatePi method
       * generate two points with the value between 0 and 1
       * if the displacement of the two points is less than 1, the two points are in the circle
       * Then, increment the numbpoint_in_circle.
       * Regardless, the total number of point will keep incrementing.
       * @return the pi estimated value
       */
      public double EstimatePi(){
          for(int i=0;i<estimate;i++){
              float x=(float) Math.random();
              float y=(float) Math.random();
              float displacement= x*x+y*y;
              System.out.println("x: "+x+" | y: "+y);
              if(displacement<1){
                  numbpoint_in_circle=numbpoint_in_circle+1;
                 
              }
              numbpoint_in_total=numbpoint_in_total+1;
          }
          System.out.println("number in circle: "+numbpoint_in_circle+" | number in total: "+numbpoint_in_total);
          double pi= (4.0*numbpoint_in_circle)/numbpoint_in_total;
          return pi;
      }
    
}

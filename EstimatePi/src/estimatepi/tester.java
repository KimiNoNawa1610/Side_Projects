/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estimatepi;

/**
 *
 * @author votha
 */
public class tester {
    public static void main(String[] args){
        EstimatePi est=new EstimatePi();
        est.setEstimation(100);
        System.out.println(est.EstimatePi());
    }
}

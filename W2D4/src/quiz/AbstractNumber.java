/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz;

/**
 *
 * @author mzijlstra
 */
public abstract class AbstractNumber {
    protected double number;
    
    public abstract double getNumber();
    
    public void setNumber(double number) {
        this.number = number;
    }
}

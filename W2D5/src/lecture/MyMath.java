/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture;

/**
 *
 * @author mzijlstra
 */
public class MyMath {
    private String name;
    
    public MyMath(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    public static int min(int a, int b) {
        //name = "doing min";
        //setName("doing min");
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}

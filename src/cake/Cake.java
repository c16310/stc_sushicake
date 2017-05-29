/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cake;

import syokuninwork.*;

/**
 *
 * @author c16310
 */
public class Cake extends Food{
    private String owner;
    Cake(String owner) {
        System.out.println(owner + "ケーキを作ります。");
        this.owner = owner;
    }
    public void use() {
        System.out.println(owner + "ケーキどうぞ。");
    }
    public String getSushi() {
        return owner;
    }
    
}

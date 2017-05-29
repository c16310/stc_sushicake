/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sushi;
import syokuninwork.*;
/**
 *
 * @author c16310
 */
public class Sushi extends Food{
    private String owner;
    Sushi(String owner) {
        System.out.println(owner + "の寿司を作ります。");
        this.owner = owner;
    }
    public void use() {
        System.out.println(owner + "、どうぞ。");
    }
    public String getSushi() {
        return owner;
    }
    
}

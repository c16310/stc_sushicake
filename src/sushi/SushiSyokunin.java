/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sushi;
import syokuninwork.*;
import java.util.*;
/**
 *
 * @author c16310
 */
public class SushiSyokunin extends Cook{
    private List sushis = new ArrayList();
    protected Food createFood(String owner) {
        return new Sushi(owner);
    }
    protected void registerProduct(Food food){
        sushis.add(((Sushi)food).getSushi());
    }
    public List getSushis() {
        return sushis;
    }
}

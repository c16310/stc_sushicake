/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cake;
import syokuninwork.*;
import java.util.*;
/**
 *
 * @author c16310
 */
public class CakeSyokunin  extends Cook{
    private List cakes = new ArrayList();
    protected Food createFood(String owner) {
        return new Cake(owner);
    }
    protected void registerProduct(Food food){
        cakes.add(((Cake)food).getSushi());
    }
    public List getSushis() {
        return cakes;
    }
}

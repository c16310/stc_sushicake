/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syokuninwork;

/**
 *
 * @author c16310
 */
public abstract class Cook {
    public final Food create(String owner) {
        Food f = createFood(owner);
        registerProduct(f);
        return f;
    }
    protected abstract Food createFood(String owner);
    protected abstract void registerProduct(Food food);
    
}

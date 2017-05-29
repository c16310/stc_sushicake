/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import syokuninwork.*;
import sushi.*;
import cake.*;
/**
 *
 * @author c16310
 */
public class Main {
    public static void main(String[] args){
        Cook cook = new SushiSyokunin();
        Food sushi1 = cook.create("コハダ");
        Food sushi2 = cook.create("たこ");
        Food sushi3 = cook.create("マグロ");
        sushi1.use();
        sushi2.use();
        sushi3.use();
        
        Cook cook2 = new CakeSyokunin();
        Food cake1 = cook.create("ショート");
        Food cake2 = cook.create("チーズ");
        Food cake3 = cook.create("ロール");
        cake1.use();
        cake2.use();
        cake3.use();        
        
        
    }
}


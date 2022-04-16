/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphisme;

/**
 *
 * @author Panda PC
 */
    public abstract class Vehicle { //contoh kelas abstract
    public void function(){
        System.out.println("Tools transportation");
    }
    public void fuel(){
        System.out.println("fuels");
    }
    public abstract void walk(); // penulisan method abstract    
    
}



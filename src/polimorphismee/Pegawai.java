/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphismee;

/**
 *
 * @author Panda PC
 */
public class Pegawai {
    String nama;
    int gaji;
    Pegawai(){ //konstruktor 
        
    }
    Pegawai (String nm){ //deklarasi konstruktor
        this.nama=nm;
        System.out.println("pegawai");
    }
    public int gaji(){
        return 0;
    }
}



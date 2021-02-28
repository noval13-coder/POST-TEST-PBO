/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

import java.util.Scanner;
public class miniBus {
    //membuat variabel
    private double penumpang;
    private double maxPenumpang;
    private double counter;
    private double penumpangBaru;
    private double hargaTiket = 25000;
    private char namaPenumpang = 'a';
    Scanner input = new Scanner(System.in);
    
    //konstruktor kelas Bis
    public miniBus (int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    //menambahkan penumpang
    public void addPenumpang (int penumpang){
        double temp;
        temp = this.penumpang+penumpang;
        if (temp > maxPenumpang){
            System.out.println("Penumpang Melebihi Kuota yang Disediakan");
        }else{
            this.penumpang=temp;
            
        }
    }
}

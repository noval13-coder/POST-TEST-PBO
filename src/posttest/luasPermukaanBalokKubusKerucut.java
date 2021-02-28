/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest;
import java.lang.Math; //menggunakan library lang.Math untuk nilai phi
class luasPermukaanBalokKubusKerucut {
   float  l; //membuat variabel
    float p; //membuat variabel
    float t; //membuat variabel
    float s; //membuat variabel
    float r; //membuat variabel
    float S; //membuat variabel
   
   float LuasPermukaanKubus(){ //membuat fungsi untuk menghitung Lp kubus
       float Kubus = 6*(s*s); // membuat sebuah variabel
       System.out.println("Lp Kubus= 6 x ("+s+" x "+s+")");
       System.out.println("Lp Kubus = "+Kubus);
       return Kubus;
   }
   float LuasPermukaanBalok(){ //membuat fungsi untuk menghitung Lp Balok
       float Balok = 2*((p*l)+(p*t)+(l*t)); //membuat sebuah variabel
       System.out.println("Lp Balok = 2 x (("+p+" x "+l+") + ("+p+" x "+t+
               ") + ("+l+ " x "+t+"))");
       System.out.println("Lp Balok = "+Balok);
       return Balok;
   
   }
   double LuasPermukaanKerucut(){ // membuat fungsi untuk menghitung Lp Kerucut
       double Kerucut = Math.PI*r*(r + S); //membuat sebuah variabel
       System.out.println("Lp Kerucut = "+Math.PI+" x "+r+"("+r+"+"+s+")");
       System.out.println("Lp Kerucut = "+Kerucut);
       return Kerucut;
   }
}

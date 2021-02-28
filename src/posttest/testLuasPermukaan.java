/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest;

/**
 *
 * @author ASUS
 */
public class testLuasPermukaan {
    public static void main(String[] args) {
        bangunRuang BangunRuang = new bangunRuang(); 
        
        luasPermukaanBalokKubusKerucut LP = new luasPermukaanBalokKubusKerucut(); 
        LP.p = 5; 
        LP.l = 3;
        LP.t = 8;
        LP.s = 6;
        LP.r = 7;
        LP.S = 10;
        
        BangunRuang.LuasPermukaanKubus(); 
        LP.LuasPermukaanKubus(); 
        BangunRuang.LuasPermukaanBalok(); 
        LP.LuasPermukaanBalok(); 
        BangunRuang.LuasPermukaanKerucut(); 
        LP.LuasPermukaanKerucut(); 
        
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kid.a_jpa.utils;

/**
 *
 * @author karim
 */
public class GenerateurID {
    
    public static String genererID_Cons(){
        int nm =  (int)Math.round(Math.random()*1000000000);
        String id = Integer.toString(nm);
        return id;
    }
    
    public static String genererID_Doss(){
        int nm =  (int)Math.round(Math.random()*1000000000);
        String id = Integer.toString(nm);
        return id;
    }
    public static String genererID_Inf(){
        int nm =  (int)Math.round(Math.random()*1000);
        String id = Integer.toString(nm);
        return "A"+id;
    }
    
    public static String genererNumAutorisation(){
        int nm =  (int)Math.round(Math.random()*1000000);
        String id = Integer.toString(nm);
        return id;
    }
    
    public static String genererNumReference(){
        int nm =  (int)Math.round(Math.random()*100000000);
        String id = Integer.toString(nm);
        return id;
    }
}

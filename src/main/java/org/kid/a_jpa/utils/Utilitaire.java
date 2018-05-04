/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kid.a_jpa.utils;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author karim
 */
public class Utilitaire {
    
    public static double montantTotal(double montant, double frais){
        return (montant+frais);
    }
    
    public static void afficheData(Object listing){
        System.out.println(((List)listing).size() + " enregistrements(s) trouvés:");
        Iterator iter = ((List)listing).iterator();
        while ( iter.hasNext()) {
//            List perTemp = (List) iter.next();
            System.out.println(iter.next());
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kid.a_jpa.dao;

import java.util.List;
import org.kid.a_jpa.entities.Proprios;
import org.kid.a_jpa.entities.Tickets;
import org.kid.a_jpa.entities.Voitures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author karim
 */


public interface ProrprioRepository extends JpaRepository<Proprios, Long> {
    //Liste des tickets d'un proprio
    @Query ("Select t from Tickets t where t.proprios=:p")
    public List<Tickets> ticketProprio(@Param("p")Proprios pro);
    
    //Liste des voitres d'un proprios
    @Query ("Select v from Voitures v where v.proprios=:p")
    public List<Voitures> voituresProprio(@Param("p")Proprios pro);
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kid.a_jpa.dao;

import org.kid.a_jpa.entities.Tickets;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author karim
 */

public interface TicketsRepository extends JpaRepository<Tickets, Long>{
    
}

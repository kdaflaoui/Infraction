/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kid.a_jpa.dao;

import org.kid.a_jpa.entities.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author karim
 */

public interface TransactionsRepository extends JpaRepository<Transactions, Long>{
    
}

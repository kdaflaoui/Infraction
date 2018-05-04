package org.kid.a_jpa.entities;
// Generated 2018-01-19 18:14:15 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author karim
 */

@Entity
@Table(name="reference_paiement")
public class ReferencePaiement  implements java.io.Serializable {

    @Id
    @GeneratedValue
    @Column(name="paiement_id", nullable=false)
    private long paiementId;
    @ManyToOne
    @JoinColumn(name="transaction_id", nullable=false)
    private Transactions transactions;
    @Column(name= "num_reference", nullable=false)
    private String numReference;
    @Column(name= "carte_credit", nullable=false)
    private String carteCredit;
    @Column(name= "num_autorisation", nullable=false)
    private long numAutorisation;

    public ReferencePaiement() {
    }

	
    public ReferencePaiement(String carteCredit, long numAutorisation) {
        this.carteCredit = carteCredit;
        this.numAutorisation = numAutorisation;
    }
    public ReferencePaiement(Transactions transactions, String numReference, String carteCredit, long numAutorisation) {
       this.transactions = transactions;
       this.numReference = numReference;
       this.carteCredit = carteCredit;
       this.numAutorisation = numAutorisation;
    }
   
    public long getPaiementId() {
        return this.paiementId;
    }
    
    public void setPaiementId(long paiementId) {
        this.paiementId = paiementId;
    }
    public Transactions getTransactions() {
        return this.transactions;
    }
    
    public void setTransactions(Transactions transactions) {
        this.transactions = transactions;
    }
    public String getNumReference() {
        return this.numReference;
    }
    
    public void setNumReference(String numReference) {
        this.numReference = numReference;
    }
    public String getCarteCredit() {
        return this.carteCredit;
    }
    
    public void setCarteCredit(String carteCredit) {
        this.carteCredit = carteCredit;
    }
    public long getNumAutorisation() {
        return this.numAutorisation;
    }
    
    public void setNumAutorisation(long numAutorisation) {
        this.numAutorisation = numAutorisation;
    }




}



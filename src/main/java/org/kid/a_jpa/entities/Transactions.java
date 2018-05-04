package org.kid.a_jpa.entities;
// Generated 2018-01-19 18:14:15 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author karim
 */

@Entity
@Table(name="transactions")
public class Transactions  implements java.io.Serializable {

    @Id
    @GeneratedValue
    @Column(name="transaction_id", nullable=false)
    private long transactionId;
    @OneToOne
    @JoinColumn(name="ticket_id", nullable=false)
    private Tickets tickets;
    @Column(name= "date_transaction", nullable=false)
    private Date dateTransaction;
    @Column(name= "type_transaction", nullable=false)
    private String typeTransaction;
    @Column(name= "statut", nullable=false)
    private String statut;
    @Column(name= "montant_paye", nullable=false)
    private BigDecimal montantPaye;
    @OneToMany(targetEntity = ReferencePaiement.class, mappedBy = "transactions", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set referencePaiements = new HashSet(0);
   

    public Transactions() {
    }

	
    public Transactions(Date dateTransaction, String typeTransaction, String statut, BigDecimal montantPaye) {
        this.dateTransaction = dateTransaction;
        this.typeTransaction = typeTransaction;
        this.statut = statut;
        this.montantPaye = montantPaye;
    }
    public Transactions(Tickets tickets, Date dateTransaction, String typeTransaction, String statut, BigDecimal montantPaye, Set referencePaiements) {
       this.tickets = tickets;
       this.dateTransaction = dateTransaction;
       this.typeTransaction = typeTransaction;
       this.statut = statut;
       this.montantPaye = montantPaye;
       this.referencePaiements = referencePaiements;
    }
   
    public long getTransactionId() {
        return this.transactionId;
    }
    
    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }
    public Tickets getTickets() {
        return this.tickets;
    }
    
    public void setTickets(Tickets tickets) {
        this.tickets = tickets;
    }
    public Date getDateTransaction() {
        return this.dateTransaction;
    }
    
    public void setDateTransaction(Date dateTransaction) {
        this.dateTransaction = dateTransaction;
    }
    public String getTypeTransaction() {
        return this.typeTransaction;
    }
    
    public void setTypeTransaction(String typeTransaction) {
        this.typeTransaction = typeTransaction;
    }
    public String getStatut() {
        return this.statut;
    }
    
    public void setStatut(String statut) {
        this.statut = statut;
    }
    public BigDecimal getMontantPaye() {
        return this.montantPaye;
    }
    
    public void setMontantPaye(BigDecimal montantPaye) {
        this.montantPaye = montantPaye;
    }
    public Set getReferencePaiements() {
        return this.referencePaiements;
    }
    
    public void setReferencePaiements(Set referencePaiements) {
        this.referencePaiements = referencePaiements;
    }

    @Override
    public String toString() {
        return "Transactions{" + "transactionId=" + transactionId + ", tickets=" + tickets + ", dateTransaction=" + dateTransaction + ", typeTransaction=" + typeTransaction + ", statut=" + statut + ", montantPaye=" + montantPaye + ", referencePaiements=" + referencePaiements + '}';
    }

}



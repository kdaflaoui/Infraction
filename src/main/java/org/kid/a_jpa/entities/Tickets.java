package org.kid.a_jpa.entities;
// Generated 2018-01-19 18:14:15 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author karim
 */

@Entity
@Table(name="tickets")
public class Tickets  implements java.io.Serializable {


    @Id
    @GeneratedValue
    private long ticketId;
    

    @OneToOne
    @JoinColumn(name="inf_id", nullable=false)
    private Infractions infractions;


    @ManyToOne
    @JoinColumn(name="proprios_id", nullable=false)
    private Proprios proprios;
    

    @ManyToOne
    @JoinColumn(name="voiture_id", nullable=false)
    private Voitures voitures;
    @Column(name= "date_echeance", nullable=false)
    private Date dateEcheance;

    public Tickets() {
    }

	
    public Tickets(Date dateEcheance) {
        this.dateEcheance = dateEcheance;
    }
    public Tickets(Infractions infractions, Proprios proprios, Voitures voitures, Date dateEcheance) {
       this.infractions = infractions;
       this.proprios = proprios;
       this.voitures = voitures;
       this.dateEcheance = dateEcheance;
    }
   
    public long getTicketId() {
        return this.ticketId;
    }
    
    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }
    public Infractions getInfractions() {
        return this.infractions;
    }
    
    public void setInfractions(Infractions infractions) {
        this.infractions = infractions;
    }
    
    public Proprios getProprios() {
        return this.proprios;
    }
    
    public void setProprios(Proprios proprios) {
        this.proprios = proprios;
    }
    
    public Voitures getVoitures() {
        return this.voitures;
    }
    
    public void setVoitures(Voitures voitures) {
        this.voitures = voitures;
    }
    public Date getDateEcheance() {
        return this.dateEcheance;
    }
    
    public void setDateEcheance(Date dateEcheance) {
        this.dateEcheance = dateEcheance;
    }

    @Override
    public String toString() {
        return "Tickets{" + "ticketId=" + ticketId + ", infractions=" + infractions + ", proprios=" + proprios + ", voitures=" + voitures + ", dateEcheance=" + dateEcheance + '}';
    }




}



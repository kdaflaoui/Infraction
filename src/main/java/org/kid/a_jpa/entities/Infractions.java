package org.kid.a_jpa.entities;
// Generated 2018-01-19 18:14:15 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author karim
 */

@Entity
@Table(name="infractions")
public class Infractions  implements java.io.Serializable {

    @Id
    @GeneratedValue
    @Column(name="inf_id", nullable=false)
    private long infId;
    @Column(name= "num_constat",  nullable=false)
    private String numConstat;
    @Column(name= "num_infraction", nullable=false)
    private String numInfraction;
    @Column(name= "type_constat", nullable=false)
    private String typeConstat;
    @Column(name= "montant_infraction",  nullable=false)
    private BigDecimal montantInfraction;
    @Column(name= "date_infraction", nullable=false)
    private Date dateInfraction;
    @Column(name= "endroit", nullable=false)
    private String endroit;

    public Infractions() {
    }

    public Infractions(String numConstat, String numInfraction, String typeConstat, BigDecimal montantInfraction, Date dateInfraction, String endroit) {
       this.numConstat = numConstat;
       this.numInfraction = numInfraction;
       this.typeConstat = typeConstat;
       this.montantInfraction = montantInfraction;
       this.dateInfraction = dateInfraction;
       this.endroit = endroit;
    }
   
    public long getInfId() {
        return this.infId;
    }
    
    public void setInfId(long infId) {
        this.infId = infId;
    }
    public String getNumConstat() {
        return this.numConstat;
    }
    
    public void setNumConstat(String numConstat) {
        this.numConstat = numConstat;
    }
    public String getNumInfraction() {
        return this.numInfraction;
    }
    
    public void setNumInfraction(String numInfraction) {
        this.numInfraction = numInfraction;
    }
    public String getTypeConstat() {
        return this.typeConstat;
    }
    
    public void setTypeConstat(String typeConstat) {
        this.typeConstat = typeConstat;
    }
    public BigDecimal getMontantInfraction() {
        return this.montantInfraction;
    }
    
    public void setMontantInfraction(BigDecimal montantInfraction) {
        this.montantInfraction = montantInfraction;
    }
    public Date getDateInfraction() {
        return this.dateInfraction;
    }
    
    public void setDateInfraction(Date dateInfraction) {
        this.dateInfraction = dateInfraction;
    }
    public String getEndroit() {
        return this.endroit;
    }
    
    public void setEndroit(String endroit) {
        this.endroit = endroit;
    }

    @Override
    public String toString() {
        return "Infractions{" + "infId=" + infId + ", numConstat=" + numConstat + ", numInfraction=" + numInfraction + ", typeConstat=" + typeConstat + ", montantInfraction=" + montantInfraction + ", dateInfraction=" + dateInfraction + ", endroit=" + endroit + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Infractions other = (Infractions) obj;
        if (this.infId != other.infId) {
            return false;
        }
        if (!Objects.equals(this.typeConstat, other.typeConstat)) {
            return false;
        }
        if (!Objects.equals(this.endroit, other.endroit)) {
            return false;
        }
        if (!Objects.equals(this.montantInfraction, other.montantInfraction)) {
            return false;
        }
        if (!Objects.equals(this.dateInfraction, other.dateInfraction)) {
            return false;
        }
        return true;
    }

}



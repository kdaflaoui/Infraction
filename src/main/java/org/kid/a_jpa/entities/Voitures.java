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
@Table(name="voitures")
public class Voitures  implements java.io.Serializable {

    @Id
    @GeneratedValue
    private long voitureId;
    @ManyToOne
    @JoinColumn(name="proprios_id", nullable=false)
    private Proprios proprios;
    @Column(name= "plaque", nullable=false)
    private String plaque;
    @Column(name= "modele", nullable=false)
    private String modele;

    public Voitures() {
    }

    public Voitures(String plaque, String modele) {
        this.plaque = plaque;
        this.modele = modele;
    }
    
    public Voitures(Proprios proprios, String plaque, String modele) {
       this.proprios = proprios;
       this.plaque = plaque;
       this.modele = modele;
    }
   
    public long getVoitureId() {
        return this.voitureId;
    }
    
    public void setVoitureId(long voitureId) {
        this.voitureId = voitureId;
    }
    public Proprios getProprios() {
        return this.proprios;
    }
    
    public void setProprios(Proprios proprios) {
        this.proprios = proprios;
    }
    public String getPlaque() {
        return this.plaque;
    }
    
    public void setPlaque(String plaque) {
        this.plaque = plaque;
    }
    public String getModele() {
        return this.modele;
    }
    
    public void setModele(String modele) {
        this.modele = modele;
    }

    @Override
    public String toString() {
        return "Voitures{" + "voitureId=" + voitureId + ", proprios=" + proprios + ", plaque=" + plaque + ", modele=" + modele + '}';
    }
}



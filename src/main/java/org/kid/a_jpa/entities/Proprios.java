package org.kid.a_jpa.entities;
// Generated 2018-01-19 18:14:15 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author karim
 */

@Entity
@Table(name="proprios")
public class Proprios  implements java.io.Serializable {


    @Id
    @GeneratedValue
    @Column(name="proprios_id", nullable=false)
    private long propriosId;
    @Column(name= "num_dosssier", length=9, nullable=false, unique=true)
    private String numDossier;
    @Column(name= "nom", nullable=false)
    private String nom;
    @Column(name= "prenom", nullable=false)
    private String prenom;
    @Column(name= "adresse", nullable=false)
    private String adresse;
    @Column(name= "ville", nullable=false)
    private String ville;
    @Column(name= "code_postal", nullable=false)
    private String codePostal;
    
    
    @OneToMany(targetEntity = Tickets.class, mappedBy = "proprios", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set ticketses = new HashSet(0);
    
   
    @OneToMany(targetEntity = Voitures.class, mappedBy = "proprios", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set voitureses = new HashSet(0);

    public Proprios() {
    }

    public Proprios(long propriosId, String numDossier, String nom, String prenom, String adresse, String ville, String codePostal) {
        this.propriosId = propriosId;
        this.numDossier = numDossier;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ville = ville;
        this.codePostal = codePostal;
    }

	
    public Proprios(String nom, String prenom, String adresse, String ville, String codePostal) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ville = ville;
        this.codePostal = codePostal;
    }

   
    public long getPropriosId() {
        return this.propriosId;
    }
    
    public void setPropriosId(long propriosId) {
        this.propriosId = propriosId;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getAdresse() {
        return this.adresse;
    }
    
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getVille() {
        return this.ville;
    }
    
    public void setVille(String ville) {
        this.ville = ville;
    }
    public String getCodePostal() {
        return this.codePostal;
    }
    
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getNumDossier() {
        return numDossier;
    }

    public void setNumDossier(String numDossier) {
        this.numDossier = numDossier;
    }


    public Set getTicketses() {
        return ticketses;
    }

    public void setTicketses(Set ticketses) {
        this.ticketses = ticketses;
    }
    

    public Set getVoitureses() {
        return voitureses;
    }
    public void setVoitureses(Set voitureses) {
        this.voitureses = voitureses;
    }

   
    @Override
    public String toString() {
        return "Proprios{" + "propriosId=" + propriosId + ", numDossier=" + numDossier + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", ville=" + ville + ", codePostal=" + codePostal+'}';
    }
}



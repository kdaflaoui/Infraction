package org.kid.a_jpa.entities;
// Generated 2018-01-19 18:14:15 by Hibernate Tools 4.3.1

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
@Table(name="administrateurs")
public class Administrateurs  implements java.io.Serializable {

    @Id
    @GeneratedValue
    @Column(name="admin_id", nullable=false)
    private long adminId;
    @Column(name= "nom", nullable=false)
    private String nom;
    @Column(name= "prenom", nullable=false)
    private String prenom;
    @Column(name= "username", nullable=false)
    private String username;
    @Column(name= "passeword", nullable=false)
    private String passeword;

    public Administrateurs() {
    }

    public Administrateurs(long adminId, String nom, String prenom, String username, String passeword) {
       this.adminId = adminId;
       this.nom = nom;
       this.prenom = prenom;
       this.username = username;
       this.passeword = passeword;
    }
   
    public long getAdminId() {
        return this.adminId;
    }
    
    public void setAdminId(long adminId) {
        this.adminId = adminId;
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
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPasseword() {
        return this.passeword;
    }
    
    public void setPasseword(String passeword) {
        this.passeword = passeword;
    }




}



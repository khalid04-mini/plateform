@package com.inprogress.inprogress.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Table(name='centres')

public class Centre implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "CENTER_GENERATOR")
    @SequenceGenerator(
            name= "CENTER_GENERATOR",
            sequenceName = "CENTER_ID_SEQ",
            allocationSize = 1
    )



    @Column(name="idCentre")
    private long idCentre;
    @Column(name="address")
    private String address;
    @Column(name="nom_centre")
    private String nomCentre;
    @Column(name="salles")
    private String salles;

    public Centre() {
    }

    public String getAddress() {
        return this.Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getNom() {
        return this.Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getSalles() {
        return this.Salles;
    }

    public void setSalles(String Salles) {
        this.Salles = Salles;
    }

    
}

@package com.inprogress.inprogress.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="formation")


public class Formation{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idformation;
    @Column(name="nomFormation");
    private String nomFormation;
    @Column(name="DateDebutFormation");
    private Date DateDebutFormation; 
    @Column(name="DateFinFormation");
    private Date DateFinFormation; 
    @Column(name="idFormateur");
    private Formateur idFormateur;
    @Column(name="id_facture");
    private Facture id_facture;

    public Formation() {
    }



    public int getIdformation() {
        return this.idformation;
    }

    public void setIdformation(int idformation) {
        this.idformation = idformation;
    }

    public String getNomFormation() {
        return this.nomFormation;
    }

    public void setNomFormation(String nomFormation) {
        this.nomFormation = nomFormation;
    }

    public Date getDateDebutFormation() {
        return this.DateDebutFormation;
    }

    public void setDateDebutFormation(Date DateDebutFormation) {
        this.DateDebutFormation = DateDebutFormation;
    }

    public Date getDateFinFormation() {
        return this.DateFinFormation;
    }

    public void setDateFinFormation(Date DateFinFormation) {
        this.DateFinFormation = DateFinFormation;
    }

    public int getIdFormateur() {
        return this.idFormateur;
    }

    public void setIdFormateur(int idFormateur) {
        this.idFormateur = idFormateur;
    }

    public int getid_facturet() {
        return this.id_facture;
    }

    public void setid_facture(int id_facture) {
        this.id_facture = id_facture;
    }

}

   
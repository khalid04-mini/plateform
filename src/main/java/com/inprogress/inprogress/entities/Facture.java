@package com.inprogress.inprogress.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="facture")

public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idfacture;
    @Column(name="datedepaiement");
    private Date datedepaiement;
    @Column(name="montant");
    private String montant;
    @Column(name="etat");
    private String etat;
	@OneToOne(mappedBy = "participant", cascade = { CascadeType.PERSIST, CascadeType.MERGE }, orphanRemoval = true)
    private Participant  id_participant;
	@OneToOne(mappedBy = "formation", cascade = { CascadeType.PERSIST, CascadeType.MERGE }, orphanRemoval = true)
    private Formation idformation;

    public Facture() {
    }


    public long getIdfacture() {
        return this.idfacture;
    }

    public void setIdfacture(long idfacture) {
        this.idfacture = idfacture;
    }

    public Date getDatedepaiement() {
        return this.datedepaiement;
    }

    public void setDatedepaiement(Date datedepaiement) {
        this.datedepaiement = datedepaiement;
    }

    public Participant getId_participant() {
        return this.id_participant;
    }

    public void setId_participant(Participant id_participant) {
        this.id_participant = id_participant;
    }

    public String getMontant() {
        return this.montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public Formation getIdformation() {
        return this.idformation;
    }

    public void setIdformation(Formation idformation) {
        this.idformation = idformation;
    }

}


    
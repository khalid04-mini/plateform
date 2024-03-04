public class Facture {
    private Date datedepaiement;
    private String id_participant;
    private String montant;
    private String idformation;


    public Facture() {
    }

    public Date getDatedepaiement() {
        return this.datedepaiement;
    }

    public void setDatedepaiement(Date datedepaiement) {
        this.datedepaiement = datedepaiement;
    }

    public String getId_participant() {
        return this.id_participant;
    }

    public void setId_participant(String id_participant) {
        this.id_participant = id_participant;
    }

    public String getMontant() {
        return this.montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public String getIdformation() {
        return this.idformation;
    }

    public void setIdformation(String idformation) {
        this.idformation = idformation;
    }
    
}


    
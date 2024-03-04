public class Paiement {
    private Date datedepaiement;
    private Bool payé;
    private String id_facture;
    private String method_paiement;
    private Float reste;

    public Date getDatedepaiement() {
        return this.datedepaiement;
    }

    public void setDatedepaiement(Date datedepaiement) {
        this.datedepaiement = datedepaiement;
    }

    public Bool getPayé() {
        return this.payé;
    }

    public void setPayé(Bool payé) {
        this.payé = payé;
    }

    public String getId_facture() {
        return this.id_facture;
    }

    public void setId_facture(String id_facture) {
        this.id_facture = id_facture;
    }

    public String getMethod_paiement() {
        return this.method_paiement;
    }

    public void setMethod_paiement(String method_paiement) {
        this.method_paiement = method_paiement;
    }

    public Float getReste() {
        return this.reste;
    }

    public void setReste(Float reste) {
        this.reste = reste;
    }
    

}

public class Formation{


    private int idformation;
    private String nomFormation;
    private Date DateDebutFormation; 
    private Date DateFinFormation; 
    private int idFormateur;
    private int id_participant;

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

    public int getId_participant() {
        return this.id_participant;
    }

    public void setId_participant(int id_participant) {
        this.id_participant = id_participant;
    }

}

   
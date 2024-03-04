public class Participant {
    private int id_participant;
    private String nom_participant;
    private String prenom_participant;
    private String email_participant;
    private String password_participant;

    public Participant() {
    }

    public int getId_participant() {
        return this.id_participant;
    }

    public void setId_participant(int id_participant) {
        this.id_participant = id_participant;
    }

    public String getNom_participant() {
        return this.nom_participant;
    }

    public void setNom_participant(String nom_participant) {
        this.nom_participant = nom_participant;
    }

    public String getPrenom_participant() {
        return this.prenom_participant;
    }

    public void setPrenom_participant(String prenom_participant) {
        this.prenom_participant = prenom_participant;
    }

    public String getEmail_participant() {
        return this.email_participant;
    }

    public void setEmail_participant(String email_participant) {
        this.email_participant = email_participant;
    }

    public String getPassword_participant() {
        return this.password_participant;
    }

    public void setPassword_participant(String password_participant) {
        this.password_participant = password_participant;
    }
    
}

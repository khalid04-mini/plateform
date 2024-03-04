public class Formateur {

    

    // attribut
    private int id_Formateur ;
    private String nom_Formateur ;
    private String email_Formateur ;
    private String password_Formateur ;
    
    // consrtuctor
    public Formateur() {
        
    }

    public int getid_Formateur(){
        return this.id_Formateur;
    }
    public void setid_Formateur(int id_Formateur){
        this.id_Formateur = id_Formateur;
    }

    public String getnom_formateur(){
        return this.nom_Formateur;

    }
    public void setnom_formateur(String nom_Formateur){
        this.nom_Formateur = nom_Formateur;

    }
     public String getemail_Formateur() {
        return this.email_Formateur
     }
      public void setemail_formateur(String email_Formateur){
        this.email_Formateur = email_Formateur
    
      }

      public String getpassword_Formateur(){
         return this.password_Formateur;
      }
      
      public void setpassword_formateur(){
        this.password_Formateur= password_Formateur;
      }


}

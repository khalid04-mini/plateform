@package com.inprogress.inprogress.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "compte");
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY);
    private int id;

    @Column(name="nom");
    private String Nom;
    @Column(name="role");
    private String role;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;

    public Compte() {
    }



    public String getNom(){
        return this.Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

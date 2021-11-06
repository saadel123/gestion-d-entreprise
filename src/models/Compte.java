/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author mehdierror404
 */
public class Compte {
    private int iduser;
    private String nom;
    private String prenom;
    private String user;
    private String password;
    private String role;
    private String QUESTION;
    private String ANSWER;
    
    

    public Compte() {
    }

    public Compte(int iduser, String nom, String prenom, String user, String password, String role, String QUESTION, String ANSWER) {
        this.iduser = iduser;
        this.nom = nom;
        this.prenom = prenom;
        this.user = user;
        this.password = password;
        this.role = role;
        this.QUESTION = QUESTION;
        this.ANSWER = ANSWER;
    }

 

    public int getIduser() {
        return iduser;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getQUESTION() {
        return QUESTION;
    }

    public void setQUESTION(String QUESTION) {
        this.QUESTION = QUESTION;
    }

    public String getANSWER() {
        return ANSWER;
    }

    public void setANSWER(String ANSWER) {
        this.ANSWER = ANSWER;
    }

    @Override
    public String toString() {
        return   iduser + " / " + nom + " _ " + prenom + "(" + role +")";
    }
    
    
    
}

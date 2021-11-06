/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author mehdierror404
 */
public class Client {

    private int idclt;
    private String nom;
    private String Prenom;
    private Date date_rend;
    private String email;
    private String tel;
    private int prix_ser;
    int versement;
    private Location Location;
    

    public Client() {
    }

    public Client(int idclt, String nom, String Prenom, Date date_rend, String email, String tel, int prix_ser, int versement, Location Location) {
        this.idclt = idclt;
        this.nom = nom;
        this.Prenom = Prenom;
        this.date_rend = date_rend;
        this.email = email;
        this.tel = tel;
        this.prix_ser = prix_ser;
        this.versement = versement;
        this.Location = Location;
    }

  
    

    

    public int getIdclt() {
        return idclt;
    }

    public void setIdclt(int idclt) {
        this.idclt = idclt;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public Date getDate_rend() {
        return date_rend;
    }

    public void setDate_rend(Date date_rend) {
        this.date_rend = date_rend;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getPrix_ser() {
        return prix_ser;
    }

    public void setPrix_ser(int prix_ser) {
        this.prix_ser = prix_ser;
    }

    public Location getLocation() {
        return Location;
    }

    public void setLocation(Location location) {
        this.Location = Location;
    }

    public int getVersement() {
        return versement;
    }

    public void setVersement(int versement) {
        this.versement = versement;
    }

    @Override
    public String toString() {
        return idclt + "     " + nom + "_" + Prenom;
    }

}

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
public class Location {
    int id_loc;
    String rue_Adresse;
    String ville;
    int code_postal;

    public Location() {
    }

    public Location(int id_loc, String rue_Adresse, String ville, int code_postal) {
        this.id_loc = id_loc;
        this.rue_Adresse = rue_Adresse;
        this.ville = ville;
        this.code_postal = code_postal;
    }

    public int getId_loc() {
        return id_loc;
    }

    public void setId_loc(int id_loc) {
        this.id_loc = id_loc;
    }

    public String getRue_Adresse() {
        return rue_Adresse;
    }

    public void setRue_Adresse(String rue_Adresse) {
        this.rue_Adresse = rue_Adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getCode_postal() {
        return code_postal;
    }

    public void setCode_postal(int code_postal) {
        this.code_postal = code_postal;
    }

 

    @Override
    public String toString() {
        return rue_Adresse +"    /"+ville +"(" + code_postal+")";
    }

   
    
    
    
}

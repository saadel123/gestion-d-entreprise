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
public class Employee {
    private int idemp;
   private String nom;
   private String Prenom;
    private String adresse;
   private String tel;
   private String email;
   private String departement;
   private int salary;
    private int rib;

    public Employee() {
    }

    public Employee(int idemp, String nom, String Prenom, String adresse, String tel, String email, String departement, int salary, int rib) {
        this.idemp = idemp;
        this.nom = nom;
        this.Prenom = Prenom;
        this.adresse = adresse;
        this.tel = tel;
        this.email = email;
        this.departement = departement;
        this.salary = salary;
        this.rib = rib;
    }

    public int getIdemp() {
        return idemp;
    }

    public void setIdemp(int idemp) {
        this.idemp = idemp;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getRib() {
        return rib;
    }

    public void setRib(int rib) {
        this.rib = rib;
    }


    @Override
    public String toString() {
        return idemp+"  :   "+nom+"_"+Prenom;
    }
    

   
   
}

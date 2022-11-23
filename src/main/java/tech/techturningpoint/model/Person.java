package tech.techturningpoint.model;

import java.util.List;
import java.util.Optional;

/**
 * Bean pour un super bonhomme.
 */
public class Person {

    /**
     * Age du capitaine.
     */
    private int age;

    /**+-
     * Nom public.
     */
    public String nom;

    /**
     * M : Homme, F : femme ou autre.
     *
     */
    public String sexe;


    /**
     * Liste d'artistes dans l'iPod de la personne.
     */
    public List<Artiste> dansMonIpod;

    public List<Artiste> getDansMonIpod() {
        return dansMonIpod;
    }

    /**
     * Responsable de la personne.
     */
    public Optional <Person> chef = Optional.empty();


    public Optional<Person> getChef() {
        return chef;
    }
    /**
     * Constructeur.
     * @param nom nom usuel
     * @param age age
     * @param sexe M ou F ?
     */
    public Person(String nom, int age, String sexe) {
        this.age = age;
        this.nom = nom;
        this.sexe = sexe;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }


   // @Override
    /*public String toString() {
        return "Person{" +
                "nom='" + nom + '\'' +
                '}';
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", nom='" + nom + '\'' +
                ", sexe='" + sexe + '\'' +
                ", dansMonIpod=" + dansMonIpod +
                ", chef=" + chef +
                '}';
    }
}

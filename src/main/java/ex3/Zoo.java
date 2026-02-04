package ex3;

import java.util.List;

public class Zoo {

    private String nom;
    private List<Animal> animals;

    public Zoo(String nom) {
        this.nom = nom;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void afficherListeAnimaux() {
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i).getNom() + " " + animals.get(i).getType() + " " + animals.get(i).getComportement());
        }
    }

    public int taille() {
        return animals.size();
    }

    /**
     * Getter for nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}

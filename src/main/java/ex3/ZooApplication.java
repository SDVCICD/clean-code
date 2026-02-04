package ex3;

public class ZooApplication {

    public static void main(String[] args) {
        Zoo zoo = new Zoo("Thoiry");

        zoo.addAnimal(new Animal("Gazelle", "MAMMIFERE", Comportement.HERBIVORE));
        zoo.addAnimal(new Animal("Zèbre", "MAMIFERE", Comportement.HERBIVORE));
        zoo.addAnimal(new Animal("Lion", "MAMMIFERE", Comportement.HERBIVORE));
        zoo.addAnimal(new Animal("Panthère", "MAMMIFERE", Comportement.CARNIVORE));
        zoo.addAnimal(new Animal("Requin blanc", "POISSON", Comportement.HERBIVORE));
        zoo.addAnimal(new Animal("Truite dorée", "POISSON", Comportement.HERBIVORE));
        zoo.addAnimal(new Animal("Boa constrictor", "SERPENT", Comportement.CARNIVORE));
        zoo.addAnimal(new Animal("Python", "SERPENT", Comportement.CARNIVORE));
    }

}

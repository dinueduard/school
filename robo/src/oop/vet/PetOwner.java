package oop.vet;

public class PetOwner {
    protected WildAnimalPet firstPet;
    protected WildAnimalPet secondPet;

    public PetOwner(WildAnimalPet firstPet, WildAnimalPet secondPet) {
        this.firstPet = firstPet;
        this.secondPet = secondPet;
    }

    public void takePetsToVet (Vet vet){
        vet.giveShotTo(firstPet);
        vet.giveShotTo(secondPet);


    }
    public void playWithPets () {
        firstPet.play();
        secondPet.play();
    }
}

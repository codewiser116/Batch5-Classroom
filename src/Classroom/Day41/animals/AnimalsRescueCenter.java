package Classroom.Day41.animals;

import java.util.ArrayList;

public class AnimalsRescueCenter {
    private ArrayList<Animal> rescuedAnimals = new ArrayList<>();
    private ArrayList<Animal> adoptedAnimals = new ArrayList<>();

    public void addAnimal(Animal animal){
        this.rescuedAnimals.add(animal);
        System.out.println(animal.getName() + " is registered!");
    }

    public void listAnimal(){
        for (Animal rescuedAnimal : rescuedAnimals) {
            rescuedAnimal.displayAnimalInfo();
        }
    }

    public void adoptAnimal(String name){
        for(int i = 0; i < rescuedAnimals.size(); i++){
            if(rescuedAnimals.get(i).getName().equals(name)){
                // change adoption status
                rescuedAnimals.get(i).setAdoptionStatus(true);
                // add to adoptedAnimals list
                adoptedAnimals.add(rescuedAnimals.get(i));
                // then remove from rescuedAnimals list
                rescuedAnimals.remove(i);
                break;
            }
        }
    }

    public void listAdoptedAnimal(){
        for (Animal rescuedAnimal : adoptedAnimals) {
            rescuedAnimal.displayAnimalInfo();
        }
    }

    public void listRescuedAnimalsByType(String type){
        for (Animal rescuedAnimal : rescuedAnimals) {
            if(type.equals("Dog") && rescuedAnimal instanceof Dog){
                rescuedAnimal.displayAnimalInfo();
            }
            else if(type.equals("Cat") && rescuedAnimal instanceof Cat){
                rescuedAnimal.displayAnimalInfo();
            }
            else if(type.equals("bird") && rescuedAnimal instanceof Bird){
                rescuedAnimal.displayAnimalInfo();
            }
        }
    }

}

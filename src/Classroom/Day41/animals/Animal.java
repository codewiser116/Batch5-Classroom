package Classroom.Day41.animals;

public abstract class Animal {
    private String name;
    private int age;
    private boolean adoptionStatus = false;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdoptionStatus() {
        return adoptionStatus;
    }

    public void setAdoptionStatus(boolean adoptionStatus) {
        this.adoptionStatus = adoptionStatus;
    }

    public void displayAnimalInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Adoption status: " + adoptionStatus);
    }
}

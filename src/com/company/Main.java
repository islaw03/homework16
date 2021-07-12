package com.company;

public class Main {

    public static void main(String[] args) {
        parrot kesha = new parrot();
        kesha.setAnimal("parrot");
        kesha.setAge(12);
        kesha.setName("Kesha");
        kesha.setBreed("prostoi");
        kesha.setColor("black");
        kesha.setTalk(false);
        System.out.println("Animal: " + kesha.getAnimal() + "\nName: " + kesha.getName() + "\nAge: " + kesha.getAge() +
                "\nColor: " + kesha.getColor() + "\nBreed: " + kesha.getBreed() + "\nIs talke ? " + kesha.isTalk);

        probel();

        parrot alex = new parrot();
        alex.setAnimal("parrot");
        alex.setAge(21);
        alex.setName("alex");
        alex.setColor("brown");
        alex.setBreed("ara");
        alex.setTalk(true);
        System.out.println("Animal" + alex.getAnimal() + "\nAge: " + alex.getAge() + "\nName: " + alex.getName()
                + "\nColor:" + alex.getColor() + "\nbreed: " + alex.getBreed() + "\nIs talke ? " + alex.isTalk);


        probel();
        Dog dog = new Dog();
        dog.setAnimal("Dog");
        dog.setAge(1);
        dog.setName("hatiko");
        dog.setBreed("Haski");
        dog.setColor("white");
        dog.setFamale(true);
        System.out.println("Animal: " + dog.getAnimal() + "\nName: " + dog.getName() + "\nAge: " + dog.getAge() + "\nColor: " +
                dog.getColor() + " \n Breed: " + dog.getBreed() + "\nisFamale ? " + dog.isFamale);
        probel();

        Cat garfield = new Cat();
        garfield.setAnimal("Cat");
        garfield.setName("Garfield");
        garfield.setAge(33);
        garfield.setBreed("siamase");
        garfield.setColor("yellow");
        garfield.setLivingAtHome(false);


        System.out.println("Animal: " + garfield.getAnimal() + "\nName: " + garfield.getName() + "\nAge: " + garfield.getAge()
                + "\nColor: " + garfield.getColor() + "\nBreed: " + garfield.getBreed() + "\nislivingHome? " + garfield.isLivingAtHome);






        

    }

    public static void probel() {
        System.out.println("____________________________________");

    }
}

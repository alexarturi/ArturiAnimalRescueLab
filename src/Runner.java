public class Runner {
    public static void main (String[]args){
        Animal animal = new Animal("Neutral", 10, true, 2);
        System.out.println("This is a generic animal");
        System.out.println("Name: " + animal.getName());
        System.out.println("Age: " + animal.getAge());
        System.out.println("Vaccinated?: " + animal.getVaccinated());
        System.out.println("Paws: " + animal.getPaws());
        animal.adopt();
        animal.sleep();
        animal.feed();

        Cat cat = new Cat("Meow", 2, false, 4);
        System.out.println("This is a cat");
        System.out.println("Name: " + cat.getName());
        System.out.println("Age: " + cat.getAge());
        System.out.println("Vaccinated?: " + cat.getVaccinated());
        System.out.println("Paws: " + cat.getPaws());
        cat.adopt();
        cat.sleep();
        cat.feed();
        cat.purr();
        System.out.println("Purr count: " + cat.getPurrCount());
        cat.play();
        System.out.println("Has played with?: " + cat.getHasPlayedWith());

        Dog dog = new Dog("Fluffy", 4, true, 4);
        System.out.println("This is a dog");
        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        System.out.println("Vaccinated?: " + dog.getVaccinated());
        System.out.println("Paws: " + dog.getPaws());
        dog.adopt();
        dog.sleep();
        dog.feed();
        dog.walk();
        System.out.println("Has been walked?: " + dog.getHasBeenWalked());
        dog.trick();
        System.out.println("Trick count: " + dog.getTrickCount());
    }
}

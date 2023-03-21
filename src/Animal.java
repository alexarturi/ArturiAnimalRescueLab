
public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private int paws;

    public Animal(String name, int age, boolean vaccinated, int paws){
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
        this.paws = paws;
    }

    public void sleep(){
        System.out.println("ZZZZZZ");
    }
    public void adopt(){
        System.out.println("I have been adopted.");
    }
    public void feed(){
        System.out.println("I have been fed.");
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public boolean getVaccinated(){
        return vaccinated;
    }
    public int getPaws(){
        return paws;
    }
}

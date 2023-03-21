public class Dog extends Animal{
    private boolean hasBeenWalked;
    private int trickCount;
    public Dog(String name, int age, boolean vaccinated, int paws){
        super(name, age, vaccinated, paws);
        hasBeenWalked = false;
        trickCount = 0;
    }

    public void trick(){
        System.out.println("Cool trick!");
        trickCount++;
    }

    public void walk(){
        System.out.println("Thanks for walking me.");
        hasBeenWalked = true;
    }

    public boolean getHasBeenWalked(){
        return hasBeenWalked;
    }
    public int getTrickCount(){
        return trickCount;
    }
}

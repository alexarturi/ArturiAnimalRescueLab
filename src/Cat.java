public class Cat extends Animal{
    private boolean hasPlayedWith;
    private int purrCount;
    public Cat(String name, int age, boolean vaccinated, int paws){
        super(name, age, vaccinated, paws);
        hasPlayedWith = false;
        purrCount = 0;
    }
    public void purr(){
        System.out.println("Purrrrrrr");
        purrCount++;
    }
    public void play(){
        System.out.println("Thanks for playing with me.");
        hasPlayedWith = true;
    }

    public int getPurrCount(){
        return purrCount;
    }

    public boolean getHasPlayedWith(){
        return hasPlayedWith;
    }
}

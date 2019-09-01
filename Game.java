public class Game{

    public static void main(String args[])
    {
        System.out.println("**********Welcome to my Video Game Mario Bros**********");
        
        Character mario=new Character("Mario (M)",3,100,10,5);

        Character Toad=new Character("Toad D",3,100,50,4);
        mario.printCharacter();
        Toad.printCharacter();

        mario.attack(Toad);
        Toad.attack(mario);
        Toad.attack(mario);
        Toad.attack(mario);
        
        Toad.attack(mario);

        Toad.attack(mario);
        Toad.attack(mario);
        

    }
}
public class Character{

    //attributes

    private int lifePoints;
    private int energy;
    private int attackPoints;
    private int bonusPoints;

    public String name;

    public void setLifePoints(int lifePoints){
        this.lifePoints=lifePoints;
    }

    public int getLifePoints(){
        return lifePoints;
    }

    public void setEnergy(int energy){
        this.energy=energy;
    }

    public int getEnergy(){
        return energy;
    }

    public void setattackPoints(int attackPoints){
        this.attackPoints=attackPoints;
    }

    public int getattackPoints(){
        return attackPoints;
    }

    public void setbonusPoints(int bonusPoints){
        this.bonusPoints=bonusPoints;
    }

    public int getbonusPoints(){
        return bonusPoints;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void printCharacter(){
        System.out.println(name + "\nLifePoints: " + lifePoints + "\nEnergy: " + energy+"\nAttack Points: "+attackPoints);
    }

    public Character(String name, int lifePoints, int energy, int attackPoints, int bonusPoints)
    {
        this.name=name;
        this.lifePoints=lifePoints;
        this.energy=energy;
        this.attackPoints=attackPoints;
        this.bonusPoints=bonusPoints;
    }

    public void attack(Character opponent){
        int lp;
        int newlp;
        int opponentLP=opponent.getLifePoints();
        int attackP=getattackPoints();
        System.out.println(name+" is attacking ..."+ opponent.getName());

        int newenergy=opponent.getEnergy()-getattackPoints();
        opponent.setEnergy(newenergy);
        opponent.printCharacter();

        if(opponent.getEnergy()<=0)
        {
            //System.out.println(name +" Kills ..."+opponent.getName());

            int newLP=opponent.getLifePoints()-1;
            opponent.setLifePoints(newLP);
            opponent.setEnergy(100);
            opponent.printCharacter();
        }

        if(opponent.getLifePoints()<=0)
        {
            System.out.println("****"+name+" Wins , GAME OVER, Congratulations!! *****");
        }
        
    }
}
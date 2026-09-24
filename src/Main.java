public class Main {
    Character Mo = new Character("Mo", 100, 100, 1, 1, 100, true);
    Character Enermy = new Character("Goblin",100,100,1,true);

    String[] Crahrakter = new String[]{"W(Warrior)", "M(Mage)", "R(Rogue)"};
    String Inv = "Iventory (6 items): ";
    String[] items ={"bow", "gun", "magic" ,"Sword" ,"Shield" , "Potion"};


    void main() {


        printCharacterSheet();
        printIventory();
        heal(25);
        isHealthCritical();
        getHealthPercentage();
        takingDamage(50);
        addXp(35);
        System.out.println(Inv);
        addGold(20);
        removeGold(50);
        levelUp();





    }

    void heal(int amount) {
        Mo.healthpoints += amount;
    }
    void takingDamage(int amount){
        int Damage= amount;
        Mo.healthpoints -= Damage;
        System.out.println("You took " + Damage + " Damage ");
        System.out.println(Mo.healthpoints + " Health ");
        AliveStatus();
    }
    boolean isHealthCritical(){
        if (Mo.healthpoints <= 25){
            System.out.println("Warning low health");
            return true;
        }else {
            System.out.println("High HP");
            return false;
        }

    }
    boolean AliveStatus(){
        if(Mo.healthpoints <=0){
            Mo.alive=false;
            return false;
        }
        System.out.println("Warrior alive: " + Mo.alive);
        Mo.alive= true;
        return true;
    }
    double getHealthPercentage(){
        return (double) Mo.healthpoints/ Mo.maxhealth*100;
    }
    void addXp(int amount){
        Mo.exp += amount;



    }
    void addGold(double amount){
        Mo.Gold += amount;
    }
    void levelUp(){
        while(Mo.exp > 1000){
            Mo.exp -= 1000;
            Mo.level ++;
            Mo.maxhealth += 10;
            Mo.healthpoints = Mo.maxhealth;
        }
        System.out.println("you have leveled up! Your new level is " + Mo.level);
    }
    boolean removeGold(double amount){
        if (Mo.Gold < amount) {
            System.out.println("Not enough gold");
            return false;
        }else {
            Mo.Gold-=amount;
            System.out.println("You paid " + amount);
            return true;

        }
    }
    void printCharacterSheet(){
           System.out.println("You have chosen: " + Mo.name);
           System.out.println("You have " + Mo.healthpoints + " Health");
           System.out.println("Maximum Health " + Mo.maxhealth);
           System.out.println(" level " + Mo.level);
           System.out.println("Exp " + Mo.exp);
           System.out.println("Gold " + Mo.Gold);
           System.out.println("Alive " + Mo.alive);
        if(Mo.exp >=1000){
            System.out.println("Ready to level up!");

        }

    }
    void printIventory(){
        String Inv = "Iventory (6 items): ";
        String[] items ={"bow", "gun", "magic" ,"Sword" ,"Shield" , "Potion"};
        for(int i = 0; i < items.length; i++){
            System.out.println(i+1+". " + items[i]);}


    }




    }














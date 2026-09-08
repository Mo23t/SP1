
import java.util.Arrays;

public class Main {
    String Herobuilder = "Ragnar";
    int Healthpoints = 85;
    int Maxhealth = 100;
    int level = 5;
    int Exp = 2300;
    double Gold = 156.5;
    boolean Alive = true;
    String[] Crahrakter = new String[]{"W(Warrior)", "M(Mage)", "R(Rogue)"};
    String Inv = "Iventory (6 items): ";
    String[] items ={"bow", "gun", "magic" ,"Sword" ,"Shield" , "Potion"};
    String Status = "Ready to level up!";
    String living = "Ragnar is still alive";

    void main() {

        System.out.println("You have chosen: " + Herobuilder);
        System.out.println("You have " + Healthpoints + " Health");
        System.out.println("Maximum Health " + Maxhealth);
        System.out.println(" level " + level);
        System.out.println("Exp " + Exp);
        System.out.println("Gold " + Gold);
        System.out.println("Alive " + Alive);
        System.out.println(Inv);
        for(int i = 0; i < items.length; i++){
            System.out.println(i+1+". " + items[i]);
        }

        if (Healthpoints <= 25){
            System.out.println("Warning low health");
        }else {
            System.out.println("High HP");
        }




        int Damage= 35;
        Healthpoints -= Damage;
        System.out.println("You took " + Damage + " Damage ");
        System.out.println(Healthpoints + " Health ");
        AliveStatus();



    }

    void Exp(){

        if(Exp >=1000){
            System.out.println("Ready to level up!");

        }


    }


    void AliveStatus(){
        if(Healthpoints <=0){
            Alive=false;
        }
        System.out.println("Warrior alive: " + Alive);

    }


}

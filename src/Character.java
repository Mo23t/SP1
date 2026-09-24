public class Character {
    String name;
    int healthpoints;
    int maxhealth;
    int level;
    int exp;
    double Gold;
    boolean alive;

    Character(String name, int healthpoints, int maxhealth, int level, int exp, double Gold, boolean alive) {
        this.name = name;
        this.healthpoints = healthpoints;
        this.maxhealth = maxhealth;
        this.level = level;
        this.exp = exp;
        this.Gold = Gold;
        this.alive = alive;


    }

    Character(String name, int healthpoints, int maxhealth, int level, boolean alive) {
        this.name = name;
        this.healthpoints = healthpoints;
        this.maxhealth = maxhealth;
        this.level = level;
        this.alive = alive;
    }

}







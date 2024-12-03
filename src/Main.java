class rpg {

    public static void main(String[] args){
        Wizard wizard = new Wizard("Merlin",100, 10,5);
        Warrior warrior = new Warrior("Ragnar",100,7,10);
        Archer archer = new Archer("Elf",100,5,5);
        // Task 5: Create an object/instance of your new character's class.

        System.out.println(wizard.getName() + "'s health: " + wizard.getHealth());
        System.out.println(warrior.getName()+"'s health: " + warrior.getHealth());
        System.out.println("Game is starting...");

        wizard.setHealthWarrior(warrior);
        System.out.println( warrior.getName()+" attacks " + wizard.getName() + ". Health updated: " + wizard.getHealth());

        archer.setHealthWarrior(warrior);
        System.out.println(warrior.getName()+" attacks " + archer.getName() + ". Health updated: " + archer.getHealth());

        System.out.println("-----------------------------------------");

        warrior.setHealthWizard(wizard);
        System.out.println( wizard.getName()+" attacks " + warrior.getName() + ". Health updated: " + warrior.getHealth());

        archer.setHealthWizard(wizard);
        System.out.println( wizard.getName()+" attacks " + archer.getName() + ". Health updated: " + archer.getHealth());

        System.out.println("-----------------------------------------");

       warrior.setHealthArcher(archer);
       System.out.println(archer.getName() + " attacks " + warrior.getName() + ". Health updated: " + warrior.getHealth());

       wizard.setHealthArcher(archer);
       System.out.println(archer.getName() + " attacks " + wizard.getName() + ". Health updated: " + wizard.getHealth());

        System.out.println("-----------------------------------------");
       // Task 6: make the wizard attack your new character.

        // Task 7: display the new stats


        // CHALLENGE: Update your program for all the characters to be able to attack each other.
    }
}


class Wizard {
    private String name;
    private int health;
    private int darkMagic;
    private int wizardArmor;

    public Wizard(String name, int health, int darkMagic, int wizardArmor){
        this.name = name;
        this.health = health;
        this.darkMagic = darkMagic;
        this.wizardArmor = wizardArmor;
    }

    public String getName() {
        return name;
    }

    public int getDarkMagic(){
        return darkMagic;
    }

    public void setHealthWarrior(Warrior attack) {
        health = health - (attack.getSword() - wizardArmor);
    }

    public void setHealthArcher(Archer attack) {
        health = health - (attack.getBow() - wizardArmor);
    }

    public int getHealth() {
        return health;
    }

}

class Warrior {
    private String name;
    private int health;
    private int sword;
    private int metalArmor;

    public Warrior(String name, int health, int sword, int metalArmor){
        this.name = name;
        this.health = health;
        this.sword = sword;
        this.metalArmor = metalArmor;
    }

    public String getName() {
        return name;
    }

    public int getSword() {
        return sword;
    }

    public int getHealth() {
        return health;
    }

    public void setHealthWizard(Wizard attack) {
        health = health - (attack.getDarkMagic() - metalArmor);
    }

    public void setHealthArcher(Archer attack) {
        health = health - (attack.getBow() - metalArmor);
    }

}

// Task 1: Write another class here for a different type of character (e.g. archer)
class Archer{
    private String name;
    private int health;
    private int bow;
    private int archerArmor;

    public Archer(String name, int health, int bow, int archerArmor){
        this.name = name;
        this.health = health;
        this.bow = bow;
        this.archerArmor = archerArmor;
    }
    public String getName() {
        return name;

    }

    public int getHealth() {
        return health;

    }

    public int getBow() {
        return bow;
    }

    public int getArcherArmor() {
        return archerArmor;

    }

    public void setHealthWizard(Wizard attack) {
        health = health - (attack.getDarkMagic() - archerArmor);
    }
    public void setHealthWarrior(Warrior attack) {
        health = health - (attack.getSword() - archerArmor);

    }

}
// Task 2: Write instance variables

// Task 3: Write the constructor

// Task 4: Write the necessary getter(accessor) and setter(modifier) methods.
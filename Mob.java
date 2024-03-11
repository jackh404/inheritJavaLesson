public class Mob {

    private int maxHealth;
    private int health;
    private int speed;
    private String name;
    private String[] drops;

    public Mob(String name, int maxHealth, int speed, String[] drops) {
        this.maxHealth = maxHealth;
        this.speed = speed;
        this.name = name;
        this.drops = drops;
        this.health = maxHealth;
    }
    public Mob() {
        this.maxHealth = 0;
        this.health = 0;
        this.speed = 0;
        this.name = "None";
        this.drops = new String[0];
    }
    public String[] getDrops() {
        return drops;
    }
    public int getHealth() {
        return health;
    }
    public int getSpeed() {
        return speed;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return name + " Health: " + health + " Speed: " + speed;
    }
    public int getMaxHealth() {
        return maxHealth;
    }
    public void setHealth(int health) {
        this.health = health;
    }
}

class Passive extends Mob {

    public Passive(String name, int maxHealth, int speed, String[] drops) {
        super(name, maxHealth, speed, drops);
    }

    private void eat(){
        if (super.getHealth() < this.getMaxHealth()){
            super.setHealth(super.getHealth() + 1);
        }
    }
}

class Hostile extends Mob {

    private int attackPower;

    private void attack(Mob victim) {
        victim.setHealth(victim.getHealth() - this.attackPower);
        
    }
    public Hostile(String name, int health, int speed, String[] drops, int attackPower) {
        super(name, health, speed, drops);
        this.attackPower = attackPower;
    }
}
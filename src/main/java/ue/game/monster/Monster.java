package ue.game.monster;

public class Monster{
    private String name;
    private int minAttack;
    private int maxAttack;
    private int minHit;
    private int maxHit;
    private boolean spirit;

    public Monster(String name, int minAttack, int maxAttack, int minHit, int maxHit){
        this(name, minAttack, maxAttack, minHit, maxHit, false);
    }

    public Monster(String name, int minAttack, int maxAttack, int minHit, int maxHit, boolean spirit){
        this.name = name;
        this.minAttack = minAttack;
        this.maxAttack = maxAttack;
        this.minHit = minHit;
        this.maxHit = maxHit;
        this.spirit = spirit;
    }


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMinAttack() {
		return minAttack;
	}

	public void setMinAttack(int minAttack) {
		this.minAttack = minAttack;
	}

	public int getMaxAttack() {
		return maxAttack;
	}

	public void setMaxAttack(int maxAttack) {
		this.maxAttack = maxAttack;
	}

	public int getMinHit() {
		return minHit;
	}

	public void setMinHit(int minHit) {
		this.minHit = minHit;
	}

	public int getMaxHit() {
		return maxHit;
	}

	public void setMaxHit(int maxHit) {
		this.maxHit = maxHit;
	}

	public boolean isSpirit() {
		return spirit;
	}

	public void setSpirit(boolean spirit) {
		this.spirit = spirit;
	}
}

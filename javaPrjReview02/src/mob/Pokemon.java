package mob;

public abstract class Pokemon implements PokemonAction{
	
	
	
	public Pokemon(int hp, int atk, String name) {
		this.hp = hp;
		this.atk = atk;
		this.name = name;
	}
	
	//field
	private int hp;
	private int atk;
	private String name;
	
	//method
	public void bodyAttack() {
		System.out.println(name + "의 몸통박치기~~");
	}
		
	//getter/setter
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		if(this.hp < hp) this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		if(this.atk < atk) this.atk = atk;
	}
	public String getName() {
		return name;
	}
	
	//toString
	@Override
	public String toString() {
		return "Pokemon [hp=" + hp + ", atk=" + atk + ", name=" + name + "]";
	}
	
}

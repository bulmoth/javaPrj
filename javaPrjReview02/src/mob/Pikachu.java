package mob;

public class Pikachu extends Pokemon {
	
	private static final String name = "��ī��";
	
	public Pikachu(int hp, int atk) {
		super(hp, atk, name);
	}
	
	@Override
	public void skill() {
		System.out.println("�鸸��Ʈ~!");
	}

}

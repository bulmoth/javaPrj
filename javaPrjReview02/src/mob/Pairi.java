package mob;

public class Pairi extends Pokemon {
	
	private static final String name = "���̸�";

	public Pairi(int hp, int atk) {
		super(hp, atk, name);
	}
	
	@Override
	public void skill() {
		System.out.println("���̾~~!");
	}

}

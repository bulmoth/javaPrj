package mob;

public class Kkobuki extends Pokemon{
	
	
	public Kkobuki(int hp, int atk) {
		super(hp, atk, name);
	}

	private static final String name = "꼬부기";

	@Override
	public void skill() {
		System.out.println("물대포~!");
	}
	

}

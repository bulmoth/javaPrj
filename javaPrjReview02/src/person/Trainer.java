package person;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import mob.Pokemon;

public class Trainer {
	
	public Trainer(String name) {
		this.name = name;
	}
	private String name;
	private final Map<String, Pokemon> pocket = new HashMap<>();
	
	public void addPokemon(Pokemon p) {
		pocket.put(p.getName(),p);
	}
	public Pokemon getPokemon(String name) {
		return pocket.get(name);
	}
	public void printAllPokemonName() {
		Set<String> s = pocket.keySet();
		System.out.println(name+ "의 가진 모든 포켓몬 이름-----");
		for(String str : s) {
			System.out.println(str);
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}

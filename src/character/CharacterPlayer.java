package character;

import enums.*;

public class CharacterPlayer extends Character {
  
	public String nom;
	public EnumRace race;
	public EnumClasse classe;
	
	public int level;
	public int hp, hpM, mp, mpM, str, def, mag, esp;
	
	public int exp, expToNext;
	
	public CharacterPlayer (String n, EnumRace r, EnumClasse c)
	{
		super(n);
		this.race = r;
		this.classe = c;
		this.exp = 0;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void levelUp() {
		level++;
		exp -= expToNext;
		expToNext *= 1.5;
	}
}

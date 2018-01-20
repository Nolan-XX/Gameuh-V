package character;

import enums.*;

public class CharacterPlayer extends Character {
  
	public String nom;
	public EnumRace race;
	public EnumClasse classe;
	
	public CharacterPlayer (String n, EnumRace r, EnumClasse c)
	{
		super(n);
		this.race = r;
		this.classe = c;
	}
}

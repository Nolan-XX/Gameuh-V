package character;

abstract class Character {
	
	public String nom;
	public int level;
	public int hp, hpM, mp, mpM, str, def, mag, esp;
	
	public Character(String n)
	{
	  this.nom = n;
	}
	
	public abstract void update();
	
	public abstract void levelUp();

}

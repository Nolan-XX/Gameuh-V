package enums;

public enum EnumClasse {
   PLD("Paladin", 200, 35, 100, 10, 15, 15, 25, 25, 15, 15, 25, 25),
   BLM("Mage",    100, 10, 250, 35, 5,   5, 10, 10, 30, 25, 15, 10),
   MNK("Moine",   100, 10, 50,  10, 30, 25, 15, 10, 5,   5, 5,  5);
	
   private final int bh, bm, bs, bd, bma, be;
   private final int gh, gm, gs, gd, gma, ge;
   private final String n;
   
   EnumClasse(String name, int base_hp, int hp_grow, int base_mp, int mp_grow, int str_base, int str_grow, int def_base, 
		   int def_grow, int mag_base, int mag_grow, int esp_base, int esp_grow) {
	   this.n  = name;
	   this.bh = base_hp;        this.gh = hp_grow;
	   this.bm = base_mp;        this.gm = mp_grow;
	   this.bs = str_base;       this.gs = str_grow;
	   this.bd = def_base;       this.gd = def_grow;
	   this.bma = mag_base;      this.gma = mag_grow;
	   this.be  = esp_base;      this.ge = esp_grow;
   }
   
   public String getName()   { return n;}
   public int getBaseHP()    { return bh;}
   public int getBaseMP()    { return bm;}
   public int getBaseSTR()   { return bs;}
   public int getBaseDEF()   { return bd;}
   public int getBaseMAG()   { return bma;}
   public int getBaseESP()   { return be;}
   public int getHPGrowth()  { return gh;}
   public int getMPGrowth()  { return gm;}
   public int getSTRGrowth() { return gs;}
   public int getDEFGrowth() { return gd;}
   public int getMAGGrowth() { return gma;}
   public int getESOGrowth() { return ge;}
}

package enums;

public enum EnumRace {
   Humain(0, 0, 0, 0, 0, 0), 
   Elfe(-10, 20, -2, -2, 2, 2), 
   Orc(20, -10, 2, 2, -2, -2);
   
   private final int bh, bm, bs, bd, bma, be;
   
   EnumRace(int bonusHP, int bonusMP, int bonusSTR, int bonusDEF, int bonusMAG, int bonusESP) {
	   this.bh = bonusHP;      this.bm = bonusMP;
	   this.bs = bonusSTR;     this.bd = bonusDEF;
	   this.bma = bonusMAG;    this.be = bonusESP;
   }
   
   public int getBonusHP()  { return bh;}
   public int getBonusMP()  { return bm;}
   public int getBonusSTR() { return bs;}
   public int getBonusDEF() { return bd;}
   public int getBonusMAG() { return bma;}
   public int getBonusESP() { return be;}
}

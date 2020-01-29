package pokemon;

/**
 * <b>Pokemon comme son nom l'indique est la classe des pokemons du jeu </b>
 * <p>
 * Pokemon est caracterisé par les informations suivantes :
 * <ul>
 * <li>Le nom et l'identifiant du pokemon</li>
 * <li>Son xp et son xpnecessaire pour monter de niveau</li>
 * <li>Son lvl et son lvl necessaire pour évouer si le pokemon le peut</li>
 * <li>Ses statistiques d'attaque, de defense, de vitesse,d'attaque de base et de defense de base</li>
 * <li>Le booléen évoluable qui indique si le pokémon peut évoluer</li>
 * <li>Ses points vitaux ainsi que ses points vitaux maximum lorsqu'il est guéri</li>
 * <li>Le nom de son attaque et de sa défense</li>
 * <li>Son type de defense: c'est-à-dire si elle affecte l'attaque, la defense ou rend confus le pokemon adverse </li>
 * </ul>
 * </p>
 */
public class Pokemon {
	private String name;
	private int id;
	private int lvl;
	private double xp;
	private double atck;
	private double def;
	private String attack;
	private String defense;
	private double vitesse; 
	private String type;
	private double xpnecessaire;
	private double pv;
	private double pv_max;
	private boolean evoluable;
	private int lvlnecessaire;
	private int typedefense;
	private double atckdebase;
	private double defdebase;
	
	public Pokemon(int id,String name,int lvl,double atck,double def,String attack,String defense,double vitesse,String type,double xp,double xpnecessaire,double pv,double pv_max, boolean evoluable,int lvlnecessaire,int typedefense,double atckdebase,double defdebase) {
		this.id = id;
		this.name= name;
		this.lvl= lvl;
		this.xp= xp;
		this.atck= atck;
		this.def= def;
		this.attack= attack;
		this.defense= defense;
		this.vitesse= vitesse;
		this.type= type;
		this.pv= pv;
		this.pv_max= pv_max;
		this.setEvoluable(evoluable);
		this.setLvlnecessaire(lvlnecessaire);
		this.setTypedefense(typedefense);
		this.atckdebase=atckdebase;
		this.defdebase=defdebase;
		// TODO Auto-generated constructor stub
	}
	
	public double getPv() {
		return pv;
	}
	public void setPv(double pv) {
		this.pv = pv;
	}
	
	public double getXpnecessaire() {
		return xpnecessaire;
	}
	public void setXpnecessaire(double xpnecessaire) {
		this.xpnecessaire = xpnecessaire;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public double getXp() {
		return xp;
	}

	public void setXp(double xp) {
		this.xp = xp;
	}

	public double getAtck() {
		return atck;
	}

	public void setAtck(double d) {
		this.atck = d;
	}

	public double getDef() {
		return def;
	}

	public void setDef(double d) {
		this.def = d;
	}

	public String getAttack() {
		return attack;
	}

	public void setAttack(String attack) {
		this.attack = attack;
	}

	public String getDefense() {
		return defense;
	}

	public void setDefense(String defense) {
		this.defense = defense;
	}

	public double getVitesse() {
		return vitesse;
	}

	public void setVitesse(double vitesse) {
		this.vitesse = vitesse;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
     * Méthode qui va augmenter de un le niveau du pokemon dont l'xp a atteint l'xp necessaire
     * et augmenter ses statistiques d'après une formule choisie différemment pour chaque stat.  
     * 
     * @param pokemon: pokemon dont le niveau va potentiellement augmenter de un.
     */
	public static void levelup(Pokemon pokemon) {
		 while(pokemon.getXp() >= pokemon.getXpnecessaire()) {
			pokemon.setLvl(pokemon.getLvl() + 1);
			pokemon.setXp(pokemon.getXp()-pokemon.getXpnecessaire());
			pokemon.setXpnecessaire(pokemon.getXpnecessaire() + pokemon.getLvl());
			int nombreAleatoire = 7 + (int)(Math.random() * 6);
			int nombreAleatoire2 =2 + (int)(Math.random() * 4);
			int nombreAleatoire3 =1 + (int)(Math.random() * 3);
			int nombreAleatoire4 =3 + (int)(Math.random() * 5);
		 	pokemon.setPv_max(pokemon.getPv_max() + nombreAleatoire);
		 	pokemon.setAtck(pokemon.getAtck() + nombreAleatoire2);
		 	pokemon.setDef(pokemon.getDef() + nombreAleatoire3);
		 	pokemon.setVitesse(pokemon.getVitesse() + nombreAleatoire4);
		 	pokemon.setAtckdebase(pokemon.getAtck());
		 	pokemon.setDefdebase(pokemon.getDef());
		 	System.out.println("votre "+pokemon.getName()+" est passé au niveau "+pokemon.getLvl())	;			 
		 }
		 System.out.println("");
	 }


	public double getPv_max() {
		return pv_max;
	}

	public void setPv_max(double pv_max) {
		this.pv_max = pv_max;
	}

	public boolean isEvoluable() {
		return evoluable;
	}

	public void setEvoluable(boolean evoluable) {
		this.evoluable = evoluable;
	}

	public int getLvlnecessaire() {
		return lvlnecessaire;
	}

	public void setLvlnecessaire(int lvlnecessaire) {
		this.lvlnecessaire = lvlnecessaire;
	}

	public int getTypedefense() {
		return typedefense;
	}

	public void setTypedefense(int typedefense) {
		this.typedefense = typedefense;
	}

	public double getAtckdebase() {
		return atckdebase;
	}

	public void setAtckdebase(double d) {
		this.atckdebase = d;
	}

	public double getDefdebase() {
		return defdebase;
	}

	public void setDefdebase(double d) {
		this.defdebase = d;
	}
	
	
}



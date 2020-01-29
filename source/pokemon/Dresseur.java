package pokemon;

import java.util.ArrayList;

/**
 * <b>Dresseur est la classe qui va gérer le personnage du joueur</b>
 * <p>
 * Dresseur est caracterisé par les informations suivantes :
 * <ul>
 * <li>Le nom du dresseur choisi par le joueur</li>
 * <li>Son sexe</li>
 * <li>sa positionx et sa positiony sur la carte du jeu</li>
 * <li>Listpokemon, la liste des pokemons du dresseur</li>
 * <li>son nombre de potion</li>
 * <li>Le montant d'argent qu'il possède</li>
 * <li>le nombre de badge possédé par le dresseur</li>
 * <li>le nombre de pokeballs possédé par le dresseur</li>
 * </ul>
 * </p>
 * <p>
 */
public class Dresseur {
	private String nom;
	private String sexe;
	private int positionx;
	private int positiony;
	protected ArrayList<Pokemon> Listpokemon;
	private int potion;
	private int argent;
	private int nb_badge;
	private int nb_pokeball;
	
	
	public Dresseur(String nom, String sexe, int positionx, int positiony,ArrayList<Pokemon> Listpokemon , int potion, int argent, int nb_badge,int nb_pokeball) {
		this.nom=nom;
		this.sexe=sexe;
		this.positionx=positionx;
		this.positiony=positiony;
		this.Listpokemon=Listpokemon;
		this.potion=potion;
		this.argent=argent;
		this.nb_badge=nb_badge;
		this.nb_pokeball=nb_pokeball;
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public int getPositionx() {
		return positionx;
	}

	public void setPositionx(int positionx) {
		this.positionx = positionx;
	}

	public int getPositiony() {
		return positiony;
	}

	public void setPositiony(int positiony) {
		this.positiony = positiony;
	}

	public ArrayList<Pokemon> getListpokemon() {
		return Listpokemon;
	}

	public void setPokemon(ArrayList<Pokemon> Listpokemon) {
		this.Listpokemon = Listpokemon;
	}

	public int getPotion() {
		return potion;
	}

	public void setPotion(int potion) {
		this.potion = potion;
	}

	public int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}

	public int getNb_badge() {
		return nb_badge;
	}

	public void setNb_badge(int nb_badge) {
		this.nb_badge = nb_badge;
	}

	/**
     * Méthode qui va changer la position du dresseur par rapport
     * à la chaîne de caractère direction établi par une entrée clavier
     * 
     * @param dresseur: le dresseur du joueur
     */
	public static void deplacement(Dresseur dresseur,String direction) {
		
			if (direction.equals("z") & ((dresseur.getPositiony()-1)!=0)) {
				dresseur.setPositiony(dresseur.getPositiony()-1);
			}
			else if (direction.equals("s") & ((dresseur.getPositiony()+1)!=0)) {
				dresseur.setPositiony(dresseur.getPositiony()+1);
			}
			else if (direction.equals("q") & ((dresseur.getPositionx()+1)!=0)) {
				dresseur.setPositionx(dresseur.getPositionx()-1);
			}
			else if (direction.equals("d") & ((dresseur.getPositionx()+1)!=0)) {
				dresseur.setPositionx(dresseur.getPositionx()+1);
			}
	}
	public void interaction() {
		
	}
	public void decision() {
		
	}

	public int getNb_pokeball() {
		return nb_pokeball;
	}

	public void setNb_pokeball(int nb_pokeball) {
		this.nb_pokeball = nb_pokeball;
	}


}

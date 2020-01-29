package pokemon;

import java.util.ArrayList;
import java.util.Random;


/**
 * <b>PNJcombattant personnage non joueur que le dresseur peut rencontrer et affronter </b>
 * <p>
 * PNJcombattant est caracterisé par les informations suivantes :
 * <ul>
 * <li>Les attributs d'un PNJ</li>
 * <li>Sa liste de pokemon</li>
 * <li>Son nombre de potions </li>
 * </ul>
 * </p>
 */
public class PNJcombattant extends PNJ {
	
	protected ArrayList<Pokemon> listpokemon;
	private int potion;
	

	
	public PNJcombattant(String name, String punchline,int positionx, int positiony ,ArrayList<Pokemon> listpokemon,int potion) {
		super(name, punchline,positionx,positiony);
		this.setListpokemon(listpokemon);
		this.setPotion(potion);				
		// TODO Auto-generated constructor stub
	}



	public ArrayList<Pokemon> getListpokemon() {
		return listpokemon;
	}



	public void setListpokemon(ArrayList<Pokemon> listpokemon) {
		this.listpokemon = listpokemon;
	}



	public int getPotion() {
		return potion;
	}



	public void setPotion(int potion) {
		this.potion = potion;
	}
	
	
	private static Random numberGenerator = new Random();
	/**
     * Méthode qui va génerer au hasard un pokemon d'une liste de pokemon.  
     * 
     * @param listpokemon1: liste de tous les pokemons de type plante
     */
	
	public Pokemon randomElement(ArrayList<Pokemon> listpokemon) {
		 return listpokemon.get(numberGenerator.nextInt(5));}
	
	/**
     * Méthode qui va génerer au hasard une liste de pokemon des 3 types.  
     * 
     * @param listpokemon1: liste de tous les pokemons de type plante
     * 
     * @param listpokemon2: liste de tous les pokemons de type eau
     * 
     * @param listpokemon3: liste de tous les pokemons de type feu
     * 
     * 
     */
	public void generation_pokemon(ArrayList<Pokemon> listpokemon1,ArrayList<Pokemon> listpokemon2,ArrayList<Pokemon> listpokemon3) {
		Pokemon randomPokemonPlante = randomElement(listpokemon1);
		Pokemon randomPokemonFeu = randomElement(listpokemon2);
		Pokemon randomPokemonEau = randomElement(listpokemon3);
		
		
		this.listpokemon.add(randomPokemonPlante);
		this.listpokemon.add(randomPokemonFeu);
		this.listpokemon.add(randomPokemonEau);
		for(Pokemon pok:listpokemon) {
			int nombreAleatoire = pok.getLvl()-4 + (int)(Math.random() * 11);
			pok.setLvl(nombreAleatoire);
			int nombreAleatoire2 = pok.getLvl()*2 + (int)(Math.random() * pok.getLvl()*4);
			int nombreAleatoire3 = pok.getLvl()*1 + (int)(Math.random() * pok.getLvl()*2);
			int nombreAleatoire4 = pok.getLvl()*3 + (int)(Math.random() * pok.getLvl()*5);
			int nombreAleatoire5 = pok.getLvl()*7 + (int)(Math.random() * pok.getLvl()*6);
			pok.setPv_max(nombreAleatoire5);
			pok.setPv(pok.getPv_max());
			pok.setAtck(nombreAleatoire2);
			pok.setAtckdebase(nombreAleatoire2);
			pok.setDef(nombreAleatoire3);
			pok.setDefdebase(nombreAleatoire3);
			pok.setVitesse(nombreAleatoire4);
		}
	}
}
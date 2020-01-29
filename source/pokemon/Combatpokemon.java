package pokemon;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * <b>Combatpokemon est la classe qui gère le combat entre le dresseur et un pokemon sauvage </b>
 * <p>
 * Combatpokemon est caracterisé par les informations suivantes :
 * <ul>
 * <li>Le dresseur qui combat</li>
 * <li>Le pokemon adverse qui est un pokemon sauvage rencontré</li>
 * </ul>
 * </p>
 * <p>
 * De plus, les entiers confusion1 et confusion2 établit si le pokemon en jeu
 * du dresseur et le pokemon adverse sont confus.
 * </p>
 */
public class Combatpokemon {
	private Dresseur dresseur;
	private Pokemon pokemonadverse;
	
	static int confusion1=0;
	static int confusion2=0;
	
	public Pokemon getPokemon() {
		return pokemonadverse;
	}
	public void setPokemonadverse(Pokemon pokemonadverse) {
		this.pokemonadverse = pokemonadverse;
	}
	public Dresseur getDresseur() {
		return dresseur;
	}
	public void setDreseur(Dresseur dresseur) {
		this.dresseur = dresseur;
	}
	
	public Combatpokemon(Dresseur dresseur, Pokemon pokemonadverse) {
		this.dresseur = dresseur;
		this.pokemonadverse = pokemonadverse;
	}
	
	/**
     * Les pokemons du jeu étant instanciés à un niveau fixe,
     * cette méthode va générer au hasard le niveau et les statistiques du
     * pokemon sauvage.
     * 
     * @param pokemonadverse: le pokemon sauvage affronté par le dresseur .
     * 
     */
	public static void niveaupokemonadverse(Pokemon pokemonadverse) {
		double l=0;
		if (pokemonadverse.getLvl()<16) {
			l=5+Math.random()*5;
			pokemonadverse.setLvl((int) l);
			int nombreAleatoire2 = pokemonadverse.getLvl()*2 + (int)(Math.random() * pokemonadverse.getLvl()*4);
			int nombreAleatoire3 = pokemonadverse.getLvl()*1 + (int)(Math.random() * pokemonadverse.getLvl()*2);
			int nombreAleatoire4 = pokemonadverse.getLvl()*3 + (int)(Math.random() * pokemonadverse.getLvl()*5);
			int nombreAleatoire5 = pokemonadverse.getLvl()*7 + (int)(Math.random() * pokemonadverse.getLvl()*6);
			pokemonadverse.setPv_max(nombreAleatoire5);
			pokemonadverse.setPv(pokemonadverse.getPv_max());
			pokemonadverse.setAtck(nombreAleatoire2);
			pokemonadverse.setAtckdebase(nombreAleatoire2);
			pokemonadverse.setDef(nombreAleatoire3);
			pokemonadverse.setDefdebase(nombreAleatoire3);
			pokemonadverse.setVitesse(nombreAleatoire4);
		}
		else if (pokemonadverse.getLvl()>=16 && pokemonadverse.getLvl()<25 ) {
			l=16+Math.random()*5;
			pokemonadverse.setLvl((int) l);
			int nombreAleatoire2 = pokemonadverse.getLvl()*2 + (int)(Math.random() * pokemonadverse.getLvl()*4);
			int nombreAleatoire3 = pokemonadverse.getLvl()*1 + (int)(Math.random() * pokemonadverse.getLvl()*2);
			int nombreAleatoire4 = pokemonadverse.getLvl()*3 + (int)(Math.random() * pokemonadverse.getLvl()*5);
			int nombreAleatoire5 = pokemonadverse.getLvl()*7 + (int)(Math.random() * pokemonadverse.getLvl()*6);
			pokemonadverse.setPv_max(nombreAleatoire5);
			pokemonadverse.setPv(pokemonadverse.getPv_max());
			pokemonadverse.setAtck(nombreAleatoire2);
			pokemonadverse.setAtckdebase(nombreAleatoire2);
			pokemonadverse.setDef(nombreAleatoire3);
			pokemonadverse.setDefdebase(nombreAleatoire3);
			pokemonadverse.setVitesse(nombreAleatoire4);
		}
		else if (pokemonadverse.getLvl()>=25 && pokemonadverse.getLvl()<32) {
			l=25+Math.random()*5;
			pokemonadverse.setLvl((int) l);
			int nombreAleatoire2 = pokemonadverse.getLvl()*2 + (int)(Math.random() * pokemonadverse.getLvl()*4);
			int nombreAleatoire3 = pokemonadverse.getLvl()*1 + (int)(Math.random() * pokemonadverse.getLvl()*2);
			int nombreAleatoire4 = pokemonadverse.getLvl()*3 + (int)(Math.random() * pokemonadverse.getLvl()*5);
			int nombreAleatoire5 = pokemonadverse.getLvl()*7 + (int)(Math.random() * pokemonadverse.getLvl()*6);
			pokemonadverse.setPv_max(nombreAleatoire5);
			pokemonadverse.setPv(pokemonadverse.getPv_max());
			pokemonadverse.setAtck(nombreAleatoire2);
			pokemonadverse.setAtckdebase(nombreAleatoire2);
			pokemonadverse.setDef(nombreAleatoire3);
			pokemonadverse.setDefdebase(nombreAleatoire3);
			pokemonadverse.setVitesse(nombreAleatoire4);
		}
		else {
			l=32+Math.random()*10;
			pokemonadverse.setLvl((int) l);
			int nombreAleatoire2 = pokemonadverse.getLvl()*2 + (int)(Math.random() * pokemonadverse.getLvl()*4);
			int nombreAleatoire3 = pokemonadverse.getLvl()*1 + (int)(Math.random() * pokemonadverse.getLvl()*2);
			int nombreAleatoire4 = pokemonadverse.getLvl()*3 + (int)(Math.random() * pokemonadverse.getLvl()*5);
			int nombreAleatoire5 = pokemonadverse.getLvl()*7 + (int)(Math.random() * pokemonadverse.getLvl()*6);
			pokemonadverse.setPv_max(nombreAleatoire5);
			pokemonadverse.setPv(pokemonadverse.getPv_max());
			pokemonadverse.setAtck(nombreAleatoire2);
			pokemonadverse.setAtckdebase(nombreAleatoire2);
			pokemonadverse.setDef(nombreAleatoire3);
			pokemonadverse.setDefdebase(nombreAleatoire3);
			pokemonadverse.setVitesse(nombreAleatoire4);
		}
	}
	
	
	public static int combatoufuite() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 : combattre ou 2:fuir");
		String decision = sc.nextLine();
		int decisionint;
		while (!decision.equals("1") && !decision.equals("2")) {
			System.out.println("mauvaise entrée");
			System.out.println("1 : combattre ou 2:fuir");
			decision = sc.nextLine();
		}
		decisionint = Integer.parseInt(decision);
		return decisionint;	
		
	}
	
	
	
	
	public static int attaqueoudefense() {
		String decision ="0";
		int decisionint = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("que voulez-vous faire ?");
		System.out.println("1: attaque, 2: defense");
		System.out.println("");
		decision = sc.nextLine();
		while(!decision.equals("1") && !decision.equals("2") ){
			System.out.println("mauvaise entrée, recommencez.");	
			System.out.println("que voulez-vous faire ?");
			System.out.println("1: attaque, 2: defense");
			decision = sc.nextLine();
		}
		decisionint =Integer.parseInt(decision);
		return decisionint;	
	}
		
	
	
	
	
	public static void attaquepokemonenjeu(Pokemon pokemonenjeu ,Pokemon pokemonadverse) {
		double degats=1;
		System.out.println(pokemonenjeu.getName() + " attaque " + pokemonenjeu.getAttack());
		System.out.println("");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			if (pokemonenjeu.getType().equals("plante")) {
				if(pokemonadverse.getType().equals("eau")){
					if (confusion2!=1) {
					degats = 2*(pokemonenjeu.getAtck() - pokemonadverse.getDef());
					System.out.println("C'est super efficace.");
					}
					else {
						System.out.println(pokemonenjeu.getName()+ "est confus, il ne peut pas attaquer");
						confusion2=0;
					}
				}
				else if(pokemonadverse.getType().equals("feu")) {
					if (confusion2!=1) {
					degats =0.5*( pokemonenjeu.getAtck() - pokemonadverse.getDef());
					System.out.println("Ce n'est pas très efficace.");
				}
				
				else {
					System.out.println(pokemonenjeu.getName()+ "est confus, il ne peut pas attaquer");
					confusion2=0;
				}
				}
				else {
					if (confusion2!=1) {
					degats = pokemonenjeu.getAtck() - pokemonadverse.getDef();
					}
					else {
						System.out.println(pokemonenjeu.getName()+ "est confus, il ne peut pas attaquer");
						confusion2=0;
					}
				}
			}
			else if (pokemonenjeu.getType().equals("eau")) {
				if(pokemonadverse.getType().equals("plante")){
					if (confusion2!=1) {
					degats = 0.5*(pokemonenjeu.getAtck() - pokemonadverse.getDef());
					System.out.println("Ce n'est pas très efficace.");
					}
					else {
						System.out.println(pokemonenjeu.getName()+ "est confus, il ne peut pas attaquer");
						confusion2=0;
					}
				}
				else if(pokemonadverse.getType().equals("feu")) {
					if (confusion2!=1) {
					degats =2*( pokemonenjeu.getAtck() - pokemonadverse.getDef());
					System.out.println("C'est super efficace.");
					}
					else {
						System.out.println(pokemonenjeu.getName()+ "est confus, il ne peut pas attaquer");
						confusion2=0;
					}
				}
				else {
					if (confusion2!=1) {
					degats = pokemonenjeu.getAtck() - pokemonadverse.getDef();
					}
					else {
						System.out.println(pokemonenjeu.getName()+ "est confus, il ne peut pas attaquer");
						confusion2=0;
					}
				}
			}
			else {
				if(pokemonadverse.getType().equals("plante")){
					if (confusion2!=1) {
					degats = 2*(pokemonenjeu.getAtck() - pokemonadverse.getDef());
					System.out.println("C'est super efficace.");
					}
					else {
						System.out.println(pokemonenjeu.getName()+ "est confus, il ne peut pas attaquer");
						confusion2=0;
					}
				}
				else if(pokemonadverse.getType().equals("eau")) {
					if (confusion2!=1) {
					System.out.println("Ce n'est pas très efficace.");
					degats =0.5*( pokemonenjeu.getAtck() - pokemonadverse.getDef());
					}
					else {
						System.out.println(pokemonenjeu.getName()+ "est confus, il ne peut pas attaquer");
						confusion2=0;
					}
				}
				else {
					if (confusion2!=1) {
					degats = pokemonenjeu.getAtck() - pokemonadverse.getDef();
					}
					else {
						System.out.println(pokemonenjeu.getName()+ "est confus, il ne peut pas attaquer");
						confusion2=0;
					}
				}
			}
			double pv = pokemonadverse.getPv() - degats ;
			pokemonadverse.setPv((int) pv);
			if(degats<=0) {
				degats =1;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(pokemonadverse.getName() + " perd " + degats + "pv");
			System.out.println(pokemonadverse.getName() + ": "+ pokemonadverse.getPv() + "/" + pokemonadverse.getPv_max() + "PV");
			if (pokemonadverse.getPv()<0) {
				System.out.println(pokemonadverse.getName()+" est k.o");
			}
			
			}
			
	
	
	
	
			
	public static void attaquepokemonadverse(Pokemon pokemonenjeu ,Pokemon pokemonadverse) {
		System.out.println(pokemonadverse.getName() + " attaque " + pokemonadverse.getAttack());
		double degats=1;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (pokemonenjeu.getType().equals("plante")) {
			if(pokemonadverse.getType().equals("eau")){
				if (confusion1!=1) {
				degats = 0.5*(pokemonadverse.getAtck() - pokemonenjeu.getDef());
				System.out.println("Ce n'est pas très efficace.");
				}
				else {
					System.out.println(pokemonadverse.getName()+ "est confus, il ne peut pas attaquer");
					confusion1=0;
				}
			}
			else if(pokemonadverse.getType().equals("feu")) {
				if (confusion1!=1) {
				degats =2*( pokemonadverse.getAtck() - pokemonenjeu.getDef());
				System.out.println("C'est super efficace.");
				}
				else {
					System.out.println(pokemonadverse.getName()+ "est confus, il ne peut pas attaquer");
					confusion1=0;
				}
			}
			else {
				if (confusion1!=1) {
				degats = pokemonadverse.getAtck() - pokemonenjeu.getDef();
				}
				else {
					System.out.println(pokemonadverse.getName()+ "est confus, il ne peut pas attaquer");
					confusion1=0;
				}
			}
		}
		else if (pokemonenjeu.getType().equals("eau")) {
			if(pokemonadverse.getType().equals("plante")){
				if (confusion1!=1) {
				degats = 2*(pokemonadverse.getAtck() - pokemonenjeu.getDef());
				System.out.println("C'est super efficace.");
				}
				else {
					System.out.println(pokemonadverse.getName()+ "est confus, il ne peut pas attaquer");
					confusion1=0;
				}
			}
			else if(pokemonadverse.getType().equals("feu")) {
				if (confusion1!=1) {
				degats =0.5*( pokemonadverse.getAtck() - pokemonenjeu.getDef());
				System.out.println("Ce n'est pas très efficace.");
				}
				else {
					System.out.println(pokemonadverse.getName()+ "est confus, il ne peut pas attaquer");
					confusion1=0;
				}
			}
			else {
				if (confusion1!=1) {
				degats = pokemonadverse.getAtck() - pokemonenjeu.getDef();
				}
				else {
					System.out.println(pokemonadverse.getName()+ "est confus, il ne peut pas attaquer");
					confusion1=0;
				}
			}
		}
		else {
			if(pokemonadverse.getType().equals("plante")){
				if (confusion1!=1) {
				degats = 0.5*(pokemonadverse.getAtck() - pokemonenjeu.getDef());
				System.out.println("Ce n'est pas très efficace.");
				}
				else {
					System.out.println(pokemonadverse.getName()+ "est confus, il ne peut pas attaquer");
					confusion1=0;
				}
			}
			else if(pokemonadverse.getType().equals("eau")) {
				if (confusion1!=1) {
				degats =2*( pokemonadverse.getAtck() - pokemonenjeu.getDef());
				System.out.println("C'est super efficace.");
				}
				else {
					System.out.println(pokemonadverse.getName()+ "est confus, il ne peut pas attaquer");
					confusion1=0;
				}
			}
			else {
				if (confusion1!=1) {
				degats = pokemonadverse.getAtck() - pokemonenjeu.getDef();
				}
				else {
					System.out.println(pokemonadverse.getName()+ "est confus, il ne peut pas attaquer");
					confusion1=0;
				}
			}
		}
		if(degats < 0) {
			degats = 1;
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(pokemonenjeu.getName() + "perd " + degats + "pv");
		double pv = pokemonenjeu.getPv() - degats ;
		pokemonenjeu.setPv((int) pv);
		System.out.println(pokemonenjeu.getName() + ": "+ pokemonenjeu.getPv() + "/" + pokemonenjeu.getPv_max() + "PV");
		if (pokemonenjeu.getPv()<0) {
			System.out.println(pokemonenjeu.getName()+" est k.o");
		}
		}
public static void defensepokemonenjeu(Pokemon pokemonenjeu ,Pokemon pokemonadverse) {
	if (pokemonenjeu.getTypedefense()==1) {
		pokemonadverse.setAtck(pokemonadverse.getAtck()*0.8);
		System.out.println(pokemonenjeu.getName()+ " lance "+ pokemonenjeu.getDefense());
		System.out.println("La défense de " + pokemonadverse.getName() + " diminue");
	}
	else if (pokemonenjeu.getTypedefense()==2) {
		pokemonadverse.setDef(pokemonadverse.getDef()*0.8);
		System.out.println(pokemonenjeu.getName()+ " lance "+ pokemonenjeu.getDefense());
		System.out.println("L'attaque de " + pokemonadverse.getName() + " diminue");	
	}
	else {
		confusion1=1;
		System.out.println(pokemonenjeu.getName()+ " lance "+ pokemonenjeu.getDefense());
		System.out.println(pokemonadverse.getName() + " est confus pour un tour");
	}
}

	public static void defensepokemonadverse(Pokemon pokemonenjeu ,Pokemon pokemonadverse) {
		int ca=0;
		int cd=0;
		if (pokemonadverse.getTypedefense()==1) {
			ca=ca+1;
			pokemonenjeu.setAtck(pokemonenjeu.getAtck()*0.8);
			System.out.println(pokemonadverse.getName()+ " lance "+ pokemonadverse.getDefense());
			System.out.println("La défense de " + pokemonenjeu.getName() + " diminue");
		}
		else if (pokemonadverse.getTypedefense()==2) {
			cd=cd+1;
			pokemonadverse.setDef(pokemonenjeu.getDef()*0.8);
			System.out.println(pokemonadverse.getName()+ " lance "+ pokemonadverse.getDefense());
			System.out.println("L'attaque de " + pokemonenjeu.getName() + " diminue");	
		}
		else {
			confusion2=1;
			System.out.println(pokemonenjeu.getName() + " est confus pour un tour");
		}
		System.out.println("");
	}
	
	
	
	
	public static void soignerpokemon(Dresseur dresseur) {
		String decision = "0";
		int decisionint = 0;
		Scanner sc = new Scanner(System.in);
		int nb_pokemon = dresseur.getListpokemon().size();
		for(int i=1; i <= nb_pokemon ;i++) {
			
		System.out.println(i+" : " + dresseur.getListpokemon().get(i-1).getName());
		}
		System.out.println("choisissez un pokemon a soigner");
		decision = sc.nextLine();
		decisionint = Integer.parseInt(decision);
		while (decisionint > nb_pokemon) {
			System.out.println("mauvaise entrée, recommencez.");
			for(int i=1; i <= nb_pokemon ;i++) {
				
				System.out.println(i+" : " + dresseur.getListpokemon().get(i-1).getName());
			decision = sc.nextLine();
			decisionint = Integer.parseInt(decision);
				}
		
		}
		System.out.println("Vous avez choisi : " + dresseur.getListpokemon().get(decisionint).getName());
		Pokemon pokemonasoigner = dresseur.getListpokemon().get(decisionint);
		pokemonasoigner.setPv(pokemonasoigner.getPv() + 50);
		System.out.println(pokemonasoigner.getName() + " a été soigné de 50 pv.");
	}

	
	
	
	public static boolean continuerlecombat(Dresseur dresseur) {
		for(Pokemon pok : dresseur.getListpokemon()) {
			if (pok.getPv() > 0) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	public static Pokemon pokemonenjeu(Dresseur dresseur) {
		int decisionint = 0;
		String decision = "0";
		Scanner sc = new Scanner(System.in);
		int nb_pokemon = dresseur.getListpokemon().size();
		System.out.println("Quel pokemon voulez vous envoyer ?");
		for(int i=1; i <= nb_pokemon ;i++) {
		System.out.println(i+" : " + dresseur.getListpokemon().get(i-1).getName() + " , " + dresseur.getListpokemon().get(i-1).getPv() + "/" + dresseur.getListpokemon().get(i-1).getPv_max());
		}
		decision = sc.nextLine();
		decisionint = Integer.parseInt(decision);
		while (decisionint > nb_pokemon) {
			System.out.println("mauvaise entrée, recommencez.");
			for(int i=1; i <= nb_pokemon ;i++) {
				
				System.out.println(i+" : " + dresseur.getListpokemon().get(i-1).getName());
			decision = sc.nextLine();
			decisionint = Integer.parseInt(decision);
				}
		}
		while (decisionint > nb_pokemon || dresseur.getListpokemon().get(decisionint-1).getPv() <= 0) {
			System.out.println("pokemon ko, choisissez en un autre.");
			for(int i=1; i <= nb_pokemon ;i++) {
				
				System.out.println(i+" : " + dresseur.getListpokemon().get(i-1).getName()+", pv = "+dresseur.getListpokemon().get(i-1).getPv()+ "PV");
			decision = sc.nextLine();
			decisionint = Integer.parseInt(decision);
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Vous avez choisi : " + dresseur.getListpokemon().get(decisionint-1).getName());
		Pokemon pokemonenjeu = dresseur.getListpokemon().get(decisionint-1);
		System.out.println("");
		return pokemonenjeu;
	}
	
	
	
	
	
	public static boolean tenterdecapturer(Dresseur dresseur,Pokemon pokemonadverse) {
		dresseur.setNb_pokeball(dresseur.getNb_pokeball()-1);
		double pourcentage_de_vie = pokemonadverse.getPv()/pokemonadverse.getPv_max();
		double chance_de_capture =1- (pokemonadverse.getLvl()/100) - pourcentage_de_vie/2 ;
		double x = Math.random();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (x >chance_de_capture) {
			System.out.println("capture de " + pokemonadverse.getName()+ "réussie");
			if(dresseur.getListpokemon().size() < 3) {
				dresseur.getListpokemon().add(pokemonadverse);
			}
			restaurer(pokemonadverse);
			return true;
		}
		System.out.println("la capture du pokemon a echoue");
		return false;
	}
	
	public static void restaurer(Pokemon pokemonenjeu) {
		pokemonenjeu.setAtck(pokemonenjeu.getAtckdebase());
		pokemonenjeu.setDef(pokemonenjeu.getDefdebase());
	}
	
	
	
	
	public static boolean continuercombatpokemon(Pokemon pokemonenjeu ,Pokemon pokemonadverse) {
		return (pokemonenjeu.getPv() > 0 && pokemonadverse.getPv() > 0);
	}
	
	
	
	
	
	public static void combat(Dresseur dresseur,Pokemon pokemonadverse){
		Scanner sc = new Scanner(System.in);
		String decision = "0";
		niveaupokemonadverse(pokemonadverse);
		System.out.println("Un "+ pokemonadverse.getName() + "vous attaque.");
		System.out.println("");
		int decisionint = combatoufuite();

		if (decisionint == 1) {
			boolean tenterdecapturer = false;
			while (continuerlecombat(dresseur) && pokemonadverse.getPv()>=0 && tenterdecapturer == false){
				Pokemon pokemonenjeu = pokemonenjeu(dresseur);
				while(continuercombatpokemon(pokemonenjeu , pokemonadverse) && tenterdecapturer == false) {
					System.out.println("que voulez-vous faire ?");
					System.out.println("1: attaquer, 2: changer de pokemon, 3: soigner un pokemon, 4: tenter de capturer");
					System.out.println("");
					decision = sc.nextLine();
					while (!decision.equals("1") && !decision.equals("2") && !decision.equals("3") && !decision.equals("4")) {
						System.out.println("mauvaise entrée, recommencez.");	
						System.out.println("que voulez-vous faire ?");
						System.out.println("1: attaquer, 2: changer de pokemon, 3: soigner un pokemon, 4: tenter de capturer");
						decision = sc.nextLine();
					}
					decisionint = Integer.parseInt(decision);
			
					if( decisionint == 1){
						decisionint = attaqueoudefense();
						if(decisionint ==1) {
							if(pokemonenjeu.getVitesse() >= pokemonadverse.getVitesse()){
								attaquepokemonenjeu(pokemonenjeu,pokemonadverse);
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								if (pokemonadverse.getPv() > 0) {	
									double ia=Math.random();
									if (ia<=0.7) {
										attaquepokemonadverse(pokemonenjeu,pokemonadverse);
									}
									else {
										defensepokemonadverse(pokemonenjeu,pokemonadverse);
									}
								}
							}
						
						else{
							attaquepokemonadverse(pokemonenjeu,pokemonadverse);	
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							if (pokemonenjeu.getPv() > 0) {	
									attaquepokemonenjeu(pokemonenjeu,pokemonadverse);
							}
						}
						}
							else {
								if(pokemonenjeu.getVitesse() >= pokemonadverse.getVitesse()) {
									defensepokemonenjeu(pokemonenjeu,pokemonadverse);
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									if (pokemonadverse.getPv() > 0) {
										double ia=Math.random();
										if (ia<=0.7) {
											attaquepokemonadverse(pokemonenjeu,pokemonadverse);
										}
										else {
											defensepokemonadverse(pokemonenjeu,pokemonadverse);
										}
									}
								}
								else {
									double ia=Math.random();
									if (ia<=0.7) {
										attaquepokemonadverse(pokemonenjeu,pokemonadverse);
									}
									else {
										defensepokemonadverse(pokemonenjeu,pokemonadverse);
									}
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									if(pokemonenjeu.getPv() >0) {
										defensepokemonenjeu(pokemonenjeu,pokemonadverse);
									}
								}
							}
					}	
						
					else if(decisionint == 2) {
						pokemonenjeu = pokemonenjeu(dresseur);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						double ia=Math.random();
						if (ia<=0.7) {
							attaquepokemonadverse(pokemonenjeu,pokemonadverse);
						}
						else {
							defensepokemonadverse(pokemonenjeu,pokemonadverse);
						}
					}
					
					else if(decisionint == 3) {
						if (dresseur.getPotion() >  0) {
							soignerpokemon(dresseur);
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							double ia=Math.random();
							if (ia<=0.7) {
								attaquepokemonadverse(pokemonenjeu,pokemonadverse);
							}
							else {
								defensepokemonadverse(pokemonenjeu,pokemonadverse);
							}
						}	
						else {
							System.out.println("Vous n'avez pas de potion!");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
					
					else if(decisionint == 4) {
						
						if (dresseur.getNb_pokeball() > 0) {
							if(dresseur.getListpokemon().size() < 3) {
								tenterdecapturer = tenterdecapturer(dresseur,pokemonadverse);
								if (tenterdecapturer == false) {
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									double ia=Math.random();
									if (ia<=0.7) {
										attaquepokemonadverse(pokemonenjeu,pokemonadverse);
									}
									else {
										defensepokemonadverse(pokemonenjeu,pokemonadverse);
									}
								}
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println("il vous reste " + dresseur.getNb_pokeball() + " pokeball(s)");
							}
							else{
								System.out.println("Vous ne pouvez pas avoir plus de 3 pokemon dans votre équipe, deposez en un au centre mrs");
							}
						}
						else {
							System.out.println("Vous n'avez pas de pokeball");
						}
					}
				}
				if (pokemonadverse.getPv() <= 0) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Vous avez remporté le combat");
					restaurer(pokemonadverse);
					for (Pokemon p: dresseur.getListpokemon()) {
						restaurer(p);
					}
					pokemonenjeu.setXp(pokemonenjeu.getXp() + pokemonadverse.getLvl());
				}
				Pokemon.levelup(pokemonenjeu);
				if (pokemonenjeu.isEvoluable()) {
					if(pokemonenjeu.getLvl()>pokemonenjeu.getLvlnecessaire()) {
						for (Pokemon p: NewMain.ListePokemon) {
							if (p.getId()==pokemonenjeu.getId()+1) {
								dresseur.getListpokemon().set(dresseur.getListpokemon().indexOf(pokemonenjeu), p);
								System.out.println("Félicitation votre" + pokemonenjeu.getName()+ "a évolué en" + p.getName());
								System.out.println("");
							}
						}
					}
				}		
			}
			if (continuerlecombat(dresseur) == false) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Vous avez perdu le combat.");
				restaurer(pokemonadverse);
				for (Pokemon p: dresseur.getListpokemon()) {
					restaurer(p);
				}
				dresseur.setPositionx(0);
				dresseur.setPositiony(0);
			}
		}
		else if(decisionint == 2) {
			System.out.println("Vous prenez la fuite.");
			restaurer(pokemonadverse);
			for (Pokemon p: dresseur.getListpokemon()) {
				restaurer(p);
			}			
		}	
	}		
}
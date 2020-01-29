package pokemon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class NewMain {
	
	
	static ArrayList<Pokemon> ListePokemon=new ArrayList<Pokemon>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Pokemon Mbaobap = new Pokemon(34,"Mbaobap",32,148,90,"Crochet droite gauche","Esquive rapide",256,"plante",0,506,350,350, false, 0,1,148,90);
		Pokemon Ronaldatte = new Pokemon(37,"Ronaldatte",32,148,90,"Frappe de malade","Cri intimidant",256,"plante",0,506,350,350,false,0,2,148,90);
		Pokemon Solking = new Pokemon(40,"Solking",32,148,90,"Guerilla","Autotune strident",216,"plante",0,506,350,350,false,0,3,148,90);
		Pokemon Ararbre = new Pokemon(46,"Ararbre",16,84,60,"Attaque collective","Fierté",90,"plante",0,130,190,190,false,0,1,84,60);
		Pokemon Birgril = new Pokemon(44,"Birgril",25,120,72.5,"Fouet'lianes","Survie extreme",217.5,"plante",0,310,280,280,false,0,1,120,72.5);
		
		
		
		ArrayList<Pokemon> ListePokemon_ville3_plante = new ArrayList<Pokemon>();
		ListePokemon_ville3_plante.add(Mbaobap);
		ListePokemon_ville3_plante.add(Ronaldatte);
		ListePokemon_ville3_plante.add(Solking);
		ListePokemon_ville3_plante.add(Ararbre);
		ListePokemon_ville3_plante.add(Birgril);
		
		
		
		Pokemon Boobaobab = new Pokemon(33,"Boobaobab",16,84,60,"Octogone","Moquerie",90,"plante",0,130,190,190,true,32,2,84,60);
		Pokemon Zidatte = new Pokemon (36,"Zidatte",16,84,60,"Coup dboule","Feinte géniale",128,"plante",0,130,190,190,true,32,1,84,60);
		Pokemon Damsol = new Pokemon (39,"Damsol",16,84,60,"Feu de bois","Amnesie",90,"plante",0,130,190,190,true,32,3,84,60);
		Pokemon Basilbolic = new Pokemon (42,"Nom",25,120,72.5,"Coup de tête","Etoile 93",139.5,"plante",0,310,280,280,false,0,3,120,72.5);
		Pokemon Terril = new Pokemon (43,"Terril",5,40,22.5,"Secousse","Nuage de poussière",29.5,"plante",0,20,80,80,true,25,2,40,22.5);
		
		ArrayList<Pokemon> ListePokemon_ville2_plante = new ArrayList<Pokemon>();
		ListePokemon_ville2_plante.add(Boobaobab);
		ListePokemon_ville2_plante.add(Zidatte);
		ListePokemon_ville2_plante.add(Damsol);
		ListePokemon_ville2_plante.add(Basilbolic);
		ListePokemon_ville2_plante.add(Terril);
		
		
		Pokemon Kobaobab = new Pokemon (32,"Kobaobab",5,40,22.5,"Freestyle tenebreux","Orgueuilleux",67.5,"plante",0,20,80,80,true,16,1,40,22.5);
		Pokemon Palmiessi = new Pokemon (35,"Palmiessi",5,40,22.5,"Frappe enroulée","Minuscule",107.5,"plante",0,20,80,80.0,true,16,2,40,22.5);
		Pokemon Tournsol = new Pokemon (38,"Tournsol",5,40,22.5,"Tranch'herbe","Huile glissante",67.5,"plante",0,20,80.0,80.0,true,16,1,40,22.5);
		Pokemon Basolic = new Pokemon (41,"Basolic",5,40,22.5,"Rapounet","Dommage",67.5,"plante",0,20,80.0,80.0,true,25,3,40,22.5);
		Pokemon Rato = new Pokemon (45,"Rato",5,40,22.5,"Coup de griffe","Friendzone",107.5,"plante",0,20,80.0,80.0,false,0,3,40,22.5);
		
		
		ArrayList<Pokemon> ListePokemon_ville1_plante = new ArrayList<Pokemon>();
		ListePokemon_ville1_plante.add(Kobaobab);
		ListePokemon_ville1_plante.add(Palmiessi);
		ListePokemon_ville1_plante.add(Tournsol);
		ListePokemon_ville1_plante.add(Basolic);
		ListePokemon_ville1_plante.add(Rato);	
		
		
		Pokemon Cristalline = new Pokemon(19,"Cristalline",32,148,90,"JCVD","Surf",256,"eau",0,506,350.0,350.0,false,0,2,148,90);
		Pokemon Zacharien = new Pokemon(22,"Zacharien",32,148,90,"Cheh","Cardio",178,"eau",0,506,350.0,350.0,false,0,2,148,90);
		Pokemon Cruche = new Pokemon(25,"Cruche",32,148,90,"Laser glace","Surf",256,"eau",0,506,350.0,350.0,true,32,1,149,90);
		Pokemon Fleaufloche = new Pokemon(29,"Fleaufloche",25,120,72.5,"Seum Ultime","Corps de chips",177.5,"eau",0,310,280.0,280.0,false,0,3,120,72.5);
		Pokemon Hitsugaya = new Pokemon (31,"Hitsugaya",16,84,60,"Hyoten","Hyakkaso",168,"eau",0,130,190.0,190.0,false,0,1,84,60);
		
		ArrayList<Pokemon> ListePokemon_ville3_eau = new ArrayList<Pokemon>();
		ListePokemon_ville3_eau.add(Cristalline);
		ListePokemon_ville3_eau.add(Zacharien);
		ListePokemon_ville3_eau.add(Cruche);
		ListePokemon_ville3_eau.add(Fleaufloche);
		ListePokemon_ville3_eau.add(Hitsugaya);
		
		
		Pokemon Volvic = new Pokemon (24,"Volvic",16,84,60,"Tsunami","Soin",168,"eau",0,130,190.0,190.0,true,32,1,84,60);
		Pokemon Zacharie = new Pokemon (18,"Zacharie",16,84,60,"Pas glissé","Grigri",90,"eau",0,130,190,190.0,true,32,2,84,60);
		Pokemon Carafe = new Pokemon (24,"Carafe",16,84,60,"Ultra laser","Hydrophobie",90,"eau",0,130,190.0,190.0,false,0,2,84,60);
		Pokemon Malikator = new Pokemon (27,"Malikator",25,120,72.5,"Laser glace","Ecran",139.5,"eau",0,310,280.0,280.0,false,0,1,120,72.5);
		Pokemon Fleau = new Pokemon (28,"Fleau",5,40,22.5,"Coup de gueule","Prez BDS",29.5,"eau",0,20,80.0,80.0,true,25,3,40,22.5);
		
		ArrayList<Pokemon> ListePokemon_ville2_eau = new ArrayList<Pokemon>();
		ListePokemon_ville2_eau.add(Volvic);
		ListePokemon_ville2_eau.add(Zacharie);
		ListePokemon_ville2_eau.add(Carafe);
		ListePokemon_ville2_eau.add(Fleau);
		ListePokemon_ville2_eau.add(Malikator);
		
		
		Pokemon Hepar = new Pokemon  (17,"Hepar",5,40,22.5,"Cascade","Magnésium",107.5,"eau",0,20,80.0,80.0,true,16,1,40,22.5);
		Pokemon Lacarie = new Pokemon  (20,"Lacarie",5,40,22.5,"Match ATP","Zayt alzaytun",29.5,"eau",0,20,80.0,80.0,true,16,2,40,22.5);
		Pokemon Bro = new Pokemon  (23,"Bro",5,40,22.5,"Pistolet à eau","Ecran",107.5,"eau",0,20,80.0,80.0,true,16,3,40,22.5);
		Pokemon Malicarpe = new Pokemon  (26,"Malicarpe",5,40,22.5,"Tempète","Jouer la montre",29.5,"eau",0,20,80.0,80.0,true,25,3,40,22.5);
		Pokemon Aokiji = new Pokemon  (30,"Aokiji",16,84,60,"Monde glacé","Blizzard",90,"eau",0,130,190.0,190.0,false,0,2,84,60);
		
		
		ArrayList<Pokemon> ListePokemon_ville1_eau = new ArrayList<Pokemon>();
		ListePokemon_ville1_eau.add(Hepar);
		ListePokemon_ville1_eau.add(Lacarie);
		ListePokemon_ville1_eau.add(Bro);
		ListePokemon_ville1_eau.add(Malicarpe);
		ListePokemon_ville1_eau.add(Aokiji);
		
		Pokemon Brunoir = new Pokemon (4,"Brunoir",32,148,90,"Noir","Turbo",216,"feu",0,506,350.0,350.0,false,0,1,148,90);
		Pokemon Feudroute = new Pokemon (7,"Feudroute ",32,148,90,"Eblouissement","Chaleur",216,"feu",0,506,350.0,350.0,false,0,2,148,90);
		Pokemon Feurouge = new Pokemon (10,"Feurouge",32,148,90,"STOOOOOOOP","Arrêt",256,"feu",0,506,350.0,350.0,false,0,3,148,90);
		Pokemon Churfeur = new Pokemon (14,"Churfeur",25,120,72.5,"Jeu de mot","Dislexie adverse",217.5,"feu",0,310,280.0,280.0,false,0,3,120,72.5);
		Pokemon Nekfeu = new Pokemon (16,"Nekfeu",25,120,72.5,"Flow","Turbo",217.5,"feu",0,310,280.0,280.0,false,0,1,120,72.5);
		
		
		ArrayList<Pokemon> ListePokemon_ville3_feu = new ArrayList<Pokemon>();
		ListePokemon_ville3_feu.add(Brunoir);
		ListePokemon_ville3_feu.add(Feudroute);
		ListePokemon_ville3_feu.add(Feurouge);
		ListePokemon_ville3_feu.add(Churfeur);
		ListePokemon_ville3_feu.add(Nekfeu);
		
		
		
		Pokemon Bruno = new Pokemon (3,"Bruno",16,84,60,"Lancer d'arguments","Esquive",128,"feu",0,130,190.0,190.0,true,32,1,84,60);
		Pokemon Feudcroisment = new Pokemon (6,"Feudcroisment",16,84,60,"Jour dans la nuit","Fuego",128,"feu",0,130,190.0,190.0,true,32,2,84,60);
		Pokemon Feuorange = new Pokemon (9,"Feuorange",16,84,60,"Amende de la police","Ralentissement",168,"feu",0,130,190.0,190.0,true,32,1,84,60);
		Pokemon Milfeu = new Pokemon (12,"Milfeu",16,84,60,"Lancer de gâteaux","Grossissement",168,"feu",0,130,280,280,false,0,2,84,60);
		Pokemon Choufeur = new Pokemon (13,"Choufeur",5,40,22.5,"Sans béchamel","Puanteur",67.5,"feu",0,20,80.0,80.0,true,25,3,40,22.5);
		
		ArrayList<Pokemon> ListePokemon_ville2_feu = new ArrayList<Pokemon>();
		ListePokemon_ville2_feu.add(Bruno);
		ListePokemon_ville2_feu.add(Feudcroisment);
		ListePokemon_ville2_feu.add(Feuorange);
		ListePokemon_ville2_feu.add(Milfeu);
		ListePokemon_ville2_feu.add(Choufeur);
		
		
		
		
		
		Pokemon Brunul = new Pokemon (2,"Brunul",5,40,22.5,"Lancer d'arguments","defense",67.5,"feu",0,20,80.0,80.0,true,16,1,40,22.5);
		Pokemon Feudposition = new Pokemon (5,"Feudposition",5,40,22.5,"Diversion","defense",67.5,"feu",0,20,80.0,80.0,true,16,1,40,22.5);
		Pokemon Feuvert = new Pokemon (8,"Feuvert",5,40,22.5,"Lancer de pneux","defense",107.5,"feu",0,20,80.0,80.0,true,16,1,40,22.5);
		Pokemon Coiffeu = new Pokemon (11,"Coiffeu",16,84,60,"Coup de ciseau","defense",90,"feu",0,130,190.0,190.0,false,25,1,84,60);
		Pokemon Potofeu = new Pokemon (15,"Potofeu",5,40,22.5,"Intoxication par navet","defense",29.5,"feu",0,20,80.0,80.0,true,25,1,40,22.5);
		
		ArrayList<Pokemon> ListePokemon_ville1_feu = new ArrayList<Pokemon>();
		ListePokemon_ville1_feu.add(Brunul);
		ListePokemon_ville1_feu.add(Feudposition);
		ListePokemon_ville1_feu.add(Feuvert);
		ListePokemon_ville1_feu.add(Coiffeu);
		ListePokemon_ville1_feu.add(Potofeu);
		
		
		
		ListePokemon.add(Mbaobap);
		ListePokemon.add(Ronaldatte);
		ListePokemon.add(Solking);
		ListePokemon.add(Ararbre);
		ListePokemon.add(Birgril);
		ListePokemon.add(Boobaobab);
		ListePokemon.add(Zidatte);
		ListePokemon.add(Damsol);
		ListePokemon.add(Basilbolic);
		ListePokemon.add(Terril);
		ListePokemon.add(Kobaobab);
		ListePokemon.add(Palmiessi);
		ListePokemon.add(Tournsol);
		ListePokemon.add(Basolic);
		ListePokemon.add(Rato);	
		ListePokemon.add(Cristalline);
		ListePokemon.add(Zacharien);
		ListePokemon.add(Cruche);
		ListePokemon.add(Fleaufloche);
		ListePokemon.add(Hitsugaya);
		ListePokemon.add(Volvic);
		ListePokemon.add(Zacharie);
		ListePokemon.add(Carafe);
		ListePokemon.add(Fleau);
		ListePokemon.add(Malikator);
		ListePokemon.add(Hepar);
		ListePokemon.add(Lacarie);
		ListePokemon.add(Bro);
		ListePokemon.add(Malicarpe);
		ListePokemon.add(Aokiji);
		ListePokemon.add(Brunoir);
		ListePokemon.add(Feudroute);
		ListePokemon.add(Feurouge);
		ListePokemon.add(Churfeur);
		ListePokemon.add(Nekfeu);
		ListePokemon.add(Bruno);
		ListePokemon.add(Feudcroisment);
		ListePokemon.add(Feuorange);
		ListePokemon.add(Milfeu);
		ListePokemon.add(Choufeur);
		ListePokemon.add(Brunul);
		ListePokemon.add(Feudposition);
		ListePokemon.add(Feuvert);
		ListePokemon.add(Coiffeu);
		ListePokemon.add(Potofeu);

		

		
		ArrayList<Pokemon> ListePokemonSerge = new ArrayList<Pokemon>() ;

		Pokemon pok1 = ListePokemon_ville3_plante.get(0);
		Pokemon pok2 = ListePokemon_ville3_plante.get(2);
		Pokemon pok3 = ListePokemon_ville3_eau.get(2);
		

		ListePokemonSerge.add(pok1);
		ListePokemonSerge.add(pok2);
		ListePokemonSerge.add(pok3);

		ArrayList<Pokemon> ListePokemonBenoit = new ArrayList<Pokemon>() ;
		Pokemon pok4 = ListePokemon_ville2_feu.get(0);
		Pokemon pok5 = ListePokemon_ville2_feu.get(2);
		Pokemon pok6 = ListePokemon_ville2_plante.get(2);
		
		ListePokemonBenoit.add(pok4);
		ListePokemonBenoit.add(pok5);
		ListePokemonBenoit.add(pok6);
		
		
		ArrayList<Pokemon> ListePokemonAbelatif = new ArrayList<Pokemon>() ;
		Pokemon pok7 = ListePokemon_ville2_eau.get(0);
		Pokemon pok8 = ListePokemon_ville2_eau.get(2);
		Pokemon pok9 = ListePokemon_ville2_feu.get(2);
		
		ListePokemonAbelatif.add(pok7);
		ListePokemonAbelatif.add(pok8);
		ListePokemonAbelatif.add(pok9);
		

		
		ArrayList<Pokemon> ListePokemonElevetorcy = new ArrayList<Pokemon>() ;
		ArrayList<Pokemon> ListePokemonBCPST = new ArrayList<Pokemon>() ;
		ArrayList<Pokemon> ListePokemonJoueurdeFootdEvry = new ArrayList<Pokemon>() ;
		
		
		
		ArrayList<Pokemon> ListePokemonGaspard = new ArrayList<Pokemon>();
		ListePokemonGaspard.add(Mbaobap);
		ListePokemonGaspard.add(Fleaufloche);
		ListePokemonGaspard.add(Ararbre);
		
		ArrayList<Pokemon> ListePokemonFelix=new ArrayList<Pokemon>();
		ListePokemonFelix.add(Solking);
		ListePokemonFelix.add(Zacharien);
		ListePokemonFelix.add(Nekfeu);
		
		
		ArrayList<Pokemon> ListePokemonWalid=new ArrayList<Pokemon>();
		ListePokemonWalid.add(Brunoir);
		ListePokemonWalid.add(Cristalline);
		ListePokemonWalid.add(Churfeur);

		PNJcombattant Gaspard = new PNJcombattant("Gaspard","Si tu n'y arrive pas, joue la montre !",0,0,ListePokemonGaspard,4);
		PNJcombattant Felix = new PNJcombattant("Felix","C'est partis pour le combat du seum",0,0,ListePokemonFelix, 4);
		PNJcombattant Walid = new PNJcombattant("Walid", "J'ai beau perdre en ping-pong,tennis,foot,babyfoot,billard,electionBDE, en duel Pokemon, je suis invincible!",0,0, ListePokemonWalid,4);
		
		
		PNJcombattant  Serge_botton = new PNJcombattant("Serge_botton","J'aime la geodesie", 0,0,ListePokemonSerge,4);
		PNJcombattant  Abelatif = new PNJcombattant("Abelatif","ygreg", 0,0,ListePokemonAbelatif,4);
		PNJcombattant  Benoit_coste = new PNJcombattant("Benoit_coste","il y a  53 signatures sur la feuille d'appel et vous êtes 50, on fait comment ?",0,0,ListePokemonBenoit,4);
	
		PNJcombattant Eleve_torcy = new  PNJcombattant("Eleve Torcy","Les concours ? Qu'est ce que c'est ?", 0,0,ListePokemonElevetorcy,4);
		Eleve_torcy.generation_pokemon(ListePokemon_ville1_plante,ListePokemon_ville1_feu,ListePokemon_ville1_eau);
		
		
		PNJcombattant BCPST = new  PNJcombattant("Ancien BCPST","J'ai pris spe SVT au lycee", 0,0,ListePokemonBCPST,4);
		BCPST.generation_pokemon(ListePokemon_ville2_plante,ListePokemon_ville2_feu,ListePokemon_ville2_eau);
		
		PNJcombattant JoueurdeFootdEvry= new  PNJcombattant("Joueur de foot d'Evry","11-2 c'est un score de Ping-pong non ?", 0,0,ListePokemonJoueurdeFootdEvry,4);
		JoueurdeFootdEvry.generation_pokemon(ListePokemon_ville3_plante,ListePokemon_ville3_feu,ListePokemon_ville3_eau);
		
		
		ArrayList<PNJcombattant> listPNJcombattant =new ArrayList<PNJcombattant>();
		listPNJcombattant.add(Serge_botton);
		listPNJcombattant.add(Eleve_torcy);
		listPNJcombattant.add(Abelatif);
		listPNJcombattant.add(BCPST);
		listPNJcombattant.add(Benoit_coste);
		listPNJcombattant.add(JoueurdeFootdEvry);
		listPNJcombattant.add(Felix);
		listPNJcombattant.add(Gaspard);
		listPNJcombattant.add(Walid);
		
		
		
		File file =new File("./monDresseur.txt");
		File file2 = new File("./Listepokemon.txt");
		File file3 = new File("./stockagepokemon.txt");
		
		
	
		MyWindow myWindow = MyWindow.getInstance();
		myWindow.setVisible( true);
		myWindow.setFile(file);
		myWindow.setFile2(file2);
		myWindow.setFile3(file3);
		Dresseur dresseur = MyWindow.creationdresseur(file,file2);
		ArrayList<Pokemon> stockagepokemon = creationstockage(file3);
		myWindow.setDresseur(dresseur);
		Plan_ville.setDresseur(dresseur);
		Plan_ville.setListePokemon_ville1_plante(ListePokemon_ville1_plante);
		Plan_ville.setListePokemon_ville2_plante(ListePokemon_ville2_plante);
		Plan_ville.setListePokemon_ville3_plante(ListePokemon_ville3_plante);
		
		Plan_ville.setListePokemon_ville1_feu(ListePokemon_ville1_feu);
		Plan_ville.setListePokemon_ville2_feu(ListePokemon_ville2_feu);
		Plan_ville.setListePokemon_ville3_feu(ListePokemon_ville3_feu);
		
		Plan_ville.setListePokemon_ville1_eau(ListePokemon_ville1_eau);
		Plan_ville.setListePokemon_ville2_eau(ListePokemon_ville2_eau);
		Plan_ville.setListePokemon_ville3_eau(ListePokemon_ville3_eau);

		
		myWindow.setStockagepokemon(stockagepokemon);
		myWindow.setListPNJcombattant(listPNJcombattant);
		
		
		
		
		
	}
	/**
     * Méthode qui va charger le stockage de pokemon du joueur sauvegardé ou en créer un
     * nouveau si le fichier de sauvegarde n'existe pas
     * 
     * @param file3: fichier texte avec les attributs des pokemons enregistrés dans le stockage
     *    
     */
	public static ArrayList<Pokemon> creationstockage(File file3) {
		
		ArrayList<Pokemon> stockagepokemon = new ArrayList<Pokemon>();
		if(file3.exists()) {
			try{
				BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file3),"UTF-8"));
				String line = reader.readLine();
				while(line!= null) {
					line = reader.readLine();
					String name = line;
					line = reader.readLine();
					int id = Integer.parseInt(line);
					line = reader.readLine();
					int lvl = Integer.parseInt(line);
					line = reader.readLine();
					double  xp = Double.parseDouble(line);
					line = reader.readLine();
					double atck = Double.parseDouble(line);
					line = reader.readLine();
					double def = Double.parseDouble(line);
					line = reader.readLine();
					String attack = line;
					line = reader.readLine();
					String defense = line;
					line = reader.readLine();
					double vitesse = Double.parseDouble(line);
					line = reader.readLine();
					String type = line;
					line = reader.readLine();
					double xpnecessaire=Double.parseDouble(line); 
					line = reader.readLine();
					double pv = Double.parseDouble(line);
					line = reader.readLine();
					double pv_max = Double.parseDouble(line);
					line = reader.readLine();
					boolean evoluable = Boolean.valueOf(line).booleanValue() ;
					line = reader.readLine();
					int lvlnecessaire = Integer.parseInt(line);
					line = reader.readLine();
					int typededefense = Integer.parseInt(line);
					line = reader.readLine();
					double atckdebase = Double.parseDouble(line);
					line = reader.readLine();
					double defdebase = Double.parseDouble(line);
					Pokemon pokemon = new Pokemon(id,name,lvl,atck,def,attack,defense,vitesse,type,xp,xpnecessaire,pv,pv_max,evoluable,lvlnecessaire,typededefense,atckdebase,defdebase);
					stockagepokemon.add(pokemon);
					line = reader.readLine();
				}
			reader.close();
			}catch(IOException e) {
					e.printStackTrace();
			}
		}
		return stockagepokemon;
	}
}
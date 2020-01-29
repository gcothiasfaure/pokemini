package pokemon;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


/**
 * Cette classe sert à dessiner le plan du jeu dans lequel le dresseur évolue.
 * Elle extends JPanel car on utilise cette objet pour construire la fenêtre.
 * @author Gaspard
 * @version finale
 */
public class Plan_ville extends JPanel { 

	
	/**
	 * L'ArrayList des Pokémons plante de niveau 1 (ville 1)
	 * @see Pokemon
	 */
	public static ArrayList<Pokemon> ListePokemon_ville1_plante;
	
	/**
	 * Récupère l'ArrayList des Pokémons plante de niveau 1 (ville 1)
	 * @return l'ArrayList des Pokémons plante de niveau 1 (ville 1)
	 */
	public ArrayList<Pokemon> getListePokemon_ville1_plante() {
		return ListePokemon_ville1_plante;
	}

	/**
	 * Met à jour l'ArrayList des Pokémons plante de niveau 1 (ville 1)
	 * @param listePokemon_ville1_plante ArrayList<Pokemon>
	 */
	public static void setListePokemon_ville1_plante(ArrayList<Pokemon> listePokemon_ville1_plante) {
		ListePokemon_ville1_plante = listePokemon_ville1_plante;
	}

	/**
	 * L'ArrayList des Pokémons feu de niveau 1 (ville 1)
	 * @see Pokemon
	 */
	public static ArrayList<Pokemon> ListePokemon_ville1_feu;
	
	/**
	 * Récupère l'ArrayList des Pokémons feu de niveau 1 (ville 1)
	 * @return l'ArrayList des Pokémons feu de niveau 1 (ville 1)
	 */
	public ArrayList<Pokemon> getListePokemon_ville1_feu() {
		return ListePokemon_ville1_feu;
	}

	/**
	 * Met à jour l'ArrayList des Pokémons feu de niveau 1 (ville 1)
	 * @param listePokemon_ville1_feu ArrayList<Pokemon>
	 */ 
	public static void setListePokemon_ville1_feu(ArrayList<Pokemon> listePokemon_ville1_feu) {
		ListePokemon_ville1_feu = listePokemon_ville1_feu;
	}

	/**
	 * L'ArrayList des Pokémons eau de niveau 1 (ville 1)
	 * @see Pokemon
	 */
	public static ArrayList<Pokemon> ListePokemon_ville1_eau;
	
	/**
	 * Récupère l'ArrayList des Pokémons eau de niveau 1 (ville 1)
	 * @return l'ArrayList des Pokémons eau de niveau 1 (ville 1)
	 */
	public ArrayList<Pokemon> getListePokemon_ville1_eau() {
		return ListePokemon_ville1_eau;
	}

	/**
	 * Met à jour l'ArrayList des Pokémons eau de niveau 1 (ville 1)
	 * @param listePokemon_ville1_eau ArrayList<Pokemon>
	 */
	public static void setListePokemon_ville1_eau(ArrayList<Pokemon> listePokemon_ville1_eau) {
		ListePokemon_ville1_eau = listePokemon_ville1_eau;
	}

	/**
	 * L'ArrayList des Pokémons plante de niveau 2 (ville 2)
	 * @see Pokemon
	 */
	public static ArrayList<Pokemon> ListePokemon_ville2_plante;
	
	/**
	 * Récupère l'ArrayList des Pokémons plante de niveau 2 (ville 2)
	 * @return l'ArrayList des Pokémons plante de niveau 2 (ville 2)
	 */
	public ArrayList<Pokemon> getListePokemon_ville2_plante() {
		return ListePokemon_ville2_plante;
	}

	/**
	 * Met à jour l'ArrayList des Pokémons plante de niveau 2 (ville 2)
	 * @param listePokemon_ville2_plante ArrayList<Pokemon>
	 */
	public static void setListePokemon_ville2_plante(ArrayList<Pokemon> listePokemon_ville2_plante) {
		ListePokemon_ville2_plante = listePokemon_ville2_plante;
	}

	/**
	 * L'ArrayList des Pokémons feu de niveau 2 (ville 2)
	 * @see Pokemon
	 */
	public static ArrayList<Pokemon> ListePokemon_ville2_feu;
	
	/**
	 * Récupère l'ArrayList des Pokémons feu de niveau 2 (ville 2)
	 * @return l'ArrayList des Pokémons feu de niveau 2 (ville 2)
	 */
	public ArrayList<Pokemon> getListePokemon_ville2_feu() {
		return ListePokemon_ville2_feu;
	}

	/**
	 * Met à jour l'ArrayList des Pokémons feu de niveau 2 (ville 2)
	 * @param listePokemon_ville2_feu ArrayList<Pokemon>
	 */
	public static void setListePokemon_ville2_feu(ArrayList<Pokemon> listePokemon_ville2_feu) {
		ListePokemon_ville2_feu = listePokemon_ville2_feu;
	}

	/**
	 * L'ArrayList des Pokémons eau de niveau 2 (ville 2)
	 * @see Pokemon
	 */
	public static ArrayList<Pokemon> ListePokemon_ville2_eau;
	
	/**
	 * Récupère l'ArrayList des Pokémons eau de niveau 2 (ville 2)
	 * @return l'ArrayList des Pokémons eau de niveau 2 (ville 2)
	 */
	public ArrayList<Pokemon> getListePokemon_ville2_eau() {
		return ListePokemon_ville2_eau;
	}

	/**
	 * Met à jour l'ArrayList des Pokémons eau de niveau 2 (ville 2)
	 * @param listePokemon_ville2_eau ArrayList<Pokemon>
	 */
	public static void setListePokemon_ville2_eau(ArrayList<Pokemon> listePokemon_ville2_eau) {
		ListePokemon_ville2_eau = listePokemon_ville2_eau;
	}

	/**
	 * L'ArrayList des Pokémons plante de niveau 3 (ville 3)
	 * @see Pokemon
	 */
	public static ArrayList<Pokemon> ListePokemon_ville3_plante;
	
	/**
	 * Récupère l'ArrayList des Pokémons plante de niveau 3 (ville 3)
	 * @return l'ArrayList des Pokémons plante de niveau 3 (ville 3)
	 */
	public ArrayList<Pokemon> getListePokemon_ville3_plante() {
		return ListePokemon_ville3_plante;
	}

	/**
	 * Met à jour l'ArrayList des Pokémons plante de niveau 3 (ville 3)
	 * @param listePokemon_ville3_plante ArrayList<Pokemon>
	 */
	public static void setListePokemon_ville3_plante(ArrayList<Pokemon> listePokemon_ville3_plante) {
		ListePokemon_ville3_plante = listePokemon_ville3_plante;
	}

	/**
	 * L'ArrayList des Pokémons feu de niveau 3 (ville 3
	 * @see Pokemon
	 */
	public static ArrayList<Pokemon> ListePokemon_ville3_feu;
	
	/**
	 * Récupère l'ArrayList des Pokémons feu de niveau 3 (ville 3)
	 * @return l'ArrayList des Pokémons feu de niveau 3 (ville 3)
	 */
	public ArrayList<Pokemon> getListePokemon_ville3_feu() {
		return ListePokemon_ville3_feu;
	}

	/**
	 * Met à jour l'ArrayList des Pokémons feu de niveau 3 (ville 3)
	 * @param listePokemon_ville3_feu ArrayList<Pokemon>
	 */
	public static void setListePokemon_ville3_feu(ArrayList<Pokemon> listePokemon_ville3_feu) {
		ListePokemon_ville3_feu = listePokemon_ville3_feu;
	}

	/**
	 * L'ArrayList des Pokémons eau de niveau 3 (ville 3)
	 * @see Pokemon
	 */
	public static ArrayList<Pokemon> ListePokemon_ville3_eau;
	
	/**
	 * Récupère l'ArrayList des Pokémons eau de niveau 3 (ville 3)
	 * @return l'ArrayList des Pokémons eau de niveau 3 (ville 3)
	 */
	public ArrayList<Pokemon> getListePokemon_ville3_eau() {
		return ListePokemon_ville3_eau;
	}

	/**
	 * Met à jour l'ArrayList des Pokémons eau de niveau 3 (ville 3)
	 * @param listePokemon_ville3_eau ArrayList<Pokemon>
	 */
	public static void setListePokemon_ville3_eau(ArrayList<Pokemon> listePokemon_ville3_eau) {
		ListePokemon_ville3_eau = listePokemon_ville3_eau;
	}

	/**
	 * Le dresseur du jeu
	 * @see Dresseur
	 */
	public static Dresseur dresseur;
	
	/**
	 * PNJ Jeoffroy présent sur la carte
	 * @see PNJcombattant
	 */
	public PNJcombattant Jeoffroy;
	
	/**
	 * PNJ Hubert présent sur la carte
	 * @see PNJcombattant
	 */
	public PNJcombattant Hubert;
	
	/**
	 * PNJ Adriano présent sur la carte
	 * @see PNJcombattant
	 */
	public PNJcombattant Adriano;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * <x> position initiale du dresseur selon les abcisses
	 * <y> position initiale du dresseur selon les ordonnées
	 */
	int x = 21;	
	int y = 21;
	
	/**
	 * Il faut ajouter 1 aux coordonnées pour être bien placé sur le plan
	 * <X> position sur le plan du dresseur
	 * <Y> position sur le plan du dresseur
	 */
	public int X=x+1;
	public int Y=y+1;

	/**
	 * Met à jour la position du dresseur
	 * @param dresseur
	 */
	public static void setDresseur(Dresseur dresseur) {
		Plan_ville.dresseur = dresseur;}
	
	/**
	 * Récupère la position du dresseur
	 * @return Dresseur
	 */
	public Dresseur getDresseur() {
		return dresseur;
		}
	
	/**
	 * Utilisé pour prendre un élément alétoire dans une ArrayList
	 * <numberGenerator> Random
	 */
	private static Random numberGenerator = new Random();
	
	/**
	 * Permet de prendre un élément alétoire dans une ArrayList de 5 Pokémons
	 * @param listpokemon
	 * @return un élément alétoire dans une ArrayList de 5 Pokémons
	 */
	public Pokemon randomElement(ArrayList<Pokemon> listpokemon) {
		 return listpokemon.get(numberGenerator.nextInt(5));}
	
	/**
	 * Définie les coordonnées d'un point de forte probabilité de tomber sur un Pokémon dans la zone feu
	 * <Xf> coordonnée selon x
	 * <Yf> coordonnée selon y
	 */
	public double Xf=11.5;
	public int Yf=13;

	/**
	 * <Df> La distance entre le point (Xf,Yf) et le dresseur
	 * Servira ensuite à caractériser la zone où est présent un Pokémon feu
	 */
	public double Df=Math.sqrt((Xf-x)*(Xf-x)+(Yf-y)*(Yf-y));
	
	/**
	 * Définie les coordonnées d'un point de forte probabilité de tomber sur un Pokémon dans la zone eau
	 * <Xf> coordonnée selon x
	 * <Yf> coordonnée selon y
	 */
	public double Xe=12.5;
	public int Ye=46;
	
	/**
	 * <De> La distance entre le point (Xe,Ye) et le dresseur
	 * Servira ensuite à caractériser la zone où est présent un Pokémon eau
	 */
	public double De=Math.sqrt((Xe-x)*(Xe-x)+(Ye-y)*(Ye-y));
	
	/**
	 * Sert à dessiner sur la fenêtre précedemment créée
	 * @param gr Graphics
	 */
	@Override
	public void paintComponent(Graphics gr) {
	//Obligatoire de nommer cette méthode "paintComponent"
		
		Graphics2D g = (Graphics2D)gr;
	
		//Dessine le fond de carte en couleur marron :
		Color marron = new Color(225,206,154);
		g.setColor(marron);
		g.fillRect(50,50,900,900);
		
		//Dessine la zone Pokemon plante niv3:
		g.setColor(Color.GREEN);
		g.fillRoundRect(590,50,360,500,30,30);
		//Dessine la zone Pokemon plante niv2:
		g.setColor(Color.GREEN.darker());
		g.fillRoundRect(650,50,300,400,30,30);		
		//Dessine la zone Pokemon plante niv1:
		g.setColor(Color.GREEN.darker().darker());
		g.fillRoundRect(710,50,240,300,30,30);
		g.fillRect(900,50,50,50);
		
		//Dessine la zone Pokemon eau niv 1 :
		Color bleutresclair = new Color(169,234,254);
		g.setColor(bleutresclair);
		g.fillRect(300,670,300,100);
		g.fillRoundRect(550, 670, 100, 240, 30, 30);
		//Dessine la zone Pokemon eau niv 2 :
		Color bleuclair = new Color(116,208,241);
		g.setColor(bleuclair);
		g.fillOval(60,595,410,250);
		g.fillRect(90,720,20,150);
		//Dessine la zone Pokemon eau niv 3:
		Color bleufonce = new Color(0,127,255);
		g.setColor(bleufonce);
		g.fillRect(50,850,900,50);
		
		//Dessine la zone Pokemon feu niv 1:
		g.setColor(Color.YELLOW);
		g.fillOval(50,80, 400, 400);
		//Dessine la zone Pokemon feu niv 2:
		g.setColor(Color.ORANGE);
		g.fillOval(100,130, 300, 300);
		//Dessine la zone Pokemon feu niv 3:
		g.setColor(Color.RED);
		g.fillOval(150,180, 200, 200);

		//Dessine le cadrillage du plan :
		g.setColor(Color.GRAY);
		for(int i=50;i<=950;i=i+20)
			g.drawLine(i,50,i,950);
		for(int i=50;i<=950;i=i+20)
			g.drawLine(50,i,950,i);
		
		//Définie la zone cratère volcan (impossible d'y aller) :
		g.setColor(Color.RED.darker());
		g.fillOval(200,230,100,100);
		
		//Définie la zone mer (impossible d'y aller) :
		g.setColor(Color.BLUE);
		g.fillRect(50,890,900,60);
		//Zone lac (impossible d'y aller) :
		g.fillOval(110,635,320,170);
		//Zone riviere (impossible d'y aller) :
		g.fillRect(300,710,300,20);
		g.fillRoundRect(590, 710, 20, 240, 20, 20);
		g.fillRoundRect(110, 720, 20, 200,20,20);
		
		//definie les conditions pour ne pas sortir du plan:
		if (x<2 || x>46) {
			setX(22);
			setY(21);
			dresseur.setPositionx(X-1);
			dresseur.setPositiony(Y-1);}
		
		//Définie les conditions pour ne pas aller dans le cratère du volcan:
		if (Df<2.7) {
			System.out.println("Vous ne pouvez pas aller dans le volcan");
			setX(22);
			setY(21);
			dresseur.setPositionx(X-1);
			dresseur.setPositiony(Y-1);}
		
		//Définie les conditions pour ne pas aller dans l'eau:
		if (y>43 || (x<30 && x>4 && y>34) || (x<21 && x>4 && De<15.4)) {
			System.out.println("Vous ne pouvez pas aller dans l'eau");
			setX(22);
			setY(21);
			dresseur.setPositionx(X-1);
			dresseur.setPositiony(Y-1);}
		
		//Définie la rencontre avec Pokemon eau:
		if (((De>15.4 && De<16.9 && x<23) || (y==34 && (x==22 || x==21)) || ((y==40 || y==41) && x==3)) && Math.random()<0.20)
			Combatpokemon.combat(dresseur,randomElement(ListePokemon_ville2_eau));
		if ((((y==33 || y==34) && (x<32 && x>22)) || ((x==30 || x==31) && (y<42 && y>34))) && Math.random()<0.20)
			Combatpokemon.combat(dresseur,randomElement(ListePokemon_ville1_eau));
		if (((y==42 || y==43) && x>29) && Math.random()<0.20)
			Combatpokemon.combat(dresseur,randomElement(ListePokemon_ville3_eau));

		//Définie la rencontre avec Pokemon feu:
		if ((Df>2.7 && Df<5.9) && Math.random()<0.25)
			Combatpokemon.combat(dresseur,randomElement(ListePokemon_ville1_feu));
		if ((Df>5.9 && Df<8) && Math.random()<0.25)
			Combatpokemon.combat(dresseur,randomElement(ListePokemon_ville2_feu));
		if ((Df>8 && Df<10.7) && Math.random()<0.25)
			Combatpokemon.combat(dresseur,randomElement(ListePokemon_ville3_feu));
		
		//Définie la rencontre avec Pokemon plante:
		if ((x>34 && y<17) && Math.random()<0.25)
			Combatpokemon.combat(dresseur,randomElement(ListePokemon_ville3_plante));
		if ((((31<x && x<35) && y<22) || ((x>34) && (16<y && y<22))) && Math.random()<0.25)
			Combatpokemon.combat(dresseur,randomElement(ListePokemon_ville2_plante));
		if ((((28<x && x<32) && y<27) || ((x>31) && (21<y && y<27)))  && Math.random()<0.25) 
			Combatpokemon.combat(dresseur,randomElement(ListePokemon_ville1_plante));
		
		//places les icones des PNJ:
		//Pour le PNJ feu (8,25)
		Image iconePNJfeu = null;
		try {iconePNJfeu = ImageIO.read(new File("icone3m.png"));}
		catch (IOException e) {e.printStackTrace();}
		g.drawImage(iconePNJfeu, 8*20+7, 25*20+4, this);
		//Pour le PNJ plante (24,20)
		Image iconePNJplante = null;
		try {iconePNJplante = ImageIO.read(new File("icone1m.png"));} 
		catch (IOException e) {e.printStackTrace();}
		g.drawImage(iconePNJplante,24*20+7,5*20+4, this);
		//pour le PNJ eau (38,33)
		Image iconePNJeau = null;
		try {iconePNJeau = ImageIO.read(new File("icone2m.png"));}
		catch (IOException e) {e.printStackTrace();}
		g.drawImage(iconePNJeau, 38*20+7,33*20+4, this);
		
		//Conditions pour rencontrer un PNJ
		if ((x>6 && x<10) && (y<27 && y>23)) 
			Combatdresseur.combatPNJ(dresseur, Jeoffroy);
		if ((x>22 && x<26) && (y<7 && y>3)) 
			Combatdresseur.combatPNJ(dresseur, Hubert);
		if ((x>36 && x<40) && (y<35 && y>31)) 
			Combatdresseur.combatPNJ(dresseur, Adriano);
			
		//Conditions pour ne pas être sur la même case qu'un PNJ 
		if (x==8 && y==25) {
			setX(9);
			setY(25);
			dresseur.setPositionx(X-1);
			dresseur.setPositiony(Y-1);}
		if (x==24 && y==5) {
			setX(25);
			setY(6);
			dresseur.setPositionx(X-1);
			dresseur.setPositiony(Y-1);}
		if (x==38 && y==33) {
			setX(39);
			setY(35);
			dresseur.setPositionx(X-1);
			dresseur.setPositiony(Y-1);}
		 		      
		//Place l'image du curseur du joueur:
		Image iconejoueur = null;
		try {iconejoueur = ImageIO.read(new File("icone.png"));} 		
		catch (IOException e) {e.printStackTrace();}
		g.drawImage(iconejoueur,x*20+5,y*20+3, this);
		      
		//Dessine la bordure exterieure 
		g.setColor(Color.BLACK);
		g.drawRect(50,50,900,900);
	}
	
	/**
	 * Met à jour la coordonnée x du dresseur et Df et De
	 * @param i 
	 */
	public void setX(int i) {
		this.x = i+1;
		this.X = i+1;
		this.Df=Math.sqrt((Xf-x)*(Xf-x)+(Yf-y)*(Yf-y));
		this.De=Math.sqrt((Xe-x)*(Xe-x)+(Ye-y)*(Ye-y));
		// TODO Auto-generated method stub
	}
	
	/**
	 * Met à jour la coordonnée y du dresseur et Df et De
	 * @param i
	 */
	public void setY(int i) {
		this.y = i+1;
		this.Y = i+1;
		this.Df=Math.sqrt((Xf-x)*(Xf-x)+(Yf-y)*(Yf-y));
		this.De=Math.sqrt((Xe-x)*(Xe-x)+(Ye-y)*(Ye-y));
		// TODO Auto-generated method stub
	}
	
}
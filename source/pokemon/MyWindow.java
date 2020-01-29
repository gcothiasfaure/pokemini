package pokemon;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.KeyboardFocusManager;
import java.awt.event.WindowAdapter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;;

/**
 * <b>Cette classe sert à cree et afficher l'interface graphique du jeu
 * Elle extends JPanel car on utilise cette objet pour construire la fenêtre<b>
 * <p>
 * MyWindow est caractérisé part les informations suivantes :
 * <ul>
 * <li>un JButton mrs qui permet d'utiliser la classe MrsACtionListner<li>
 * <li> un JButton Arene qui permet d'utiliser la classe AreneACtionListner<li>
 * <li>un JButton Consulter qui permet d'utiliser la classe ConsulterACtionListner<li>
 * <li>un JButton Save qui permet d'utiliser la classe SavrACtionListner<li>
 * <li>un JButton Quit qui permet d'utiliser la classe QuitACtionListner<li>
 * <li>un Dresseur dresseur qui correspond au dresseur du joueur<li>
 * <li>une ArrayList<Pokemon> qui permet d'utiliser la fonction stockage pokemon<li>
 * <li>une arrayList<PNJcmbattant qui stock les differents Pnj du main<li>
 * <li>un File file qui stock les informations du dresseur<li>
 * <li>un File file2 qui stocke les pokemon du dresseur<li>
 * <li>un File file3 qui stocke les pokemon dans le stockage de pokemon<li>
 * <li>un Plan_ville plan_ville qui permet la creation de la map dans l'interface<li>
 * <ul>
 * @author felix
 *
 */


public class MyWindow extends JFrame{
	
	private JButton mrs  = new JButton("Centre MRS");
	private JButton Arene = new JButton("Arene");
	private JButton Consulter = new JButton("Consulter objet/pokemons");
	private JButton Save = new JButton("Sauvegarder");
	private JButton Quit = new JButton("Sauvegarder et quitter");
	protected static JTextArea text = new JTextArea("Bienvenue");
	private static final long serialVersionUID = -4939544022387453046L;
	private Dresseur dresseur;
	private ArrayList<Pokemon> stockagepokemon;
	private ArrayList<PNJcombattant> listPNJcombattant;
	private File file ;
	private File file2 ;
	private File file3 ;
	private Plan_ville plan_ville = new Plan_ville();
	
	private static MyWindow instance;
	
	
	/**
	 * methode qui permet de creer une instance MyWindow si elle n'existe pas deja
	 * @return MyWindow
	 */
	public static MyWindow getInstance() {
		if (instance == null) {
			MyWindow myWindow = new MyWindow();
			instance = myWindow;
		}
		return instance;
	}
	
	
	public MyWindow() {
		super("PokemIGN");
		
		
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setSize(1300,1000);
		this.setLocationRelativeTo(null); 
		 
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		
		
		contentPane.add(createLeftPanel(),BorderLayout.WEST);
		
		Plan_ville.setDresseur(dresseur);
		contentPane.setFocusable(true);
	
		contentPane.add(plan_ville,BorderLayout.CENTER);
		contentPane.setName("contentPane");
		
		KeyboardFocusManager focusManager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
		focusManager.addKeyEventDispatcher(new MouvementKeyDispatcher());
		
		
		
		contentPane.setFocusable(true);
		
		
		this.setContentPane(contentPane);
		contentPane.setVisible(true);
		contentPane.revalidate();
		contentPane.repaint();
		

		
		this.addWindowListener(new WindowAdapter() {
			/**
			 * methode qui permet de confirmer si le joueur veux reellement quitter sa partie sans sauvegarder lorsqu'il ferme la fenetre
			 */
			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {
				int response = JOptionPane.showConfirmDialog(MyWindow.this, "Quitter sans sauvergarder ?","Quitter",JOptionPane.YES_NO_OPTION);
				if(response == JOptionPane.YES_OPTION) {
					MyWindow.this.dispose();
				}
			};
		});
		
		
	}

	
		
	/**
	 * Methode permettant la creation du JPanel ou figurent les boutons
	 * @return JPanel
	 */
	private JPanel createLeftPanel() {
		
		
		JPanel panel = new JPanel(new GridLayout(5,1,20,20));
		
		mrs.addActionListener(new MrsActionListener(this));
		
		
		panel.add(mrs);
		
		
		Arene.addActionListener(new AreneActionListener(this));
		panel.add(Arene) ;

		
		Consulter.addActionListener(new ConsulterActionListener(this));
		panel.add(Consulter) ;
		
		
		Save.addActionListener(new SaveActionListener(this));
		panel.add(Save) ;
		
		
		
		
		Quit.addActionListener(new QuitActionListener(this));
		panel.add(Quit) ;
		
		panel.setName("paneau");
		
		return panel;
	}
	
	
	public static void main(String[] args) throws Exception {
	
	
	UIManager.setLookAndFeel(new NimbusLookAndFeel());
	
	
	}




	public void setDresseur(Dresseur dresseur) {
		this.dresseur = dresseur;		
	}

	public void setStockagepokemon(ArrayList<Pokemon> stockagepokemon) {
		this.stockagepokemon = stockagepokemon;		
	}




	public ArrayList<PNJcombattant> getListPNJcombattant() {
		return listPNJcombattant;
	}




	public void setListPNJcombattant(ArrayList<PNJcombattant> listPNJcombattant) {
		this.listPNJcombattant = listPNJcombattant;
	}
	
	public File getFile() {
		return file;
	}




	public void setFile(File file) {
		this.file = file;
	}
	
	public File getFile2() {
		return file2;
	}




	public void setFile2(File file2) {
		this.file2 = file2;
	}
	
	public File getFile3() {
		return file3;
	}




	public void setFile3(File file3) {
		this.file3 = file3;
	}

	
	
	
	
	
	public ArrayList<Pokemon> getStockagepokemon() {
		return stockagepokemon;
	}


	/**
     * Méthode qui va charger une partie sauvegardée ou en créer une
     * nouvelle si elle n'existe pas
     * 
     * @param file: fichier texte avec les attributs du dresseur chargé
     * 
     * @param file2: fichier texte avec les attributs de chacun des pokemons
     * de la liste des pokemons du dresseur
     * 
     */
	public static Dresseur creationdresseur(File file,File file2) {
		Dresseur dresseur = null;
		if(file.exists()) {
				ArrayList<Pokemon> Listpokemon = new ArrayList<Pokemon>();
				
				try{
					BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file2),"UTF-8"));
					String line = reader.readLine();
					while(line!= null) {
						/**
						* Pour charger les pokemons du dresseur, on va chercher ses pokemons
						* dans un fichier independant file2 où on va charger les attributs du
						* pokemon qu'on crée et ajoute à la liste de pokemon du dresseur,
						* dans le fichier texte file2
						*/
						line = reader.readLine();
						String name = line;
						line = reader.readLine();
						int id = Integer.parseInt(line);
						line = reader.readLine();
						int lvl = Integer.parseInt(line);
						line = reader.readLine();
						double xp = Double.parseDouble(line);
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
						double xpnecessaire= Double.parseDouble(line);
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
						Listpokemon.add(pokemon);
						line = reader.readLine();
					}
					reader.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
				
				try {
				/**
				* Pour charger une partie, on va prendre le dresseur defini en debut de methode
				* et lui changer ses attributs par lecture du fichier texte file
				*/
				BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
				String line = reader.readLine();
				String nom = line;
				line = reader.readLine();
				String sexe = line;
				line = reader.readLine();
				int positionx = Integer.parseInt(line);
				line = reader.readLine();
				int positiony = Integer.parseInt(line);
				line = reader.readLine();
				line = reader.readLine();
				int potion = Integer.parseInt(line);
				line = reader.readLine();
				int argent = Integer.parseInt(line);
				line = reader.readLine();
				int nb_badge = Integer.parseInt(line);
				line = reader.readLine();
				int nb_pokeball = Integer.parseInt(line);
				
				
				
				dresseur = new Dresseur(nom,sexe,positionx,positiony,Listpokemon,potion,argent,nb_badge,nb_pokeball); 
																
				reader.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
		}
		else {
			String sexe;
						
			String[] options = new String[] {"garcon","fille"};
		    int response = JOptionPane.showOptionDialog(null, "\nBien le bonjour! Bienvenue dans le monde incroyable des pokemon!"
		    		+"\nMon nom est FRANCIS DEE"
		    		+"\nCe monde est peuple de creatures appeles POKEMON!"
		    		+"\nPour certains, les pokemon sont des ainimaux domestiques, pour d'autres, ils sont un moyen de combattre."
		    		+"\nPour ma part l'etude des Cartes est ma proffession."
		    		+ "\nMais avant tout, parle-moi un peu de toi."
		    		+"\nMaintenant dis-moi. Es-tu un garcon ou une fille ? "
		    		, "Choix du sexe",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, options, options[0]);
			
			if (response == 0) {
				sexe = "garcon";
			}
			else {
				sexe = "fille";
				}
			String name =JOptionPane.showInputDialog("\n Quel est ton nom ?");
			options = new String[] {"oui","non"};
		    response = JOptionPane.showOptionDialog(null, "D'accord donc tu t'appelles "+name+" ?", "Confirmation du nom",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, options, options[0]);
			while(response == 1) {
				name =JOptionPane.showInputDialog("\npeut-tu me repeter ton nom ?");
				options = new String[] {"oui","non"};
			    response = JOptionPane.showOptionDialog(null, "D'accord donc tu t'appelles "+name+" ?", "Confirmation du nom",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, options, options[0]);
			}
			
			ArrayList<Pokemon> Listpokemon = new ArrayList<Pokemon>() ;
			dresseur = new Dresseur( name, sexe, 20,21 ,Listpokemon ,0,0,0,10); 

			
			Pokemon starter;
			
			options = new String[] {"Feuvert","hepar","Kobaobab"};
		    response = JOptionPane.showOptionDialog(null,"\n"+ name + " !"
		    		+ "\nTa quete des POKeMON est sur le point de commencer!"
		    		+ "Un tout nouveau monde de reves, d'aventures et de POKeMON t'attend! Bonne chance!"
		    		+ "\nIl te faut maintenant un pokemon pour pouvoir commencer ton aveture."
		    		+ "\nJe vais t'en offrir un."
		    		+ "\nLequel aimerais-tu avoir ?"
		    		,"Choix du starter",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, options, options[0]);
			
		
			
			if( response == 0) {
				starter = new Pokemon (8,"Feuvert",5,40,22.5,"Lancer de pneux","defense",107.5,"feu",0,20,80.0,80.0,true,16,1,40,22.5);
			}
			else if( response == 1) {
				starter = new Pokemon  (17,"Hepar",300,300,300,"Cascade","Magnesium",30,"eau",99,100,30.0,30.0,true,16,1,10,10);
			}
			
			else {
				starter = new Pokemon (32,"Kobaobab",5,40,22.5,"Freestyle tenebreux","Orgueuilleux",67.5,"plante",0,20,80,80,true,16,1,40,22.5);
			}
			
			JOptionPane.showMessageDialog(null,"\nTu as choisis " + starter.getName() + ", c'est un excellent choix." );
			dresseur.Listpokemon.add(starter);
		}
		return dresseur;
	}
	
	
	public Plan_ville getPlan_ville() {
		return plan_ville;
	}
	
	public Dresseur getDresseur() {
		return dresseur;
	}
	
}
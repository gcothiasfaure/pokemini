package pokemon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
/**
 * <b>Cette classe permet d'implementer le JButton Arene
 * Elle implement ActionListener car on redefinis les methodes de cet interface<b>
 * <p>
 * <li>un objet MyWindow ou apparais le bouton en question<li>
 * 
 * @author felix
 *
 */
public class AreneActionListener implements ActionListener {
	
	
	private MyWindow myWindow;
	
	
	public AreneActionListener(MyWindow window) {
		// TODO Auto-generated constructor stub
		this.myWindow = window;
	}
	
	
	/**
	 * reecriture de la methode actionPerformed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		AreneListener(e);
	}
	
	private void AreneListener(ActionEvent event) {
		Arene(this.myWindow.getDresseur(),this.myWindow.getListPNJcombattant());
	}
	
	/**
     * Méthode qui va gérer le passage du dresseur à l'arène avec les différentes options 
     * d'affrontement qui vont lui être proposées.  
     * 
     * @param dresseur: dresseur du joueur 
     * 
     * @param listPNJcombattant: liste de tous les PNJcombattants du jeu.
     */
	public static void Arene(Dresseur dresseur,ArrayList<PNJcombattant> listPNJcombattant) {
		int k = 3;
	
		if (dresseur.getNb_badge() >= 3) {
		 k =4;
		}
		String[] options = new String[k]; 
		options[0] = "Champion";
		options[1] ="dresseur d'entrainement";
		options[2] = "Partir";
		if(k == 4) {
			options[3] = "La Ligue";
		}
		
		
	    int response = JOptionPane.showOptionDialog(null, "Qui voulez-vous combattre ?", "Arene",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, options, options[0]);
	    /**
	     * Si le joueur n'a pas de badge et qu'il choisit d'affronter un champion 
	     * il affronte le premier champion d'arène
	     * s'il choisit le dresseur d'entraînement, il affronte le PNJcombattant
	     * qui accompagne  
	     */
	    if (dresseur.getNb_badge() == 0) {
	    	if (response == 0) {
					Combatdresseur.combatPNJ(dresseur,listPNJcombattant.get(0));
			}
			else if (response == 1) {
					Combatdresseur.combatPNJ(dresseur,listPNJcombattant.get(1));	
			}
	    }
	    
	    /**
	     * Si le joueur a un badge et qu'il choisit d'affronter un champion 
	     * il affronte le second champion d'arène
	     * s'il choisit le dresseur d'entraînement, il affronte le PNJcombattant
	     * qui accompagne  
	     */
	    else if (dresseur.getNb_badge() == 1)  {
	    	if (response == 0) {
					Combatdresseur.combatPNJ(dresseur,listPNJcombattant.get(2));
			}
			else if (response == 1) {
					Combatdresseur.combatPNJ(dresseur,listPNJcombattant.get(3));	
			}
	    }
	    
	    /**
	     * Si le joueur a deux badges et qu'il choisit d'affronter un champion 
	     * il affronte le troisième champion d'arène
	     * s'il choisit le dresseur d'entraînement, il affronte le PNJcombattant
	     * qui accompagne  
	     */
	    else if (dresseur.getNb_badge() == 2)  {
	    	if (response == 0) {
					Combatdresseur.combatPNJ(dresseur,listPNJcombattant.get(4));
			}
			else if (response == 1) {
					Combatdresseur.combatPNJ(dresseur,listPNJcombattant.get(5));	
			}
	    }
	    
	    else {
	    	if (response == 0) {
				Combatdresseur.combatPNJ(dresseur,listPNJcombattant.get(4));
	    	}
			else if (response == 1) {
					Combatdresseur.combatPNJ(dresseur,listPNJcombattant.get(5));	
			}
			else {
				ligue(dresseur,listPNJcombattant);
			}
	    }
	    JOptionPane.showMessageDialog(null,"\nMerci de votre visite, revenez quand vous voulez !");
	}
	
	/**
     * Méthode qui va gérer le passage du dresseur à la ligue avec les différentes options 
     * d'affrontement qui vont lui être proposées.  
     * 
     * @param dresseur: dresseur du joueur 
     * 
     * @param listPNJcombattant: liste de tous les PNJcombattants du jeu.
     */
	public static void ligue(Dresseur dresseur, ArrayList<PNJcombattant> listPNJcombattant) {
		int decisionint = JOptionPane.showConfirmDialog(null,"Vous avez remporte tous les badges, Felicitations!"
				+ "\nMais le vrai defi pour devenir le meilleur dresseur commence maintenant..."
				+ "\nEtes-vous prêts à affronter les champions de la ligue?","Ligue pokemon",JOptionPane.YES_NO_OPTION);
		
		
		if (decisionint==0) {
			/**
		     * Si le joueur indique qu'il est prêt à affronter la ligue, alors il affronte 
		     * le premier champion de la ligue, et les suivants tant qu'il gagne les duels.
		     */
			Combatdresseur.combatPNJ(dresseur,listPNJcombattant.get(6));
			if(Combatpokemon.continuerlecombat(dresseur)){
				Combatdresseur.combatPNJ(dresseur,listPNJcombattant.get(7));
				if(Combatpokemon.continuerlecombat(dresseur)){
					Combatdresseur.combatPNJ(dresseur,listPNJcombattant.get(8));
					if(Combatpokemon.continuerlecombat(dresseur)) {
						JOptionPane.showMessageDialog(null,"Felicitations ! Vous avez vaincu la ligue Decartes, vous etes donc devenu le meilleur dresseur du campus Decartes.");
					}
				}
			}
		}
	}

}


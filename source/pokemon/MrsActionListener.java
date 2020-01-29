package pokemon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;


/**
 * <b>Cette classe permet d'implementer le JButton mrs
 * Elle implement ActionListener car on redefinis les methodes de cet interface<b>
 * <p>
 * <li>un objet MyWindow ou apparais le bouton en question<li>
 * 
 * @author felix
 *
 */

public class MrsActionListener implements ActionListener {
	
	
private MyWindow myWindow;
	
	
	public MrsActionListener(MyWindow window) {
		// TODO Auto-generated constructor stub
		this.myWindow = window;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		MrsListener(e);
	}
	
	private void MrsListener(ActionEvent event) {
		Mrs(this.myWindow.getDresseur(),this.myWindow.getStockagepokemon());
	}

	
	/**
     * Méthode qui gère le passage du dresseur au centre MRS, et les différentes actions
     * possibles(soigner son pokemon, gérer son stockage de pokemon, acheter des objets)
     * 
     * @param dresseur: le dresseur du joueur
     */
public static void Mrs(Dresseur dresseur,ArrayList<Pokemon> stockagepokemon) {
		
		
		
		String[] options = new String[] {"1 :soigner vos pokemon?","2: acceder au stockage de pokemon","3: acheter des potions","4: acheter des pokeballs"};
	    int decisionint = JOptionPane.showOptionDialog(null, "Bonjour bienvenue dans notre centre MRS, que souhaitez vous faire ?", "Choix MRS",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, options, options[0]);
		
		if (decisionint == 0) {
			for (Pokemon p:dresseur.getListpokemon()) {
				p.setPv(p.getPv_max());	
			}
			JOptionPane.showMessageDialog(null,"\nVos Pokemons ont ete soignes, merci de votre visite!");
		}
		else if(decisionint==1){
			
			options = new String[] {"1 :consulter vos pokemon","2: deposer un pokemon","3: retirer un pokemon"};
		    decisionint = JOptionPane.showOptionDialog(null, "Que souhaitez vous faire ?", "Choix Stockage",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, options, options[0]);
			
			if(decisionint == 0) {
				checker(stockagepokemon);
			}
			else if(decisionint==1) {
				deposer(dresseur,stockagepokemon);
			}
			else if(decisionint==2) {
				retirer(dresseur,stockagepokemon);
			}
		}
		else if(decisionint == 2){
			
			String decision = JOptionPane.showInputDialog("Vous avez actuellement " + dresseur.getArgent() +" ects. \nChaque potion coute 10 ects, combien en voulez vous ?");
			decisionint  =Integer.parseInt(decision);
			if(decisionint*10 <= dresseur.getArgent()) {
				decisionint = JOptionPane.showConfirmDialog(null,"Etes vous sur de vouloir acheter " + decisionint + " potion(s) ?","confirmation",JOptionPane.YES_NO_OPTION );
				if(decisionint == 1) {
					dresseur.setArgent(dresseur.getArgent() - decisionint*50);
					dresseur.setPotion(dresseur.getPotion()+ decisionint); 
					
					JOptionPane.showMessageDialog(null,"Merci pour votre achat,vous avez " + dresseur.getPotion() + "potion(s) et il vous reste " + dresseur.getArgent() + " ects");
				}
			}
			else {
				JOptionPane.showMessageDialog(null,"Desole, vous n'avez pas assez d'ects");
			}
		}
		else{			
			String decision = JOptionPane.showInputDialog("Vous avez actuellement " + dresseur.getArgent() +" ects. \nChaque pokeball coute 10 ects, combien en voulez vous ?");
			decisionint  =Integer.parseInt(decision);
			if(decisionint*10 <= dresseur.getArgent()) {
				decisionint = JOptionPane.showConfirmDialog(null,"\nEtes vous sur de vouloir acheter " + decisionint + " pokeball(s) ?","confirmation",JOptionPane.YES_NO_OPTION );
				
				if(decisionint == 1) {
					dresseur.setArgent(dresseur.getArgent() - decisionint*10);
					dresseur.setNb_pokeball(dresseur.getNb_pokeball()+ decisionint); 
					
					JOptionPane.showMessageDialog(null,"Merci pour votre achat,vous avez " + dresseur.getNb_pokeball() + "pokeball(s) et il vous reste " + dresseur.getArgent() + " ects");
				}
			}
			else {
				JOptionPane.showMessageDialog(null,"Desole, vous n'avez pas assez d'ects");
			}
		}
		
		JOptionPane.showMessageDialog(null,"A bientot");
	}
	
/**
 * Méthode qui gère le dépôt d'un pokemon dans le stockage 
 * du fait de la limite du nombre de pokemons actifs dans la liste de pokemon du dresseur 
 * 
 * @param dresseur: le dresseur du joueur
 */
	public static void deposer(Dresseur dresseur,ArrayList<Pokemon> stockagepokemon){
		if(dresseur.getListpokemon().size()>1) {
			String[] options = new String[] {};
			if(dresseur.getListpokemon().size() == 2) {
				options = new String[] {1 + " nom : " + dresseur.getListpokemon().get(0).getName() + " Pv_max : " + dresseur.getListpokemon().get(0).getPv_max() +" level : " + dresseur.getListpokemon().get(0).getLvl(),
						2 + " nom : " + dresseur.getListpokemon().get(1).getName() + " Pv_max : " + dresseur.getListpokemon().get(1).getPv_max() +" level : " + dresseur.getListpokemon().get(1).getLvl()};
	
			}
			else { options = new String[] {1 + " nom : " + dresseur.getListpokemon().get(0).getName() + " Pv_max : " + dresseur.getListpokemon().get(0).getPv_max() +" level : " + dresseur.getListpokemon().get(0).getLvl(),
					2 + " nom : " + dresseur.getListpokemon().get(1).getName() + " Pv_max : " + dresseur.getListpokemon().get(1).getPv_max() +" level : " + dresseur.getListpokemon().get(1).getLvl(),
					3 + " nom : " + dresseur.getListpokemon().get(2).getName() + " Pv_max : " + dresseur.getListpokemon().get(2).getPv_max() +" level : " + dresseur.getListpokemon().get(2).getLvl()};
	
			}
		    int response = JOptionPane.showOptionDialog(null, "Quel pokemon voulez vous deposer ?", "Depot pokemon",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, options, options[0]);
			
			if(response <= dresseur.getListpokemon().size()) {
				Pokemon pok = dresseur.getListpokemon().get(response);
				stockagepokemon.add(pok);
				dresseur.Listpokemon.remove(pok);
				JOptionPane.showMessageDialog(null,"Votre " + pok.getName() + " a bien ete depose dans le stockage de pokemon");
			}
		}
		else {
		JOptionPane.showMessageDialog(null,"Vous devez au moins avoir 2 pokemon sur vous pour pouvoir en deposer un");
		}
	}
	
	/**
	 * Méthode qui permet de voir les pokemons présents dans le stockage 
	 * 
	 * @param stockapokemon: liste de pokemons dans le stockage de pokémon
	 */
	public static void checker(ArrayList<Pokemon> stockagepokemon) {
		if(stockagepokemon.size()==0) {
			JOptionPane.showMessageDialog(null, "Vous n'avez aucun pokemon en stock");
		}
		else {
			String options = null;
			for(Pokemon pok:stockagepokemon) {
				
				options  = "Pokemon stockes :";
				for(int indice = 1; indice == stockagepokemon.size(); indice++ )
				options  = options +"\n" + indice  + " nom : " + pok.getName() + ", attaque : "+ pok.getAttack()+ " :" + pok.getAtck() + " ,defense : " + pok.getDefense() + " : " + pok.getDef() +  " , pv : " + pok.getPv() + "/" + pok.getPv_max() + ", lvl :" + pok.getLvl() + ", xp :"  + pok.getXp() + "/" + pok.getXpnecessaire();
			}
			JOptionPane.showMessageDialog(null, options);
		}
	}
	
	/**
	 * Méthode qui gère le retrait d'un pokemon du stockage  
	 * 
	 * @param dresseur: le dresseur du joueur
	 * 
	 * @param stockapokemon: liste de pokemons dans le stockage de pokémon
	 * 
	 */
	public static void retirer(Dresseur dresseur,ArrayList<Pokemon> stockagepokemon  ) {
		if(dresseur.getListpokemon().size() < 3 && stockagepokemon.size() >=1) {
			String[] options = new String[stockagepokemon.size()];
			int indice = 1;
			for(Pokemon pok:stockagepokemon) {
				options [indice-1] = indice + " nom : " + pok.getName() + " Pv_max : " + pok.getPv_max() +" level : " + pok.getLvl();
				indice ++ ;
			}
			int response = JOptionPane.showOptionDialog(null, "Quel pokemon voulez vous retirer ?", "retirer pokemon",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, options, options[0]);
			
				
			JOptionPane.showMessageDialog(null,stockagepokemon.get(response).getName() + " a rejoind votre equipe");
			dresseur.Listpokemon.add(stockagepokemon.get(response));
			stockagepokemon.remove(stockagepokemon.get(response));
			}		
		else if(dresseur.getListpokemon().size() > 3) {
			JOptionPane.showMessageDialog(null,"Vous ne pouvez pas posseder plus de 3 pokemon dans votre equipe");
		}
		else {
			JOptionPane.showMessageDialog(null,"Vous n'avez aucun pokemon stocke");
		}
	}
	
}


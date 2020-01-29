package pokemon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


/**
 * <b>Cette classe permet d'implementer le JButton consulter
 * Elle implement ActionListener car on redefinis les methodes de cet interface<b>
 * <p>
 * <li>un objet MyWindow ou apparais le bouton en question<li>
 * 
 * @author felix
 *
 */
public class ConsulterActionListener implements ActionListener {
	
	private MyWindow myWindow;
	
	public ConsulterActionListener(MyWindow window) {
		// TODO Auto-generated constructor stub
		this.myWindow = window;
	}
	
	
	
	/**
	 * reecriture de la methode actionperformed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		ConsulterListener(e);
		
	}
	
	private void ConsulterListener(ActionEvent event) {
		Checking(this.myWindow.getDresseur());
	}
    
	
	/**
     * Méthode qui va indiquer au joueur son nombre de d'objets(potions, badge etc...)
     * ainsi que tous ses pokemons et certaines de leurs statistiques.
     * 
     * @param dresseur: le dresseur du joueur
     */	
	public void Checking(Dresseur dresseur) {
		String etatpok;
		etatpok =  "\nVous avez " + dresseur.getNb_badge() + " badge(s).\n Vous avez " + dresseur.getPotion() + " potion(s).\n Vous avez " + dresseur.getNb_pokeball() + " pokeball(s)." ;
		int indice =0 ;
		for(Pokemon pok:dresseur.getListpokemon()) {
			indice ++;
			etatpok = etatpok + "\n" + indice+" : " + pok.getName() + ", attaque : "+ pok.getAttack()+ " :" + pok.getAtck() + " ,defense : " + pok.getDefense() + " : " + pok.getDef() +  " , pv : " + pok.getPv() + "/" + pok.getPv_max() + ", lvl :" + pok.getLvl() + ", xp :"  + pok.getXp() + "/" + pok.getXpnecessaire();
		}		
		JOptionPane.showMessageDialog(MyWindow.getInstance(), etatpok);
		
	}

}

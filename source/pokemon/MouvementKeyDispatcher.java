package pokemon;

import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;
/**
 * Classe qui permet a la machine de capter les entrées claviers necessaires au deplacement du personnage
 * Cette classe implements KeyEventDispatcher car on  l'ulise pour capter les entrees clavier
 * @author felix
 *
 */
public class MouvementKeyDispatcher implements KeyEventDispatcher {
	
	
	/**
	 * reecrtiure de la methode dispatchKeyEvent 
	 * la pression des touches z,q,s,d permettent respectivement les deplacements du dresseur vers le haut,la gauche,le bas et la droite
	 */
	@Override
	public boolean dispatchKeyEvent(KeyEvent e) {
		
		int keycode = e.getKeyCode();
		if (keycode == KeyEvent.VK_Z && e.getID() == KeyEvent.KEY_PRESSED) {
			Dresseur.deplacement(MyWindow.getInstance().getDresseur(),"z");
			MyWindow.getInstance().getPlan_ville().setX(Plan_ville.dresseur.getPositionx());
			MyWindow.getInstance().getPlan_ville().setY(Plan_ville.dresseur.getPositiony());
			MyWindow.getInstance().revalidate();
			MyWindow.getInstance().repaint();
		}
		
		else if (keycode == KeyEvent.VK_Q && e.getID() == KeyEvent.KEY_PRESSED) {
			Dresseur.deplacement(MyWindow.getInstance().getDresseur(),"q");
			MyWindow.getInstance().getPlan_ville().setX(Plan_ville.dresseur.getPositionx());
			MyWindow.getInstance().getPlan_ville().setY(Plan_ville.dresseur.getPositiony());
			MyWindow.getInstance().revalidate();
			MyWindow.getInstance().repaint();
		}
		
		if (keycode == KeyEvent.VK_S && e.getID() == KeyEvent.KEY_PRESSED) {
			Dresseur.deplacement(MyWindow.getInstance().getDresseur(),"s");
			MyWindow.getInstance().getPlan_ville().setX(Plan_ville.dresseur.getPositionx());
			MyWindow.getInstance().getPlan_ville().setY(Plan_ville.dresseur.getPositiony());
			MyWindow.getInstance().revalidate();
			MyWindow.getInstance().repaint();
		}
	
		else if (keycode == KeyEvent.VK_D && e.getID() == KeyEvent.KEY_PRESSED) {
			Dresseur.deplacement(MyWindow.getInstance().getDresseur(),"d");
			MyWindow.getInstance().getPlan_ville().setX(Plan_ville.dresseur.getPositionx());
			MyWindow.getInstance().getPlan_ville().setY(Plan_ville.dresseur.getPositiony());
			MyWindow.getInstance().revalidate();
			MyWindow.getInstance().repaint();
		}
		// TODO Auto-generated method stub
		return false;
	}

}

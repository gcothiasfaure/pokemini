package pokemon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
/**
 * <b>Cette classe permet d'implementer le JButton Quit
 * Elle implement ActionListener car on redefinis les methodes de cet interface<b>
 * <p>
 * <li>un objet MyWindow ou apparais le bouton en question<li>
 * 
 * @author felix
 *
 */
public class QuitActionListener implements ActionListener {

	private MyWindow myWindow;
	
	public QuitActionListener(MyWindow window) {
		// TODO Auto-generated constructor stub
		this.myWindow = window;
	}
	
	
	
	
	/**
	 * reecriture de la methode actionPerformed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		SaveListener(e);
	}
	
	private void SaveListener(ActionEvent event) {
			Quit(this.myWindow.getDresseur(),this.myWindow.getStockagepokemon(),this.myWindow.getFile(),this.myWindow.getFile2(),this.myWindow.getFile3());
	}
	
	
	
	/**
	 * Cette methode permet de sauvegarder et quitter le jeu
	 * @param dresseur
	 * @param stockagepokemon
	 * @param file
	 * @param file2
	 * @param file3
	 */
	public static void Quit(Dresseur dresseur ,ArrayList<Pokemon> stockagepokemon, File file,File file2,File file3) {
		if(!file.exists()) { 
			try{                    
				file.createNewFile() ;           
				}catch(IOException e) {                    
					e.printStackTrace();            
					}   
			}
		try{FileWriter writer =  new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(writer); 
			String n= dresseur.getNom() +"\n"+ dresseur.getSexe() + "\n"+ dresseur.getPositionx()+"\n" + dresseur.getPositiony()+"\n" + "Listepokemon" +"\n" + dresseur.getPotion()+ "\n" + dresseur.getArgent()+ "\n" + dresseur.getNb_badge()+ "\n" + dresseur.getNb_pokeball();						
			bw.write(n);
			bw.close();
			writer.close();
			
			writer =  new FileWriter(file2);
			bw = new BufferedWriter(writer);
			for(Pokemon pok:dresseur.getListpokemon()) {
				n="nouveau pokemon :" + "\n" + pok.getName() +"\n"+ pok.getId() + "\n"+ pok.getLvl()+"\n" + pok.getXp()+"\n" + pok.getAtck()+"\n" + pok.getDef()+ "\n" + pok.getAttack()+ "\n" + pok.getDefense()+ "\n" + pok.getVitesse()+ "\n" + pok.getType() + "\n"+ pok.getXpnecessaire() +"\n"+ pok.getPv() +"\n"+ pok.getPv_max() +"\n"+ pok.isEvoluable() +"\n"+ pok.getLvlnecessaire() +"\n"+ pok.getTypedefense() + "\n" + pok.getAtckdebase() + "\n" + pok.getDefdebase() + "\n";						
				bw.write(n);
			}
			bw.close();
			writer.close();
			
			writer =  new FileWriter(file3);
			bw = new BufferedWriter(writer);
			for(Pokemon pok:stockagepokemon) {
				n="Nouveau pokemon :" + "\n" + pok.getName() +"\n"+ pok.getId() + "\n"+ pok.getLvl()+"\n" + pok.getXp()+"\n" + pok.getAtck()+"\n" + pok.getDef()+ "\n" + pok.getAttack()+ "\n" + pok.getDefense()+ "\n" + pok.getVitesse()+ "\n" + pok.getType() + "\n"+ pok.getXpnecessaire() +"\n"+ pok.getPv() +"\n"+ pok.getPv_max() +"\n"+ pok.isEvoluable() +"\n"+ pok.getLvlnecessaire() + "\n"+ pok.getTypedefense() + "\n" + pok.getAtckdebase() + "\n" + pok.getDefdebase() + "\n";						
				bw.write(n);
			}
			bw.close();
			writer.close();
			
			}catch(IOException e) {
				e.printStackTrace();
				}
		JOptionPane.showMessageDialog(null,"Votre partie a ete sauvegardee avec succes ");
		MyWindow.getInstance().dispose();
		}
}

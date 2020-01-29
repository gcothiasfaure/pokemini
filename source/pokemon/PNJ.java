package pokemon;


/**
 * <b>PNJ personnage non joueur que le dresseur peut rencontrer </b>
 * <p>
 * PNJ est caracterisé par les informations suivantes :
 * <ul>
 * <li>Le nom du PNJ</li>
 * <li>la punchline du PNJ: phrase qu'il déclarera à chaque interaction avec le joueur</li>
 * <li>Sa positionx et sa positiony sur la map du jeu</li>
 * </ul>
 * </p>
 * <p>
 * De plus, les entiers confusion1 et confusion2 établit si le pokemon en jeu
 * du dresseur et le pokemon adverse sont confus.
 * </p>
 */
public class PNJ {
	private String name;
	private String punchline;
	private int positionx ;
	private int positiony ;

	
	public PNJ(String name, String punchline, int positionx, int positiony) {
		this.name = name;
		this.punchline = punchline;
		this.positionx = positionx;
		this.positiony = positiony;
		
	}

	
	public String getPunchline() {
		return punchline;
	}
	
	public void setPunchline(String punchline) {
		this.punchline = punchline;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public int getPositionx() {
		return positionx;
	}

	public void setPositionx(int positionx) {
		this.positionx = positionx;
	}

	public int getPositiony() {
		return positiony;
	}

	public void setPositiony(int positiony) {
		this.positiony = positiony;
	}


	
	
}

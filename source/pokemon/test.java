package pokemon;

public class test {
	
	String v;
	
	public String getV() {
		return v;
	}

	public void setV(String v) {
		this.v = v;
	}
	
	public test(String v ) {
		this.v=v;
	}
	public static void main(String[] args) {
		String v = "j'aime ";
		
		test truc = new test(v);
		
		String i =truc.getV();
		
		i = "aaaaaaaaa";
		
		System.out.println(truc.getV());
	}
}

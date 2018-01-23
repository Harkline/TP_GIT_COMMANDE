public class Heros{
	private String chNom;
	private String chClasse; 
	
	public Heros(String parNom, String parClasse){
		chNom=parNom;
		chClasse=parClasse;
	}
	
	public String toString(){
		return chNom +" "+  chClasse  ;
	} //toString() 
	
	public static void main (String[] args){
	Heros bob;
	bob=new Heros ("Bob", "le magicien");
	
	System.out.println(bob.toString());
	} 
}

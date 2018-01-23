public class Heros{
	private String chNom;
	private String chClasse; 
	private String chGenre;
	
	public Heros(String parNom, String parClasse,String parGenre){
		chNom=parNom;
		chClasse=parClasse;
		chGenre=parGenre;
	}
	
	public String toString(){
		if (chGenre=="m") 
			return chNom +" le "+ chClasse;
		return chNom +" la "+ chClasse;
	} //toString() 
	
	public static void main (String[] args){
		Heros bob;								    //La création d'un personnage en deux lignes !	
		bob = new Heros ("Bob","magicien","m");
		Heros zoe = new Heros("Zoe","barbare","f"); //En une seule ligne !
		System.out.println(bob.toString());
		System.out.println(zoe.toString());
	} 
}

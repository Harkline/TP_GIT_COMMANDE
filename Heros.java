public class Heros{
	private String chNom;
	private String chClasse; 
	private String chGenre;
	private int chPoint_de_vie=100;
	private int chAttaque=10;
	private int chDefense=10;
	private int chDommages=10;
	
	
	public Heros(String parNom, String parClasse, String parGenre){
		chNom=parNom;
		chClasse=parClasse;
		chGenre=parGenre;
	}

	public Heros(String parNom, String parClasse, String parGenre, int parPoint_de_vie, int parAttaque, int parDefense, int parDommages){
		chNom=parNom;
		chClasse=parClasse;
		chGenre=parGenre;
		chPoint_de_vie=parPoint_de_vie;
		chAttaque=parAttaque;
		chDefense=parDefense;
		chDommages=parDommages;
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

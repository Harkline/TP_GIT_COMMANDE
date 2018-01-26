import java.lang.*;

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
	
	public boolean estVivant(){
		if (chPoint_de_vie>0)
			return true;
		return false;
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
		//System.out.println(zoe.chDommages);
		bob.Attaquer(zoe);
		//System.out.println(zoe.chPoint_de_vie);
		zoe.Soigner();
		//System.out.println(zoe.chPoint_de_vie);
	}
	
	public void Soigner(){
		this.chPoint_de_vie=100;
		//System.out.println("J'ai soigne le hero!");
	}	 
	
	//math.random() return a pseudorandom double greater than or equal to 0.0 and less than 1.0. 
	public void Attaquer(Heros defenseur){
		double proba=Math.random();
		if (proba>(float)(chAttaque/(float)(chAttaque+defenseur.chDefense))){ 
			defenseur.chPoint_de_vie = defenseur.chPoint_de_vie - chDommages;
			System.out.println(this.toString()+" attaque "+defenseur.toString()+" et lui inflige "+defenseur.chDommages+" point(s) de dommage(s)"); //Affichage de l'attaque reussi
		}
		else
			System.out.println(this.toString()+" attaque "+defenseur.toString()+" et rate "); //Affichage de l'attaque rate
			
	}
}

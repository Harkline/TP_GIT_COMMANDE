
public class Heros
	{
	String chNom;
	String chClasse;
	char chGender;
	int chVie = 100;
	int chAtk = 10;
	int chDef = 10;
	int chDgts = 10;
	public Heros (String parNom, String parClasse, char parGender)
		{
		this.chNom = parNom;
		this.chClasse = parClasse;
		this.chGender = parGender;
		}
	public Heros (String parNom, String parClasse, char parGender, int parVie, int parAtk, int parDef, int parDgts)
		{
		this.chNom = parNom;
		this.chClasse = parClasse;
		this.chGender = parGender;
		this.chVie = parVie;
		this.chAtk = parAtk;
		this.chDef = parDef;
		this.chDgts = parDgts;
		}
	public static void br() 
		{
		System.out.println();
		}
	public static void afficherStats()
		{
		System.out.println("");
		}
	public String intToString(int parAmetre)
		{
		return ""+parAmetre;
		}
	public String stringToString(String parAmetre)
		{
		return ""+parAmetre;
		}
	public static void main(String[] args)
		{
		Heros michel = new Heros("Michel", "Ingenieur Informaticien", 'A');
		Heros gamzee = new Heros("Gamzee", "Barde de la Fureur", 'M');
		Heros aradia = new Heros("Aradia", "Demoiselle du Temps", 'F');
		Heros.br();
		LaFenetre fenetreG = new LaFenetre("Menu", michel, aradia);
		System.out.println(aradia.stringToString(aradia.chClasse));
		Heros.br();
		Heros.br();
		}
	}

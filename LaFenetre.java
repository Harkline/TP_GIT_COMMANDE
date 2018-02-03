import javax.swing.*;
import java.awt.*;

public class LaFenetre extends JFrame
	{
	Heros chHeros;
	 /* 
	 */
	private static final long serialVersionUID = 1L;
	public LaFenetre (String parTitre, Heros parHeros, Heros parHerosBis)
		{
		super(parTitre);
		chHeros = parHeros;
		PanelFils contentPane = new PanelFils(parHeros, parHerosBis);
		setContentPane(contentPane);
		contentPane.setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(645, 555); setVisible(true); setLocation(300, 300);
		}


    public static void main() {
        /*
        Heros Bob = new Heros("Bob", "Magicien", 'm') ;
        System.out.println(Bob);// inutile d'ajouter .toString
        // println prend automatiquement la methode toString

        Heros Zoe = new Heros("Zoe", "Barbare", 'f') ;
        System.out.println(Zoe);
        Bob.Combat(Zoe);

        Heros michel = new Heros("Michel", "Ingenieur Informaticien", 'A');
        Heros gamzee = new Heros("Gamzee", "Barde de la Fureur", 'M');
        Heros aradia = new Heros("Aradia", "Demoiselle du Temps", 'F');
        Heros.br();
        LaFenetre fenetreG = new LaFenetre("Menu", michel, aradia);
        System.out.println(aradia.stringToString(aradia.chClasse));
        Heros.br();
        Heros.br();
        */
    }
	}

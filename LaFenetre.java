import javax.swing.JPanel ;
import javax.swing.JFrame ;
import java.awt.Frame ;
import java.awt.Color ;
import java.awt.Window ;
import javax.swing.JButton ;
import javax.swing.JTextField ;
import java.awt.event.ActionListener ;
import java.awt.event.ActionEvent ;

public class LaFenetre extends JFrame
	{
	Heros chHeros;
	 /* 
	 */
	private static final long serialVersionUID = 1L;
    // P:à quoi sert cette variable ?
	public LaFenetre (String parTitre, Heros parHeros, Heros parHerosBis)
		{
		super(parTitre);
		chHeros = parHeros;
		PanelFils contentPane = new PanelFils(parHeros, parHerosBis);
        // P:le panel va prendre en parametre les deux heros qui lutteront
		setContentPane(contentPane);
		contentPane.setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000, 600);
        // P:precedemment:566~,622~
        setVisible(true);
        setLocation(10, 10);
        // P:precedemment:300,300
		}


    public static void main(String args[]) {
        /*
        Heros Bob = new Heros("Bob", "Magicien", 'm') ;
        System.out.println(Bob);// inutile d'ajouter .toString
        // println prend automatiquement la methode toString

        Heros Zoe = new Heros("Zoe", "Barbare", 'f') ;
        System.out.println(Zoe);
        Bob.Combat(Zoe);
        */
        Heros michel = new Heros("Michel", "Ingenieur Informaticien", 'm');
        Heros gamzee = new Heros("Gamzee", "Barde de la Fureur", 'm');
        Heros aradia = new Heros("Aradia", "Demoiselle du Temps", 'f');
        /*
        Heros.br();
        */
        LaFenetre fenetreG = new LaFenetre("Menu", michel, aradia);
        /*
        System.out.println(aradia.stringToString(aradia.chClasse));
        Heros.br();
        Heros.br();
        */
    }
	}

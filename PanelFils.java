import javax.swing.JPanel ;
import java.awt.BorderLayout ;
import javax.swing.JButton ;
import javax.swing.JTextField ;
import java.awt.event.ActionListener ;
import java.awt.event.ActionEvent ;

public class PanelFils extends JPanel
	{
	static LaFenetre chMama;
	PanelDuHaut leHaut;
	Heros chHeros1;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelFils(LaFenetre parFenetre, Heros parHeros1)
		{
		chMama = parFenetre;
		Heros chHeros1 = parHeros1;
		
		this.setLayout(new BorderLayout(1, 0));
		
		PanelCombat combat = new PanelCombat(chHeros1);
        add(combat, BorderLayout.SOUTH);
        // le panel ou s'affichera les differentes attaques possibles
		PanelDuHaut leHaut = new PanelDuHaut(chMama, chHeros1);
        add(leHaut, BorderLayout.NORTH);
		// panel servant a l'edition des champs du/des Heros
        // et a afficher le texte narrant le combat
		}
	public void actualiser()
		{
		this.leHaut = new PanelDuHaut(chMama, this.chHeros1);
        add(this.leHaut, BorderLayout.NORTH);
        this.revalidate();
		}
	}

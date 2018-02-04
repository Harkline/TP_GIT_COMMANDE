import javax.swing.JPanel ;
import java.awt.BorderLayout ;
import javax.swing.JButton ;
import javax.swing.JTextField ;
import java.awt.event.ActionListener ;
import java.awt.event.ActionEvent ;

public class PanelFils extends JPanel
	{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelFils(Heros parHeros1, Heros parHeros2)
		{
		Heros chHeros1 = parHeros1;
		Heros chHeros2 = parHeros2;
		
		this.setLayout(new BorderLayout(20, 20));
		
		PanelCombat combat = new PanelCombat(chHeros1, chHeros2);
        add(combat, BorderLayout.SOUTH);
        // le panel ou s'affichera les differentes attaques possibles
		PanelDuHaut leHaut = new PanelDuHaut(chHeros1, chHeros2);
        add(leHaut, BorderLayout.NORTH);
		// panel servant a l'edition des champs du/des Heros
        // et a afficher le texte narrant le combat
		}
	}

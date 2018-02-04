import javax.swing.JPanel ;
import javax.swing.JLabel ;
import java.awt.GridLayout ;
import java.awt.Color ;
import javax.swing.JButton ;
import javax.swing.JTextField ;
import java.awt.event.ActionListener ;
import java.awt.event.ActionEvent ;

public class PanelDuHaut extends JPanel implements ActionListener
	{
	Heros chHeros1;
	Heros chHeros2;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelDuHaut(Heros parHeros1, Heros parHeros2)
		{
		chHeros1 = parHeros1;
		chHeros2 = parHeros2;
		
		GridLayout gl = new GridLayout();
		gl.setColumns(2);
        gl.setRows(1);
        gl.setHgap(9);
        gl.setVgap(9);
		setLayout(gl);
		
		
		JPanel affichage = new JPanel();
        add(affichage);
        affichage.setBackground(new Color(95, 158, 160));
		affichage.add(new JLabel("Affichage:"));
		
		FondCarac hStats = new FondCarac(chHeros1);
		hStats.actualiserFonds(this);
		
		PanelEdition panelDeGauche = new PanelEdition(chHeros1);
        add(panelDeGauche);
        panelDeGauche.setBackground(new Color(95, 158, 160));
		//panelDeGauche.add(new JLabel("Edition"));
		
		
		setBackground(new Color(0, 120, 120));
		}
	public void actionPerformed(ActionEvent parEvt)
		{
		
		}
	}

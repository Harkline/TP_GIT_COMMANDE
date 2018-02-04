import javax.swing.JPanel ;
import javax.swing.JLabel ;
import java.awt.GridLayout ;
import java.awt.BorderLayout ;
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

		/*GridLayout gl = new GridLayout();
		gl.setColumns(2);
        gl.setRows(1);
        gl.setHgap(9);
        gl.setVgap(9);
		setLayout(gl);*/
        // P:beaucoup de lignes pour rien non ? Enfin je crois

        //this.setLayout(new GridLayout(1, 2, 1, 0)) ;
        //this.setLayout(new BorderLayout(1, 0)) ;

		/*JPanel affichage = new JPanel();
        add(affichage);
        affichage.setBackground(new Color(95, 158, 160));
		affichage.add(new JLabel("Affichage:"));
		affichage.setOpaque(true) ;*/
        // P:J'ai enleve le panel affichage, je pense qu'on peut s'en passer

		FondCarac hStats = new FondCarac(chHeros1);
        add(hStats) ;
		hStats.actualiserFonds(this);
        //add(hStats, BorderLayout.CENTER) ; BorderLayout
		//hStats.setOpaque(true) ;

		PanelEdition panelDeDroite = new PanelEdition(chHeros1);
        panelDeDroite.setBackground(new Color(95, 158, 160));
        add(panelDeDroite);
        //add(panelDeDroite, BorderLayout.EAST) ; BorderLayout
        //panelDeDroite.setOpaque(true) ;
		//panelDeGauche.add(new JLabel("Edition"));
		setBackground(new Color(0, 120, 120));
		}
	public void actionPerformed(ActionEvent parEvt)
		{

		}
	}

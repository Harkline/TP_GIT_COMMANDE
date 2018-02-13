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
	LaFenetre chMama;
	Heros chHeros1;
	Heros chHeros2;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelDuHaut(LaFenetre parFenetre, Heros parHeros1)
		{
		chMama = parFenetre;
		chHeros1 = parHeros1;

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

		PanelEdition panelDeDroite = new PanelEdition(this, hStats, chHeros1);
        panelDeDroite.setBackground(new Color(95, 158, 160));
        add(panelDeDroite);
        //add(panelDeDroite, BorderLayout.EAST) ; BorderLayout
        //panelDeDroite.setOpaque(true) ;
		//panelDeGauche.add(new JLabel("Edition"));
		setBackground(new Color(0, 120, 120));
		}
	public void actualiser()
		{
		this.removeAll();
		FondCarac hStats = new FondCarac(this.chHeros1);
        add(hStats);
		hStats.actualiserFonds(this);
		PanelEdition panelDeDroite = new PanelEdition(this, hStats, this.chHeros1);
        panelDeDroite.setBackground(new Color(95, 158, 160));
        add(panelDeDroite);
        setBackground(new Color(0, 120, 120));
		this.revalidate();
		}
	public void actionPerformed(ActionEvent parEvt)
		{

		}
	}

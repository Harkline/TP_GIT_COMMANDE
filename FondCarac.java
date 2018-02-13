import javax.swing.BoxLayout ;
import javax.swing.JPanel ;
import javax.swing.JLabel ;

public class FondCarac extends JPanel
	{
	JPanel lesFonds[] = new JPanel[6];
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FondCarac(Heros parHeros)
		{
		Heros chHeros;
		chHeros = parHeros;
		for(int i=0; i<6; i++)
			{
			lesFonds[i] = new JPanel();
			lesFonds[i].setLayout(new BoxLayout(lesFonds[i], BoxLayout.LINE_AXIS));
			}
		
			{
			lesFonds[0].add(new JLabel(""+chHeros.getNom()));
			lesFonds[1].add(new JLabel(""+chHeros.getClasse()));
			lesFonds[2].add(new JLabel("Vie: "+chHeros.getPointsDeVie()+"/"+chHeros.getPointsDeVieMax()));
			lesFonds[3].add(new JLabel("Atk: "+chHeros.getAttaque()));
			lesFonds[4].add(new JLabel("Def: "+chHeros.getDefense()));
			lesFonds[5].add(new JLabel("Dgts: "+chHeros.getDommages()));
			}
		}
	public void actualiserFonds(PanelDuHaut parPanel)
		{
		for(int i=0; i<6; i++)
			{
			parPanel.add(lesFonds[i]);
			}
		}
	}

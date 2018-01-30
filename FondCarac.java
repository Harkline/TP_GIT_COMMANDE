import javax.swing.*;
import java.awt.*;

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
			lesFonds[0].add(new JLabel(""+chHeros.chNom));
			lesFonds[1].add(new JLabel(""+chHeros.chClasse));
			lesFonds[2].add(new JLabel("Vie: "+chHeros.intToString(chHeros.chVie)));
			lesFonds[3].add(new JLabel("Atk: "+chHeros.intToString(chHeros.chAtk)));
			lesFonds[4].add(new JLabel("Def: "+chHeros.intToString(chHeros.chDef)));
			lesFonds[5].add(new JLabel("Dgts: "+chHeros.intToString(chHeros.chDgts)));
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

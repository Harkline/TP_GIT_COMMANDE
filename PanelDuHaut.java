import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
		gl.setColumns(2); gl.setRows(1); gl.setHgap(9); gl.setVgap(9);
		setLayout(gl);
		
		
		JPanel affichage = new JPanel(); add(affichage); affichage.setBackground(new Color(95, 158, 160));
		FondCarac hStats = new FondCarac(chHeros1);
		add(hStats);
		
		affichage.add(new JLabel("Affichage:"));
		
		JPanel autre = new JPanel(); add(autre); autre.setBackground(new Color(95, 158, 160));
		autre.add(new JLabel("Autre:"));
		
		
		setBackground(new Color(0, 120, 120));
		}
	public void actionPerformed(ActionEvent parEvt)
		{
		
		}
	}

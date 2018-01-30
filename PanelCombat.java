import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelCombat extends JPanel implements ActionListener
	{
	Heros chHeros1;
	Heros chHeros2;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelCombat(Heros parHeros1, Heros parHeros2)
		{
		chHeros1 = parHeros1;
		chHeros2 = parHeros2;
		
		setLayout(new BorderLayout(5, 5));
		setSize(400, 400);
		
		
		JLabel titre = new JLabel("Combat:");
		setBackground(new Color(255, 250, 240));
		add(titre, BorderLayout.NORTH);
		}
	public void actionPerformed(ActionEvent parEvt)
		{
		
		}
	}

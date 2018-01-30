import javax.swing.*;
import java.awt.*;

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
		
		PanelCombat combat = new PanelCombat(chHeros1, chHeros2); add(combat, BorderLayout.SOUTH);
		PanelDuHaut leHaut = new PanelDuHaut(chHeros1, chHeros2); add(leHaut, BorderLayout.NORTH);
		
		}
	}

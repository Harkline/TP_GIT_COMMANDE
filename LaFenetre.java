import javax.swing.*;
import java.awt.*;

public class LaFenetre extends JFrame
	{
	Heros chHeros;
	 /* 
	 */
	private static final long serialVersionUID = 1L;
	public LaFenetre (String parTitre, Heros parHeros, Heros parHerosBis)
		{
		super(parTitre);
		chHeros = parHeros;
		PanelFils contentPane = new PanelFils(parHeros, parHerosBis);
		setContentPane(contentPane);
		contentPane.setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(645, 555); setVisible(true); setLocation(300, 300);
		}
	}

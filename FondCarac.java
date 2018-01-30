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
		
		GridLayout gl = new GridLayout();
		gl.setColumns(1); gl.setRows(6); gl.setHgap(9); gl.setVgap(9);
		setLayout(gl);
		
		
		add(new JLabel("Nom: "+chHeros.chNom));
		add(new JLabel("Classe: "+chHeros.chClasse));
		add(new JLabel("Vie: "+chHeros.intToString(chHeros.chVie)));
		add(new JLabel("Atk: "+chHeros.intToString(chHeros.chAtk)));
		add(new JLabel("Def: "+chHeros.intToString(chHeros.chDef)));
		add(new JLabel("Dgts: "+chHeros.intToString(chHeros.chDgts)));
		
		}
	}

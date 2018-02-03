import javax.swing.JPanel ;
import javax.swing.JButton ;
import javax.swing.JTextField ;
import java.awt.event.ActionListener ;
import java.awt.event.ActionEvent ;

public class PanelEdition extends JPanel implements ActionListener {

    JTextField zonePV ;
    JTextField zonePVMax ;
    JTextField zoneAtk ;
    JTextField zoneDef ;
    JTextField zoneDom ;
    JButton actualiser = new JButton("Actualiser les statistiques") ;
    Heros chHero ;

    public PanelEdition() {
        this.add(zonePV) ;
        this.add(zonePVMax) ;
        this.add(zoneAtk) ;
        this.add(zoneDef) ;
        this.add(zoneDom) ;
        this.add(actualiser) ;
        actualiser.addActionListener(this) ;
    }

    public void setChHero(Heros parHeros) {
        this.chHero = parHeros ;
    }

    public void AfficherStats() {
        zonePV.setText(String.valueOf(this.chHero.getPointsDeVie())) ;
        zonePVMax.setText(String.valueOf(this.chHero.getPointsDeVieMax())) ;
        zoneAtk.setText(String.valueOf(this.chHero.getAttaque())) ;
        zoneDef.setText(String.valueOf(this.chHero.getDefense())) ;
        zoneDom.setText(String.valueOf(this.chHero.getDommages())) ;
    }



    public void actionPerformed(ActionEvent parEvt) {
        if (parEvt.getSource() == actualiser) {
            this.chHero.setPointsDeVie(Integer.parseInt(zonePV.getText()));
            this.chHero.setPointsDeVieMax(Integer.parseInt(zonePVMax.getText()));
            this.chHero.setAttaque(Integer.parseInt(zoneAtk.getText()));
            this.chHero.setDefense(Integer.parseInt(zoneDef.getText()));
            this.chHero.setDommages(Integer.parseInt(zoneDom.getText()));
        }
    }
}
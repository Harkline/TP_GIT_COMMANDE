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
    HerosPaul chHero ;

    public PanelEdition() {
        this.add(zonePV) ;
        this.add(zonePVMax) ;
        this.add(zoneAtk) ;
        this.add(zoneDef) ;
        this.add(zoneDom) ;
        this.add(actualiser) ;
        actualiser.addActionListener(this) ;
    }

    public void setChHero(HerosPaul hero) {
        this.chHero = hero ;
    }

    public void AfficherStats() {
        zonePV.setText(String.valueOf(this.getPointsDeVie())) ;
        zonePVMax.setText(String.valueOf(this.getPointsDeVieMax())) ;
        zoneAtk.setText(String.valueOf(this.getAttaque())) ;
        zoneDef.setText(String.valueOf(this.getDefense())) ;
        zoneDom.setText(String.valueOf(this.getDommages())) ;
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

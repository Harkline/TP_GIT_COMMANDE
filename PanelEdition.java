import javax.swing.JPanel ;
import javax.swing.JLabel ;
import javax.swing.JButton ;
import javax.swing.JTextField ;
import java.awt.event.ActionListener ;
import java.awt.event.ActionEvent ;

public class PanelEdition extends JPanel implements ActionListener {

    JLabel labelPV = new JLabel("PV") ;
    JTextField zonePV = new JTextField();
    JLabel labelPVMax = new JLabel("PVMax") ;
    JTextField zonePVMax = new JTextField();
    JLabel labelAtk = new JLabel("Atk") ;
    JTextField zoneAtk = new JTextField();
    JLabel labelDef = new JLabel("Def") ;
    JTextField zoneDef = new JTextField();
    JLabel labelDom = new JLabel("Dom") ;
    JTextField zoneDom = new JTextField();
    JButton actualiser = new JButton("Actualiser les statistiques") ;
    Heros chHero ;

    public PanelEdition(Heros parHeros) {
        zonePV.setText(String.valueOf(parHeros.getPointsDeVie())) ;
        zonePVMax.setText(String.valueOf(parHeros.getPointsDeVieMax())) ;
        zoneAtk.setText(String.valueOf(parHeros.getAttaque())) ;
        zoneDef.setText(String.valueOf(parHeros.getDefense())) ;
        zoneDom.setText(String.valueOf(parHeros.getDommages())) ;
        this.add(labelPV) ;
        this.add(zonePV) ;
        this.add(labelPVMax) ;
        this.add(zonePVMax) ;
        this.add(labelAtk) ;
        this.add(zoneAtk) ;
        this.add(labelDef) ;
        this.add(zoneDef) ;
        this.add(labelDom) ;
        this.add(zoneDom) ;
        this.add(actualiser) ;
        this.chHero = parHeros ;
        actualiser.addActionListener(this) ;
    }

    public void setChHero(Heros parHeros) {
        this.chHero = parHeros ;
    }

    // Affichage des statistiques des Heros :
    // points de vie
    // points de vie max
    // attaque
    // defense
    // dommages
    public void AfficherStats() {
        zonePV.setText(String.valueOf(this.chHero.getPointsDeVie())) ;
        zonePVMax.setText(String.valueOf(this.chHero.getPointsDeVieMax())) ;
        zoneAtk.setText(String.valueOf(this.chHero.getAttaque())) ;
        zoneDef.setText(String.valueOf(this.chHero.getDefense())) ;
        zoneDom.setText(String.valueOf(this.chHero.getDommages())) ;
    }

    // actualisation des statistiques des Heros
    // a l'aide d'un bouton actualiser et de la fonction
    // actionPerformed
    public void ActualiserStats() {
        this.chHero.setPointsDeVie(Integer.parseInt(zonePV.getText()));
        this.chHero.setPointsDeVieMax(Integer.parseInt(zonePVMax.getText()));
        this.chHero.setAttaque(Integer.parseInt(zoneAtk.getText()));
        this.chHero.setDefense(Integer.parseInt(zoneDef.getText()));
        this.chHero.setDommages(Integer.parseInt(zoneDom.getText()));
    }


    public void actionPerformed(ActionEvent parEvt) {
        if (parEvt.getSource() == actualiser) {
            ActualiserStats() ;
        }
    }
}

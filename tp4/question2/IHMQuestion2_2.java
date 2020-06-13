package question2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IHMQuestion2_2 extends JFrame {

    private JButton boutonA = new JButton("A");
    private JButton boutonB = new JButton("B");
    private JButton boutonC = new JButton("C");

    private TextArea contenu = new TextArea(30, 80);
    private JButtonObserver jb1;
    private JButtonObserver jb2;
    private JButtonObserver jb3;
    
    private JMouseObserver jm1;
    private JMouseObserver jm2;
    private JMouseObserver jm3;
 
    public IHMQuestion2_2() {
        super("IHM Question2_2");
        JPanel enHaut = new JPanel();
        enHaut.add(boutonA);
        enHaut.add(boutonB);
        enHaut.add(boutonC);
        setLayout(new BorderLayout(5, 5));
        add("North", enHaut);
        add("Center", contenu); // contenu sera transmis aux observateurs, voir
                                // la description des constructeurs
        setLocation(150,150);pack();show();
        enHaut.setBackground(Color.magenta);
        
        jb1 = new JButtonObserver("jb1", contenu);
        jb2 = new JButtonObserver("jb2", contenu);
        jb3 = new JButtonObserver("jb3", contenu);
        
        boutonA.addActionListener(jb1);
        boutonA.addActionListener(jb2);
        boutonA.addActionListener(jb3);
        
        boutonB.addActionListener(jb1);
        boutonB.addActionListener(jb2);
        
        boutonC.addActionListener(jb1);
        
        jm1 = new JMouseObserver("jm1", contenu);
        jm2 = new JMouseObserver("jm2", contenu);
        jm3 = new JMouseObserver("jm3", contenu);

        boutonA.addMouseListener(jm1);
        boutonB.addMouseListener(jm2);
        boutonC.addMouseListener(jm3);

        // à compléter à l'identique de la question 2_1, (du copier/coller)...
        // le bouton A a 3 observateurs jbo1, jbo2 et jbo3

        // le bouton B a 2 observateurs jbo1 et jbo2

        // le bouton C a 1 observateur jbo1

        // à compléter pour la question 2_2 (JMouseObserver)
            // le bouton A a 1 observateur jmo1
            // le bouton B a 1 observateur jmo2
            // le bouton C a 1 observateur jmo3
        
    }
    
     public static void main(String[] args){
        new IHMQuestion2_1();
        new IHMQuestion2_2();
    }


}

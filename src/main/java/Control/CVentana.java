/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Ventana1;
import vista.Ventana2;

/**
 *
 * @author User
 */
public class CVentana implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "ParesImpares" -> {
                Ventana2 f2 = new Ventana2();
                CVentana2 c2 = new CVentana2();
                f2.setOidor(c2);
                f2.setVisible(true);
            }
            case "OrderArray" -> {
                Ventana1 f = new Ventana1();
                CVentana1 c = new CVentana1();
                f.setOidor(c);
                f.setVisible(true);
            }
        }
    }

}

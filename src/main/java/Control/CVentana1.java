/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import oovv.Maex;
import oovv.OrderArray;
import vista.Ventana1;

/**
 *
 * @author User
 */
public class CVentana1 implements ActionListener {

    private Ventana1 ventana;
    private OrderArray app;

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            switch (e.getActionCommand()) {
                case "Ejecutar" -> {
                    String[] ArrayNumeros = ventana.getArrayNumeros();
                    ventana.muestra(app.ordenaArray(ArrayNumeros));
                }
            }
        } catch (Maex maex) {
            JOptionPane.showMessageDialog(ventana, "Introduce los datos correctemente");
        } catch (AssertionError assertionError) {
        }
    }

}

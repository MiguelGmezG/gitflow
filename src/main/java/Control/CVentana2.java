/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import oovv.ParesImpares;
import vista.Ventana2;

/**
 *
 * @author User
 */
public class CVentana2 implements ActionListener{
private Ventana2 ventana;
private ParesImpares app;
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Ejecutar" -> ventana.muestra(app.ParesImpares(ventana.numeracion()));
        }
    }
    
}

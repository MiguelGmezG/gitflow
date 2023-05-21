/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package gitflow;

import Control.CVentana;
import Control.CVentana1;
import Control.CVentana2;
import vista.Ventana;
import vista.Ventana1;
import vista.Ventana2;

/**
 *
 * @author User
 */
public class Gitflow {

    public static void main(String[] args) {
        Ventana f = new Ventana();
        CVentana c = new CVentana();
        f.setOidor(c);
        f.setVisible(true);
    }
}

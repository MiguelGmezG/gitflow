/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package gitflow;

import Control.CVentana1;
import vista.Ventana1;

/**
 *
 * @author User
 */
public class Gitflow {

    public static void main(String[] args) {
        Ventana1 f = new Ventana1();
        CVentana1 c = new CVentana1();
        f.setOidor(c);
        f.setVisible(true);
    }
}

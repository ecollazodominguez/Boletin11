/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11_1;

import javax.swing.JOptionPane;

/**
 *
 * @author ecollazodominguez
 */
public class Cronometro {

    public void lerTexto() {
        int iniciar;
        String escrita = "x";
        String texto = "A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática.";
        JOptionPane.showMessageDialog(null, "Preme enter para empezar");
        long inicioTiempo = System.currentTimeMillis();
        do {

            escrita = JOptionPane.showInputDialog("ESCRIBE A SEGUINTE FRASE : \n"
                    + "A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática.");

            if (texto.equals(escrita)) {
                JOptionPane.showMessageDialog(null, "Preme enter para rematar");
                long finalTiempo = System.currentTimeMillis();
                JOptionPane.showMessageDialog(null, "Tardaches " + (finalTiempo - inicioTiempo) / 1000 + " seg en escribir a frase.");
            } else {
                JOptionPane.showMessageDialog(null, "Texto incorrecto.");
            }

        } while (texto.equals(escrita) == false);
    }
}

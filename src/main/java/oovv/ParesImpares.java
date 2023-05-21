/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ParesImpares {

    public String ParesImpares (String args) {
        int[] numeros = null;
        try {
            String[] array = args.split(", ");
            numeros = new int[10];
            for (int i = 0; i < array.length; i++) {
                numeros[i] += Integer.parseInt(array[i]);
            }
        } catch (NumberFormatException numberFormatException) {
        }

        return "\nNúmeros ingresados:" + mostrarNumeros(numeros)
                + "\nNúmeros pares:" + mostrarPares(numeros)
                + "\nNúmeros impares:" + mostrarImpares(numeros)
                + "\nNúmero máximo: " + encontrarMaximo(numeros)
                + "Número mínimo: " + encontrarMinimo(numeros);

    }

    private static String mostrarNumeros(int[] numeros) {
        String txt = "";
        for (int numero : numeros) {
            txt = +numero + " ";
        }
        return txt;
    }

    private static String mostrarPares(int[] numeros) {
        String txt = "";
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                txt = +numero + " ";
            }
        }
        return txt;
    }

    private static String mostrarImpares(int[] numeros) {
        String txt = "";
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                txt = +numero + " ";
            }
        }
        return txt;
    }

    private static int encontrarMaximo(int[] numeros) {
        int maximo = Integer.MIN_VALUE;

        for (int numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
        }

        return maximo;
    }

    private static int encontrarMinimo(int[] numeros) {
        int minimo = Integer.MAX_VALUE;

        for (int numero : numeros) {
            if (numero < minimo) {
                minimo = numero;
            }
        }

        return minimo;
    }

}

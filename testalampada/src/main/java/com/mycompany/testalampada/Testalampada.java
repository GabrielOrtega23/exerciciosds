/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testalampada;
import java.util.Scanner;
/**
 *
 * @author gabrielortega
 */
public class Testalampada {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        Lampada lampada = new Lampada();

       
        lampada.mostraEstado();

        System.out.println("1 - Acender");
        System.out.println("2 - Apagar");
        System.out.println("3 - Não mudar");

        int opcao = scanner.nextInt();

        if (opcao == 1) {
            lampada.acende();
        } 
        else if (opcao == 2) {
            lampada.apagar();
        }

        System.out.println("Estado final:");
        lampada.mostraEstado();
    }
}

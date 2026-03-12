/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testalampada;
import java.util.Random;
/**
 *
 * @author gabrielortega
 */
public class Lampada {
    boolean estadoDaLampada;
      Lampada() {
        Random random = new Random();
        estadoDaLampada = random.nextBoolean();
    }


    void acende() {
        estadoDaLampada = true;
    }

    void apagar() {
        estadoDaLampada = false;
    }

    void mostraEstado() {
        if (estadoDaLampada == true) {
            System.out.println("A lâmpada está acesa");
        } else {
            System.out.println("A lâmpada está apagada");
        }
    }
}


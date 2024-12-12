package org.example.computer;

import org.example.computer.Vga;

public class Ecran implements Vga {
    @Override
    public void print(String message) {
        System.out.println("==========Ecran===========");
        System.out.println(message);
        System.out.println("==========Ecran===========");
    }
}

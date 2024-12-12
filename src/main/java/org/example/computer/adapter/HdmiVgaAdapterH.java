package org.example.computer.adapter;

import org.example.computer.Hdmi;
import org.example.computer.TV;
import org.example.computer.Vga;

public class HdmiVgaAdapterH extends TV implements Vga {
    @Override
    public void print(String message) {
        System.out.println("==============Adapter=============");
        byte[] data=message.getBytes();
        super.view(data);
        System.out.println("==============/Adapter=============");
    }

}

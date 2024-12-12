package org.example.computer;

public class SuperVP implements Vga,Hdmi{
    @Override
    public void view(byte[] data) {
        System.out.println("..............Super VP HDMI.............");
        String message=new String(data);
        System.out.println(message);
        System.out.println("..............Super VP HDMI.............");
    }

    @Override
    public void print(String message) {
        System.out.println("..............Super VP Vga................");
        System.out.println(message);
        System.out.println("..............Super VP Vga................");
    }
}

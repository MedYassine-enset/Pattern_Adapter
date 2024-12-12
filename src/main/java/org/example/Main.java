package org.example;

import org.example.computer.*;
import org.example.computer.adapter.HdmiVgaAdapter;
import org.example.computer.adapter.HdmiVgaAdapterH;

public class Main {
    public static void main(String[] args) {

        UniteCentre uniteCentre=new UniteCentre();
        uniteCentre.setVga(new Ecran());
        uniteCentre.print("Bonjour");
        uniteCentre.setVga(new VideoProjecteur());
        uniteCentre.print("Bonjour");
        uniteCentre.setVga(new HdmiVgaAdapter());

        HdmiVgaAdapter hdmiVgaAdapter=new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());
        uniteCentre.setVga(hdmiVgaAdapter);
        hdmiVgaAdapter.print("Bonjour Master II-DBCC Design pattern");

        HdmiVgaAdapterH hdmiVgaAdapterH=new HdmiVgaAdapterH();
        uniteCentre.setVga(hdmiVgaAdapterH);
        hdmiVgaAdapterH.print("Bonjour Master II-DBCC Design pattern");


        uniteCentre.setVga(new SuperVP());
        uniteCentre.print("Hello");

        HdmiVgaAdapter hdmiVgaAdapter1=new HdmiVgaAdapter();
        hdmiVgaAdapter1.setHdmi(new SuperVP());
        uniteCentre.setVga(hdmiVgaAdapter1);
        uniteCentre.print("B2");

    }
}
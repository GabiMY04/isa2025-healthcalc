package main;
import java.awt.EventQueue;

import healthcalc.HealthCalcController;
import healthcalc.HealthCalcImpl;
import vistaHealthCalc.VistaHealthCalc;


public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            VistaHealthCalc vista = new VistaHealthCalc();
            HealthCalcImpl modelo = HealthCalcImpl.getInstance();
            new HealthCalcController(vista, modelo);
            vista.setVisible(true);
        });
    }
}

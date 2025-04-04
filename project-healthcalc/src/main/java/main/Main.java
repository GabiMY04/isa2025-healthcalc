package main;
import java.awt.EventQueue;

import healthcalc.HealthCalcImpl;
import healthcalc.HealthCalcController;
import vistaHealthCalc.VistaHealthCalc;

public class Main {
	public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            VistaHealthCalc vista = new VistaHealthCalc();
            HealthCalcImpl modelo = new HealthCalcImpl();
            new HealthCalcController(vista, modelo);
            vista.setVisible(true);
        });
    }
}

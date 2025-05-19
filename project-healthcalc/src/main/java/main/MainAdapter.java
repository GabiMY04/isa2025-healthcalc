package main;

import healthcalc.HealthAdapter;
import healthcalc.HealthHospital;

public class MainAdapter {
    public static void main(String[] args) {
        // Main method to run the application
        try {
            HealthHospital prueba = new HealthAdapter();
            System.out.println("Peso ideal: " + prueba.pesoIdeal('m', 180));
            System.out.println("BMR: " + prueba.bmr('m', 25, 120, 70000));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

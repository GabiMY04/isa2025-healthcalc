package main;

import healthcalc.HealthAdapter;
import healthcalc.HealthHospital;

public class MainAdapter {
    public static void main(String[] args) {
        // Main method to run the application
        try {
            HealthHospital prueba = new HealthAdapter();
            System.out.println("Peso ideal: " + prueba.pesoIdeal('m', 1.60f)+ "kg");
            System.out.println("BMR: " + prueba.bmr('m', 25, 1.60f, 70000) +" kcal");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

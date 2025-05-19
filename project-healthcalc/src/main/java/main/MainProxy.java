package main;

import healthcalc.HealthHospital;
import healthcalc.HealthProxy;
import healthcalc.HealthStats;

public class MainProxy {
    public static void main(String[] args) {
        try {
            HealthHospital hospital = new HealthProxy();

            System.out.println("Peso ideal: " + hospital.pesoIdeal('m', 1.60f) + "gramos");
            System.out.println("BMR: " + hospital.bmr('m', 25, 1.60f, 70000) + " kcal");
            System.out.println("Peso ideal: " + hospital.pesoIdeal('m', 1.70f) + "gramos");
            System.out.println("BMR: " + hospital.bmr('m', 25, 1.70f, 80000) + " kcal");

            // Si necesitas estadísticas:
            HealthStats stats = (HealthStats) hospital;
            System.out.println("Altura media: " + stats.alturaMedia() + " m");
            System.out.println("Peso medio: " + stats.pesoMedio() + " gramos");
            System.out.println("Edad media: " + stats.edadMedia() + " años");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

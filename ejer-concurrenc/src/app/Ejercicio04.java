package app;

import java.util.Scanner;

public class Ejercicio04 extends Thread {
    String[] estaciones = { "Primavera", "Verano", "Otoño", "Invierno" };
    Scanner datos = new Scanner(System.in);
    String estacion;

    public Ejercicio04() {
        System.out.print("seleccione una ");
        for (String string : estaciones) {
            System.out.print(string+" ");
        }
        
        estacion = datos.nextLine();
    }

    @Override
    public void run() {
        switch (estacion) {
            case "primavera":
                try {Thread.sleep(5000);
                    System.out.println("septiembre, octibre, noviembre");
                    
                } catch (InterruptedException e) {}
                break;
            case "verano":
                try {Thread.sleep(5000);
                    System.out.println("diciembre, enero, febrero");
                    
                } catch (InterruptedException e) {}
                break;
            case "otoño":
                try {Thread.sleep(5000);
                    System.out.println("marzo, abril, mayo");
                    
                } catch (InterruptedException e) {}
                break;
            case "invierno":
                try {Thread.sleep(5000);
                    System.out.println("junio, julio, agosto");
                    
                } catch (InterruptedException e) {}
                break; 
        }
    }
    public static void main(String[] args) {
        while (true) {
            Thread estacion = new Ejercicio04();
            estacion.start();
        }
        
    }
}
package Reloj;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Reloj reloj1 = new Reloj(50, 59, 23);
        
        System.out.println("Hora inicial: " + reloj1.MostrarHoraTexto());

        do {
            
            try { Thread.sleep(1000); } catch (InterruptedException e) { }
            
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("Hora: " + reloj1.MostrarHoraTexto());
            
            List<String> hora = null;
            if (reloj1.getHora() == 0 || reloj1.getHora() == 12) {
                hora = ArraysHoras.Hora0;
            } else if (reloj1.getHora() == 1 || reloj1.getHora() == 13) {
                hora = ArraysHoras.Hora1;
            } else if (reloj1.getHora() == 2 || reloj1.getHora() == 14) {
                hora = ArraysHoras.Hora2;
            } else if (reloj1.getHora() == 3 || reloj1.getHora() == 15) {
                hora = ArraysHoras.Hora3;
            } else if (reloj1.getHora() == 4 || reloj1.getHora() == 16) {
                hora = ArraysHoras.Hora4;
            } else if (reloj1.getHora() == 5 || reloj1.getHora() == 17) {
                hora = ArraysHoras.Hora5;
            } else if (reloj1.getHora() == 6 || reloj1.getHora() == 18) {
                hora = ArraysHoras.Hora6;
            } else if (reloj1.getHora() == 7 || reloj1.getHora() == 19) {
                hora = ArraysHoras.Hora7;
            } else if (reloj1.getHora() == 8 || reloj1.getHora() == 20) {
                hora = ArraysHoras.Hora8;
            } else if (reloj1.getHora() == 9 || reloj1.getHora() == 21) {
                hora = ArraysHoras.Hora9;
            } else if (reloj1.getHora() == 10 || reloj1.getHora() == 22) {
                hora = ArraysHoras.Hora10;
            } else if (reloj1.getHora() == 11 || reloj1.getHora() == 23) {
                hora = ArraysHoras.Hora11;
            }

            List<String> minuto = null;
            if (reloj1.getMinuto() <= 4) {
                minuto = ArraysMinutos.Minuto0;
            } else if (reloj1.getMinuto() <= 9) {
                minuto = ArraysMinutos.Minuto1;
            } else if (reloj1.getMinuto() <= 14) {
                minuto = ArraysMinutos.Minuto2;
            } else if (reloj1.getMinuto() <= 19) {
                minuto = ArraysMinutos.Minuto3;
            } else if (reloj1.getMinuto() <= 24) {
                minuto = ArraysMinutos.Minuto4;
            } else if (reloj1.getMinuto() <= 29) {
                minuto = ArraysMinutos.Minuto5;
            } else if (reloj1.getMinuto() <= 34) {
                minuto = ArraysMinutos.Minuto6;
            } else if (reloj1.getMinuto() <= 39) {
                minuto = ArraysMinutos.Minuto7;
            } else if (reloj1.getMinuto() <= 44) {
                minuto = ArraysMinutos.Minuto8;
            } else if (reloj1.getMinuto() <= 49) {
                minuto = ArraysMinutos.Minuto9;
            } else if (reloj1.getMinuto() <= 54) {
                minuto = ArraysMinutos.Minuto10;
            } else if (reloj1.getMinuto() <= 59) {
                minuto = ArraysMinutos.Minuto11;
            }
            List<String> resultado = Reloj.combinarHoraYMinuto(hora, minuto);
            
            resultado.forEach(System.out::println);

            reloj1.PasaSegundo();
            reloj1.PasaMinuto();
            reloj1.PasaHora();


        } while(true == true);
    }
}
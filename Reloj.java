package Reloj;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;
    DecimalFormat df = new DecimalFormat("00");

    public Reloj(int segundo, int minuto, int hora) {
        this.segundo = Math.min(segundo, 59);
        this.minuto = Math.min(minuto, 59);
        this.hora = Math.min(hora, 23);
    }

    public void PasaSegundo() {
        this.segundo += 1;
    }

    public void PasaMinuto() {
        if (this.segundo == 60){
        this.minuto += 1;
        this.segundo = 0;
        }
    }

    public void PasaHora() {
        if (this.minuto == 60) {
        this.hora += 1;
        this.minuto = 0;
        if (this.hora ==24) {
            this.hora = 0;
        }
        }
    }

    public int getHora() {
        return this.hora;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public void PonerHora(int segundo, int minuto, int hora) {
        this.segundo = Math.min(segundo, 59);
        this.minuto = Math.min(minuto, 59);
        this.hora = Math.min(hora, 23);
    }

    public String MostrarHoraTexto() {
        return df.format(hora)+ ":" +df.format(minuto)+ ":" +df.format(segundo);

    }

    public static List<String> combinarHoraYMinuto(List<String> hora, List<String> minuto) {
        List<String> resultado = new ArrayList<>();

        for (int i = 0; i < hora.size(); i++) {
            String horaLinea = hora.get(i);
            String minutoLinea = minuto.get(i);

            String combinada = "";

            if (minutoLinea.contains(".") && horaLinea.contains("o")) {
                combinada = horaLinea;
            } else if (minutoLinea.contains(".") && !horaLinea.contains("o")) {
                combinada = minutoLinea;
            } else {
                combinada = horaLinea;
            }

            resultado.add(combinada);
        }

        return resultado;
    }
}
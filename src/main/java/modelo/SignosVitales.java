/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;

/**
 *
 * @author Sofia
 */
public class SignosVitales {
    
    private double presion;
    private double frecuenciaCardiaca;
    private double temperatura;
    private double frecuenciaRespiratoria;
    private ArrayList<String> alertas;

    public SignosVitales(double presion, double frecuenciaCardiaca, double temperatura, double frecuenciaRespiratoria) {
        this.presion = presion;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.temperatura = temperatura;
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }

    public double getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public void setFrecuenciaCardiaca(double frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getFrecuenciaRespiratoria() {
        return frecuenciaRespiratoria;
    }

    public void setFrecuenciaRespiratoria(double frecuenciaRespiratoria) {
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
    }

    public ArrayList<String> getAlertas() {
        return alertas;
    }
    
    
    public ArrayList<String> EvaluarAlertas(double frecuenciaCardiaca, double temperatura, double frecuenciaRespiratoria){
        
        if (frecuenciaCardiaca > 100) {
            alertas.add("Taquicardia detectada");
        }
        if (frecuenciaCardiaca < 60) {
            alertas.add("Bradicardia detectada");
        }
        
        if (temperatura > 38 ) {
            alertas.add("Fiebre detectada");
        }
        
        if (frecuenciaRespiratoria > 20 || frecuenciaRespiratoria > 12){
            alertas.add("Respiración alterada");
        }
        
        return alertas;
    }
}

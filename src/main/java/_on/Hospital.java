/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package con;

import modelo.*;
import java.util.ArrayList;

/**
 *
 * @author juanc
 */
public class Hospital {
    
    static ArrayList<PacienteInterno> pacientesint = new ArrayList<>();
    static ArrayList<PacienteExterno> pacientesext = new ArrayList<>();

    public static void main(String[] args) { 
        
    }
    
    public static PacienteInterno crearPacienteInterno(String nombre, double id, int habitacion){
        
        PacienteInterno p= new PacienteInterno(nombre, id, habitacion, null, null, null);
        p.setSignosVitales(new SignosVitales(0,0,0,0));
        pacientesint.add(p);
        return p;
    }
    
     public static PacienteExterno crearPacienteExterno(String nombre, double id){
        
        PacienteExterno p= new PacienteExterno(nombre, id, null);
        
        pacientesext.add(p);
        return p;
    }
    
    public static void guardarSignos (PacienteInterno p, double presion, double fc, double temperatura, double fr){
        
        p.getSignosVitales().setPresion(presion);
        p.getSignosVitales().setFrecuenciaCardiaca(fc);
        p.getSignosVitales().setTemperatura(temperatura);
        p.getSignosVitales().setFrecuenciaRespiratoria(fr);
        
        p.getSignosVitales().EvaluarAlertas(fc, temperatura, fr);
        p.evaluarEstado();
    }
    
        public ArrayList<PacienteInterno> getPacientesint() {
        return pacientesint;
    }
}

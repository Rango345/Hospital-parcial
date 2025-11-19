/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Sofia
 */
public class PacienteInterno extends Paciente {
    
    private String estado;
    private int habitacion;
    private SignosVitales signosVitales;

    public PacienteInterno(String nombre, double id, int habitacion, String estado, Historial historia, SignosVitales signosVitales) {
        super(nombre, id, historia);
        this.estado= estado;
        this.habitacion= habitacion;
        this.signosVitales= signosVitales;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

    public SignosVitales getSignosVitales() {
        return signosVitales;
    }

    public void setSignosVitales(SignosVitales signosVitales) {
        this.signosVitales = signosVitales;
    }
    
    
    public void evaluarEstado(){
        
        if (signosVitales != null){
            
            if (signosVitales.getAlertas().isEmpty()){
                setEstado("Estable");
            }
            else {
                setEstado("Crítico");
            }
        }

        else {
            setEstado("No hay signos vitales registrados");
        }
    }
    
}

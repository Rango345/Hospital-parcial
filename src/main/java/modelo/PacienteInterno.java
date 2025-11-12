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
    
    private String diagnostico;
    private int habitacion;
    private String signosVitales; //objeto

    public PacienteInterno(String nombre, double id, int habitacion, String diagnostico, String estado, String Historia) {
        super(nombre, id, estado, Historia);
        this.diagnostico= diagnostico;
        this.habitacion= habitacion;
        this.signosVitales= signosVitales;
    }
    
    
}

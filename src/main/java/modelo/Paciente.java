/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Sofia
 */
public abstract class Paciente {
    
    protected String nombre;
    protected String id;
    protected String diagnostico;
    protected Historial historia; 
    
    public Paciente(String nombre, String id, Historial historia) {
        this.nombre = nombre;
        this.id = id;
        this.historia = historia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Historial getHistoria() {
        return historia;
    }

    public void setHistoria(Historial historia) {
        this.historia = historia;
    }
    
}

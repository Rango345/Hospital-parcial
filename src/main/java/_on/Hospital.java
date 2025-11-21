/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package con;
import Vista.*;
import modelo.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author juanc
 */
public class Hospital {
    
    public static ArrayList<PacienteInterno> pacientesint = new ArrayList<>();
    public static ArrayList<PacienteExterno> pacientesext = new ArrayList<>();

    public static void main(String[] args) { 
        new Menu().setVisible(true);
    }
    
    public static PacienteInterno crearPacienteInterno(String nombre, String id, int habitacion){
        
        PacienteInterno p= new PacienteInterno(nombre, id, habitacion, null, null, null);
        pacientesint.add(p);
        return p;
    }
    
     public static PacienteExterno crearPacienteExterno(String nombre, String id){
        
        PacienteExterno p= new PacienteExterno(nombre, id, null);
        
        pacientesext.add(p);
        return p;
    }
    
    public ArrayList<PacienteInterno> getPacientesint() {
        return pacientesint;
    }
}

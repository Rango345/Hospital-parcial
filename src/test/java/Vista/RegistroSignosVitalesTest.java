/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Vista;
import modelo.*;
import con.Hospital;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author juanc
 */
public class RegistroSignosVitalesTest {
    
   @Test
    void testGuardarSignosVitales() {
        // Crear paciente
        PacienteInterno paciente = new PacienteInterno("Juan", "123", 101,"78",null,null);

        // Crear signos vitales
        SignosVitales signos = new SignosVitales(120, 80, 37.2, 16);

        // Asignar
        paciente.setSignosVitales(signos);
        paciente.evaluarEstado();

        // Verificar que se guardaron correctamente
        assertNotNull(paciente.getSignosVitales());
        assertEquals(120, paciente.getSignosVitales().getPresion());
        assertEquals(80, paciente.getSignosVitales().getFrecuenciaCardiaca());
        assertEquals(37.2, paciente.getSignosVitales().getTemperatura());
        assertEquals(16, paciente.getSignosVitales().getFrecuenciaRespiratoria());
    }
    
}

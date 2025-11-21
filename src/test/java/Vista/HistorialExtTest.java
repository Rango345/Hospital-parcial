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
public class HistorialExtTest {
    
    @Test
    public void testGuardarHistorial() {
        // Crear paciente
        PacienteExterno paciente = new PacienteExterno("Juan", "123", null);

        // Simular formulario
        Historial historial = new Historial(
                "Gastritis",      // EnfPrev
                "Apendice",       // Cirugías
                "Penicilina",     // Alergias
                "Ibuprofeno",     // Medicamentos
                "Dolor abdominal",// Motivo
                "Gastritis aguda",// Diagnostico
                "Ninguna",      // Tratamiento
                "Omeprazol",        // Observaciones
                "Diabetes"        // Hereditarias
        );

        // Guardar historial en paciente
        paciente.setHistoria(historial);

        // Validar
        assertNotNull(paciente.getHistoria());
        assertEquals("Gastritis", paciente.getHistoria().getEnfermedadesPrevias());
        assertEquals("Omeprazol", paciente.getHistoria().getTratamiento());
        assertEquals("Penicilina", paciente.getHistoria().getAlergias());
    }
    
}

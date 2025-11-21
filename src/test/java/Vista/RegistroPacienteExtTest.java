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
public class RegistroPacienteExtTest {
       @BeforeEach
    void limpiarLista() {
        Hospital.pacientesext.clear();
    }

    @Test
    void testRegistrarPacienteCorrectamente() {
        PacienteExterno p = Hospital.crearPacienteExterno("Juan", "123456789");

        assertNotNull(p);
        assertEquals("Juan", p.getNombre());
        assertEquals("123456789", p.getId());
        assertEquals(1, Hospital.pacientesext.size());
    }
}

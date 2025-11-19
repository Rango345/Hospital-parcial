/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author juanc
 */

import javax.swing.*;
import java.awt.*;
import java.util.List;
import modelo.*;
import con.Hospital;

public class prueba extends JFrame {



    private void initComponents() {
        this.setLayout(new GridLayout(0, 1));

        for (PacienteInterno paciente : Hospital.pacientesint) {
            JButton botonPaciente = new JButton(paciente.getNombre());

            botonPaciente.addActionListener(e -> {
                Detallespaciente ventana = new Detallespaciente(paciente);
                ventana.setVisible(true);
            });

            this.add(botonPaciente);
        }

        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Pacientes Internos");
    }
    }

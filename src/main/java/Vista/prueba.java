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

public class prueba extends JFrame {

    private List<PacienteInterno> pacientes;
    private Detallespaciente ventanaDetalle = null; // Se crea solo cuando se necesite

    public prueba(List<PacienteInterno> pacientes) {
        this.pacientes = pacientes;
        initComponents();
    }

    private void initComponents() {
        this.setLayout(new GridLayout(0, 1)); // Agrega botones en columna

        for (PacienteInterno paciente : pacientes) {
            JButton botonPaciente = new JButton(paciente.getNombre());

            botonPaciente.addActionListener(e -> mostrarDetalle(paciente));

            this.add(botonPaciente);
        }

        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Pacientes Internos");
    }

    private void mostrarDetalle(PacienteInterno paciente) {
        if (ventanaDetalle == null) {
            ventanaDetalle = new Detallespaciente(paciente);
        } else {
            ventanaDetalle.setPaciente(paciente); 
        }

        ventanaDetalle.setVisible(true);
        ventanaDetalle.toFront();
    }
}
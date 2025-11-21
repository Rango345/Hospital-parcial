package Vista;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Vista.*;
import javax.swing.*;
import java.awt.*;
import modelo.PacienteInterno;
import modelo.*;

/**
 *
 * @author juanc
 */


public class Detallespacienteext extends JFrame {

    public Detallespacienteext(PacienteExterno pacientes) {
        initComponents(pacientes);
    }

    private void initComponents(PacienteExterno pacientes) {
        this.setLayout(new BorderLayout());

        JTextArea textoDetalle = new JTextArea();
        textoDetalle.setEditable(false);

        StringBuilder detalles = new StringBuilder();

        detalles.append("Nombre: ").append(pacientes.getNombre()).append("\n");

        Historial h = pacientes.getHistoria();

        if(h != null){
            detalles.append("Enfermedades Previas: ").append(h.getEnfermedadesPrevias()).append("\n");
            detalles.append("Cirugías Previas: ").append(h.getCirugiasPrevias()).append("\n");
            detalles.append("Alergias: ").append(h.getAlergias()).append("\n");
            detalles.append("Medicamentos Actuales: ").append(h.getMedicamentosActuales()).append("\n");
            detalles.append("Enfermedades Hereditarias: ").append(h.getEnfermedadesHereditarias()).append("\n\n");
            detalles.append("Motivo de Consulta: ").append(h.getMotivoConsulta()).append("\n");
            detalles.append("Diagnóstico: ").append(h.getDiagnostico()).append("\n");
            detalles.append("Tratamiento: ").append(h.getTratamiento()).append("\n");
            detalles.append("Observaciones: ").append(h.getObservaciones()).append("\n");
        } else {
            detalles.append("No hay historial registrado.\n");
        }

        textoDetalle.setText(detalles.toString());

        this.add(new JScrollPane(textoDetalle), BorderLayout.CENTER);
        
        JPanel panelBotones = new JPanel(new FlowLayout());

        JButton btnVolver = new JButton("Volver");
        JButton btnHistorial = new JButton("Registrar Historial");
        
        
        btnVolver.addActionListener(e -> {
            new InformeExt().setVisible(true);
            dispose();
        });
        
         btnHistorial.addActionListener(e -> {
            new HistorialExt(pacientes).setVisible(true);
            dispose();
        });
         
        panelBotones.add(btnVolver);
        panelBotones.add(btnHistorial);

        this.add(panelBotones, BorderLayout.SOUTH);
        
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Detalle - " + pacientes.getNombre());
        this.setLocationRelativeTo(null);
        
    }
    
    public void setPaciente(PacienteExterno pacientes){
    initComponents(pacientes);
       }
}
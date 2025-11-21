/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import javax.swing.*;
import java.awt.*;
import modelo.PacienteInterno;
import modelo.*;

/**
 *
 * @author juanc
 */


public class DetallespacienteInt extends JFrame {

    public DetallespacienteInt(PacienteInterno paciente) {
        initComponents(paciente);
    }

    private void initComponents(PacienteInterno paciente) {
        this.setLayout(new BorderLayout());

        JTextArea textoDetalle = new JTextArea();
        textoDetalle.setEditable(false);

        StringBuilder detalles = new StringBuilder();

        detalles.append("Nombre: ").append(paciente.getNombre()).append("\n");
        detalles.append("Número de documento: ").append(paciente.getId()).append("\n");
        detalles.append("Habitación: ").append(paciente.getHabitacion()).append("\n");
        detalles.append("Estado: ").append(paciente.getEstado()).append("\n\n");

        Historial h = paciente.getHistoria();

        if(h != null){
            detalles.append("Enfermedades Previas: ").append(h.getEnfermedadesPrevias()).append("\n");
            detalles.append("Cirugías Previas: ").append(h.getCirugiasPrevias()).append("\n");
            detalles.append("Alergias: ").append(h.getAlergias()).append("\n");
            detalles.append("Medicamentos Actuales: ").append(h.getMedicamentosActuales()).append("\n");
            detalles.append("Enfermedades Hereditarias: ").append(h.getEnfermedadesHereditarias()).append("\n\n");
            detalles.append("Motivo de Consulta: ").append(h.getMotivoConsulta()).append("\n");
            detalles.append("Diagnóstico: ").append(h.getDiagnostico()).append("\n");
            detalles.append("Tratamiento: ").append(h.getTratamiento()).append("\n");
            detalles.append("Observaciones: ").append(h.getObservaciones()).append("\n\n");
        } else {
            detalles.append("No hay historial registrado.\n");
        }
        
        SignosVitales s = paciente.getSignosVitales();
        
        if(s != null){
            detalles.append("Alertas: \n").append(s.getAlertas()).append("\n");
            detalles.append("Presión: ").append(s.getPresion()).append("\n");
            detalles.append("Frecuencia cardíaca: ").append(s.getFrecuenciaCardiaca()).append("\n");
            detalles.append("Temperatura: ").append(s.getTemperatura()).append("\n");
            detalles.append("Frecuencia respiratoria: ").append(s.getFrecuenciaRespiratoria()).append("\n");
        } else {
            detalles.append("No hay signos vitaes registrados.\n");
        }
        

        textoDetalle.setText(detalles.toString());

        this.add(new JScrollPane(textoDetalle), BorderLayout.CENTER);
        
        JButton botonVolver = new JButton("Volver");
        botonVolver.addActionListener(e -> {
            new InformeInter().setVisible(true);
            dispose();
        });

        this.add(botonVolver, BorderLayout.SOUTH);
        

        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Detalle - " + paciente.getNombre());
        this.setLocationRelativeTo(null);
        
    }
    
    public void setPaciente(PacienteInterno paciente){
    initComponents(paciente);
       }
}
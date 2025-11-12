/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import model.Paciente;
/**
 *
 * @author juanc
 */
public class NewClass extends JFrame {

    private ArrayList<Paciente> listaPacientes = new ArrayList<>();
    private DefaultListModel<String> modeloLista = new DefaultListModel<>();
    private JList<String> listaVisual;
    
    // Campos de registro
    private JTextField txtNombre, txtDni, txtEdad, txtHabitacion, txtEstado, txtHistoria;

    public VentanaPrincipal() {
        setTitle("Sistema de Gestión de Pacientes - Hospital");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel principal
        JPanel panel = new JPanel(new BorderLayout());
        add(panel);

        // Panel de registro
        JPanel panelRegistro = new JPanel(new GridLayout(7, 2, 5, 5));
        panelRegistro.setBorder(BorderFactory.createTitledBorder("Registrar Paciente"));

        txtNombre = new JTextField();
        txtDni = new JTextField();
        txtEdad = new JTextField();
        txtHabitacion = new JTextField();
        txtEstado = new JTextField();
        txtHistoria = new JTextField();

        panelRegistro.add(new JLabel("Nombre:"));
        panelRegistro.add(txtNombre);
        panelRegistro.add(new JLabel("DNI:"));
        panelRegistro.add(txtDni);
        panelRegistro.add(new JLabel("Edad:"));
        panelRegistro.add(txtEdad);
        panelRegistro.add(new JLabel("Habitación:"));
        panelRegistro.add(txtHabitacion);
        panelRegistro.add(new JLabel("Estado:"));
        panelRegistro.add(txtEstado);
        panelRegistro.add(new JLabel("Historia Clínica:"));
        panelRegistro.add(txtHistoria);

        JButton btnAgregar = new JButton("Agregar Paciente");
        panelRegistro.add(btnAgregar);

        JButton btnAlerta = new JButton("Ver Alertas");
        panelRegistro.add(btnAlerta);

        // Panel de lista de pacientes
        JPanel panelLista = new JPanel(new BorderLayout());
        panelLista.setBorder(BorderFactory.createTitledBorder("Pacientes Registrados"));
        listaVisual = new JList<>(modeloLista);
        panelLista.add(new JScrollPane(listaVisual), BorderLayout.CENTER);

        panel.add(panelRegistro, BorderLayout.WEST);
        panel.add(panelLista, BorderLayout.CENTER);

        // Acción de botón agregar
        btnAgregar.addActionListener(e -> {
            try {
                String nombre = txtNombre.getText();
                String dni = txtDni.getText();
                int edad = Integer.parseInt(txtEdad.getText());
                String habitacion = txtHabitacion.getText();
                String estado = txtEstado.getText();
                String historia = txtHistoria.getText();

                Paciente p = new Paciente(nombre, dni, edad, habitacion, estado, historia);
                listaPacientes.add(p);
                modeloLista.addElement(nombre + " (" + estado + ")");

                if (estado.equalsIgnoreCase("Crítico")) {
                    JOptionPane.showMessageDialog(this, 
                        "⚠️ ¡ALERTA! El paciente " + nombre + " está en estado crítico.",
                        "Alerta Médica", JOptionPane.WARNING_MESSAGE);
                }

                limpiarCampos();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Edad inválida.");
            }
        });

        btnAlerta.addActionListener(e -> mostrarAlertas());
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtDni.setText("");
        txtEdad.setText("");
        txtHabitacion.setText("");
        txtEstado.setText("");
        txtHistoria.setText("");
    }

    private void mostrarAlertas() {
        StringBuilder alertas = new StringBuilder();
        for (Paciente p : listaPacientes) {
            if (p.getEstado().equalsIgnoreCase("Crítico")) {
                alertas.append("⚠️ Paciente crítico: ").append(p.getNombre())
                       .append(" (Hab: ").append(p.getHabitacion()).append(")\n");
            }
        }
        if (alertas.length() == 0) {
            JOptionPane.showMessageDialog(this, "No hay alertas activas.");
        } else {
            JOptionPane.showMessageDialog(this, alertas.toString(), "Alertas activas", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaPrincipal().setVisible(true));
    }
}

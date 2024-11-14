package p147_TercerExamenParcial;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class App extends JFrame {
    private JTable tablaJugadores;
    private DefaultTableModel modeloTabla;
    private JTextField txtNombre, txtEdad, txtSexo, txtEstadoCivil, txtDescripcion, txtSalario;
    private List<Jugador> listaJugadores;

    public App() {
        setTitle("Liga de Fútbol");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        modeloTabla = new DefaultTableModel(new Object[]{"Nombre", "Edad", "Sexo", "Estado Civil", "Descripción", "Salario"}, 0);
        tablaJugadores = new JTable(modeloTabla);
        tablaJugadores.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mostrarJugadorSeleccionado();
            }
        });
        JScrollPane scrollPane = new JScrollPane(tablaJugadores);
        
        JPanel panelDatos = new JPanel(new GridLayout(6, 2));
        panelDatos.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelDatos.add(txtNombre);

        panelDatos.add(new JLabel("Edad:"));
        txtEdad = new JTextField();
        panelDatos.add(txtEdad);

        panelDatos.add(new JLabel("Sexo:"));
        txtSexo = new JTextField();
        panelDatos.add(txtSexo);

        panelDatos.add(new JLabel("Estado Civil:"));
        txtEstadoCivil = new JTextField();
        panelDatos.add(txtEstadoCivil);

        panelDatos.add(new JLabel("Descripción:"));
        txtDescripcion = new JTextField();
        panelDatos.add(txtDescripcion);

        panelDatos.add(new JLabel("Salario:"));
        txtSalario = new JTextField();
        panelDatos.add(txtSalario);

        JPanel panelBotones = new JPanel();
        JButton btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(e -> agregarJugador());
        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(e -> guardarJugadoresEnArchivo());
        panelBotones.add(btnAgregar);
        panelBotones.add(btnGuardar);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem itemAbrir = new JMenuItem("Abrir");
        itemAbrir.addActionListener(e -> cargarJugadoresDesdeArchivo());
        JMenuItem itemGuardar = new JMenuItem("Guardar");
        itemGuardar.addActionListener(e -> guardarJugadoresEnArchivo());
        JMenuItem itemSalir = new JMenuItem("Salir");
        itemSalir.addActionListener(e -> System.exit(0));
        menuArchivo.add(itemAbrir);
        menuArchivo.add(itemGuardar);
        menuArchivo.add(itemSalir);

        JMenu menuAyuda = new JMenu("Ayuda");
        JMenuItem itemAcercaDe = new JMenuItem("Acerca de...");
        itemAcercaDe.addActionListener(e -> JOptionPane.showMessageDialog(this, "Aplicación de Liga de Fútbol v1.0"));
        menuAyuda.add(itemAcercaDe);

        menuBar.add(menuArchivo);
        menuBar.add(menuAyuda);
        setJMenuBar(menuBar);

        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(panelDatos, BorderLayout.NORTH);
        add(panelBotones, BorderLayout.SOUTH);

        // Inicializamos la lista de jugadores
        listaJugadores = new ArrayList<>();
    }

    private void cargarJugadoresDesdeArchivo() {
        listaJugadores = UtileriaJugador.cargarJugadores("jugadores.dat");
        modeloTabla.setRowCount(0); // Limpiar la tabla
        for (Jugador jugador : listaJugadores) {
            modeloTabla.addRow(new Object[]{
                jugador.getNombre(), jugador.getEdad(), jugador.getSexo(), jugador.getEstadoCivil(),
                jugador.getDescripcion(), jugador.getSalario()
            });
        }
    }

    private void guardarJugadoresEnArchivo() {
        UtileriaJugador.guardarJugadores(listaJugadores, "jugadores.dat");
    }

    private void agregarJugador() {
        String nombre = txtNombre.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        char sexo = txtSexo.getText().charAt(0);
        String estadoCivil = txtEstadoCivil.getText();
        String descripcion = txtDescripcion.getText();
        double salario = Double.parseDouble(txtSalario.getText());

        // Crear un nuevo jugador
        Jugador jugador = new Jugador(nombre, edad, sexo, estadoCivil, descripcion, salario);
        listaJugadores.add(jugador);

        // Actualizar la tabla
        modeloTabla.addRow(new Object[]{jugador.getNombre(), jugador.getEdad(), jugador.getSexo(),
                jugador.getEstadoCivil(), jugador.getDescripcion(), jugador.getSalario()});

        limpiarCampos();
    }

    private void mostrarJugadorSeleccionado() {
        int selectedRow = tablaJugadores.getSelectedRow();
        if (selectedRow >= 0) {
            txtNombre.setText((String) modeloTabla.getValueAt(selectedRow, 0));
            txtEdad.setText(String.valueOf(modeloTabla.getValueAt(selectedRow, 1)));
            txtSexo.setText(String.valueOf(modeloTabla.getValueAt(selectedRow, 2)));
            txtEstadoCivil.setText((String) modeloTabla.getValueAt(selectedRow, 3));
            txtDescripcion.setText((String) modeloTabla.getValueAt(selectedRow, 4));
            txtSalario.setText(String.valueOf(modeloTabla.getValueAt(selectedRow, 5)));
        }
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtEdad.setText("");
        txtSexo.setText("");
        txtEstadoCivil.setText("");
        txtDescripcion.setText("");
        txtSalario.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new App().setVisible(true);
        });
    }
}

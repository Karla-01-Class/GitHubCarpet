package p147_TercerExamenParcial;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class App extends JFrame implements ActionListener {
    
    ArrayList<Jugador> datos = new ArrayList<>();
    JMenuBar menuBar;
    JMenu mnuArchivo, mnuAyuda;
    JMenuItem smnAbrir, smnGuardar, smnSalir, smnAcercade;
    JPanel pnlTabla, pnlDatos, pnlBotones;
    JDialog jdlAcercaDe;
    JLabel lblNombre, lblEdad, lblSexo, lblEstadoCivil, lblDescripcion, lblSalario;
    JTextField txtNombre, txtEdad, txtSexo, txtEstadoCivil, txtDescripcion, txtSalario;
    JScrollPane spane;
    JTable table;
    DefaultTableModel modelo;
    JFileChooser fchArchivo;
    JButton btnAgregar, btnGrabar;

    public App() {
        super("Control de Jugadores de Futbol");

        // Barra de menú
        setLayout(new GridLayout(3, 1));

        pnlTabla = new JPanel(new BorderLayout());
        spane = new JScrollPane();
        pnlTabla.add(spane);
        table = new JTable();
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[] {"Nombre", "Edad", "Sexo", "Estado Civil", "Descripción", "Salario"});
        table.setModel(modelo);
        spane.setViewportView(table);
        add(pnlTabla);

        pnlDatos = new JPanel(new GridLayout(6, 2));
        lblNombre = new JLabel("Nombre: ");
        txtNombre = new JTextField();
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);
        lblEdad = new JLabel("Edad: ");
        txtEdad = new JTextField();
        pnlDatos.add(lblEdad);
        pnlDatos.add(txtEdad);
        lblSexo = new JLabel("Sexo: ");
        txtSexo = new JTextField();
        pnlDatos.add(lblSexo);
        pnlDatos.add(txtSexo);
        lblEstadoCivil = new JLabel("Estado Civil: ");
        txtEstadoCivil = new JTextField();
        pnlDatos.add(lblEstadoCivil);
        pnlDatos.add(txtEstadoCivil);
        lblDescripcion = new JLabel("Descripción: ");
        txtDescripcion = new JTextField();
        pnlDatos.add(lblDescripcion);
        pnlDatos.add(txtDescripcion);
        lblSalario = new JLabel("Salario: ");
        txtSalario = new JTextField();
        pnlDatos.add(lblSalario);
        pnlDatos.add(txtSalario);
        add(pnlDatos);

        pnlBotones = new JPanel();
        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(this);
        pnlBotones.add(btnAgregar);
        btnGrabar = new JButton("Grabar");
        btnGrabar.addActionListener(this);
        pnlBotones.add(btnGrabar);
        add(pnlBotones);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == smnSalir) {
            dispose();
        } else if (e.getSource() == smnAbrir) {
            abrirArchivo();
        } else if (e.getSource() == smnGuardar) {
            guardarArchivo();
        } else if (e.getSource() == btnAgregar) {
            agregarRegistro();
        } else if (e.getSource() == btnGrabar) {
            grabarRegistro();
        }
    }

    public void cargarDatos() {
        modelo.setRowCount(0); // Limpia la tabla
        for (Jugador jugador : datos) {
            modelo.addRow(new Object[] {jugador.getNombre(), jugador.getEdad(), jugador.getSexo(), jugador.getEstadoCivil(), jugador.getDescripcion(), jugador.getSalario()});
        }
    }

    public void grabarRegistro() {
        try {
            String nombre = txtNombre.getText();
            int edad = Integer.parseInt(txtEdad.getText());
            char sexo = txtSexo.getText().charAt(0);
            String estadoCivil = txtEstadoCivil.getText();
            String descripcion = txtDescripcion.getText();
            double salario = Double.parseDouble(txtSalario.getText());
            datos.add(new Jugador(nombre, edad, sexo, estadoCivil, descripcion, salario));
            cargarDatos(); // Llama a cargarDatos para actualizar la tabla
            JOptionPane.showMessageDialog(this, "Registro agregado", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error en el ingreso de datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

        

    public void abrirArchivo() {
        fchArchivo = new JFileChooser();
        fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos (.dat)", "dat"));
        int res = fchArchivo.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            try {
                datos = Utileria.desSeralizarDatos(fchArchivo.getSelectedFile().getPath());
                cargarDatos();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al abrir archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void guardarArchivo() {
        fchArchivo = new JFileChooser();
        fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos (.dat)", "dat"));
        int res = fchArchivo.showSaveDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            try {
                Utileria.serializarDatos(fchArchivo.getSelectedFile().getPath(), datos);
                JOptionPane.showMessageDialog(this, "Archivo guardado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al guardar archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void agregarRegistro() {
        txtNombre.setText("");
        txtEdad.setText("");
        txtSexo.setText("");
        txtEstadoCivil.setText("");
        txtDescripcion.setText("");
        txtSalario.setText("");
        btnGrabar.setEnabled(true);
    }

}
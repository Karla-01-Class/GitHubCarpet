import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class P144_TemperaturasGUi extends JFrame implements ActionListener, ChangeListener {
    JPanel p1;
    JLabel lblGrados, lblCentigrados, lblFarenheit;
    JTextField txtCentigrados, txtFarenheit;
    ButtonGroup grpOpciones;
    JRadioButton rbtCentigrados, rbtFarenheit;
    JButton btnCalcular, btnSalir;

    public P144_TemperaturasGUi() {
        super("Calcular temperaturas");
        setLayout(new FlowLayout());

        p1 = new JPanel();
        p1.setLayout(new GridLayout(5, 2));

        lblCentigrados = new JLabel("Centigrados: ", JLabel.RIGHT);
        p1.add(lblCentigrados);
        txtCentigrados = new JTextField();
        p1.add(txtCentigrados);
        lblFarenheit = new JLabel("Farenheit: ", JLabel.RIGHT);
        p1.add(lblFarenheit);
        txtFarenheit = new JTextField();
        p1.add(txtFarenheit);

        grpOpciones = new ButtonGroup();
        rbtCentigrados = new JRadioButton("Centigrados");
        rbtFarenheit = new JRadioButton("Farenheit");
        grpOpciones.add(rbtCentigrados);
        grpOpciones.add(rbtFarenheit);
        p1.add(rbtCentigrados);
        p1.add(rbtFarenheit);

        add(p1);

        btnCalcular = new JButton("Aceptar");
        add(btnCalcular);
        btnSalir = new JButton("Salir");
        add(btnSalir);

        rbtCentigrados.addChangeListener(this);
        rbtFarenheit.addChangeListener(this);

        btnCalcular.addActionListener(this);
        btnSalir.addActionListener(this);
    }

    public void stateChanged(ChangeEvent e) {
        txtCentigrados.setEnabled(true);
        txtFarenheit.setEnabled(true);
        if (rbtCentigrados.isSelected())
            txtCentigrados.setEnabled(false);
        else
            txtFarenheit.setEnabled(false);
    }

    public void actionPerformed(ActionEvent e) {
        float cen, far;
        if (e.getSource() == btnCalcular) {
            try {
                if (rbtCentigrados.isSelected()) {
                    far = Float.parseFloat(txtFarenheit.getText());
                    cen = (far - 32) * 5f / 9f;
                    txtCentigrados.setText(String.format("%.2f", cen));
                } else if (rbtFarenheit.isSelected()) {
                    cen = Float.parseFloat(txtCentigrados.getText());
                    far = (cen * 9f / 5f) + 32;
                    txtFarenheit.setText(String.format("%.2f", far));
                }
            }catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Faltan valores", "Error",JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnSalir){
            dispose();
        }
    }

    public static void main(String[] args) {
        P144_TemperaturasGUi app = new P144_TemperaturasGUi();
        app.setBounds(10, 10, 250, 200);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
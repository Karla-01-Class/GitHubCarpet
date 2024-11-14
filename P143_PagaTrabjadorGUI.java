import javax.swing.*;
import java.awt.event.*;

public class P143_PagaTrabjadorGUI extends JFrame implements ActionListener { 
    JLabel lblNombre, lblHoras, lblPagaHoras, lblResultado, lblResumen;
    JTextField txtNombre, txtHoras, txtPagaHoras;
    JButton btnCalcular, btnSalir;

    public P143_PagaTrabjadorGUI() {
        super("Calcular la paga de trabajadores");
        setLayout(null);

        lblNombre = new JLabel("Nombre del trabajador: ");
        lblNombre.setBounds(10, 20, 200, 30);
        add(lblNombre);
        txtNombre = new JTextField();
        txtNombre.setBounds(150, 20, 170, 30);
        add(txtNombre);

        lblHoras = new JLabel("Horas trabajadas: ");
        lblHoras.setBounds(10, 60, 200, 30);
        add(lblHoras);
        txtHoras = new JTextField();
        txtHoras.setBounds(150, 60, 170, 30);
        add(txtHoras);

        lblPagaHoras = new JLabel("Paga por horas: ");
        lblPagaHoras.setBounds(10, 100, 200, 30);
        add(lblPagaHoras);
        txtPagaHoras = new JTextField();
        txtPagaHoras.setBounds(150, 100, 170, 30);
        add(txtPagaHoras);

        lblResumen = new JLabel("Resumen de Pagos:");
        lblResumen.setBounds(110, 140, 200, 30);
        add(lblResumen);

        lblResultado = new JLabel("<html> </html>");
        lblResultado.setBounds(10, 170, 320, 130);
        add(lblResultado);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(45, 310, 100, 30);
        add(btnCalcular);
        btnSalir = new JButton("Salir");
        btnSalir.setBounds(185, 310, 100, 30);
        add(btnSalir);
        btnCalcular.addActionListener(this);
        btnSalir.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            String nombre = txtNombre.getText();
            int horas = Integer.parseInt(txtHoras.getText());
            float pagaHoras = Float.parseFloat(txtPagaHoras.getText());
            float tasa = 0.03f;

            double pagaBruta = horas * pagaHoras;
            double impuesto = pagaBruta * tasa;
            double pagaNeta = pagaBruta - impuesto;

            String resultado = String.format(
                    "<html>El trabajador %s trabajó %d horas, a una paga de %.2f pesos la hora, con una tasa de impuestos de %.2f.<br>"
                    + "<br>Paga Bruta: %.2f<br>Impuesto: %.2f<br>Paga Neta: %.2f</html>",
                    nombre, horas, pagaHoras, tasa, pagaBruta, impuesto, pagaNeta);
            lblResultado.setText(resultado);
        } else if (e.getSource() == btnSalir) {
            JOptionPane.showMessageDialog(this, "Gracias por usar este programa", "Despedida",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }

    public static void main(String[] args) {
        P143_PagaTrabjadorGUI app = new P143_PagaTrabjadorGUI();
        app.setBounds(10, 10, 350, 400);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
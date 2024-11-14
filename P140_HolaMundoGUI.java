import javax.swing.*;
import java.awt.*;

public class P140_HolaMundoGUI extends JFrame {

    private JLabel lblSaludo;

    public P140_HolaMundoGUI(){
        System.out.print("\033[H\033[2J");
        setLayout(null);
        lblSaludo = new JLabel("Hola Mundo");
        lblSaludo.setFont(new Font("Arial", Font.BOLD,30));
        lblSaludo.setBounds(10, 20, 200, 30);
        add(lblSaludo);
        setTitle("Mi primer Programa de Interfaz Grafica en Java");
    }
    public static void main(String[] args) {
        P140_HolaMundoGUI app = new P140_HolaMundoGUI();

        app.setBounds(0, 0, 800, 300);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }   
}
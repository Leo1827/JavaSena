import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormularioSwing extends JFrame implements ActionListener {

    // Componentes del formulario
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JButton btnSaludar;
    private JLabel lblMensaje;

    public FormularioSwing() {
        // Configurar el diseño del formulario
        setLayout(new FlowLayout());

        // Crear componentes
        lblNombre = new JLabel("Ingresa tu nombre:");
        txtNombre = new JTextField(15);
        btnSaludar = new JButton("Saludar");
        lblMensaje = new JLabel("");

        // Agregar componentes al JFrame
        add(lblNombre);
        add(txtNombre);
        add(btnSaludar);
        add(lblMensaje);

        // Agregar evento al botón
        btnSaludar.addActionListener(this);

        // Configurar ventana
        setTitle("Formulario tipo Applet");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null); // Centrar ventana
    }

    // Acción del botón
    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre = txtNombre.getText();
        lblMensaje.setText("Hola, " + nombre + "!");
    }

    // Método principal (punto de entrada)
    public static void main(String[] args) {
        // Crear y mostrar el formulario
        new FormularioSwing();
    }
}

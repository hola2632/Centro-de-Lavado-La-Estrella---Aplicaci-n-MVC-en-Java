package vista;

import javax.swing.*;
import java.awt.*;

public class ServicioView extends JFrame {
    public JComboBox<String> cbServicio;
    public JComboBox<String> cbVehiculo;
    public JTextField txtFuncionario;
    public JTextField txtPrecio;
    public JButton btnRegistrar;

    public ServicioView() {
        setTitle("Centro de Lavado La Estrella");
        setSize(350, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 10, 10));

        JLabel lblServicio = new JLabel("Tipo de servicio:");
        JLabel lblVehiculo = new JLabel("Tipo de vehículo:");
        JLabel lblFuncionario = new JLabel("Funcionario:");
        JLabel lblPrecio = new JLabel("Precio:");

        cbServicio = new JComboBox<>(new String[]{
                "Lavado Básico", "Lavado Especial",
                "Desinfección Básica", "Desinfección Avanzada",
                "Combo 1", "Combo 2", "Combo 3"
        });

        cbVehiculo = new JComboBox<>(new String[]{"Automóvil", "Camioneta"});
        txtFuncionario = new JTextField();
        txtPrecio = new JTextField();
        btnRegistrar = new JButton("Registrar Servicio");

        add(lblServicio);
        add(cbServicio);
        add(lblVehiculo);
        add(cbVehiculo);
        add(lblFuncionario);
        add(txtFuncionario);
        add(lblPrecio);
        add(txtPrecio);
        add(new JLabel());
        add(btnRegistrar);
    }
}

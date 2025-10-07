package controlador;

import modelo.ServicioModel;
import vista.ServicioView;

public class ServicioController {
    private ServicioView vista;
    private ServicioModel modelo;

    public ServicioController(ServicioView vista, ServicioModel modelo) {
        this.vista = vista;
        this.modelo = modelo;

        this.vista.btnRegistrar.addActionListener(e -> registrar());
    }

    private void registrar() {
        String tipoServicio = (String) vista.cbServicio.getSelectedItem();
        String tipoVehiculo = (String) vista.cbVehiculo.getSelectedItem();
        String funcionario = vista.txtFuncionario.getText();
        double precio = Double.parseDouble(vista.txtPrecio.getText());
        modelo.registrarServicio(tipoServicio, tipoVehiculo, funcionario, precio);
    }
}

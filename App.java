import controlador.ServicioController;
import modelo.ServicioModel;
import vista.ServicioView;

public class App {
    public static void main(String[] args) {
        ServicioModel modelo = new ServicioModel();
        ServicioView vista = new ServicioView();
        ServicioController controlador = new ServicioController(vista, modelo);
        vista.setVisible(true);
    }
}

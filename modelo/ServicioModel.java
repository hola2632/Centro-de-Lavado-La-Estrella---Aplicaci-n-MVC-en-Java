package modelo;

public class ServicioModel {
    private String tipoServicio;
    private String tipoVehiculo;
    private String funcionario;
    private double precio;

    public ServicioModel() {}

    public void registrarServicio(String tipoServicio, String tipoVehiculo, String funcionario, double precio) {
        this.tipoServicio = tipoServicio;
        this.tipoVehiculo = tipoVehiculo;
        this.funcionario = funcionario;
        this.precio = precio;
    }

    public String getTipoServicio() { return tipoServicio; }
    public String getTipoVehiculo() { return tipoVehiculo; }
    public String getFuncionario() { return funcionario; }
    public double getPrecio() { return precio; }
}

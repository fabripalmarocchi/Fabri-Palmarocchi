public class Almacen {
    
    
    private String nombreEmpresa;
    private String direccion;
    
    private String venta;
    private String recibirPedido;
    private int recibirPago;

    public Almacen() {
    }

    public Almacen(String nombreEmpresa, String direccion, String venta, String recibirPedido, int recibirPago) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.venta = venta;
        this.recibirPedido = recibirPedido;
        this.recibirPago = recibirPago;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getVenta() {
        return venta;
    }

    public void setVenta(String venta) {
        this.venta = venta;
    }

    public String getRecibirPedido() {
        return recibirPedido;
    }

    public void setRecibirPedido(String recibirPedido) {
        this.recibirPedido = recibirPedido;
    }

    public int getRecibirPago() {
        return recibirPago;
    }

    public void setRecibirPago(int recibirPago) {
        this.recibirPago = recibirPago;
    }
    
    
}

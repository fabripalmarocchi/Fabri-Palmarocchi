public class Proveedores {

    private int telefono;
    private int NIT;
    private String direccion;	
    private String producto;
    private String nombre_proveedor;

    public Proveedores() {
    }

    public Proveedores(int telefono, int NIT, String direccion, String producto, String nombre_proveedor) {
        this.telefono = telefono;
        this.NIT = NIT;
        this.direccion = direccion;
        this.producto = producto;
        this.nombre_proveedor = nombre_proveedor;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getNIT() {
        return NIT;
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }
    
    
}